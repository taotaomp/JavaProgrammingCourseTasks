package com.hst.第七题;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/***
 * 打印出所有的“水仙花数”，“水仙花数”是指一个三位数，其各位数字的立方和等于该数本身。例如，153是一个“水仙花数”，因为153 = 1^3+5^3+3^3
 * @author ataoD
 *
 */
public class Task7 {
	
	public ArrayList<Integer> findNarcissisticNumber(){
		ArrayList<Integer> container = new ArrayList<>();
		for (int i = 100; i < 999; i++) {
			if(Math.pow(i/100,3)+Math.pow((i%100)/10,3)+Math.pow(i%10,3)==i) {
				container.add(i);
			}
		}
		return container;
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ArrayList<Integer> container = new ArrayList<Integer>();
		container = new Task7().findNarcissisticNumber();
		Iterator<Integer> i = container.iterator();
		for (int j = 0; i.hasNext(); j++) {
			if(j%10==0&&j!=0) {
				System.out.println();
			}
	 		System.out.print(i.next()+" ");
			
		}
	}

}
