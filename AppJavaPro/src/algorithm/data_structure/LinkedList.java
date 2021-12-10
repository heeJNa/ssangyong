package algorithm.data_structure;

public class LinkedList {
	
	private Node head;	//�ʱⰪ�� null
	private Node tail;
	private int size = 0;

	private class Node {

		private Object data;
		private Node next;

		public Node(Object input) {
			this.data = input;
			this.next = null;
		}

		public String toString() {
			return String.valueOf(this.data);
		}
	}
	public void addFirst(Object input) {
		Node newNode = new Node(input);
		newNode.next = head;	//���� ������� ��尡 ������ head�� ����Ű����
		head = newNode;			//head�� ���� ������� ��带 ���� Ŵ 
		size++;
		if(head.next == null) {
			tail = head;
		}
	}
	
	public void addLast(Object input){
		Node newNode = new Node(input);
		if(size == 0) 
			addFirst(input);
		else {
			tail.next = newNode;
			tail = newNode;
			size++;
		}
	}
	
	public void add(int k, Object input) {
		if(k==0)
			addFirst(input);
		else {
			Node tmp1 = node(k-1).next;
			Node tmp2 = tmp1.next;
			Node newNode = new Node(input);
			tmp1.next = newNode;
			newNode.next = tmp2;
			size++;
			if(newNode.next == null) {
				tail = newNode;
			}
		}
	}
	
	public String toString() {
		if(head == null)
			return "[]";
		Node tmp = head;
		String str = "[";
		while(tmp.next != null){	//��������� �����ϰ� str�� data�� ��.
			str += tmp.data + ",";
			tmp = tmp.next;
		}
		str += tmp.data;	//������ ����� �����͸� ����.
		return str + "]";
	}
	
	public Object removeFirst() {
		Node tmp = head;
		head = tmp.next;
		
		Object returnData = tmp.data;
		tmp = null;
		size--;
		return returnData;
	}
	
	public Object remove(int k) {
		if(k==0)
			return removeFirst();
		Node tmp = node(k-1);
		Node removeData = tmp.next;
		tmp.next = tmp.next.next;
		
		Object returnData = removeData.data;
		if(removeData == tail) {
			tail = tmp;
		}
		
		removeData = null;
		size--;
		return returnData;
	}
	
	public int size() {
		return size;
	}
	
	public Object getElement(int k) {
		Node tmp = node(k);
		return tmp.data;
	}
	
	public int indexOf(Object data){
		Node tmp = head;
		
		int index = 0;
		
		while(tmp.data !=data) {
			tmp = tmp.next;
			index++;
			if(tmp == null) 
				return -1;
		}
		return index;
	}
			
	
	private Node node(int index) {	//index�� �ִ� ���� ã������ �޼ҵ�
		Node search = head;
		for(int i =0; i<index; i++) {
			search = search.next;
		}
		return search;
	}
	
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.addFirst(20);
	}
}
	
	
	
	
		
		
