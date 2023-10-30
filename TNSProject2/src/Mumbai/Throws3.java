package Mumbai;

import java.io.IOException;

class S{
	  void method() throws IOException
	   {  
	   System.out.println("device operation performed");  
	   }  
}  

public class Throws3 {

	public static void main(String[] args) throws IOException {
	     S m=new S();  
	       m.method();  
          System.out.println("normal flow...");  


	}

}
