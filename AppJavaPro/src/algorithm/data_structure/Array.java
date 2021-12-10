package algorithm.data_structure;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	int count;
	int[] arr;
	public int length;
	int ERROR = -1;
	Scanner scanner = new Scanner(System.in);

	public Array() {
		count = 0;
		this.length = 10;
		arr = new int[length];
	}

	public Array(int length) {
		count = 0;
		this.length = length;
		arr = new int[length];
	}

	public void increment() {
		int[] imsi = new int[length * 2];
		System.arraycopy(arr, 0, imsi, 0, arr.length);
		System.out.println(Arrays.toString(imsi));
	}

	public void add(int num) {
		if (isFull()) {
			System.out.println("Array is full");
			do {
				System.out.println("�� ū �迭�� ���� �Ͻðڽ��ϱ�? (yes/no)");
				String s = scanner.nextLine();
				if (s.equals("yes")) {
					increment();
					return;
				} else if (s.equals("no")) {
					return;
				} else {
					continue;
				}
			} while (true);
		} else {
			arr[count++] = num;
		}
	}

	public void update(int index, int num) {
		if (isEmpty()) {
			System.out.println("Empty");
			return;
		} else if (index < 0 || index > count) {
			System.out.println("Out Of Index");
			return;
		}
		arr[index - 1] = num;
	}

	public int delete() {

		int error = ERROR;

		System.out.print("�� ��° ���� ����ðڽ��ϱ� ? (1 ~ " + count + ") >> ");
		int index = scanner.nextInt();
		scanner.nextLine();

		if (isEmpty()) {
			System.out.println("Empty");
			return error;
		} else if (index <= 0 || index > count) {
			System.out.println("Out Of Index");
			return error;
		}
		int tmp = arr[index - 1];

		if (index == count) {
			arr[index - 1] = 0;
			return tmp;
		} else {
			for (int i = index - 1; i < count - 1; i++) {
				arr[i] = arr[i + 1];
			}
			for (int i = --count; i < length; i++) {
				arr[i] = 0;
			}
			return tmp;
		}
	}
	
	public int delete(int index) {

		int error = ERROR;

		if (isEmpty()) {
			System.out.println("Empty");
			return error;
		} else if (index < 0 || index > count) {
			System.out.println("Out Of Index");
			return error;
		}
		int tmp = arr[index - 1];

		if (index == count) {
			arr[index - 1] = 0;
			return tmp;
		} else {
			for (int i = index - 1; i < count - 1; i++) {
				arr[i] = arr[i + 1];
			}
			for (int i = --count; i < length; i++) {
				arr[count] = 0;
			}
			return tmp;
		}
	}

	public int delete(int data, String state) {

		int index;
		int tmp = 0;
		
		System.out.print("�ߺ��Ǵ� ���� ��� ����ðڽ��ϱ� ? (Yes/No) >>");
		state = scanner.nextLine();

		do {	//�ߺ��Ǵ� ���� �־ ����
			index = search(data);
			if(index == ERROR) break;
			tmp = arr[index];

			if (index+1 == count) {
				arr[index] = 0;
				return tmp;
			} else {
				for (int i = index; i < count - 1; i++) {	//�ڿ� ���� ������ �����
					arr[i] = arr[i + 1];
				}
				for (int i = --count; i < length; i++) {	//�ڿ� ���� 0���� ä���
					arr[i] = 0;
				}
			}
		} while (state.toLowerCase().equals("yes"));	//state�� a�� �ߺ� �� ����
		
		return tmp;
	}

	public int search(int data) {// where,what

		int ret = ERROR;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == data)
				return i;
		}
		return ret;
	}

	public int search(int data, int fromIndex) {// where,what

		int ret = ERROR;

		for (int i = fromIndex; i < arr.length; i++) {
			if (arr[i] == data)
				return i;
		}
		return ret;

	}

	public void modify(int data, int change, int fromIndex, char state) {// where(Point),(origin,change)ValueCahange
		int index = search(data, fromIndex);

		if (index == ERROR)
			return;

		arr[index] = change;
		if (state == 'a')
			modify(data, change, fromIndex, state);
	}

	public int getElement(int index) {
		if (isEmpty()) {
			System.out.println("Empty");
			return ERROR;
		} else if (index < 0 || index > count) {
			System.out.println("Out Of Index");
			return ERROR;
		}
		return arr[index - 1];
	}

	public boolean isEmpty() {
		if (count == 0)
			return true;
		else
			return false;
	}

	public int getSize() {
		return length;
	}

	public boolean isFull() {
		if (count >= length) {
			return true;
		} else
			return false;

	}

	public void removeAll() {
		for (int i = 0; i < length; i++) {
			arr[i] = 0;
		}
		count = 0;
	}

	public void showArray() {
		for (int i : arr) {
			System.out.printf("%-3d", i);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Array a = new Array(5);
		a.add(10);
		a.add(20);
		a.add(50);
		a.add(40);
		a.add(50);
		a.delete(50,"A");
		a.showArray();
//		a.update(2, 10);
//		a.delete();
//		a.showArray();
//		a.removeAll();
//		a.showArray();

	}

}
