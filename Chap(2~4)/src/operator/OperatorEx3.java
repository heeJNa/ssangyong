package operator;

public class OperatorEx3 {

	public static void main(String[] args) {

		int num1=10;
		int i = 2;
		
		boolean value =((num1=num1+10)<10) && ((i=i+2)<10);
		//앞부분이 이미 false이기 때문에 뒤에는 확인하지 않음.
		System.out.println(num1);
		System.out.println(i);
		
		System.out.println(value);
		
		int num2=10;
		int num3=20;
		
		int num =(num2>num3)?num2:num3;
		
		System.out.println(num);
	}

}
