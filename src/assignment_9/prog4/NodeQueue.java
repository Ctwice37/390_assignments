package assignment_9.prog4;

public class NodeQueue {
	/* stores the element at the front of the queue, if it exists */
	private Node head;
	
	/* stores the element at the end of the queue, if it exists */
	private Node tail;
	
	/**
	 * Inserts a new node containing s at end of queue
	 */
	public void enqueue(String s) {
		Node current = head;
		if(current == null) {
			head = new Node(s, null);
			tail = head;
			return;
		}
		while(current.next != null) {
			current = current.next;
		}
		current.next = new Node(s, null);
		tail = current.next;
	}
	/**
	 * Removes node from the front of the queue and returns its value if
	 * head is n
	 */
	public String dequeue() throws QueueException {
		if(isEmpty()) throw new QueueException("Queue is empty!");

		String temp = head.data;
		head = head.next;
		return temp;
	}	
	/**
	 * Returns value stored at the front of the queue
	 * @return
	 * @throws QueueException
	 */
	public String peek() throws QueueException {
		if(isEmpty()) throw new QueueException("Queue is empty!");
		return head.data;
	}
	public boolean isEmpty() {
		return head == null;
	}
	@Override
	public String toString() {
		if(isEmpty()) return "<empty queue>";
		return head.toString();
	}
}


