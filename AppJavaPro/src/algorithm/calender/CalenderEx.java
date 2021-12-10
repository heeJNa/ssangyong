package algorithm.calender;

import java.util.Scanner;

public class CalenderEx {
	
	Scanner scanner = new Scanner(System.in);
	
	int year;
	int month;
	int total;
	private int[] monthDay = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private String[] dayOfWeek = { "일", "월", "화", "수", "목", "금", "토" };
	
	public void calender() {
		insert();
		disp();
	}
	
	private void insert() {
		System.out.print("Year : ");
		year = scanner.nextInt();
		System.out.print("Month : ");
		month = scanner.nextInt();
	}
	
	private int totalDays() {
		
		return total = (year-1) * 365 + (year-1)/4 - (year-1) / 100 + (year-1) / 400;
	}
	
	private void getLastDay() {
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			monthDay[1]++;
		}
	}
	private int getWeek() {
		getLastDay();
		int week = totalDays();
		
		for(int i = 0; i<month-1;i++) {
			week += monthDay[i];
		}
		week++;
		return week%7;
	}
	
	private void disp() {
		int tab = getWeek();
		
		System.out.printf("%d년 %1d월\n",year,month);
		for (int i = 0; i < dayOfWeek.length; i++) {
			System.out.print(dayOfWeek[i] + "\t");
		}
		System.out.println();
		for(int i=1;i<=monthDay[month-1];i++) {
	         if(i==1) {
	            for (int j = 0; j < tab; j++) {
	               System.out.print("\t");
	            }
	         }
	         System.out.printf("%1d\t",i);
	         tab++;
	         if(tab>6) {
	            tab=0;
	            System.out.println();
	         }
		}
	}
	

	public static void main(String[] args) {
		CalenderEx c = new CalenderEx();
		c.calender();
	}

}
