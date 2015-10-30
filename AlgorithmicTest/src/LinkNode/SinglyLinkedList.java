package LinkNode;

import LinearList.LList;

public class SinglyLinkedList<T> implements LList<T> {
//带头节点的单链表
	protected Node<T> head;
	
	public SinglyLinkedList(){
		this.head = new Node<T>();
	}
	
	///////尾插法构造单链表
	public SinglyLinkedList(T[] element){
		this();
		Node<T> rear = this.head;
		for(int i=0;i<element.length;i++){
			rear.next = new Node<T>(element[i],null);
			rear = rear.next;
		}
	}
	
	@Override
	public boolean isEmpty() {
		return this.head.next ==null;
	}

	@Override
	public int length() {
		int i = 0;
		Node<T> node = this.head.next;
		while(node!=null){
			i++;
			node = node.next;
		}
		return i;
	}

	@Override
	public T get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void set(int i, T data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert(int i, T data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void append(T data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T remove(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T serach(T key) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
