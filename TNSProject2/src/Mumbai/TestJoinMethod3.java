package Mumbai;

public class TestJoinMethod3 extends Thread{
   
	public void run()
	{
		System.out.println("Running");
	}
	public static void main(String[] args) {
		TestJoinMethod3 t1=new TestJoinMethod3();
		TestJoinMethod3 t2=new TestJoinMethod3();
		
		System.out.println("First Thread name="+t1.getName());
		System.out.println("First Thread ID="+t1.getId());
		System.out.println("Second  Thread name="+t2.getName());
		System.out.println("Second  Thread ID="+t2.getId());	
		t1.setName("Sonoo");
		System.out.println("New Thread name="+t1.getName());
	}

}
