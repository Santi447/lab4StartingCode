package exercise2;

public class MyNode<E>
{

	private E element;
	private MyNode<E> next;
	private MyNode<E> prev;
	
	public MyNode(E element){
		
		this.element = element;
		this.next = null;
		this.prev = null;
	}
	
	public E getElement() {
		return this.element;
	}
	
	public MyNode<E> getNext() {
		return this.next;
	}
	
	public MyNode<E> getPrev(){
		return this.prev;
	}
	
	public void setElement(E element) {
		this.element = element;
	}
	public void setNext(MyNode<E> newNode) {
		this.next = newNode;
	}
	public void setPrev(MyNode<E> newNode) {
		this.prev = newNode;
	}

}
