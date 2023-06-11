package com.ly.mailstudy.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {

    private String username;
    private String password;

    private String roles;
    private String permissions;
}
