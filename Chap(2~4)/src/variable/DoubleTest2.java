package variable;

public class DoubleTest2 {

	public static void main(String[] args) {

		double dNum =1;
		
		for(int i=0; i<10000; i++) {
			dNum=dNum+0.1;
		}
		System.out.println(dNum); //부동소수점 오류로 인해 1001이 정확히 안나옴.
		//이러한 오류를 감수하고도 더 많은 실수를 표현하기위해 부동소수점을 사용
	}

}
