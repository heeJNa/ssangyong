package sist.com.controller;

public class ControllerEx2 {

	public void controlEx1(double avg) {
		if (avg >= 90)
			System.out.println("A");
		else if (avg >= 80)
			System.out.println("B");
		else if (avg >= 70)
			System.out.println("c");
		else
			System.out.println("F");
	}

	public void controlEx2(int value) {
		switch (value) {
		case 5:
			System.out.println("5");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("6");
			break;
		default:
			System.out.println("±‚≈∏");

		}

	}

	public void controlEx3(int first, int second) { // 1 10
		switch (first) {
		case 1:
			System.out.println("1");
			switch (second) {
			case 10:
				System.out.println("10");
				return;
			case 20:
				System.out.println("20");
			}
		case 2:
			System.out.println("2");

		}

	}

	public void contorlEx4(double avg) {

		switch ((int) (avg / 10)) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		default:
			System.out.println("F");

		}
	}

	public void contorlEx5(String str) {

		switch (str) {
		case "Java":
			System.out.println("Java");
			break;
		case "Oracle":
			System.out.println("Oracle");
			break;
		case "Spring":
			System.out.println("Spring");
			break;
		default:
			System.out.println("can't use");

		}

	}

	public static void main(String[] args) {
		ControllerEx2 c = new ControllerEx2();
		c.controlEx1(60);
		c.controlEx2(9);
		c.controlEx3(1, 10); // 1, 10
		c.contorlEx4(60);
		c.contorlEx5("Java");

	}

}
