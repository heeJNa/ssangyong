package algorithm.sort;

import java.util.Arrays;
import java.util.Random;

public class HeapSort {

	public void heapSort(int[] heap, int length) {

		if (length == 0) {
			System.out.println("힙정렬 끝 ");
			return;
		}

		heapify(heap, length);

		int tmp = heap[0];
		heap[0] = heap[length - 1];
		heap[length - 1] = tmp;
		System.out.printf("최대 힙의 루트인 %d를 heap[%d]에 삽입\n", tmp, length-1 );
		
		System.out.println("힙 정렬 수행");
		heapSort(heap, length - 1);
	}

	private void heapify(int[] arr, int length) {
		System.out.printf("\n전체 트리구조를 최대힙구조로 변경 시작\n");
		disp(arr, length);
		if (length == 0)
			return;

		for (int i = 1; i < length; i++) { //
			int child = i;
			do {
				int root = (child - 1) / 2;
				System.out.printf("root : %d child : %d\n", root, child);
				if (arr[root] < arr[child]) { // 루트보다 자식이 더 크면 교환
					int tmp = arr[child];
					arr[child] = arr[root];
					arr[root] = tmp;
					System.out.printf("root인 arr[%d]와 child인 arr[%d] 교환\n", root, child);
				}
				child = root;
			} while (child != 0);
		}
		System.out.print("최대힙 생성 : ");
		disp(arr, length);
	}

	public void disp(int[] arr) {
		System.out.print("\n힙 정렬 결과 : ");
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
			arr[i] = random.nextInt(100); // 100을 넘지 않는 랜덤 값이나옴. }
		}

		System.out.println(Arrays.toString(arr));

		HeapSort h = new HeapSort();
		h.heapSort(arr, 10);
		h.disp(arr);
	}
}
