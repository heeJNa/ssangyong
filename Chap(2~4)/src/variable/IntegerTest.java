package variable;

public class IntegerTest {

	public static void main(String[] args) {
		
		byte bs=-128;
		System.out.println(bs);
		
		/*int ival=12345678900;
		long lval=12345678900;
		자바는 숫자가있으면 모두 4바이트로 처리.*/
		long lval=12345678900L; 
		//4바이트 이상은 L로 long이라는것을 알림
		long lval2=100; //4바이트 이하는 자동으로 int로형변환

	}

}
