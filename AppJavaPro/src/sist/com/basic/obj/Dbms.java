package sist.com.basic.obj;

public class Dbms {
	private String url;
	private String account;
	private String password;
	private int connectMax;
	private Point p;
	
	
	public Dbms() {
		this("");
	}
	
	public Dbms(Point p) {
		this.p = new Point(1,2);
		url = "kim";
		account = "woori";
	}
	
	public Dbms(String url) {
		this(url,"");
	}
	
	public Dbms(String url, String account) {
		this(url,account,"");
		this.account =account;
	}
	
	public Dbms(String url, String account, String password) {
		this(url,account,password,0);
		this.password = password;
	}
	
	public Dbms(String url, String account, String password, int connectMax) {
		this.url = url;
		this.account =account;
		this.password = password;
		this.connectMax =connectMax;
	}
	
	public void disp() {
		System.out.println("url : " +url+ ", account : " +account + ", password : " + password + ", connectMax : "+ connectMax);
	}
	public static void main(String[] args) {
		Dbms db1 = new Dbms();
		db1.disp();
		Dbms db2 = new Dbms("https");
		db2.disp();
	}

}
