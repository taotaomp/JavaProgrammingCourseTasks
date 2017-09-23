package com.hst.第四题;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task4 {
	/**
	 * 用for语句实现下面的程序：从10~100能被2整除但不能被3整除的整数，要求每行按10个数（数与数之间有一个空格间隔）的形式输出
	 * @param args
	 */
	
	private static void forDemo(List<Integer> a){
		for (int i = 10; i < 100; i++) {
			if (i %2 == 0 && i%3 != 0) {
				a.add(i);
			}
		}
	}
	
	public static void main(String[] args) {
		List<Integer> container = new ArrayList<>();
		forDemo(container);
		Iterator<Integer> i = container.iterator();
		for (int j = 0; i.hasNext(); j++) {
			if (j%10 == 0&&j!=0) {
				System.out.println("");
			}
			System.out.print(i.next()+ " ");
		}

	}

}
