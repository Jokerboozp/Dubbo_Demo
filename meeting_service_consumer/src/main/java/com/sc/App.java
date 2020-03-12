package com.sc;

import com.sc.entity.MeetingPub;
import com.sc.service.MeetingPubService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath:consumer.xml"});
        context.start();

        MeetingPubService meetingPubService = context.getBean(MeetingPubService.class);
        MeetingPub meetingPub = meetingPubService.selectByPcode("1001");

        System.out.println( meetingPub );
        System.in.read();
    }
}
