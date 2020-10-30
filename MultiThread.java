package day5_hcl_assgn;

class MyThread implements Runnable{
	
	String name;
	Thread t;
	

	public MyThread(String name) {
		
		this.name = name;
		t = new Thread(this,name);
		t.start();
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		
			for(int i=0;i<=100;i++)
		
				System.out.println(name+":"+i);
			


}
}

public class MultiThread {

	public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub

	
	
	MyThread m=new MyThread("one");
	MyThread m1=new MyThread("two");
	MyThread m2=new MyThread("three");
	Thread t1=new Thread(m);
	Thread t2=new Thread(m1);
	Thread t3=new Thread(m2);
	t1.start();
	t2.start();
	t3.start();
	t1.join();
	t2.join();
	t3.join();
	
	
}
}


