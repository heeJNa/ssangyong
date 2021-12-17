package sist.com.basic.obj;

public class FontMain {

	public static void main(String[] args) {
		Point3D p = new Point3D();
	}

}

class Point {
	int x, y;
	
	Point(int x, int y){
		System.out.println("Point 持失切");
		this.x =x;
		this.y = y;
		
	}
	
	String getLocation() {
		return "x :" + x + "y : " + y;
	}
}

class Point3D extends Point {
	int z ;
	
	Point3D(int x, int y, int z	){
		super(x,y);
		System.out.println("Point3D(x,y,z,) 持失切");
		this.z =z;
	}
	Point3D(){
		this(100,200,300);
		System.out.println("Point3D() 持失切");
	}

	@Override
	String getLocation() {
		return super.getLocation() + "z :" + z;
	}
	
	
}
