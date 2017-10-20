package com.hst.第八题;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/***
 * 求1000之内的完全数。完全数就是一个数恰好等于它的因子之和。例如，6的因子为1，2，3，而6=1+2+3，因此6就是完全数
 * @author ataoD
 *
 */
public class Task8 {

	public Task8(List<Integer> container) {
		findPerfectNumber(container);
	}
	
	private void findPerfectNumber(List<Integer> container) 
	{
		List<Integer> temp = new ArrayList<>();
		for (int i = 0; i < 1000; i++) {	//0到1000的待找数
			temp.clear();
			for (int j = 1; j < i; j++) {	//寻找i的因子
				if(i%j==0) {
					temp.add(j);	//将找到的因子存入temp
				}
			}
			Iterator<Integer> it = temp.iterator();
			int sum = 0;
			while (it.hasNext()) {		//相加全部的因子
				sum+=it.next();
			}
			if(sum==i) {		//如果因子和等于数本身，则为完全数
				container.add(i);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		List<Integer> container = new ArrayList<>();
		new Task8(container);
		Iterator<Integer> i = container.iterator();
		for (int j = 0; i.hasNext(); j++) {
			if(j%10==0&&j!=0) {
				System.out.println();
			}
	 		System.out.print(i.next()+" ");
			
		}
	}

}
