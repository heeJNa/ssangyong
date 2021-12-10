package sist.com.basic2.obj;

public class ObjectDemo {

	public void inheritanceEx1() {
		String s = new String();
		Object o = s; // UPCAST
		if (o instanceof String)
			s = (String) o;
		System.out.println("good");
	}

	public void inheritanceEx2(Object obj) {
		if (obj instanceof String) {
			String s = (String)obj;	//(String) new Object()´Â ¿À·ù! 
			System.out.println(s.charAt(0));
		}
	}

	public static void main(String[] args) {
		ObjectDemo o = new ObjectDemo();
		o.inheritanceEx1();
		o.inheritanceEx2(new String("abcc"));
	}
}
