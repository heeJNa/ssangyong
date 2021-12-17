package algorithm.basic;

class Lotto{
	
	public int randomEx() {
		return ((int) (Math.random() * 100) % 45 + 1);
	}

	public void lotto() {
		int[] m = new int[6]; // [int][][][][][][][][][]
		for (int i = 0; i < m.length; i++) {
			m[i] = randomEx();
			for(int j =0; j <i; j++) {
				if(m[i] == m[j]) {	//중복방지
					i--;
					break;
				}
			}
			
		}
		bubbleSort(m);
		disp(m);
	}

	public void disp(int[] data) {
		for (int i : data)
			System.out.printf("%3d", i);
	}

	public int[] bubbleSort(int[] a) {
		int tmp = 0;
		for (int i = a.length; i > 0; i--) {
			boolean b = false;
			for (int j = 0; j < i-1; j++) {
				if (a[j] > a[j + 1]) {
					tmp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tmp;
					b = true;
				}
			}
			if(!b) break;	//한번도 안바뀌면 false
		}
		return a;
	}
}
				

public class LottoProgram {

	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		lotto.lotto();
	}
}

