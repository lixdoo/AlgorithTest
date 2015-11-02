package test;

public class test {
//	public boolean test1(int x){
//		return x==1?true:false;
//	}
//	public static void main(String[] args){
//		int x = 1;
//		System.out.println(new test().test1(x));
//	}
/////////////////////////////////////////////////////////////////////
	public static void main(String[] args){
		new Thread(new Thread1()).start();
		try{
			Thread.sleep(10);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		new Thread(new Thread2()).start();
	}
	private static class Thread1 implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			synchronized (test.class) {
				System.out.println("enter thread1...");
				System.out.println("thread1 is waiting...");
				try{
					test.class.wait();
				}catch(InterruptedException e){
					e.printStackTrace();
				}
				System.out.println("thread1 is going on...");
				System.out.println("thread1 is being over!");
			}
			
		}
	}
	private static class Thread2 implements Runnable{

		@Override
		public void run() {
			synchronized (test.class) {
				System.out.println("enter thread2...");
				System.out.println("thread2 notify other thread can release wait status...");
				test.class.notify();
				System.out.println("thread2 is sleeping ten millisecond...");
				try{
					Thread.sleep(10);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
				System.out.println("thread2 is going on...");
				System.out.println("thread2 is being over...");
			}
		}
		
	}
}
