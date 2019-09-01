package com.bjsxt.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.xml.BeanDefinitionDocumentReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.bjsxt.model.User;

//Dependency Injection  依赖注入
//Inverse of Control    控制反转
public class UserServiceTest {

    @Test
    public void testAdd() throws Exception {
        //BeanFactory:是顶级父接口
        //ApplicationContext 子接口，功能更强大
        //初始化容器Context
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        //ClassPathXmlApplicationContext() 构造器可以接收多个配置文件，查看API
        UserService service = (UserService)ctx.getBean("userService");

        System.out.println(service.getClass());//class com.bjsxt.service.UserService

        service.add(new User());

        boolean flag = true;
        boolean flag1 = false;
        boolean flag2 = false;
        flag = flag1!=flag2;
        System.out.println(flag);
    }

    @Test
    public void test_XmlBeanFactory(){
        Resource resource = new ClassPathResource("beans.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        UserService service = (UserService)beanFactory.getBean("userService");

        System.out.println(service.getClass());//class com.bjsxt.service.UserService
        service.add(new User());
    }

    /**
     * 以下测试spring源码用到的
     */
    public void testSourceSpring(){
        //BeanFactory
        //XmlBeanFactory
        //DefaultListableBeanFactory

        //BeanDefinitionDocumentReader  //读取beans.xml文件的接口
        //DefaultBeanDefinitionDocumentReader  //读取beans.xml文件

        //BeanDefinition
        //AbstractBeanDefinition
        //RootBeanDefinition
        //ChildBeanDefinition
        //GenericBeanDefinition


        //JdbcTemplate
        //RowMapper
    }

    public static void main(String[] args) {

    }

    public void testReSource() {
        try {
            Resource resource = new ClassPathResource("beans.xml");
            System.out.println(resource.exists());
            System.out.println(resource.getDescription());
            System.out.println(resource.getFilename());
            System.out.println(resource.lastModified());
            System.out.println(resource.isOpen());

            InputStream inputStream = resource.getInputStream();
            byte buffer[] = new byte[1024];
            FileOutputStream outputStream = new FileOutputStream(new File("e:\\beans.txt"));
            int len = 0;
            while ((len = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("over");
    }


    public void testResource2(){
        try {
            Resource resource = new FileSystemResource("beans.xml");//路径不对而已
            InputStream inputStream = resource.getInputStream();
            byte buffer[] = new byte[1024];
            FileOutputStream outputStream = new FileOutputStream(new File("e:\\filesystem_beans.txt"));
            int len = 0;
            while ((len = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("over");
    }


}
