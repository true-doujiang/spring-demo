package com.yhh.bean.life.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.*;
import org.springframework.context.annotation.ImportAware;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.type.AnnotationMetadata;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import java.util.Arrays;

/**
 *
 */
public class UserService implements InitializingBean, DisposableBean,
									ApplicationContextAware,
									ApplicationEventPublisherAware, 
									BeanClassLoaderAware, 
									BeanFactoryAware,
									BeanNameAware, 
									EnvironmentAware,
                                    ResourceLoaderAware,
                                    ImportAware {

    private String name;

    //构造器
    public UserService(){
        System.out.println("调用 UserService 无参构造函数");
    }
    
    public UserService setName(String name) {
        System.out.println("UserService 中利用set方法设置属性值");
        this.name = name;
        return this;
    }

    // --------------init()----- destory()--开始---------------

    //通过<bean>的init-method属性指定的初始化方法
    public void initMethod() throws Exception {
        System.out.println("执行xml配置的init-method");
    }

    //通过<bean>的destroy-method属性指定的销毁方法
    public void destroyMethod() throws Exception {
        System.out.println("执行xml配置的destroy-method");
    }

    // @PostConstruct    //= init-method
    @PostConstruct
    public void initPostConstruct(){
        System.out.println("执行 @PostConstruct 注解标注的方法  //= init-method");
    }

    @PreDestroy          //= destroy-method
    public void preDestroy(){
        System.out.println("执行 @preDestroy 注解标注的方法 // = destroy-method ");
    }

    // --------------init()----- destory()--结束---------------

    // InitializingBean
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("执行InitializingBean接口的afterPropertiesSet方法");

    }

    // DisposableBean
    @Override
    public void destroy() throws Exception {
        System.out.println("执行DisposableBean接口的destroy方法");
    }



    // ================= *Aware ==========================

    // 1. ApplicationContextAware
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        //ClassPathXmlApplicationContext
        System.out.println("执行 *Aware setApplicationContext:: Bean Definition Names="
                + Arrays.toString(applicationContext.getBeanDefinitionNames()));
    }


    // 2. ApplicationEventPublisherAware
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        //ClassPathXmlApplicationContext
        System.out.println("执行 *Aware setApplicationEventPublisher");
    }

    // 3. BeanClassLoaderAware
    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("执行 *Aware setBeanClassLoader,ClassLoader Name = " + classLoader.getClass().getName());
    }

    // 4. BeanFactoryAware
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
    	//DefaultListableBeanFactory 
        System.out.println("执行 *Aware setBeanFactory:: userService bean singleton=" +  beanFactory.isSingleton("userService"));
    	//System.out.println("执行setBeanFactory,setBeanFactory:: giraffe bean singleton=" +  beanFactory.isSingleton("com.giraffe.spring.service.GiraffeService#0"));
    }

    // 5. BeanNameAware
    @Override
    public void setBeanName(String s) {
        System.out.println("执行 *Aware setBeanName:: Bean Name defined in context = " + s);
    }

    // 6. EnvironmentAware
    @Override
    public void setEnvironment(Environment environment) {
        System.out.println("执行 *Aware setEnvironment = " + environment);
    }

    // 7. ResourceLoaderAware
    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        Resource resource = resourceLoader.getResource("classpath:spring.xml");
        System.out.println("执行 *Aware setResourceLoader:: Resource File Name="  + resource.getFilename());
    }

    // 8. ImportAware
    @Override
    public void setImportMetadata(AnnotationMetadata annotationMetadata) {
        // 暂时没有执行 应该需要有条件才能执行
        System.out.println("执行 *Aware setImportMetadata");
    }
    
}
