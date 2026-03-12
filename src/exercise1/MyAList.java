package exercise1;

import java.util.ArrayList;
import java.util.Iterator;

public class MyAList<E> implements Iterable<E>
{
	private ArrayList<E> list;
	
	public MyAList() {
	  list = new ArrayList<E>();
	}
	
	public void add(E item) {
		list.add(item);
	}
	public void addAll(MyAList<E> items) {
		for(E item : items) {
			list.add(item);
		}
	}
	public E get(int index) {
		return null;
	}
	public void remove(int index) {
		return;
	}
	public void set(int index, E item) {
		return;
	}
	public int size() {
		return 1;
	}
	public boolean isEmpty() {
		return true;
	}
	public Object [] toArray() {
		return null;
	}
	public void clear() {
		return;
	}
	@Override
	public Iterator<E> iterator()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
