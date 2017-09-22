package com.hst.第三题;

import java.util.Scanner;

public class Task3 {
	/**
	 * 编写一个程序，给定一个t值（可初始化定义），按下式计算y值并输出，要求分别写出if语句和switch语句
	 * 		t^2-1		0<=t<1
	 * 		t^3-2t-2	1<=t<3
	 * y=	t^2-t*sint  3<=t<5
	 *  	t+1			5<=t<7
	 * 		t-1			其他
	 * @param args
	 */
	
	private static double enbodyByIf(int t){
		double y;
		if (t>=0 && t<1) {
			y = t*t - 1;
		}
		else if (t>=1 && t<3) {
			y = t*t*t - 2*t - 2;
		}
		else if(t>=3 && t<5){
			y = t*t - t*Math.sin(t);
		}
		else if (t>=5 && t<7) {
			y = t + 1;
		}
		else{
			y = t-1;
		}
		return y;
	}
	
	private static double enbodyBySwitch(int t){
		double y;
		switch (t) {
		case 0:
			y = t*t - 1;
			break;
		case 1:
		case 2:
			y = t*t*t - 2*t - 2;
			break;
		case 3:	
		case 4:	
			y = t*t - t*Math.sin(t);
			break;
		case 5:	
		case 6:
			y = t + 1;
			break;
		default:
			y = t-1;
			break;
		}
		return y;
	}
	
	public static void main(String[] args) {
		System.out.println("请输入t值");
		try{
			Scanner input = new Scanner(System.in);
			int t = input.nextInt();
			double y1 = enbodyByIf(t);
			double y2 = enbodyBySwitch(t);
			System.out.println("if:"+y1+"\nswitch:"+y2);
		}catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
