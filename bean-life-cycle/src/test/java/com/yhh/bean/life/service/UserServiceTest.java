package com.yhh.bean.life.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * https://yemengying.com/2016/07/14/spring-bean-life-cycle/
 */
public class UserServiceTest {

    public static void main(String[] args) {

        System.out.println("Spring容器初始化");
        System.out.println("=====================================");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        System.out.println("Spring容器初始化完毕");
        System.out.println("=====================================");


        System.out.println("从容器中获取Bean");
        UserService service = context.getBean("userService", UserService.class);
        //GiraffeService service = context.getBean("com.giraffe.spring.service.GiraffeService#0", GiraffeService.class);

        System.out.println(service);
        System.out.println("=====================================");

        context.close();
        System.out.println("Spring容器关闭");
    }
}
