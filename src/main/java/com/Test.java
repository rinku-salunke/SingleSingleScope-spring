package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {

	
ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");

Student s1=(Student) ac.getBean("s");
System.out.println(s1);
System.out.println(s1.getAdr());


Student s2=(Student) ac.getBean("s");
System.out.println(s2);
System.out.println(s2.getAdr());



}
}
