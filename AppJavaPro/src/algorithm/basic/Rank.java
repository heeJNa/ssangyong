package algorithm.basic;


public class Rank {
	
	public int[] rank(int [] arr) {
		int[] rank = new int[arr.length];
		
		for(int i =0 ; i<rank.length; i++) {
			rank[i]=1;
		}
		for(int i =0; i<arr.length; i++) {
			for(int j = 0 ; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					rank[i]++;
				}
			}
		}
		return rank;
	}

	public static void main(String[] args) {
		Rank r= new Rank();
		int [] score = {90, 85, 85,60,100};
		
		for(int i = 0; i<score.length; i++) {
			System.out.println(score[i] + " " + r.rank(score)[i] + "µî");
		}
	}

}
