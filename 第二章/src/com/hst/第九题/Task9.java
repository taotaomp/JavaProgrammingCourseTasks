package com.hst.第九题;

public class Task9 {
	
	public static long fact(int seed) {
		long _fact = 1;
		for (int j = seed; j >0 ; j--) {	//阶乘计算
			_fact = _fact*j;
		}
		return _fact;
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		double e = 0;
		for (int i = 1; 1.0/fact(i)>0.0001; i++) {
			e=e+1.0/fact(i);
		}
		System.out.println(e);
	}

}
