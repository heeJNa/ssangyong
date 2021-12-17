package sist.com.basic3.obj;

public abstract class Dao {
	public void connectProcess() {
		System.out.println("Data Access Connect!");
	}
	
	public abstract void select() ;
	public abstract void update() ;
	public abstract void info() ;
	public abstract void delete() ;
}
