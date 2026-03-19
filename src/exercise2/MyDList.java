package exercise2;

public class MyDList<E>
{

	private MyNode<E> head;
	private MyNode<E> tail;
	private int size;
	
	//Constructor
	public MyDList() {
		head = null;
		tail = null;
		size = 0;
	}
	
	public MyNode<E> getHead(){
		return this.head;
	}
	
	public void addFirst(E item) {
		MyNode<E> newNode = new MyNode<>(item);
		if(isEmpty()) {

		head = newNode;
		tail = newNode;
		}
		else {
		newNode.setNext(head);
		head.setPrev(newNode);
		head = newNode;
		}
		size++;
	}
	
	public void addLast(E item) {
		MyNode<E> newNode = new MyNode<>(item);	
		
		if(isEmpty()) {
			head = newNode;
			tail = newNode;
		}
		else {
		tail.setNext(newNode);
		newNode.setPrev(tail);
		tail = newNode;
		}
		size++;
		
	}
	
	public E removeFirst() {
		if(isEmpty()) {
			return null;
		}
		else {
		E oldHead = head.getElement();
		if (size == 1) {
			head = null;
			tail = null;
		}
		else {
			head.getNext().setPrev(null);
			head = head.getNext();
		}
		size--;
		return oldHead;
		}
	}
	
	public E removeLast() {
		if(isEmpty()) {
			return null;
		}
		else {
		E oldTail = tail.getElement();
		if(size == 1) {
			head = null;
			tail = null;
		}
		else {
			tail.getPrev().setNext(null);
			tail = tail.getPrev();
			
		}
		size --;
		return oldTail;
		}
	}
	
	public int size() {
		return this.size;
	}
	public boolean isEmpty() {
		if (size == 0) return true;	
		return false;
	}
}