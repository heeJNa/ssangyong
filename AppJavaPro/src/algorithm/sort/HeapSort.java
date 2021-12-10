package algorithm.sort;

import java.util.Arrays;
import java.util.Random;

public class HeapSort {

	public void heapSort(int[] heap, int length) {

		if (length == 0) {
			System.out.println("������ �� ");
			return;
		}

		heapify(heap, length);

		int tmp = heap[0];
		heap[0] = heap[length - 1];
		heap[length - 1] = tmp;
		System.out.printf("�ִ� ���� ��Ʈ�� %d�� heap[%d]�� ����\n", tmp, length-1 );
		
		System.out.println("�� ���� ����");
		heapSort(heap, length - 1);
	}

	private void heapify(int[] arr, int length) {
		System.out.printf("\n��ü Ʈ�������� �ִ��������� ���� ����\n");
		disp(arr, length);
		if (length == 0)
			return;

		for (int i = 1; i < length; i++) { //
			int child = i;
			do {
				int root = (child - 1) / 2;
				System.out.printf("root : %d child : %d\n", root, child);
				if (arr[root] < arr[child]) { // ��Ʈ���� �ڽ��� �� ũ�� ��ȯ
					int tmp = arr[child];
					arr[child] = arr[root];
					arr[root] = tmp;
					System.out.printf("root�� arr[%d]�� child�� arr[%d] ��ȯ\n", root, child);
				}
				child = root;
			} while (child != 0);
		}
		System.out.print("�ִ��� ���� : ");
		disp(arr, length);
	}

	public void disp(int[] arr) {
		System.out.print("\n�� ���� ��� : ");
		for (int i : arr) {
			System.out.printf("%-3d", i);
		}
	}
	public void disp(int[] arr , int length) {
		for (int i = 0 ; i<length ; i++) {
			System.out.printf("%-3d", arr[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Random random = new Random();
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(100); // 100�� ���� �ʴ� ���� ���̳���. }
		}

		System.out.println(Arrays.toString(arr));

		HeapSort h = new HeapSort();
		h.heapSort(arr, 10);
		h.disp(arr);
	}
}
