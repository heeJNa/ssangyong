package algorithm.basic;

public class MaxCount {
	
	int[] arr = new int[10];
	int [] count = new int[10];
	int [] m = new int[5];
	int max;
	int maxCount;
	
	private void randomEx() {
		for (int i = 0; i< arr.length; i++) {
			arr[i] = (int) (Math.random() * 10);
		}
		sort();
		for(int i : arr)
			System.out.printf("%-4d",i);
		System.out.println();
		maxCount();
	}
		
	public void maxCount() {
		
		
		for(int i = 0; i<arr.length; i++) {
			count[arr[i]]++;
		}
		for(int i =0; i<count.length; i++) {
			if(max<=count[i]) {
				max = count[i];
			}
		}
		count(count);
		
		System.out.print("최빈수는 ");
		
		for(int i =0; i<maxCount; i++) {
			System.out.print(m[i]+ "  ");
		}
		System.out.println( "이고 " + "출현횟수는 " +max +"이다.");
	}
	
	private int[] count(int[] count) {
		for(int i = 0, j = 0; i<count.length; i++) {
			if(count[i] == max) {
				m[j++] = i;
				maxCount++;
			} else
				continue;
		}
		return m;
	}
	
	private void sort() {	//선택 정렬
		int tmp = 0;
		
		for(int i = 0; i<arr.length; i++) {
			int min = i;
			for(int j = i+1; j<arr.length; j++) {
				if(arr[min]>arr[j]) {
					min = j;
				}
			}
			tmp = arr[i];
			arr[i]= arr[min];
			arr[min] = tmp;
		}
		
	}
	public static void main(String[] args) {
		MaxCount m = new MaxCount();
		m.randomEx();
	}
	
}
		
	
	
	
	
				
		
