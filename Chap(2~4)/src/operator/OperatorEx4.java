package operator;

public class OperatorEx4 {

	public static void main(String[] args) {

	int num1=0B00001010; //10
	int num2=0B00000101; //5
	
	System.out.println(num1&num2); //and����
	System.out.println(num1|num2); //or ����
	System.out.println(num1^num2); //xor����
	
	System.out.println(num2<<2); //2��2���� ���Ѵ�
	System.out.println(num2<<=3); //2��3���� ���ϰ� ����
	System.out.println(num1>>1); //2��1���� ����
	}
}
	
