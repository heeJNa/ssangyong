package algorithm.data_structure;

public class Stack {
	
	Array array ;
	int top;
	
	public Stack(int size) {
		array = new Array(size);
		top = 0;
	}
	
	public void push(int num) {
		if(top >= array.getSize()) {
			System.out.println("Stack is full");
		} else {
			array.add(num);
			top++;
		}
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return 0;
		}else {
			return array.delete(top);
		}
	}
	
	public void peak() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return;
		} else {
			System.out.println(array.getElement(top));
		}
	}
	
	public void printAll() {
		array.showArray();
	}
	
	public boolean isEmpty() {
		if(top == 0) {
			return true;
		} else
			return false;
	}

	public static void main(String[] args) {
		Stack stack = new Stack(5);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.peak();
	}

}
