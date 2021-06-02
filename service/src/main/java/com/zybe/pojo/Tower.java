package com.zybe.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "[tower]")
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
    @Column(name = "[windSpeed]")
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
