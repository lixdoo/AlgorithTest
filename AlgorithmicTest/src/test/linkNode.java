package test;

public class linkNode{
	
	public  int data;
	public linkNode next;
	
	public linkNode(int x){
		this.data = x;
		this.next = null;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public linkNode getNext() {
		return next;
	}
	public void setNext(linkNode next) {
		this.next = next;
	}
	
}
