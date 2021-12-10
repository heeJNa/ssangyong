package operator;

public class OperatorEx4 {

	public static void main(String[] args) {

	int num1=0B00001010; //10
	int num2=0B00000101; //5
	
	System.out.println(num1&num2); //and¿¬»ê
	System.out.println(num1|num2); //or ¿¬»ê
	System.out.println(num1^num2); //xor¿¬»ê
	
	System.out.println(num2<<2); //2ÀÇ2½ÂÀ» °öÇÑ´Ù
	System.out.println(num2<<=3); //2ÀÇ3½ÂÀ» °öÇÏ°í ´ëÀÔ
	System.out.println(num1>>1); //2ÀÇ1½ÂÀ» ³ª´®
	}
}
	
