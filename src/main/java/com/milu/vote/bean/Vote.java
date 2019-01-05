package com.milu.vote.bean;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vote {
    private String id;
    private String name;
    private String sex;
    private Integer voteNumber;
    private String createTime;
    private String introduce;
    private String orgName;
}
