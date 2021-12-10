package algorithm.calender;

import java.util.Scanner;

public class Calender {

	int year = 0, month = 0;
	Scanner scanner = new Scanner(System.in);

	public void weekDay() {
		
		int[] lastDay = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String[] strWeek = { "일", "월", "화", "수", "목", "금", "토" };
		
		System.out.println("Year:");
		year = scanner.nextInt();

		System.out.println("Month:");
		month = scanner.nextInt();

		/*
		 * 입력한 해의 전까지의 일수 (year - 1) / 4 와 (year - 1) / 400 는 윤달이 있는 해 +1
		 * (year - 1) /100 은 100년 마다 윤달이 아닌 해 -1
		 */		
		int total = (year - 1) * 365 + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;	
		
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			lastDay[1]++;
		}
		
		for (int i = 0; i < month - 1; i++) {
			total += lastDay[i];
		}
		total++;
		
		int week = total % 7;
		System.out.println(year + "년" + month + "월");
		
		for (int i = 0; i < strWeek.length; i++) {
			System.out.print(strWeek[i] + "\t");
		}
		
		System.out.println();
		
		for(int i=1;i<=lastDay[month-1];i++) {
	         if(i==1) {
	            for (int j = 0; j < week; j++) {
	               System.out.print("\t");
	            }
	         }
	         System.out.printf("%1d\t",i);
	         week++;
	         if(week>6) {
	            week=0;
	            System.out.println();
	         }
	         
	      }
	}


	public static void main(String[] args) {
		Calender a = new Calender();
		a.weekDay();

	}

}
