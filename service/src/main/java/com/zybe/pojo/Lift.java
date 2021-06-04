package com.zybe.pojo;

import lombok.Data;

import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Table(name = "`lift`")
@Data
public class Lift {
    @NotBlank
    private String device_sn;
    @NotBlank
    private String locale_time;
    @NotNull
    private Float weight;
    @NotNull
    private Float height;
    @NotNull
    private Float speed;
    @NotNull
    private Float tilt;
    @NotNull
    private Integer direction;
    @NotNull
    private Float rated_weight;
    @NotNull
    private Float rated_height;
    @NotNull
    private Float rated_speed;
    @NotNull
    private Integer door;
    @NotNull
    private Integer state;
    private Float wind_speed;
}
