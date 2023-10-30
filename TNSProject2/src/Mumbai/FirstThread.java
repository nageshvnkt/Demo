package Mumbai;
class Threads1 extends Thread
{
	public void run()
	{
		System.out.println("First Thread ID is="+Thread.currentThread().getId());
	}
}
class Threads2 extends Thread
{
	public void run()
	{
		System.out.println("Second thread Id is="+Thread.currentThread().getId());
	}
}
public class FirstThread {

	public static void main(String[] args) {
	Threads1 t1=new Threads1();
	t1.start();
	
	Threads2 t2 =new Threads2();
	t2.start();

	}

}
