package small_program.student;

//(alt+shitf+s)+r (getter,setter)
//(alt+shitf+s)+o (Constructor)
//(alt+shitf+s)+s  toString
public class Student implements Comparable<Student>{
	private String name;
	private int age;
	private String stdID;
	private String schoolName;
	private Score score;


	public Student() {
		score = new Score();
	}

	public Student(Score score) {
		super();
		this.score = score;
	}

	public Student(String name, int age, String stdID, String schoolName) {
		this.name = name;
		this.age = age;
		this.stdID = stdID;
		this.schoolName = schoolName;
		score = new Score();
	}

	public Score getScore() {
		return score;
	}

	public void setScore(Score score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getStdID() {
		return stdID;
	}

	public void setStdID(String stdID) {
		this.stdID = stdID;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	

	@Override
	public String toString() {
		return "�̸� : " + name + ", ���� : " + age + ", �й� : " + stdID + ", �б��� : " + schoolName;
	}

//	parameter���� ���� ��� ������ ����
//	parameter�� ���� ��� 0�� ����
//	parameter���� ū ��� ����� ����
	@Override
	public int compareTo(Student o) {
		if(o.age<age) {
			return 1;
		} else if(o.age>age) {
			return-1;
		}
		return 0;
	}
}