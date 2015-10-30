package paixu;


class ArrayBub{
	private long[] a;
	private int nElems;
	
	public ArrayBub(int max){
		a = new long[max];
		nElems = 0;
	}
	public void insert(long value){
		a[nElems] = value;
		nElems++;
	}
	public void display(){
		for(int j=0;j<nElems;j++){
			System.out.println(a[j] + "");
		}
	}
	public void bubbleSort(){
		int out ,in;
		for(out=nElems-1;out>1;out--){
			for(in=0;in<out;in++){
				if(a[in]>a[in+1]){
					swap(in,in+1);
				}
			}
		}
	}
	public void swap(int one,int two){
		long temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}
	
}
public class BubbleSortApp {
	public static void main(String[] args){
		int maxSize = 100;
		ArrayBub arr = new ArrayBub(maxSize);
		arr.insert(99);
		arr.insert(1);
		arr.insert(100);
	}
}
