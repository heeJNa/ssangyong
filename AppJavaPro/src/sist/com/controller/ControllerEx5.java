package sist.com.controller;

public class ControllerEx5 {
	 public void looping1() {
	      int cnt=0;
	      for(int i=0;i<5;i++) {
	         for(int j=0;j<=4;j++) {
	            for(int k=0;k<3;k++) {
	               cnt++;
	            }
	         }
	      }
	      System.out.printf("cnt=%d",cnt);
	      
	   }   
	   public void looping2() {
	      int i=0,j=0,k=0,cnt=0;
	      /*
	       * while(true) { if(i==3)break; System.out.println("�°�ȳ�"); i++; }
	       */
	      while(i<5) {
	         while(j<3) {            
	            while(k<2) {
	               cnt++;
	               k++;
	            }
	            k=0;
	            j++;
	         }
	         j=0;
	         i++;
	      }      
	      System.out.println(cnt);
	   }
	   public void looping3() {
	      int i=0,j=0,k=0,cnt=0;
	      do {         
	         do {
	             do {
	                cnt++;
	                
	             }while(k++<2);
	            k=0;
	          
	         }while(j<3);
	         j=0;
	         
	      }while(i++<5);
	      System.out.println(cnt);
	   }
	   
	   public void looping4(){
		   int cnt = 0;
		   for(int i = 0; i<10; i++);
			   cnt++;
		   
	   }
	   
	   public void looping5() {
		   int cnt = 0;
		   for(int i = 0; i<10; i++) {
			   if(i == 5) break;
			   for(int j =0; j<5;j++) {
				   if(j==2)continue;
				   cnt++;
			   }
		   }
		   System.out.println(cnt);
	   }
	   
	   public void looping6() {
		   int cnt =0;
		   for(int i =0; i<10; i ++) {
			   if(i%2 ==0)continue;
			   cnt++;
		   }
	   }
	   public static void main(String[] args) {
		   ControllerEx5 c=new ControllerEx5();
		   c.looping6();
//	      c.looping3();
//	      c.looping2();
	      
	   } 

	}


