package com.hst.第一题;

public class Task1 {
	/**
	 * 打印某学生某一学期的Java、数据库和英语等课程的成绩和等级（优、良、中、及格和不及格），并给出平均成绩。
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] scoreInfo = new int[3][3];
		scoreInfo[0][0] = 90;
		scoreInfo[1][0] = 20;
		scoreInfo[2][0] = 70;
		
		for (int i = 0; i < scoreInfo.length; i++) {
			if (scoreInfo[i][0]/10 <6) {
				scoreInfo[i][1] = 1;
			}
			else if (scoreInfo[i][0]/10 ==7) {
				scoreInfo[i][1] = 2;
			}
			else if (scoreInfo[i][0]/10 ==8) {
				scoreInfo[i][1] = 3;
			}
			else if (scoreInfo[i][0]/10 ==9) {
				scoreInfo[i][1] = 4;
			}
			else if (scoreInfo[i][0]/10 ==10) {
				scoreInfo[i][1] = 5;
			}
			
		}
		
		double average = (scoreInfo[0][0] + scoreInfo[1][0] + scoreInfo[2][0])/3.0;
		String rank,course = null;
		System.out.println("姓名\t张三");
		
		for (int i = 0; i < scoreInfo.length; i++) {
			switch (i) {
			case 0:
				course = "Java";
				break;
			case 1:
				course = "数据库";
				break;
			case 2:
				course = "英语";
			
				break;
			}
			switch (scoreInfo[i][1]) {
			case 1:
				rank="不及格";
				break;
			case 2:
				rank="及格";
				break;
			case 3:
				rank="中";
				break;
			case 4:
				rank="良";
				break;
			default:
				rank="优";
				break;
			}
			System.out.println(course+"\t"+scoreInfo[i][0]+"\t"+rank);
		}
		System.out.println("平均\t"+average);

	}

}
