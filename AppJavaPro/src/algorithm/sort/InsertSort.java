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
//				�� �迭�� ������ �Ǿ��ֱ� ������ ��ȯ�� 
//				�̷������ ������ j�� �� �迭�� ������ ū�� 
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
			  arr[i] = random.nextInt(100); // 100�� ���� �ʴ� ���� ���̳���. }
		  }
		  
		 System.out.println(Arrays.toString(arr));
		 
		ins.insertSort(arr);
		ins.showArray(arr);
	}
}
