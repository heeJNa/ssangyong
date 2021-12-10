package algorithm.data_structure;

public class Queue {
	Array queue ;
	int count;
	
	public Queue() {
		queue = new Array();
		count = 0;
	}
	
	public Queue(int size) {
		queue = new Array(size);
		count = 0;
	}
	
	public void enQueue(int data) {
		
		if(queue.isFull()) {
			System.out.println("Queue is full");
			return;
		}
		queue.add(data);
	}
	
	public int deQueue() {
		if(queue.isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		return queue.delete(1);
	}
	
	public void printQueue() {
		queue.showArray();
		
	}
	
	

	public static void main(String[] args) {
		Queue q = new Queue(5);
		q.enQueue(10);
		q.enQueue(10);
		q.printQueue();
		q.enQueue(20);
		q.printQueue();
		System.out.println(q.deQueue());
		q.printQueue();
		
	}

}
