package com.sist.lib;
// StringTokenizer (�ܾ ����) => split() => []
// => ��Ʈ��ũ ���� => java.util
// => ���¼� �м� => ���̺귯�� (������, �ڸ��) => ê�� (�ΰ�����)
// Open Api => īī��, ���̹�Ŭ�ι�, ����
import java.util.*;
public class MainClass6 {
	// <c:Tokens>
	public static void main(String[] args) {
		String names="ȫ�浿|��û��|������|�����|������|��������";
		StringTokenizer st = new StringTokenizer(names, "|");
		/*
		 * System.out.println(st.nextToken()); System.out.println(st.nextToken());
		 * System.out.println(st.nextToken()); System.out.println(st.nextToken());
		 * System.out.println(st.nextToken()); System.out.println(st.nextToken());
		 */
		System.out.println("�̸� ���� : "+st.countTokens());
		while(st.hasMoreTokens()) {	//token �ڸ� ������ŭ ���ư�
			System.out.println(st.nextToken());
		}
		/*
		 * StringTokenizer st = new StringTokenizer(names, "|");
		 * 											=====  === ������
		 *                                           ���
		 *  st.nextToken() : ���� �ڸ� ������ 1��
		 *  st.countTokens() : ���� �ڸ� ����
		 *  st.hasMoreTokens() : ������ �ִ� ���� (return boolean) ���� ��ū�� ������ false�� ��.
		 *  
		 *  ==> ��¥, �̹���
		 *  ==> null���� �ִ� ��� �����߻�(�˻� x)
		 *  
		*/
	}
}
