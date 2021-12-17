package algorithm.basic;

public class LeastCommonMultiple {
	
	public int greatestCommonDivisor (int a, int b){
		if(a>b) {
			if(b==0) return a;
			else return greatestCommonDivisor(b, a%b);
		}else {
			if(a==0) return b;
			else return greatestCommonDivisor(a, b%a);
	}
}
	public int leastCommonMultiple (int a, int b) {
		return (a*b)/greatestCommonDivisor(a, b);
	}
	


	public static void main(String[] args) {
		
		LeastCommonMultiple l = new LeastCommonMultiple();
		
		System.out.println(l.greatestCommonDivisor(45, 60));
		System.out.println(l.leastCommonMultiple(45, 60));
	}


}