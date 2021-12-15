package com.sist.lib;

/*
 *	replace(char c1, char c2)
 * 			old      new
 *	replace(String s1, String s2)
 *          old        new
 *  replaceAll(String regex, String s)
 *             old           new ==>���Խ�
 *             
 *  ������ ����
 *  211.238.142.181
 *  127.0.0.1
 *  211.63.64.10
 *  211.238.142.1
 *  
 *  [0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3} 0~9������ ���ڰ� 1������ 3���� �ִ�!
 *  
 *  ���ִ� ���ְ� ���ְ� ���ְ�....
 *  ����+
*/
public class MainClass6 {
	public static void main(String[] args) {
		String s = "Hello Java";
		String s1= s.replace('a', 'b');
		System.out.println(s1);
		String s2 = s.replace("ll",	"LL");
		System.out.println(s2);
		String data = "AAABBBcccddd�ȳ��ϼ���1234567890 �ڹ��Դϴ�";
		String ss = data.replaceAll("[A-Za-z0-9]", "");
		System.out.println(ss);
		String ss1 = data.replaceAll("[^A-Z]","");
		// [A-Z] => ���ĺ� �빮�� ��ü
		// [^A-Z] => �빮�ڸ� �����ϰ�
		System.out.println(ss1);
		String ss2 = data.replaceAll("[^a-z]", "");
		System.out.println(ss2);
		String ss3 = data.replaceAll("[^0-9]", "");
		System.out.println(ss3);
		String ss4 = data.replaceAll("[^��-�R]", "");
		System.out.println(ss4);
		//�ѱ� => ��-�R
		//^���� (�����ϰ�)
		//[^] ����
		//^[��-�R] => ���� (�ѱ۷� ������ ��� ����)
		//[0-9]$ => �� (���ڷ� ������ ��� ��)
		//^[��|��] ==> (��)or(��) ���ڷ� �����ϴ� ��� ���ڿ�
		// * (0���̻�) �ڿ� ���ڰ� �������� �������� �ִ�.
		// + (1���̻�) �ڿ� �ѱ��� �̻� �־���Ѵ�.
		//^,$,|,+,* ==> ���Ǵ� ��ȣ ==> *, + ==> ���� ���ڿ��� ã�����ؼ��� \\+ \\* �̷��� ��� 
	}
}
