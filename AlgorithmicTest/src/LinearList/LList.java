package LinearList;

public interface LList<T> {
	boolean isEmpty();
	int length();
	T get(int i);
	void set(int i,T data);
	void insert(int i,T data);
	void append(T data);
	T remove(int i);
	void removeAll();
	T serach(T key);

}
