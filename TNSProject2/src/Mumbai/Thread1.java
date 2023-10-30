package Mumbai;

class Eclipse extends Thread
{
	public void run()
	{
		System.out.println("Eclipse Thread Id is"+Thread.currentThread().getId());
	}
}
class PPT extends Thread
{
	public void run()
	{
		System.out.println("PPT Thread Id is"+Thread.currentThread().getId());
	}
}
public class Thread1 {

	public static void main(String[] args) {
		Eclipse obj=new Eclipse();
		obj.start();
		PPT obj1=new PPT();
		obj1.start();
		
	}

}
