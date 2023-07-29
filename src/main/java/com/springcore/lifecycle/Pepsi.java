package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean{
	private double price;
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("pepsi setting price");
		this.price = price;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("pepsi destroy");
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("pepsi afterPropertiesSet init");
		
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

}
