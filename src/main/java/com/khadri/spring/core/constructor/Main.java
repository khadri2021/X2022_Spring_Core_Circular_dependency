package com.khadri.spring.core.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        X x = applicationContext.getBean("x", X.class);
        Y y = applicationContext.getBean("y", Y.class);

        System.out.println(x.getY());
        System.out.println(y.getX());

    }
}
