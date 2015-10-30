package LinkNode;

public class Node<T> {
	public T data;
	public Node<T> next;
	
	public Node(T data,Node<T> next){
		this.data = data;
		this.next=next;
	}
	public Node(){
		this(null, null);
	}
	
	
//	遍历单链表
	public void display(Node<T> head){
		Node<T> node = head;
		if(head==null){
			System.out.println("单链表为空");
		}
		
		while(node!=null){
			System.out.println(node.data.toString());
			node = node.next;
		}
		
	}
	
		

}
