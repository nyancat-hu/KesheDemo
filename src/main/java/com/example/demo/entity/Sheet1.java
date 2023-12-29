package com.example.demo.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

/**
 * (Sheet1)表实体类
 *
 * @author makejava
 * @since 2023-12-29 19:40:53
 */
@lombok.Data
@TableName("`sheet1`")
public class Sheet1 {

    private String targetId;

    private String targetName;

    private String targetTag;

    private String globalTime;

    private Double localElapsedTime;

    private Double x;

    private Double y;

    private Double vx;

    private Double vy;

    private Double ax;

    private Double ay;

    private Double speed;

    private Double acceleration;

    private Double space;

    private Double curvature;

    private Double angle;

    private String yawrate;

    private String status;

    private String tag;


}

