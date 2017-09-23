package com.hst.第五题;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Task5 {
	/**
	 *编写一个Java应用程序，先产生一个随机数n（要求0<n<10),然后随机生成n个0~100的随机数，输出这n个随机数的和。
	 * @param args
	 */
	private static void randomGenerate(List<Integer> a){
		Random r = new Random();
		int count = r.nextInt(10);
		for (int i = 0; i < count; i++) {
			a.add(r.nextInt(100));
		}
	}
	
	public static void main(String[] args) {
		List<Integer> container = new ArrayList<>();
		randomGenerate(container);
		Iterator<Integer> i = container.iterator();
		int sum = 0;
		while (i.hasNext()) {
			sum += i.next();
		}
		System.out.println(sum);
	}

}
