package algorithm.basic;


class Max {
	
	int[] arr = new int[10];
	int max = 0;
	int min = 100;
	int count;
	int avg;
	
	public void maxEx() {
		randomEx();
		
		for(int i = 0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}else if(min>arr[i]){
					min = arr[i];
			}
		}
		System.out.println("최대값 : " + max +"\n최소값 : " + min + "\n근사값은 : " + near()  +"\n평균값 : " 
							+ getAvg() + "\n평균 값 이상인 요소의 개수 : " + count);
	}
	
	private int getAvg() {
		int sum = 0;
		for(int i : arr) {
			sum += (float)i;
		}
		avg = sum/arr.length;
		
		for(int i : arr) {
			if(i>=avg) {
				count++;
			}
		}
		
		return avg;
	}
	
	private int near() {
		int m = 125;
		int target = 25;
		int d= 0;
		int near = 0;
		
		for(int i =0; i<arr.length; i++) {
			if(target>arr[i]) {
				d = target - arr[i];
			}else {
				d = arr[i] - target;
			}
			if(d<m) {
				m = d;
				near = arr[i];
			}
		}	
		
		return near;
	}

	private void randomEx() {
		for (int i = 0; i< arr.length; i++) {
			arr[i] = (int) (Math.random() * 100 + 1);
		}
		sort();
		for(int i : arr)
			System.out.printf("%-4d",i);
		
		
		System.out.println();
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
	
}
		
public class MaxTest {
	
	public static void main(String[] args) {
		Max max = new Max();
		max.maxEx();
	}
	
}
		



		

