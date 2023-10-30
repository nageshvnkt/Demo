package Mumbai;

class Eclips implements Runnable
{
	public void run()
	{
		System.out.println("Eclipse1 threadId is "+Thread.currentThread().getId());
	}
}

class Eclipse2 implements Runnable
{
	public void run()
	{
		System.out.println("Eclipse2 threadId is "+Thread.currentThread().getId());
	}
}
public class Thread2 {

	public static void main(String[] args) {
	   Eclips obj=new Eclips();
	   Thread t1=new Thread(obj);
	   t1.start();
	   Eclipse2 obj2=new Eclipse2();
	   Thread t2=new Thread(obj2);
	   t2.start();	
	}

}
