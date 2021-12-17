package com.sist.main;

/*
 * 
 *   2021.12.09 => �⺻ ���� 
 *   1. ���� (�޸� ���� ����) ==> 20page , 25page 28page~29page
 *                              32page
 *      => �������� 
 *      ���� : byte => ��������� / ��Ʈ��ũ ����
 *            int 
 *            long 
 *      �Ǽ� : double
 *      ���� : char ===> �̱�(ASC => 1byte) / ��Ƽ (Unicode = 2byte)
 *      ���� : boolean 
 *      ���� : �迭(1��:����) => ���� (Collection) / Ŭ����
 *      *** ����ȯ (�������� ����)  => Ŭ�������� ����ȯ (80page)
 *                                ===== ũ�� (is-a,has-a)
 *                                is-a : ��� (���� => �����ؼ� ��뤤)
 *                                has-a : ���� (���� => ������� ���)
 *          �ڵ� ����ȯ : => UpCasting
 *            10+10.5 => �ڹٴ� ���� ���������� ������ ���� 
 *            ==
 *            10.0
 *            10.0+10.5 = 20.5
 *          ���� ����ȯ : => DownCasting
 *            10+(int)10.5
 *          ****** int����(byte,short,char) ���������� ����Ǹ� int
 *          byte + byte = int 
 *          char + char = int  
 *   2. ������ (������,�ǿ�����)
 *      ���׿����� 93page
 *        = ���������� (++,--)
 *        = ���������� (!)
 *        = ����ȯ ������ (type)
 *      ���׿����� 
 *        = ��������� (+ ,- , * , / , %) 97page
 *          + => ���ڿ� ���� , ���� ������� 
 *          / => 0���� ������ ����
 *            => ����/����=���� 
 *          % => ��ȣ�� �������̴� 
 *          -5 % -2 ==> -1  
 *           5 % -2 ==> 1
 *        = �񱳿����� ( == , != , < , > , <= ,>=) => boolean
 *          109page
 *        = ���������� ( &&(����) , ||(����)) 114page
 *                    ȿ������ ���� ó�� (118page) 
 *                    (����) && (����)
 *                    =====
 *                     false 
 *                    (����) || (����)
 *                     true      
 *                    
 *        = ���Կ����� (= , += , -=) 132page
 *    3. ��� 
 *       = ���ǹ� ����
 *         = ���� ���ǹ� (if)
 *         = ���� ���ǹ� (if~else)
 *         = ���� ���ǹ� (if ~ else if ~ else if ~ else)
 *       = ���ù� (switch~ case)
 *         ���� (Application) => ��Ʈ��ũ 
 *       = �ݺ��� ==> 156page
 *          = while : �ݺ�Ƚ���� ���� ��� (1��)
 *          = do~while : �ѹ��̻� ���� (1��)
 *          = for : �ݺ�Ƚ�� ���� (2��)
 *                  ���� /  ������ => �˰����� 
 *       = �ݺ���� 175page
 *          = break : �ݺ� �ߴ�
 *          = continue : Ư�� �κ� ���� 
 *       ================== ������ + ��� = �޼ҵ�
 *       
 *     4. ��Ƽ� ����
 *        �����͸� ��Ƽ� ���� = �迭(����) 
 *        ���ɹ��� ��Ƽ� ���� = �޼ҵ� 
 *        ========================= + Ŭ���� (������ ����)
 *        HW / SW
 *        70��� ==> ����ȸ�� (�ʿ��Ҷ� ����)
 *        =============================== (80���) ��� (Ŭ����)
 *        
 *     5. �迭 (1��)
 *        = �������� �޸� ���� 
 *        =  �ʱ�ȭ
 *        = �ε��� (0��)
 *        int[] arr
 *        arr[0] ==> arr+0
 *        arr[1] ==> arr+4
 *     6. �޼ҵ� 
 *        ======================================
 *            ����� (������)    �Ű����� (����� ��û)
 *        ======================================
 *          = ����ڰ� �α��� ��û : id,password 
 *          = �Ű����� (id,password)
 *          = �α��� OK, Fail ==> boolean
 *          
 *          boolean isLogin(String id,String pwd)
 *          
 *                    
 *                 O               O
 *        ======================================
 *          ���� , ���ڿ� �ڸ��� 
 *          double Math.random() 
 *        
 *                 O               X
 *        ======================================
 *           �޼ҵ� ��ü ó�� ==> void (insert,update,delete)
 *           System.out,println("sdsjdjsj")
 *                 X               O
 *        ======================================
 *                 X               X
 *        ======================================
 *        
 *     7. ��ü ���� (����)
 *     8. Ŭ���� 
 *        = �������
 *          ���� (Ŭ����,�迭)
 *          �޼ҵ� (������+���)
 *          ������ (�ʱ�ȭ)
 *     9. ĸ��ȭ(��ť�� �ڵ�) => �ǹ�ȭ 
 *        = ������ ��ȣ 
 *        = ��� 
 *        = ���� => private , �޼ҵ� => public 
 *     10. ���� (���/����)
 *         ��� : ������ �ִ� ��� (������ �ҽ��� ����)
 *         ���� : ������ ���� ��� (�״�� ���)
 *     11. ���� / �߰� => ������ 
 *         ���� : �������̵� 
 *         �߰� : �����ε� 
 *     =============================================
 *     11. Ŭ���� ����
 *         = �Ϲ� Ŭ���� 
 *           : �뵵 
 *             = �����͸� ���� (�б�/����) => �������� Ŭ����
 *                   ~VO (MovieVO,FoodVO) , ~DTO
 *             = ��� �߰� ���� => �׼� Ŭ���� 
 *                   ~DAO , ~Manager , ~Service
 *         = �߻� Ŭ���� : �������� ������ ��Ƽ� ���� 
 *         = �������̽� 
 *         = ����Ŭ���� 
 *            = ���Ŭ���� (��ũ��ũ , ������)
 *               => ����� 
 *            = �͸��� Ŭ���� (��Ӿ��� �������̵��� ����)
 *            = ����Ŭ���� (���󵵰� ���� ����)
 *     12. ����ó�� => ������ ���Ḧ �����ϰ� ��������� ���� 
 *                   ������ ������ ������ ���� 
 *         = ���� ���� (try~catch)
 *         = ���� ȸ�� (throws)
 *     13. ���̺귯�� 
 *         java.lang
 *           = Object
 *           = String 
 *           = StringBuffer
 *           = Wrapper
 *           = Math
 *         java.util
 *           = Date , Calendar 
 *           = StringTokenizer 
 *           = Collection 
 *           = Format
 *         java.io
 *           = ���� ���� 
 *           = �ٿ�ε� 
 *           = ���ε� 
 *         java.net 
 *           = URL 
 *           = Socket
 *           
 *         ��Ÿ => �ܺ� ���̺귯�� (jsoup,simplejson...)
 *         java.sql => ����Ŭ ���� 
 *         
 *      ============================================
 *      ��Ʈ��ũ => �¶��� ���� , ERP , ȭ�� (X)
 *      �����ͺ��̽�(��) => �ַ�  (CURD) 
 *   
 *            
 *       
 *      
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �迭 => 1��
		// �迭 ����
		/*
		 * int[] �迭�� => �ڹ� int �迭��[] => C
		 */
		int[] arr = { 1, 2, 3, 4, 5 }; // ����� ���ÿ� �ʱ�ȭ
		// int[] arr=new int[5]; => 0���� �ʱ�ȭ => ���߿� ���� ä���
		// ���� ó��
		// �迭�� �ʱ�ȭ
		// �б� => ��� (�ݺ���)
		for (int i : arr) // for-each (��) => ����(������(X))=> ��¸�
		{
			System.out.println(i);
		}
		/*
		 * for(����� �������� ������:�迭/�÷���)
		 * 
		 */
		String[] title = { "�����̴���-�� ���� Ȩ", "��Ÿ���� : �� �帮��", "��", "�� �� ��", "���� ���� �θǽ�" };
		double[] reserve = { 67.3, 9.2, 4.1, 4.0, 1.8 };
		// �ε��� ��ȣ�� �̿��ؼ� ���ÿ� ���
		for (int i = 0; i < title.length; i++) {
			System.out.println(title[i] + "(������:" + reserve[i] + "%)");
		}

		// �������� ���� ���� ��ȭ�� ���
		double max = 0.0;
		int index = 0;
		for (int i = 0; i < reserve.length; i++) {
			if (max < reserve[i]) {
				max = reserve[i];// ���� ���� ������
				index = i;// ��ȭ���� ã�� ���� index ����
			}
		}

		// ���
		System.out.println(title[index]);
		System.out.println("������:" + max);

	}

}