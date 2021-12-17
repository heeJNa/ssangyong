package algorithm.twodimension;

import java.util.Scanner;

public class CRUD {

	int[][]  arr;
	private int col;
	private int row;
	private int count;
	private int length;
	int[][] search ;
	int searchCount;
	Scanner scanner = new Scanner(System.in);

	public void create() {
		arr = new int[10][10];
		row = arr.length;
		col = arr[0].length;
		length = row * col;
		count = 0;
	}

	public void create(int size) {
		arr = new int[size][size];
		row = arr.length;
		col = arr[0].length;
		length = row * col;
		count = 0;
	}

	public void add(int data) {
		if (isFull()) {
			String s;
			System.out.println("[add] Array is full");
			do {
				System.out.println("더 큰 배열을 생성 하시겠습니까? (yes/no)");
				s = scanner.nextLine();
				if (s.toLowerCase().equals("yes")) {
					increment(arr);
				} else if (s.toLowerCase().equals("no")) {
					return;
				} else {
					continue;
				}
			} while (!(s.toLowerCase().equals("yes")));
		}
		arr[count / col][count % col] = data;
		System.out.println("add " + data + " in " + "[" + count / col + "]" + "[" + count % col + "]");
		count++;
	}

	public int[][] search(int data) {
		
		search = new int[count][2];
		searchCount = 0;
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (arr[i][j] == data) {
					search[searchCount][0] = i;
					search[searchCount++][1] = j;
				}
			}
		}
		if (count == 0) {
			System.out.println("[search] There is no " + data);
			return search;
		}
		System.out.println("search " + data + " result\nrow  col");
		disp(search);
		return search;
	}

	private int[][] increment(int[][] nowArr) {
		int newRow = this.row * 2;
		int[][] newArr = new int[newRow][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				newArr[i][j] = nowArr[i][j];
			}
		}
		row = newRow;
		arr = newArr;
		return newArr = arr;
	}

	public void update(int data, int index) {

		if (index < 0 || index > length) {
			System.out.println("[update] Out Of Index " + index);
			return;
		}
		System.out.println("update\n변경 전 값 : " + arr[(index - 1) / col][(index - 1) % col]);
		arr[(index - 1) / col][(index - 1) % col] = data;
		System.out.println("변경 후 값 : " + arr[(index - 1) / col][(index - 1) % col]);
	}

	public void delete(int data) {
		
		int [][] tmp = search(data);
		int n = 0;
		int m = 0;

		for (int si = 0; si < searchCount; si++) {
			n = tmp[si][0];
			for (int sj = 1; sj < tmp[si].length; sj++) {
				m = tmp[0][sj];
				
				int index = n * col + m;
				
	

				if (isEmpty()) {
					System.out.println("[delete] Array is Empty");
					return;
				} else if (index <= 0 || index > count) {
					return;
				}

				int r = index / col;
				int c = index % col;

				arr[r][c] = 0;
				count--;

				for (int i = r; i < row; i++) {
					for (int j = c++; j < col; j++) {
						if (j >= col - 1 || i >= row) { // 그 다음 행에 있는 값을 현재 행의 마지막으로 당기기
							c = 0;
							r++;
							if (r == row)
								break;
						}
						arr[i][j] = arr[r][c++];
					}
					c = 0;
				}
				arr[row - 1][col - 1] = 0;

				System.out.println("delete " + data);
				// k 는 삭제할 행
				// s 는 삭제할 열
				/*
				 * for (int i = c, k = r, s = i + 1; i < col; i++) { // 삭제가 발생한 행과 열에서 그 행만 앞으로
				 * 당기기 int j = r; if (i == col - 1 && j <= row - 1) { // 그 다음 행에 있는 값을 현재 행의
				 * 마지막으로 당기기 s = 0; k++; } if (s >= row || k >= col) break; arr[j][i] =
				 * arr[k][s++]; }
				 * 
				 * for (int i = r + 1; i < row; i++) { for (int j = 0, s = 0, k = i; j < col;
				 * j++) { // 삭제가 발생한 행 다음 행부터 앞으로 당기기
				 * 
				 * if (j == col - 1 && i <= row - 1) { // 그 다음 행에 있는 값을 현재 행의 마지막으로 당기기 s = 0;
				 * k++; } if (s >= row || k >= col) break; arr[i][j] = arr[k][++s]; } }
				 */
			}
		}
	}

	public void disp() {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
	}

	public void disp(int[][] arr) {
		outer: for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][0] == 0 && arr[i][1] == 0)
					break outer;
				else
					System.out.printf(" %-1d   ", arr[i][j]);
			}
			System.out.println();
		}
	}

	public boolean isEmpty() {
		if (count == 0)
			return true;
		else
			return false;
	}

	public int getSize() {
		return length;
	}

	public boolean isFull() {
		if (count >= length) {
			return true;
		} else
			return false;

	}

	public static void main(String[] args) {
		CRUD tArr = new CRUD();
		tArr.create(3);
		tArr.add(10);
		tArr.add(20);
		tArr.add(30);
//		tArr.update(130, 3);
		tArr.add(60);
		tArr.add(60);
		tArr.add(60);
//		tArr.update(160, 6);
//		tArr.search(60);
		tArr.add(70);
		tArr.add(80);
		tArr.add(80);
		tArr.add(90);
		tArr.delete(80);
		tArr.delete(60);
//		tArr.delete(9);
//		tArr.search(80);
		tArr.disp();
	}

}
