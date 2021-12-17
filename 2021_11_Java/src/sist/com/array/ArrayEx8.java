package sist.com.array;

public class ArrayEx8 {

	public int[] add(int... x) {
		for (int i = 0; i < x.length; i++) {
			x[i] += 50;
		}
		return x;
	}

	/*
	 * public int[] add(int[] x) { int i = 0; while (i < x.length) { x[i++] += 100;
	 * } return x; }
	 */

	/*
	 * public void add(int ...x) {
	 * 
	 * }
	 */
	
	public String[] add(String ...str) {
		
		return new String[] {str[0],str[2]};
	}
	public static void main(String[] args) {
		ArrayEx8 a = new ArrayEx8();
		a.add(new int[] { 50, 60 });
		a.add(new int[] { 10, 20, 30, 40, 50 });
		String s1 = a.add("JAVA","Xml","React")[0];
		String s2 = a.add("JAVA","Xml","React")[1];
		
		System.out.println(s1);
		System.out.println(s2);
		/*
		 * for( int i:a.add(10,20,30,40,50)) { System.out.println(i); }
		 */
	}
}
