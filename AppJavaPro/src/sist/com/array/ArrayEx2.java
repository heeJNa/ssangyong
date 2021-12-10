package sist.com.array;

public class ArrayEx2 {

	public int randomEx() {
		return ((int) (Math.random() * 100) % 45 + 1);
	}

	public void arrayAction() {
		int[] m = new int[7]; // [int][][][][][][][][][]
		for (int i = 0; i < m.length; i++) {
			m[i] = randomEx();
			for (int j = 0; j < i; j++) {
				if (m[i] == m[j]) {
					i--;
					break;
				}
			}

		}
		disp(m);
	}

	public void disp(int[] data) {
		for (int i : data)
			System.out.printf("%3d", i);
	}

	public int[] arrayAction2() {
		int[] array = { 95, 27, 64, 100, 90 };
		return array;

	}

	public static void main(String[] args) {
		ArrayEx2 a = new ArrayEx2();
		// a.arrayAction();
		for (int i = 0; i < a.arrayAction2().length; i++)
			System.out.println(a.arrayAction2()[i]);
	}
}
