package sist.com.variable.core;

public class VariableAppEx1 {
	
	public void byteMethod() {
		byte byteValue1 = (Byte.MAX_VALUE+1)>Byte.MAX_VALUE?Byte.MAX_VALUE:0;
		System.out.println(byteValue1);
		//byte byteValue2 = Byte.MAX_VALUE+100;
		System.out.println(Byte.MAX_VALUE+100);
	}
	
	public double byteMethod1() {
		byte byteValue =100;
		return byteValue;
	}
	
	public void intMethod(int v1) {
		int v2 = Integer.MAX_VALUE;	//2147483647
		long rs = v1 + (long)v2;	//ū����Ʈ���� �����ϰ� �Ǿ�����.		
		System.out.println(rs);
		
	}
	public short shortMethod() {
		short sValue1 = 120;
		short sValue2 = 520;
		return (short)(sValue1 + sValue2);
	}
	
	public double doubleMethod() {
		return 100/(double)3;	//.�� �ٿ������
	}
	
	public void binaryMethod() {
		int v1 =015;
		int v2 = 0x45;
		System.out.println(v1);
		System.out.println(v2);
		
		System.out.println(Integer.toBinaryString(v1));
		System.out.println(Integer.toBinaryString(v2));
		
	}
	public void formatPrint() {
		
		System.out.printf("������%d�� �Դϴ�%n",15);
		System.out.printf("������%#o�� �Դϴ�%n",15);
		System.out.printf("������%#x�� �Դϴ�%n",31);
		System.out.printf("������%d�� �Դϴ�%n",15);
		System.out.printf("%s","������ 15�� �Դϴ�.");
		System.out.printf("%b%n",5>3);
		System.out.printf("c�� ����=%d �̰� ���ڴ� %c�̴�.%n",65,65);
		System.out.printf("������[%5d]�� �Դϴ�%n",15);		//������[   15]�� �Դϴ�
		System.out.printf("������[%-5d]�� �Դϴ�%n",15);		//������[15   ]�� �Դϴ�
		float f1 = .10f; //0.10, 1.0e-1
		System.out.printf("%f, %e%n",f1, f1);
		double d = 1.2345679;
		System.out.printf("%14.10f%n",d); //14�ڸ� �߿� �Ҽ��� 10�ڸ� ������ �ڸ��� �������� �տ� ����.
		System.out.printf("%20s%n","�ȳ��Ͻʴϱ�");
		System.out.printf("%.3s%n","�ȳ��Ͻʴϱ�");	//���ʿ��� 3���ڸ� ���
	}
	
	
	
	public static void main(String[] args) {
		VariableAppEx1 v = new VariableAppEx1();
		v.byteMethod();
		double d = v.byteMethod1();
		System.out.println(d);
		v.intMethod(1);
		System.out.println(v.shortMethod());
		System.out.println(v.doubleMethod());
		v.binaryMethod();
		v.formatPrint();
		
		
		
	}
}
