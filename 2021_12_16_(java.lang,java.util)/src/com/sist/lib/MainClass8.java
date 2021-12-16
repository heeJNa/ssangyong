package com.sist.lib;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

/*
 * 	java.util
 * 	��¥ ����
 * 	  Date(����Ŭ ȣȯ), Calendar(����)
 *  ��ȯ ����
 *  	��¥ ��ȯ => SimpleDateFormat
 *  			  ChoiceFormat
 *  			  MessageFormat (SQL)
 *   ������ ���� : Collection (11��, 12��)
 *   
 *   1�� ~ 8�� => �ڹٱ��� (�ʼ�)
*/
public class MainClass8 {
	public static void main(String[] args) {
		// 1.���� ��¥
		Date date = new Date(); // �ý����� ��¥ ���� (�ð�)
		// 2. ��ȯ (���α׷��� �´� �������� ��ȯ)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-d");
		String today = sdf.format(date);
//		System.out.println(today);
		StringTokenizer st = new StringTokenizer(today, "-");
		String strYear = st.nextToken();
		String strMonth = st.nextToken();
		String strDay = st.nextToken();

		int year = Integer.parseInt(strYear);
		int month = Integer.parseInt(strMonth);
		int day = Integer.parseInt(strDay);

		System.out.println(strYear + "�� " + strMonth + "��");
		/*
		 * yyyy = > 4�⵵ 2021 M => �� 1,2...11,12 / MM => 01, 02...11,12 d => �� D =>
		 * 1��1�Ϻ��� ���ݱ����� �� �� hh => �ð� mm => �� ss => ��
		 */
		System.out.println();
		// ���� ���
		String[] strWeek = { "��", "��", "ȭ", "��", "��", "��", "��" };
		for (String week : strWeek) {
			System.out.print(week + "\t");
		}
		/*
		 * List list = new ArrayList() => interface Calendar c = �޼ҵ�() => �߻�Ŭ����
		 */
		// Calendar ����
		Calendar sCal = Calendar.getInstance(); // ��ü ����
		Calendar eCal = Calendar.getInstance();
		sCal.set(Calendar.YEAR, year);
		sCal.set(Calendar.MONTH, month - 1);
		sCal.set(Calendar.DATE, 1);
		// ����
		int week = sCal.get(Calendar.DAY_OF_WEEK); // ������ 1~7
		// ù��° ��¥����
		// �Է� ���� �����Ͽ��� �����ϸ� 4�̹Ƿ� -4+1 = -3�� ���� ���� ���� 1�Ͽ��� -3�ؼ� �� ���� ���Ϻ��� 3���� ���
		sCal.add(Calendar.DATE, -sCal.get(Calendar.DAY_OF_WEEK)+1);	
		// ������ ��¥����
		eCal.set(year, month - 1, sCal.getActualMaximum(Calendar.DATE));
		eCal.add(Calendar.DATE, 7 - eCal.get(Calendar.DAY_OF_WEEK));	//�Է� ���� �ݿ��Ͽ� ������ 6�̱� ������ 7-6�� 1�� �ȴ�. 

		week = week - 1;
		// �޷� ���
		System.out.println("\n");
		for (int i = 1; sCal.before(eCal) || sCal.equals(eCal)
												; sCal.add(Calendar.DATE, 1)) {
			int startDay = sCal.get(Calendar.DATE);
			System.out.printf("%2d\t", startDay);
			
			if(i++%7 == 0) {
				System.out.println();
			}
		}
	}
}
