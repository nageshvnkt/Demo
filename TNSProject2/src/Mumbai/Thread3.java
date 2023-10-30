package Mumbai;
class Eclipse4 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Eclipse Thread Id is"+Thread.currentThread().getId());	
		}
		
	}}
class PPT4 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
		System.out.println("PPT Thread Id is"+Thread.currentThread().getId());
		}
	}}
public class Thread3 {

	public static void main(String[] args) {
		Eclipse4 obj=new Eclipse4();
		obj.start();
		PPT4 obj1=new PPT4();
		obj1.start();		
	}

}
