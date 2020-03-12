package com.sc.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class MeetingPub implements Serializable {
    //主键ID
    private String id;
    //会议编号
    private String pcode;
    //会议标题
    private String title;
    //会议内容
    private String content;
    //用户ID
    private String uid;

    //关联用户
    private User user;
}
