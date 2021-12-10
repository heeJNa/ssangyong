package loopexample;

public class BreakContinueTest {

	public static void main(String[] args) {

		for(int i=2;i<=9;i++) {
			if(i%2 == 1) continue;
			System.out.print(i+"´Ü : ");
			for(int j=1;j<=9;j++) {
				if(i<j) break;
				System.out.print(+i+"x"+j+"="+ i*j+" ");
			}
			System.out.println();
		}
			
	}

}
