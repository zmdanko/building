appid写死,值为1; 

secret写死,值为4;

secret需存入cookie,key为secret,验签逻辑中secret从cookie中获取;

全局参数gateway中使用GlobalFilter拦截验证,其他参数Controller中使用jakartta validation api进行验空
