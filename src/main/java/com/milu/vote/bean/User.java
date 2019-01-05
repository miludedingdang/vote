package com.milu.vote.bean;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String id;
    private String userName;
    private String userPassword;
    private String userPhone;
    private String memo;
}
