package algorithm.basic;

public class NumberCount {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int[]count = new int[10];
		
		for(int i = 0; i< arr.length; i++) {
			arr[i] = (int)(Math.random()*10);
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
		
		for(int i = 0; i< arr.length; i++) {
			count[arr[i]]++;
		}
		
		for(int i = 0; i < count.length; i++) {
			System.out.println(i + "ÀÇ °³¼ö : " + count[i]);
		}
	}

}
