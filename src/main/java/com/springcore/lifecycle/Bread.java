package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Bread {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("bread setting price");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Bread [price=" + price + "]";
	}

	public Bread() {
		super();
		// TODO Auto-generated constructor stub
	}
	@PostConstruct
	public void start() {
		System.out.println("starting method");
	}
	@PreDestroy
	public void end() {
		System.out.println("ending method");
	}

}
