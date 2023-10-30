package Mumbai;

public class FinallyEx {

	public static void main(String[] args) {
		try{
			//below code do not throw any exception
			int data=25/0;    
			System.out.println(data);    
			}    
			//catch won't be executed
			catch(ArrayIndexOutOfBoundsException e){  
			System.out.println(e);  
			} 
		
		finally {
	    	   System.out.println("Finally statement is executed");
	       }
		
		
       

	}

}
