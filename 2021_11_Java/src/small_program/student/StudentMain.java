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
			System.out.println("1. StudAdd 2.StudInfo 3.StudList 4.StudDelete 5. StudUpdate 6. 종료");
			switch (scanner.nextInt()) {
			case 1:
				inputStudent();
				break;
			case 2:
				showStudInfo();
				break;
			case 3:
				System.out.println("==================학생 목록(나이 순)==================");
				showStudList();
				break;
			case 4:
				deleteStud();
				break;
			case 5:
				updateStud();
				break;
			default:
				System.out.println("종료하겠습니다.");
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
		System.out.println("정보를 확인할 학생의 학번을 입력하시오.");
		String stdID = scanner.next();
		int index = search(stdID);
		if (index == -1)
			return;
		System.out.println(studList.get(index).toString());
		System.out.println(studList.get(index).getName() + " 학생의 성적");
		System.out.println(studList.get(index).getScore().toString());
	}

	private void showStudList() {
		if (isEmpty())
			return;
		System.out.println("1. 이름순 2. 나이순 3.성적순");
		String sort = "";
		int n = scanner.nextInt();
		if (n == 1) {
			sort = "이름순";
			nameSort();
		}else if(n == 3) {
			sort = "성적순";
			rankSort();
		}
		else {
			sort = "나이순";
			sort();
		}
		System.out.println("총 " + studCount +"명의 학생을 " + sort +"으로 나열하겠습니다.");
		for (int i = 0; i < studCount; i++) {
			System.out.println(i + 1 + "번 학생\n" + studList.get(i).toString());
			System.out.println(studList.get(i).getName() + " 학생의 성적");
			System.out.println(studList.get(i).getScore().toString());
		}
	}

	private void deleteStud() {
		if (isEmpty())
			return;
		System.out.println("삭제할 방법을 선택하시오.");
		System.out.println("1.학번  2.번호");
		int select = scanner.nextInt();
		if (select == 1) {
			System.out.println("학번을 입력하시오.");
			String stdID = scanner.next();
			deleteStud(stdID);
		} else {
			System.out.println("번호(index)를 입력하시오. (1 ~ " + studCount + ")");
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
		System.out.println("정보를 변경할 학생의 학번을 입력하시오.");
		String stdID = scanner.next();
		int index = search(stdID);
		if(index == -1) {
			System.out.println("해당 학번을 가진 학생은 없습니다.\n Update를 종료하겠습니다.");
			return;
		}
		boolean exit = true;
		while (exit) {
			System.out.println("변경할 정보를 선택하시오. 1.이름 2.나이 3.학번 4.학교이름 5.성적 6.종료");
			switch (scanner.nextInt()) {
			case 1:
				System.out.print("기존 이름 : " + studList.get(index).getName() + " -----> 변경할 이름 : ");
				String newName = scanner.next();
				studList.get(index).setName(newName);
				break;
			case 2:
				System.out.print("기존 나이 : " + studList.get(index).getAge() + " -----> 변경할 나이 : ");
				int newAge = scanner.nextInt();
				studList.get(index).setAge(newAge);
				break;
			case 3:
				System.out.print("기존 학번 : " + studList.get(index).getStdID() + " -----> 변경할 학번 : ");
				String newStdID = null;
				while (newStdID == null) {
					newStdID = checkDuplication(scanner.next());
				}
				studList.get(index).setStdID(newStdID);
				break;
			case 4:
				System.out.print("기존 학교명 : " + studList.get(index).getSchoolName() + " -----> 변경할 학교명 : ");
				String newSchoolName = scanner.next();
				studList.get(index).setName(newSchoolName);
				break;
			case 5:
				System.out.println("학생의 성적을 다시 입력하겠습니다.");
				studList.get(index).setScore(makeScore());
			default:
				exit = false;
				break;
			}
		}
	}

	private Score makeScore() {
		Score score = new Score();
		System.out.println("학생의 국어점수를 입력하시오");
		int kor = scanner.nextInt();
		score.setKor(kor);
		System.out.println("학생의 수학점수를 입력하시오");
		int eng = scanner.nextInt();
		score.setEng(eng);
		System.out.println("학생의 영어점수를 입력하시오");
		int math = scanner.nextInt();
		score.setMath(math);
		double avg = score.calAvg();
		System.out.println("학생의 평균은 " + Math.round(avg*100)/100.0 + "입니다.");
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
				System.out.println("같은 학번이 존재합니다. 다른 학번을 입력하시오");
				return null;
			}
			i++;
		} while (i < studCount);
		return stdID;
	}

	private void sort() {
		Collections.sort(studList); // 나이 순으로 정렬
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
			System.out.println("등록된 학생이 없습니다.");
			return true;
		} else
			return false;
	}

	public static void main(String[] args) {
		StudentMain s = new StudentMain();
		s.menu();
	}
}
