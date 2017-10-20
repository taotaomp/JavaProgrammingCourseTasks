package com.hst.第六题;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/***
 * 姐妹素数是指相邻两个奇数均为素数，请编写一个程序找出100~1000的所有姐妹素数
 * @author ataoD
 *
 */
public class Task6 {
	
	public HashMap<Integer,Integer> findSisterPrime(){
		HashMap<Integer,Integer> container = new HashMap<Integer, Integer>();
		for (int i = 101; i < 1000; i+=2) {		//第一个循环循环100到1000之间的奇数
			//判断i是否为素数
			int j;
			for (j = 2; j < i; j++) {
				if(i%j==0) {
					break;
				}
			}
			if(j==i) {		//如果j和i相等，则i是素数
				for (;j < i+2; j++) {	//判断i+2（即i的下一个奇数）是不是素数
					if((i+2)%j==0) {
						break;
					}
				}
				if(j==(i+2)) {		//如果j和i+2相等，则i+2是素数
					container.put(i, i+2);	//将i和i+2存入Hashap
				}
			}
		}
		return container;
	}
	
	public static void main(String[] args) {
		HashMap<Integer, Integer> container = new HashMap<>();
		container = new Task6().findSisterPrime();
//		Set<Entry<Integer, Integer>> s = container.entrySet();
//		Iterator<Entry<Integer, Integer>> i = s.iterator();
//		while (i.hasNext()) {
//			System.out.println(i.next());
//			
//		}
		Set<Integer> s = container.keySet();
		Iterator<Integer> i = s.iterator();
		while (i.hasNext()) {
			Integer integer = (Integer) i.next();
			System.out.println(integer+","+container.get(integer));
		}
	}

}
