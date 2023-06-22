package com.akki.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Employee {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configcollection.xml");
        Emp emp = (Emp) context.getBean("emp1");
        System.out.println(emp);
        Emp anotherEmp = (Emp) context.getBean("emp2");
        System.out.println(anotherEmp);
    }
}
