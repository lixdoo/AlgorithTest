package test;


//判断链表是否存在环形链表问题
public class LinkCricle {
	public boolean isLoop(linkNode head){
		linkNode p1 = head;
		linkNode p2 = head.getNext();
		if(head==null||head.getNext()==null){
			return false;
		}else{
			while(p2!=null&&p1!=p2){
				p1 = p1.getNext();
				p2 = p2.getNext();
			}if(p1==p2){
				return true;
			}else
				return false;
			}
		}
		
}



//链表


