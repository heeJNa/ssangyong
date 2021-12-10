package variable;

public class ExplicitConversion {

	public static void main(String[] args) {

		int i =1000;
		byte bNum=(byte)i; //명시적 형변환. 데이터 유실이 발생할 수 있다.
		System.out.println(bNum); //데이터 유실 발생!!
		
		double dNum1=1.2;
		float fNum=0.9f;
		
		int iNum1=(int)dNum1+(int)fNum; // dNum1은 1이되고 fNum은 0이됨.
		int iNum2=(int)(dNum1+fNum);	//먼저 더하고  int로 바꿨기 때문에 2가됨.
		System.out.println(iNum1);
		System.out.println(iNum2);
	}

}
