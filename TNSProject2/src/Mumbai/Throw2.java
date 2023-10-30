package Mumbai;

class UserDefinedException extends Exception  
{  
  public UserDefinedException(String str)  
    {  
           super(str);  
    }  
}  
public class Throw2 {

	public static void main(String[] args) 
	{
	    	try
	    	 {  
		    	// throw an object of user defined exception
		    	throw new UserDefinedException("This is user-defined exception");  
	    	  }  
	    	catch (UserDefinedException ude)  
	    	   {  
			    	System.out.println("Caught the exception");  
			    	// Print the message from MyException object
			    	System.out.println(ude.getMessage());  
	    	   }  
	
	}

}
