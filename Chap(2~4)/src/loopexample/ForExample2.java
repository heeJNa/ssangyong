package loopexample;

public class ForExample2 {

	public static void main(String[] args) {

		
		for(int i=1;i<=9;i++) {
			System.out.print(i+"´Ü : ");
			for(int j=1;j<=9;j++) {
				System.out.print(+i+"x"+j+"="+ i*j+" ");
			}
			System.out.println();
		}
			
		/* int dan = 2;
		 * int count=1;
		 * while(dan<=9){
		 * int count = 1;
		 * 		while(count <= 9){
		 * 			System.out.print(+i+"x"+j+"="+ i*j+" ");
		 * 			coutn++;
		 * 			}
		 * 			dan++;
		 * 			System.out.println();
		 * }
		 * 		
		 * */
	}

}
