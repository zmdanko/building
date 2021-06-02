package com.zybe.filter;

import com.zybe.customEnum.ReturnEnum;
import com.zybe.exception.CustomException;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.http.HttpMethod;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.util.DigestUtils;
import org.springframework.util.MultiValueMap;
import org.springframework.web.reactive.DispatcherHandler;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;

@Configuration
public class ArgsFilter implements GlobalFilter, Ordered {
    private static String APPID = "1";
    private static String SECRET = "4";

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        MultiValueMap<String, String> queryParams = exchange.getRequest().getQueryParams();
        String[] strings = {"appid", "timestamp", "msgid", "signature", "version"};
        String blankArg = "";
        HashMap<String, String> map = new HashMap<>();
        for (String s : strings) {
            if (queryParams.getFirst(s) == null || queryParams.getFirst(s) == "") {
                blankArg = s;
                break;
            }
            map.put(s, queryParams.getFirst(s));
        }
        try {
            switch (blankArg) {
                case "":
                    break;
                case "appid":
                    throw new CustomException(ReturnEnum.NO_APPID);
                case "timestamp":
                    throw new CustomException(ReturnEnum.NO_TIMESTAMP);
                case "msgid":
                    throw new CustomException(ReturnEnum.NO_MSGID);
                case "signature":
                    throw new CustomException(ReturnEnum.NO_SIGNATURE);
                case "version":
                    throw new CustomException(ReturnEnum.NO_VERSION);
            }

            String appid = exchange.getRequest().getQueryParams().getFirst("appid");

            ArrayList<String> ids = new ArrayList<>();
            ids.add(APPID);
            if (!ids.contains(appid)) {
                throw new CustomException(ReturnEnum.ILLEGAL_APPID);
            }

            ArrayList<String> forbiddenIDs = new ArrayList<>();
            if (forbiddenIDs.contains(appid)) {
                throw new CustomException(ReturnEnum.FORBIDDEN_APPID);
            }
            if ((exchange.getRequest().getCookies().getFirst("secret") == null) || !(exchange.getRequest().getCookies().getFirst("secret").getValue().equals(SECRET))) {
                throw new CustomException(ReturnEnum.SECRET_EXCEPTION);
            }

            map.put("secret", exchange.getRequest().getCookies().getFirst("secret").getValue());

            VerifySignature(map);
        } catch (CustomException e) {
            ServerHttpRequest request = null;
            try {
                request = exchange.getRequest().mutate().path("/exception").method(HttpMethod.GET).header("code", e.getCode() + "").header("message", URLEncoder.encode(e.getMessage(), "utf-8")).build();
            } catch (UnsupportedEncodingException ex) {
                ex.printStackTrace();
            }
            exchange = exchange.mutate().request(request).build();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return chain.filter(exchange);
    }

    private void VerifySignature(HashMap<String, String> map) throws UnsupportedEncodingException {
        String userMD5 = DigestUtils.md5DigestAsHex((map.get("appid") + map.get("msgid") + map.get("timestamp") + map.get("secret")).getBytes("utf-8"));

        System.out.println("signature:  " + userMD5);

        String localMD5 = DigestUtils.md5DigestAsHex((APPID + map.get("msgid") + map.get("timestamp") + SECRET).getBytes("utf-8"));

        if (!localMD5.equals(userMD5)) {
            throw new CustomException(ReturnEnum.ERROR_SIGNATURE);
        }
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
