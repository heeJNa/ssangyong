package algorithm.basic;
import java.util.Scanner;

public class XMark {
	
	public static void main(String[] args) {
		
		final int SIZE = 10;
		int x = 0, y = 0;
		char[][] grid =new char[SIZE][SIZE];
		
		for(int i = 1; i < SIZE; i++) {
			grid[0][i] = grid[i][0] = (char) (i +'0');	
		}
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("좌표를 입력하시오(00은 종료) >> ");
			String input = scanner.nextLine();
			
			
			if(input.length() == 2) {
				x = input.charAt(0) - '0';	//문자를 숫자로 변경
				y = input.charAt(1) - '0';
				if(x == 0 && y==0) {
					System.out.println("종료");
					break;
				}
			}
			if(input.length() != 2 || x<=0 || x >= SIZE || y<=0 || y >= SIZE) {
				System.out.println("다시 입력하시오");
				continue;
			}
			
			for(int i = 1; i<grid.length ; i++) {
				for(int j =1; j<grid[i].length; j++) {
					if(i == x && j == y) {
						grid[i][j] = 'X';
					} else {
						grid[i][j] = '0';
					}
				}
			}
			
			for(int i =0; i<grid.length; i++) {
				for(int j =0 ; j<grid[i].length; j++) {
					System.out.print(grid[i][j]);
				}
				System.out.println();
			}
		}
	}
	
}
				
				
				
				
			
			
