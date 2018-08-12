package com.hshc.jarslink.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhangyong on 2018/8/12.
 */
public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:spring-app.xml");
        classPathXmlApplicationContext.start();
    }

}
