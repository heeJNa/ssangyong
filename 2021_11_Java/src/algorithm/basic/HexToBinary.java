package algorithm.basic;

public class HexToBinary {
	
	String[] binary = {"0000", "0001", "0010", "0011",
			"0100", "0101", "0110", "0111",
			"1000", "1001", "1010", "1011", 
			"1100", "1101", "1110", "1111"};
	String result = "";
	
	public void hexToBinary(char [] hexArr) {
		for(int i = 0; i< hexArr.length; i++) {
			if(hexArr[i]>'0' && hexArr[i]<= '9') {
				result += binary[hexArr[i] - '0'];
			}else {
				result += binary[hexArr[i] - 'A' + 10];
			}
		}
		System.out.println(result);
	}
			
	
	public static void main(String[] args) {
		
		HexToBinary h = new HexToBinary();
		
		char[] hex = {'C', 'F' , 'A' , '8'};
		
		h.hexToBinary(hex);
		
		 
	}
	
}
	
	

