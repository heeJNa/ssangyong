package algorithm.calender;

import java.util.Calendar;
import java.util.Scanner;

class BornProgram {
	private int year;
	private int month;
	private int day;
	private int[] monthDay = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private int[] yunMonthDay = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private String[] dayOfTheWeek = { "일", "월", "화", "수", "목", "금", "토" };
	private String[] arr = {"원숭이","닭", "개", "돼지", "쥐", "소", "호랑이", "토끼", "용", "뱀", "말", "양"};

	Scanner scanner = new Scanner(System.in);
	Calendar calendar = Calendar.getInstance();

	public void born() {
		do {
			System.out.print("태어난 해를 입력하시오 >> ");
			this.year = scanner.nextInt();
			if ((this.year > calendar.get(Calendar.YEAR)) || year < 1)
				System.out.println("0과 " + calendar.get(Calendar.YEAR) + "사이의 값을 입력하시오.");
			else {
				break;
			}
		} while (true);

		do {
			System.out.print("태어난 월을 입력하시오 >> ");
			month = scanner.nextInt();
			if (month < 1 || month > 12) {
				System.out.println("1 ~ 12 사이의 값을 입력하시오");
			} else
				break;
		} while (true);

		boolean b = true;

		do {

			System.out.print("태어난 일을 입력하시오 >> ");
			day = scanner.nextInt();

			switch (this.month) {
			case 1, 3, 5, 7, 8, 10, 12:
				if (day < 1 || day > 31) {
					System.out.println("1 ~ 31 사이의 값을 입력하시오");
				} else {
					b = false;
				}
				break;

			case 4, 6, 9, 11:
				if (day < 1 || day > 30) {
					System.out.println("1 ~ 30 사이의 값을 입력하시오");
				} else {
					b = false;
				}
				break;

			case 2:
				if (yundal(this.year)) {
					if (day < 1 || day > 29) {
						System.out.println("1 ~ 29 사이의 값을 입력하시오");
					} else {
						b = false;
					}
					break;

				} else {
					if (day < 1 || day > 28) {
						System.out.println("1 ~ 28 사이의 값을 입력하시오");
					} else {
						b = false;
					}
					break;

				}

			}

		}  while (b);
		System.out.println("당신의 생년월일은 " + year + "년" + month + "월" + day + "일 " + getDayOfTheWeek() + "이고 " + "나이는 만 "
				+ getAge() + "세 " + chineseZodiacSign() + "띠입니다.");
	}

	private int getAge() {
		if (this.month <= calendar.get(Calendar.MONTH) + 1) {
			if (this.day <= calendar.get(Calendar.DATE)) {
				return calendar.get(Calendar.YEAR) - this.year;
			} else if (this.month == calendar.get(Calendar.MONTH) + 1) {
				return calendar.get(Calendar.YEAR) - this.year - 1;
			} else {
				return calendar.get(Calendar.YEAR) - this.year;
			}
		} else
			return calendar.get(Calendar.YEAR) - this.year - 1;
	}


	private String getDayOfTheWeek() {
		int monthDay = 0;
		int count = 0;

		if (yundal(this.year)) {
			for (int i = 1; i < this.month; i++) {
				monthDay += this.yunMonthDay[i - 1];
			}
		} else
			for (int i = 1; i < this.month; i++) {
				monthDay += this.monthDay[i - 1];
			}
		count = (this.year - 1) * 365 + yundalCount(this.year) + monthDay + this.day;

		/*
		 * switch (sum % 7) { case 0: dayOfTheWeek = "일요일"; break; case 1: dayOfTheWeek
		 * = "월요일"; break; case 2: dayOfTheWeek = "화요일"; break; case 3: dayOfTheWeek =
		 * "수요일"; break; case 4: dayOfTheWeek = "목요일"; break; case 5: dayOfTheWeek =
		 * "금요일"; break; case 6: dayOfTheWeek = "토요일"; break;
		 * 
		 * } this.dayOfTheWeek = dayOfTheWeek; return dayOfTheWeek;
		 */
		
		return this.dayOfTheWeek[count % 7] + "요일";

	}

	private String chineseZodiacSign() {
		return this.arr[this.year % 12];

	}

	private int yundalCount(int year) {
		int count = 0;
		for (int i = 1; i < year; i++) {
			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
				count++;
			}
		}
		return count;
	}

	private boolean yundal(int year) {
		if (this.year % 4 == 0 && this.year % 100 != 0 || this.year % 400 == 0) {
			return true;
		} else
			return false;
	}

}

public class BornTest {

	public static void main(String[] args) {

		BornProgram born = new BornProgram();
		born.born();

	}

}
