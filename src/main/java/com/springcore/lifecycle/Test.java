package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleconfig.xml");
		Samosa s1 = (Samosa)context.getBean("s1");
		System.out.println(s1);
		Pepsi p1 = (Pepsi)context.getBean("p1");
		System.out.println(p1);
		Bread b1 = (Bread)context.getBean("b1");
		System.out.println(b1);
		context.registerShutdownHook();	
	}
}

