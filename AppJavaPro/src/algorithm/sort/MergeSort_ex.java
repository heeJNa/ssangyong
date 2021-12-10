package algorithm.sort;

import java.util.Arrays;
import java.util.Random;

public class MergeSort_ex {

	private static int[] sorted; // ��ġ�� �������� �����Ͽ� ���Ҹ� ���� �ӽù迭

	public static void merge_sort(int[] a) {

		sorted = new int[a.length];
		merge_sort(a, 0, a.length - 1);
		sorted = null;
	}
	
	public static void merge_sort(int [] a, int left, int right) {
		
		/*
		 *  left==right ��, �κи���Ʈ�� 1���� ���Ҹ� �����ִ°�� 
		 *  ���̻� �ɰ� �� �����Ƿ� return�Ѵ�.
		 */
		if(left == right) return;
		
		int center = (left + right)/2;
		
		merge_sort(a, left, center);		// ���� �� ���� �κи���Ʈ(left ~ mid)
		merge_sort(a, center + 1, right);	// ���� �� ������ �κи���Ʈ(mid+1 ~ right)
		
		merge(a, left, center, right);		// �����۾�

	}
	
	/**
	 * ��ĥ �κи���Ʈ�� a�迭�� left ~ right �����̴�. 
	 * 
	 * @param a		������ �迭
	 * @param left	�迭�� ������
	 * @param mid	�迭�� �߰���
	 * @param right	�迭�� �� ��
	 */
	private static void merge(int[] a, int left, int mid, int right) {
		int l = left;		// ���� �κи���Ʈ ������
		int r = mid + 1;	// ������ �κи���Ʈ�� ������ 
		int idx = left;		// ä������ �迭�� �ε���
		
		while(l <= mid && r <= right) {
			/*
			 *  ���� �κи���Ʈ l��° ���Ұ� ������ �κи���Ʈ r��° ���Һ��� �۰ų� ���� ���
			 *  ������ l��° ���Ҹ� �� �迭�� �ְ� l�� idx�� 1 ������Ų��.
			 */
			if(a[l] <= a[r]) {
				sorted[idx] = a[l];
				idx++;
				l++;
			}
			/*
			 *  ������ �κи���Ʈ r��° ���Ұ� ���� �κи���Ʈ l��° ���Һ��� �۰ų� ���� ���
			 *  �������� r��° ���Ҹ� �� �迭�� �ְ� r�� idx�� 1 ������Ų��.
			 */
			else {
				sorted[idx] = a[r];
				idx++;
				r++;
			}
		}
		if(l > mid) {
			while(r <= right) {
				sorted[idx] = a[r];
				idx++;
				r++;
			}
		}
		
		/*
		 * ������ �κи���Ʈ�� ���� ��� �� �迭�� ä������ ��� (r > right)
		 * = ���� �κи���Ʈ ���Ұ� ���� �������� ���
		 * ���� �κи���Ʈ�� ������ ���ҵ��� �� �迭�� ä���ش�.
		 */
		else {
			while(l <= mid) {
				sorted[idx] = a[l];
				idx++;
				l++;
			}
		}
		/*
		 * ���ĵ� �� �迭�� ������ �迭�� �����Ͽ� �Ű��ش�.
		 */
		for(int i = left; i <= right; i++) {
			a[i] = sorted[i];
		}
		
	}

	public static void main(String[] args) {

		MergeSort_ex m = new MergeSort_ex();

		Random random = new Random();

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(100); // 100�� ���� �ʴ� ���� ���̳���. }
		}
		System.out.println(Arrays.toString(arr));
		
		m.merge_sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
