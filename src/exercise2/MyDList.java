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
		
	}
	
	public void addLast(E item) {
		
	}
	
	public E removeFirst() {
		return null;
	}
	
	public E removeLast() {
		return null;
	}
	
	public int size() {
		return this.size;
	}
	public boolean isEmpty() {
		return false;
	}
}
