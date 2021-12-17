package small_program.student;

public class Score implements Comparable<Score>{
	
	private int kor;
	private int eng;
	private int math;
	private double avg;
	private int rank =1;
	
	public Score() {
		
	}
	
	public Score(int kor, int eng, int math, double avg, int rank) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.avg = avg;
		this.rank = rank;
	}
	
	public double calAvg() {
		return avg = (kor + eng + math)/3.;
	}


	@Override
	public String toString() {
		return "국어 = " + kor + ", 영어 = " + eng + ", 수학 = " + math + ", 평균 = " + Math.round(avg*100)/100.0 + ", 석차 = " + rank + "등";
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		if(kor<0 || kor>100) return;
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		if(eng<0 || eng>100) return;
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		if(math<0 || math>100) return;
		this.math = math;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	public int compareTo(Score s) {
		if(s.getRank()<rank) {
			return 1;
		} else if(s.getRank()<rank) {
			return-1;
		}
		return 0;
	}
	
	
	
}
