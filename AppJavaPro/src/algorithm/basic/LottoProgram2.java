package algorithm.basic;

public class LottoProgram2 {

	public void lotto() {

		int[] ball = new int[45];

		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;
		}

		int tmp;
		int j;

		for (int k = 0; k < 6; k++) {
			j = (int) (Math.random() * 100 % 45);

			tmp = ball[k];
			ball[k] = ball[j];
			ball[j] = tmp;
		}
		
		sort(ball);
		
		for(int i = 0; i<6; i++) {
			System.out.printf("[%d]",ball[i]);
		}

	}
	
	public int[] sort(int[] a) {
		int tmp = 0;
		for (int i = 6; i > 0; i--) {
			boolean b = false;
			for (int j = 0; j < i-1; j++) {
				if (a[j] > a[j + 1]) {
					tmp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tmp;
					
					b=true;
				}
			}
			if(!b) break;
		}
		return a;
	}

	
	

	public static void main(String[] args) {
		LottoProgram2 l = new LottoProgram2();
		l.lotto();
	}

}
