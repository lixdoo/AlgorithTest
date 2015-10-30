package LinearList;

public class SeqList<T> implements LList {
	private Object[] element;
	private int len;
	public SeqList(int size){
		this.element = new Object[size];
		this.len = 0;
	}
	public SeqList(){
		this(64);
	}
	@Override
	public boolean isEmpty() {
		return this.len==0;
	}
	@Override
	public int length() {
		return this.len;
	}
	@Override
	public Object get(int i) {
		if(i>=0&&i<this.len){
			return this.element[i];
		}
		return null;
	}
	@Override
	public void set(int i, Object data) {
		if(data==null){
			return;
		}
		if(i>=0&&i<this.len){
			this.element[i]=data;
		}
		else
			throw new IndexOutOfBoundsException(i+"");
	}
	@Override
	public void insert(int i, Object data) {
		if(data==null){
			return;
		}
		if(this.len==element.length){
			Object[] temp = this.element;
			this.element = new Object[temp.length*2];
			for(int j=0;j<temp.length;j++){
				this.element[j] = temp[j];
			}
		}
		if(i<0)
			i=0;
		if(i>this.len){
			i=this.len;
		}
		for(int j=this.len-1;j>=i;j--){
			this.element[j+1] = this.element[j];
		}
		this.element[i] = data;
		this.len++;
		
	}
	@Override
	public void append(Object data) {
		this.insert(this.len, data);
	}
	@Override
	public Object remove(int i) {
		if(this.len==0||i<0||i>=this.len){
			return null;
		}
		T old = (T)this.element[i];
		for(int j=i;j<this.len-1;j++){
			this.element[j] = this.element[j+1];
		}
		this.element[this.len-1]=null;
		this.len--;
		return old;
	}
	@Override
	public void removeAll() {
		this.len = 0;
	}
	@Override
	public Object serach(Object key) {
		// TODO Au  to-generated method stub
		return null;
	}
	@Override
	public String toString(){
		String str="(";
		if(this.len>0){
			str +=this.element[0].toString();
		}
		for(int i=1;i<this.len;i++){
			str+=","+this.element[i].toString();
		}
		return str+")";
		
	}
	@Override
	public boolean equals(Object obj){
		if(this==obj){
			return true;
		}
		if(obj instanceof SeqList){
			SeqList<T> list = (SeqList<T>)obj;
			if(this.length()==list.length()){
				for(int i=0;i<this.length();i++){
					if(!(this.get(i).equals(list.get(i))))
						return false;
					return true;
				}
			}
		}
		return false;
	}

}
