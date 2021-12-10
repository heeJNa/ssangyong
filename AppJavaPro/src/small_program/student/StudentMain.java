package small_program.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentMain {

	private Scanner scanner;
	private ArrayList<Student> studList;
	private int studCount;

	public StudentMain() {
		studList = new ArrayList<Student>();
		scanner = new Scanner(System.in);
		studCount = 0;
	}

	public void menu() {
		boolean exit = true;
		while (exit) {
			System.out.println("1. StudAdd 2.StudInfo 3.StudList 4.StudDelete 5. StudUpdate 6. ����");
			switch (scanner.nextInt()) {
			case 1:
				inputStudent();
				break;
			case 2:
				showStudInfo();
				break;
			case 3:
				System.out.println("==================�л� ���(���� ��)==================");
				showStudList();
				break;
			case 4:
				deleteStud();
				break;
			case 5:
				updateStud();
				break;
			default:
				System.out.println("�����ϰڽ��ϴ�.");
				exit = false;
				break;
			}
		}
	}
	
	private void inputStudent() {
		Student s = new Student();
		System.out.println("Name : ");
		s.setName(scanner.next());
		System.out.println("Age : ");
		s.setAge(scanner.nextInt());
		System.out.println("StdID : ");
		String stdID = null;
		while (stdID == null) {
			if (studCount != 0) {
				stdID = checkDuplication(scanner.next());
			} else
				stdID = scanner.next();
		}
		s.setStdID(stdID);
		System.out.println("SchoolName : ");
		s.setSchoolName(scanner.next());
		s.setScore(makeScore());
		studList.add(s);
		rank();
		studCount++;
	}

	private void showStudInfo() {
		if (isEmpty())
			return;
		System.out.println("������ Ȯ���� �л��� �й��� �Է��Ͻÿ�.");
		String stdID = scanner.next();
		int index = search(stdID);
		if (index == -1)
			return;
		System.out.println(studList.get(index).toString());
		System.out.println(studList.get(index).getName() + " �л��� ����");
		System.out.println(studList.get(index).getScore().toString());
	}

	private void showStudList() {
		if (isEmpty())
			return;
		System.out.println("1. �̸��� 2. ���̼� 3.������");
		String sort = "";
		int n = scanner.nextInt();
		if (n == 1) {
			sort = "�̸���";
			nameSort();
		}else if(n == 3) {
			sort = "������";
			rankSort();
		}
		else {
			sort = "���̼�";
			sort();
		}
		System.out.println("�� " + studCount +"���� �л��� " + sort +"���� �����ϰڽ��ϴ�.");
		for (int i = 0; i < studCount; i++) {
			System.out.println(i + 1 + "�� �л�\n" + studList.get(i).toString());
			System.out.println(studList.get(i).getName() + " �л��� ����");
			System.out.println(studList.get(i).getScore().toString());
		}
	}

	private void deleteStud() {
		if (isEmpty())
			return;
		System.out.println("������ ����� �����Ͻÿ�.");
		System.out.println("1.�й�  2.��ȣ");
		int select = scanner.nextInt();
		if (select == 1) {
			System.out.println("�й��� �Է��Ͻÿ�.");
			String stdID = scanner.next();
			deleteStud(stdID);
		} else {
			System.out.println("��ȣ(index)�� �Է��Ͻÿ�. (1 ~ " + studCount + ")");
			int index = scanner.nextInt();
			studList.remove(index - 1);
		}
		studCount--;
	}

	private void deleteStud(String stdID) {
		int index = search(stdID);
		if (index == -1)
			return;
		studList.remove(index);
	}
	
	private void updateStud() {
		if (isEmpty())
			return;
		System.out.println("������ ������ �л��� �й��� �Է��Ͻÿ�.");
		String stdID = scanner.next();
		int index = search(stdID);
		if(index == -1) {
			System.out.println("�ش� �й��� ���� �л��� �����ϴ�.\n Update�� �����ϰڽ��ϴ�.");
			return;
		}
		boolean exit = true;
		while (exit) {
			System.out.println("������ ������ �����Ͻÿ�. 1.�̸� 2.���� 3.�й� 4.�б��̸� 5.���� 6.����");
			switch (scanner.nextInt()) {
			case 1:
				System.out.print("���� �̸� : " + studList.get(index).getName() + " -----> ������ �̸� : ");
				String newName = scanner.next();
				studList.get(index).setName(newName);
				break;
			case 2:
				System.out.print("���� ���� : " + studList.get(index).getAge() + " -----> ������ ���� : ");
				int newAge = scanner.nextInt();
				studList.get(index).setAge(newAge);
				break;
			case 3:
				System.out.print("���� �й� : " + studList.get(index).getStdID() + " -----> ������ �й� : ");
				String newStdID = null;
				while (newStdID == null) {
					newStdID = checkDuplication(scanner.next());
				}
				studList.get(index).setStdID(newStdID);
				break;
			case 4:
				System.out.print("���� �б��� : " + studList.get(index).getSchoolName() + " -----> ������ �б��� : ");
				String newSchoolName = scanner.next();
				studList.get(index).setName(newSchoolName);
				break;
			case 5:
				System.out.println("�л��� ������ �ٽ� �Է��ϰڽ��ϴ�.");
				studList.get(index).setScore(makeScore());
			default:
				exit = false;
				break;
			}
		}
	}

	private Score makeScore() {
		Score score = new Score();
		System.out.println("�л��� ���������� �Է��Ͻÿ�");
		int kor = scanner.nextInt();
		score.setKor(kor);
		System.out.println("�л��� ���������� �Է��Ͻÿ�");
		int eng = scanner.nextInt();
		score.setEng(eng);
		System.out.println("�л��� ���������� �Է��Ͻÿ�");
		int math = scanner.nextInt();
		score.setMath(math);
		double avg = score.calAvg();
		System.out.println("�л��� ����� " + Math.round(avg*100)/100.0 + "�Դϴ�.");
		score.setAvg(avg);

		return score;

	}
	
	private int search(String stdID) {
		boolean b = false;
		int index = 0;
		for (Student i : studList) {
			if (i.getStdID().equals(stdID)) {
				b = true;
				break;
			}
			index++;
		}
		if (b)
			return index;
		else
			return -1;
	}

	private void rank() {
		if(studCount == 1) return;
		for (int i = 0; i < studCount; i++) {
			int rank = 1;
			for (int j = 0; j < studCount; j++) {
				if (studList.get(i).getScore().getAvg() > studList.get(j).getScore().getAvg()) {
					studList.get(j).getScore().setRank(++rank);
				}
			}
		}
	}

	private String checkDuplication(String stdID) {
		int i = 0;
		do {
			if (studList.get(i).getStdID().equals(stdID)) {
				System.out.println("���� �й��� �����մϴ�. �ٸ� �й��� �Է��Ͻÿ�");
				return null;
			}
			i++;
		} while (i < studCount);
		return stdID;
	}

	private void sort() {
		Collections.sort(studList); // ���� ������ ����
	}

	private void nameSort() {
		Collections.sort(studList, new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				return s1.getName().compareToIgnoreCase(s2.getName());
			}
		});
	}
	private void rankSort() {
		Collections.sort(studList, new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				return s1.getScore().compareTo(s2.getScore());
			}
		});
	}
	
	private boolean isEmpty() {
		if (studCount == 0) {
			System.out.println("��ϵ� �л��� �����ϴ�.");
			return true;
		} else
			return false;
	}

	public static void main(String[] args) {
		StudentMain s = new StudentMain();
		s.menu();
	}
}
