package algorithm.twodimension;

import java.util.Random;

public class Sum {

	int[][] arr;

	public void random() {
		Random random = new Random();
		arr = new int[4][4];
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr[i].length - 1; j++) {
				arr[i][j] = random.nextInt(100);
			}
			System.out.println();
		}
		disp(arr);
	}


	public int[][] sum2() {
		int i = 0;
		int j = 0;
		int lastTotal = 0;
		
		for (i = 0; i < arr.length-1; i++) {
			int colTotal = 0;
			int rowTotal = 0;

			for (j = 0; j < arr[i].length-1; j++) {
				if (i == j) {
					lastTotal += arr[i][j];
					arr[arr.length-1][arr.length-1] = lastTotal;
				}
				rowTotal += arr[i][j];
				colTotal += arr[j][i];
			}
			arr[i][j] = rowTotal;
			arr[j][i] = colTotal;
		}
		return arr;
	}
	
	public int[][]	sum3(){
	     final int ROW=arr.length;
	      final int COL=arr[0].length;
	      for (int i = 0; i < ROW-1; i++) {
	         for (int j = 0; j < COL-1; j++) {
	            arr[i][COL-1] += arr[i][j];
	            //m[ROW-1][i]+=m[j][i];
	            arr[ROW-1][j] += arr[i][j];   
	            
	         }   
	         arr[ROW-1][COL-1] += arr[i][i];
	      }
	      return arr;
	}   
	      
	      
	      
	

	public void disp(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Sum s = new Sum();
		s.random();
		System.out.println("================================");
		s.disp(s.sum2());

	}

}
/*
 * public int[][] sum() { int i; int j = 0; for (i = 0; i < arr.length - 1; i++)
 * { int total = 0; for (j = 0; j < arr[i].length - 1; j++) { total +=
 * arr[i][j]; } arr[i][j] = total; } for (i = 0; i < arr.length - 1; i++) { int
 * total = 0; for (j = 0; j < arr[i].length - 1; j++) { total += arr[j][i]; }
 * arr[j][i] = total; } int total = 0; for (i = 0; i < arr.length; i++) { for (j
 * = 0; j < arr[i].length; j++) { if (i == j) total += arr[i][j]; } }
 * arr[--i][--j] = total; return arr; }
 */
