package com.zybe.pojo;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class Lift {
    @NotNull
    private String device_sn;
    @NotNull
    private String localetime;
    @NotNull
    private Float weight;
    @NotNull
    private Float height;
    @NotNull
    private Float speed;
    @NotNull
    private Float tilt;
    @NotNull
    private int direction;
    @NotNull
    private Float rated_weight;
    @NotNull
    private Float rated_height;
    @NotNull
    private Float rated_speed;
    @NotNull
    private int door;
    @NotNull
    private int state;
    private Float windspeed;
}
