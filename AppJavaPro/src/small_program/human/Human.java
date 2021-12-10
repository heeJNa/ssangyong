package small_program.human;

import java.util.Calendar;
import java.util.Scanner;

public class Human {
	private String[] data = { "������#990203-1234567#031)477-4547", "������#940303-2234567#02)471-4661",
			"������#940803-1234567#061)457-8562", "������#881202-2234567#031)477-9764" };
	private String[] arr = {"������","��", "��", "����", "��", "��", "ȣ����", "�䳢", "��", "��", "��", "��"};
	
	Man[] man = new Man[data.length];
	Calendar calendar = Calendar.getInstance();
	Scanner scanner = new Scanner(System.in);
	
	public Human() {
	}

	public void process() {
		for (int i = 0; i < data.length; i++) {
			man[i] = new Man();
			man[i].setName(data[i].split("#")[0]); // �̸� ����

			int year = Integer.parseInt(data[i].split("#")[1].substring(0, 2));	//����
			if ((Integer.parseInt(data[i].split("-")[1].substring(0, 1))) <= 3) {
				year += 1900;
				man[i].setAge(calendar.get(Calendar.YEAR) - year + 1);
			} else {
				year += 2000;
				man[i].setAge(calendar.get(Calendar.YEAR) - year + 1);
			}
			
			int month = Integer.parseInt(data[i].split("#")[1].substring(2, 4));	//���� 
			int date = Integer.parseInt(data[i].split("#")[1].substring(4, 6));
			if (calendar.get(Calendar.MONTH) + 1 == month && calendar.get(Calendar.DATE) == date) {
				man[i].setBrith(true);
			}
			
			int gender = Integer.parseInt(data[i].split("-")[1].substring(0,1));	//����
			if(gender == 1 || gender == 3) {
				man[i].setGender("Man");
			} else 
				man[i].setGender("Woman");
			
			String local = data[i].split("#")[2].substring(0,3);	//����
			switch(local) {
			case "031":
				man[i].setLocation("���"); break;
			case "032":
				man[i].setLocation("��õ"); break;
			case "033":
				man[i].setLocation("����"); break;
			case "041":
				man[i].setLocation("�泲"); break;
			case "042":
				man[i].setLocation("����"); break;
			case "043":
				man[i].setLocation("���"); break; 
			case "044":
				man[i].setLocation("����"); break;
			case "051":
				man[i].setLocation("�λ�"); break;
			case "052":
				man[i].setLocation("���"); break;
			case "053":
				man[i].setLocation("�뱸"); break;
			case "054":
				man[i].setLocation("���"); break;
			case "055":
				man[i].setLocation("�泲"); break;
			case "061":
				man[i].setLocation("����"); break;
			case "062":
				man[i].setLocation("����"); break;
			case "063":
				man[i].setLocation("����"); break;
			case "064":
				man[i].setLocation("����"); break;
			default:
				man[i].setLocation("����");
			}
			man[i].setDdi(arr[year % 12]);			//��
			man[i].setTel(data[i].split("#")[2]);	//��ȭ��ȣ
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
