package com.sc.serviceimpl;

import com.sc.entity.MeetingPub;
import com.sc.entity.User;
import com.sc.service.MeetingPubService;
import com.sc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MeetingPubServiceImpl implements MeetingPubService {

    @Autowired
    private UserService userService;

    @Override
    public MeetingPub selectByPcode(String pcode) {
        MeetingPub meetingPub = new MeetingPub();
        meetingPub.setId("1001");
        meetingPub.setPcode(pcode);
        meetingPub.setTitle("dubbo");
        meetingPub.setContent("dubbo是一个RPC框架，是一个分布式服务解决方案");

        //调用user_service_provider信息
        System.out.println("-----远程服务访问---------"+userService);
        User user = userService.selectById(meetingPub.getUid());
        meetingPub.setUser(user);
        return meetingPub;
    }
}
