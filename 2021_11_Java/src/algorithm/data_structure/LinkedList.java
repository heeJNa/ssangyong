package algorithm.data_structure;

public class LinkedList {
	
	private Node head;	//초기값은 null
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
		newNode.next = head;	//새로 만들어진 노드가 기존의 head를 가리키게함
		head = newNode;			//head가 새로 만들어진 노드를 가리 킴 
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
		while(tmp.next != null){	//마지막노드 제외하고 str에 data가 들어감.
			str += tmp.data + ",";
			tmp = tmp.next;
		}
		str += tmp.data;	//마지막 노드의 데이터를 포함.
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
			
	
	private Node node(int index) {	//index에 있는 값을 찾기위한 메소드
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
	
	
	
	
		
		
