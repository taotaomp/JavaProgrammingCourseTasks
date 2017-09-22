package com.hst.第二题;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task2 {
	/**
	 * 编写一个程序，打印100~200之间的素数，要求每行按10个数（数与数之间有一个空格间隔）的形式对其输出
	 * @param args
	 */
	private static void primerNumberGenerate(List<Integer> a){
		for (int i = 100; i < 200; i++) {	//寻数范围
			int j = 2;
			while(j<i){		
				if (i%j == 0) {		//出现能整除i的数则证明i不是素数，while循环结束
					break;
				}
				j++;
			}
			if (i==j) {		//i与j相等时，证明不存在大于1且小于i的数能整除i
				a.add(i);
			}
		}
	}
	public static void main(String[] args) {
		List<Integer> container = new ArrayList<>();
		primerNumberGenerate(container);
		Iterator<Integer> i = container.iterator();
		for (int j = 0; i.hasNext(); j++) {
			if (j%10 == 0 && j!=0) {
				System.out.println("\n");
			}
			System.out.print(i.next()+" ");
		}
	}

}
