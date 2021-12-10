package variable;

public class ImplicitConversion {

	public static void main(String[] args) {

		byte bNum=10;
		int iNum=bNum;
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2=20;
		float fNum=iNum2; //형변환이 됨.
		
		System.out.println(fNum); 
		
		double dNum;
		dNum=fNum+iNum; 
		//int가 먼저 float으로 바뀌고 float이 double로 바뀜. 2번의 형변환이 일어남
		
		System.out.println(dNum);
	}

}
