package com.hst.第一题;

public class Suansu {
	private int a;
	private int b;
	
	public Suansu(int a,int b) {
		this.a = a;
		this.b = b;
	}
	
	public void AddAB() {
		System.out.println("a与b的和为："+(a+b));
	}
	
	public void SubAB() {
		System.out.println("a与b的差为："+(a-b));
	}
	
	public void MultiAB() {
		System.out.println("a与b的积为："+(a*b));
	}
	
	public void DivAB() {
		System.out.println("a与b的商为："+(1.0*a/b));
	}
}
