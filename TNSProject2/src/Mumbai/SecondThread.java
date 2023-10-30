package Mumbai;


class Thraed1 implements Runnable
{
 public void run()
	{
		System.out.println("Fisrt thread ID="+Thread.currentThread().getId());
	}
}

class Thraed2 implements Runnable
{
	public void run()
	{
		System.out.println("Second thread ID="+Thread.currentThread().getId());	
	}
}
public class SecondThread {
	public static void main(String[] args) {
		Thraed1 td1=new Thraed1();
		Thread t1=new Thread(td1);
		t1.start();	
		Thraed2 td2=new Thraed2();
		Thread t2=new Thread(td2);
		t2.start();
		

	}

}
