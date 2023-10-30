package Mumbai;

public class NestedTryBlock2 {

	public static void main(String[] args) {
		try {  
			try {   
				try {  
					String s=null;
					System.out.println(s.length());
					
//					int arr[] = { 1, 2, 3, 4 };  
//					System.out.println(arr[10]);  
				}  
				// to handles ArithmeticException
				catch (ArithmeticException e)
				{  
					System.out.println("Arithmetic exception");  
					System.out.println(" inner try block 2");  
				}  
			}  // to handle ArithmeticException
			catch (ArithmeticException e)
			{  
				System.out.println("Arithmetic exception");  
				System.out.println("inner try block 1");  
			}  
		}       
		catch (ArrayIndexOutOfBoundsException e4)
		{  
			System.out.print(e4);  
			System.out.println(" outer (main) try block");  
		}  
		catch (Exception e5) {  
			System.out.print("Exception:"+e5);  
			System.out.println(" handled in main try-block");  }  
	}
}