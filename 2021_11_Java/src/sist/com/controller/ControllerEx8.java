package sist.com.controller;

import java.util.Scanner;

public class ControllerEx8 {

	Scanner scanner = new Scanner(System.in);

	public void controllerEx1() {
		String name = null;
		int age = 0;
		String addr = null;
		String state;
		while (true) {
			do {
				System.out.print("Name : ");
				name = scanner.nextLine();
			} while (!(name.length() >= 2 && name.length() <= 6));
			do {
				System.out.print("age : ");
				age = scanner.nextInt();
				scanner.nextLine();
			} while (!(age >= 20 && age <= 100));
			do {
				System.out.println("계속할거니? yes/no");
				state = scanner.nextLine();
			} while (!(state.equals("yes") || state.equals("no")));
			if (state.equals("no"))
				break;
		}
		// System.out.println(name + " " + age);
	}

	public void controllerEx2() {

	}

	public static void main(String[] args) {
		ControllerEx8 c = new ControllerEx8();
		c.controllerEx1();
	}

}
