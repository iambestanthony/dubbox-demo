package com.jay;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by JayJ on 2018/7/15.
 **/
public class Main {
    public static void main(String[] args) throws IOException {
        /*启动监听服务*/
        String configLocation = "classpath*:/applicationContext-provider.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:/applicationContext-provider.xml");
        String[] allBean = context.getBeanDefinitionNames();
        for (String str:allBean
             ) {
            System.out.println(str);

        }
        System.out.println("dubbo-server服务正在监听，按任意键退出");
        System.in.read();
    }
}
