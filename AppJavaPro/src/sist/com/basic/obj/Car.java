package sist.com.basic.obj;

public class Car {
	String color;
	String gearType;
	int door;

	Car() {
		this("white", "auto", 4);
	}

	Car(Car c) {
		this(c.color, c.gearType, c.door);
	}

	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;

	}

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car(c1);
		System.out.println(c1.color +" " +c1.gearType + " "+c1.door);
		System.out.println(c2.color +" " +c2.gearType + " "+c2.door);
		c1.door = 6;
		System.out.println(c1.color +" " +c1.gearType + " "+c1.door);
		System.out.println(c2.color +" " +c2.gearType + " "+c2.door);
	}
}
