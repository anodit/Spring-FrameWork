package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside Test Class");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");
		Emp emp1 = (Emp)context.getBean("emp1");
		System.out.println(emp1);
		System.out.println("Name -> "+emp1.getName());
		System.out.println("Phones -> "+emp1.getPhones());
		System.out.println("Addresses -> "+emp1.getAddresses());
		System.out.println("Courses -> "+emp1.getCourses());
	}

}
