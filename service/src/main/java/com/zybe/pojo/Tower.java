package com.zybe.pojo;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Data
public class Tower {
    @NotNull
    private String device_sn;
    @NotNull
    private String localetime;
    @NotNull
    private Float height;
    @NotNull
    private Float weight;
    @NotNull
    private Float scope;
    @NotNull
    private Float rotate;
    @NotNull
    private Float windSpeed;
    @NotNull
    private Float oblique;
    @NotNull
    private Float torque;
    @NotNull
    private Float cargo_boom;
    @NotNull
    private Float balance_arm;
    @NotNull
    private Float rated_weight;
    @NotNull
    private Float rated_height;
    @NotNull
    private Float rated_torque;
    @NotNull
    private Integer state;
}
