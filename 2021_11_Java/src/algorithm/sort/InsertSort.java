package algorithm.sort;

import java.util.Arrays;
import java.util.Random;

public class InsertSort {
	
	public void insertSort(int [] a) {
		int tmp;
		for(int i = 1; i<a.length;i++) {
			int u = i;
			for(int j =i-1; j>=0; j--) {
				if(a[u]<a[j]) {
					tmp = a[u];
					a[u]= a[j];
					a[j]= tmp;
					u--;
				}
//				앞 배열은 정렬이 되어있기 때문에 교환이 
//				이루어지지 않으면 j는 앞 배열의 값보다 큰값 
				else break;	
			}
		}
	}
	
	public void showArray(int[] arr) {
		for(int i : arr) {
			System.out.printf("%-3d", i);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		InsertSort ins = new InsertSort();
		
		Random random = new Random(); 
		  
		  int [] arr = new int[10]; 
		  
		  for (int i = 0; i < arr.length; i++) {
			  arr[i] = random.nextInt(100); // 100을 넘지 않는 랜덤 값이나옴. }
		  }
		  
		 System.out.println(Arrays.toString(arr));
		 
		ins.insertSort(arr);
		ins.showArray(arr);
	}
}
