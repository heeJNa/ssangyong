package com.sist.lib;

import java.text.*;
import java.util.Random;

public class MainClass9 {
	public static void main(String[] args) {
		// 10���� ������ �޾Ƽ� ���� => >=90 A, >=80 B, >=70 C...
		// ChoiceFormat
		double[] hak = { 50, 60, 70, 80, 90 };
		int[] student = new int[10];
		Random r = new Random();
		for (int i = 0; i < student.length; i++) {
			student[i] = r.nextInt(51) + 50;
		}
		// ���
		for (int i : student) {
			System.out.print(i + " ");
		}
		System.out.println();
		String[] score = { "F", "D", "C", "B", "A" };
		ChoiceFormat cf = new ChoiceFormat(hak, score); // double���� ���� �� �迭�� ũ�Ⱑ ���ƾ� �Ѵ�.
		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i] + " => " + cf.format(student[i]));
		}

		for (int i : student) {
			char c = 'A';
			if (i >= 90)
				c = 'A';
			else if (i >= 80)
				c = 'B';
			else if (i >= 70)
				c = 'C';
			else if (i >= 60)
				c = 'D';
			else
				c = 'F';
			System.out.println(i + " => " + c);
		}

	}
}
