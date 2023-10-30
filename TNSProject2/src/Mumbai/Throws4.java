package Mumbai;

import java.io.IOException;

class P{
	  void method() throws IOException
	   {  
	    throw new IOException("Device Error");
	   }  
}  
public class Throws4 {

	public static void main(String[] args) throws IOException {
		 P m=new P();  
	       m.method();  
        System.out.println("normal flow...");  


	}

}
