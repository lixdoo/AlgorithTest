package test;

//单向链表反转

public class LinkReverse {
	public static linkNode linkNodeRev(linkNode p){
		if(p==null||p.next==null){
			return p;
		}else{
			linkNode temp=linkNodeRev(p.next);
			p.next=p;
			p = null;
			return temp;
		}
	}

}
