package sist.com.controller;

public class ControllerEx6 {

	public void loopingEx1(int count) { // count À¯¿¬¼º
		for (int i = 1; i <= count; i++) {
			if (i % 6 == 0)
				System.out.println();
			if (!(i % 2 == 0))
				continue;
//			System.out.print(i+ "\t");
			System.out.printf("%-5d", i);
		}
	}

	public void loopingEx2(int count) {
		int i = 0;
		while (i < count) {
			i++;
			if (i % 2 == 0)
				continue;
			System.out.println(i);
		}
	}

	public void loopingEx3() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(j + "*" + i + "=" + j * i + "\t");
			}
			System.out.println();
		}
	}

	public void loopingEx4() {
		int i = 0;
		int j = 0;
		while (i++ < 9) {
			while (j++ < 9) {
				System.out.printf("%d * %d = %d\t", i, j, i * j);
				//j++;
			}
			System.out.println();
			j = 0;
			//i++;
		}
	}
	
	public void loopingEx5(){
		int i = 1;
		int j = 1;
		
		do {
			do {
				System.out.printf("%d * %d = %d\t", i, j, i * j);
				j++;
			}while(j<=9);
			System.out.println();
			j = 1;
			i++;
		}while(i<=9);
	}


	public static void main(String[] args) {
		ControllerEx6 c = new ControllerEx6();
		//c.loopingEx5();
		System.out.println();
		c.loopingEx4();
	}
}
