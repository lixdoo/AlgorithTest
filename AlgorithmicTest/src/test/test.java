package test;

public class test {
	public boolean test1(int x){
		return x==1?true:false;
	}
	public static void main(String[] args){
		int x = 1;
		System.out.println(new test().test1(x));
	}
}
