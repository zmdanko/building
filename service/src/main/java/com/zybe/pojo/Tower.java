package com.zybe.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Table(name = "`tower`")
@Data
public class Tower {
    @NotBlank
    private String device_sn;
    @NotBlank
    private String locale_time;
    @NotNull
    private Float height;
    @NotNull
    private Float weight;
    @NotNull
    private Float scope;
    @NotNull
    private Float rotate;
    @NotNull
    private Float wind_speed;
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
