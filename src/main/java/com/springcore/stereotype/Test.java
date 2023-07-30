package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		Student student1 = context.getBean("ob",Student.class);
		Student student2 = context.getBean("ob",Student.class);
		System.out.println(student1);
		System.out.println(student1.getAddress());
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
	}
}
