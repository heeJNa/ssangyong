package sist.com.array;

public class ArrayEx10 {
	
	public void arrayEx1(char[] x,char[]y,char[]z) {
	      System.out.print(x[0] +""+ y[0]+""+z[0]);
	   }   
	  public void arrayEx1(char[][]x) {
	      //System.out.println(x[0][0]);
	      for(char[]i:x) {
	         System.out.println(i.length);
	      }
	   }
	   public static void main(String[] args) {
	      ArrayEx10 a=new ArrayEx10();
	      String s1="Ajax";//[A][j][a][x]
	      String s2="SpringData";
	      String s3="HtmlReAct";      
	      a.arrayEx1(s1.toCharArray(),s2.toCharArray(),s3.toCharArray());
	      System.out.println();
	      a.arrayEx1(new char[][]{s1.toCharArray(),s2.toCharArray(),s3.toCharArray()});
	      
//	      a.arrayEx1(new char[] {'v','a','l','u'});
	   }
}
