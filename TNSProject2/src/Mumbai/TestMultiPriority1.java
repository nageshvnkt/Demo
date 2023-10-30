package Mumbai;

public class TestMultiPriority1 extends Thread{
   public void run()
   {
	   System.out.println("Name of the thread is "+ Thread.currentThread().getName());
	   System.out.println("Priority of the thread is "+ Thread.currentThread().getPriority());
   }
	public static void main(String[] args) {
		
		TestMultiPriority1 t1=new TestMultiPriority1();
		TestMultiPriority1 t2=new TestMultiPriority1();
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		 t1.setPriority(9);
		 t2.setPriority(6);
		
		
		t1.start();
		t2.start();
		
		
	}

}
