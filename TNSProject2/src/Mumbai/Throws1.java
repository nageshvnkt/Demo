package Mumbai;

import java.io.IOException;

public class Throws1 {
	    void m() throws IOException{  
		throw new IOException("device error");//checked exception
		  }  
		void n() throws IOException{  
		m();  
		  }  
		void p()
		{  
		 try{
		     n();  
		   }catch(Exception e){System.out.println("exception handled"+e);}  
		  }  

	public static void main(String[] args) {
		   Throws1 obj=new Throws1();  
		   obj.p();  
		   System.out.println("normal flow...");  
		     }  


	}


