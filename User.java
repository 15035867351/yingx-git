package com.baizhi.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String id;
    private String phone;
    @Column(name = "head_img")
    private String headImg;
    private String name;
    private String sign;
    private String wechat;
    private String status;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date regist_time;
    private String city;
    private String sex;

}

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

