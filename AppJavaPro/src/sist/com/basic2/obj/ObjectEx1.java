package sist.com.basic2.obj;

//class,object(instance),classArray,overloading,constructor,this,this(),
//Object(�繰 ����ü,this,instance),static,final,
public class ObjectEx1  {
  //�ڷ��� ������; �ڷ���(�⺻,����)   ,class����,heap����
 private int data;//iv heap
 private static int classVariable;//class���� 
 public void instanceMethod(ObjectEx1 this) {
    System.out.println("instanceMethod");
    int local=10;//lv stack
    this.data=500;
    classVariable = 10;
    staticMethod();
 }
 public static void staticMethod() {   
    System.out.println("staticMethod1");
    //data=99;
    //this.data=100;
    classVariable = 20;	
//    instaceMethod();
    
 }
 
 public static void main(String[] args) {
    //staticMethod();
    //ObjectEx1 o1=new ObjectEx1();//data
    //ObjectEx1 o2=new ObjectEx1();//data
    //o1.instanceMethod();
    staticMethod();
    String s1 = "abc";
    String s2 = "Abc#Def#GHi";
    String s = (s2.split("#",3))[0];
    System.out.println(s);
    System.out.println(s1.startsWith("b",1));
    System.out.println(s1.endsWith("bc"));
    
 }
}