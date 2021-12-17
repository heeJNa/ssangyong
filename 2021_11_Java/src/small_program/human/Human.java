package small_program.human;

import java.util.Calendar;
import java.util.Scanner;

public class Human {
	private String[] data = { "김희준#990203-1234567#031)477-4547", "이희준#940303-2234567#02)471-4661",
			"고희준#940803-1234567#061)457-8562", "박희준#881202-2234567#031)477-9764" };
	private String[] arr = {"원숭이","닭", "개", "돼지", "쥐", "소", "호랑이", "토끼", "용", "뱀", "말", "양"};
	
	Man[] man = new Man[data.length];
	Calendar calendar = Calendar.getInstance();
	Scanner scanner = new Scanner(System.in);
	
	public Human() {
	}

	public void process() {
		for (int i = 0; i < data.length; i++) {
			man[i] = new Man();
			man[i].setName(data[i].split("#")[0]); // 이름 추출

			int year = Integer.parseInt(data[i].split("#")[1].substring(0, 2));	//나이
			if ((Integer.parseInt(data[i].split("-")[1].substring(0, 1))) <= 3) {
				year += 1900;
				man[i].setAge(calendar.get(Calendar.YEAR) - year + 1);
			} else {
				year += 2000;
				man[i].setAge(calendar.get(Calendar.YEAR) - year + 1);
			}
			
			int month = Integer.parseInt(data[i].split("#")[1].substring(2, 4));	//생일 
			int date = Integer.parseInt(data[i].split("#")[1].substring(4, 6));
			if (calendar.get(Calendar.MONTH) + 1 == month && calendar.get(Calendar.DATE) == date) {
				man[i].setBrith(true);
			}
			
			int gender = Integer.parseInt(data[i].split("-")[1].substring(0,1));	//성별
			if(gender == 1 || gender == 3) {
				man[i].setGender("Man");
			} else 
				man[i].setGender("Woman");
			
			String local = data[i].split("#")[2].substring(0,3);	//지역
			switch(local) {
			case "031":
				man[i].setLocation("경기"); break;
			case "032":
				man[i].setLocation("인천"); break;
			case "033":
				man[i].setLocation("강원"); break;
			case "041":
				man[i].setLocation("충남"); break;
			case "042":
				man[i].setLocation("대전"); break;
			case "043":
				man[i].setLocation("충북"); break; 
			case "044":
				man[i].setLocation("세종"); break;
			case "051":
				man[i].setLocation("부산"); break;
			case "052":
				man[i].setLocation("울산"); break;
			case "053":
				man[i].setLocation("대구"); break;
			case "054":
				man[i].setLocation("경북"); break;
			case "055":
				man[i].setLocation("경남"); break;
			case "061":
				man[i].setLocation("전남"); break;
			case "062":
				man[i].setLocation("광주"); break;
			case "063":
				man[i].setLocation("전북"); break;
			case "064":
				man[i].setLocation("제주"); break;
			default:
				man[i].setLocation("서울");
			}
			man[i].setDdi(arr[year % 12]);			//띠
			man[i].setTel(data[i].split("#")[2]);	//전화번호
		}
	}

	public void disp() {
	      for(Man m:man) {
	         System.out.println(m.toString());
	      }
	   }

	public static void main(String[] args) {
		Human h = new Human();
		h.process();
		h.disp();
	}
}
