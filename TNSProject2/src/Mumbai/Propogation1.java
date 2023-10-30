package Mumbai;

public class Propogation1 {
	void m()
	{  
		 int data=50/0;  
	 }  
	void n()
	{  
		m();  
	}  
	void p()
	{  
		try{
		     n();  
		   }catch(Exception e){System.out.println("exception handled"+e);}  
		}  
	public static void main(String[] args) {
		
		Propogation1 obj=new Propogation1();  
		obj.p();  
		System.out.println("normal flow...");  

	}

}
