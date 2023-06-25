package com.khadri.spring.core.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        A a = context.getBean("a",A.class);
        B b = context.getBean("b", B.class);
        System.out.println(a);
        System.out.println(a.getB());
        System.out.println(b);
        System.out.println(b.getA());


    }
}