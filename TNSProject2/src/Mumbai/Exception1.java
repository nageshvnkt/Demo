package Mumbai;

public class Exception1 {

	public static void main(String[] args) {
		int a=4,q,r;
		int x=2;
		System.out.println(x);
		int z=a/x;
		System.out.println(z);	
		
		try{
			q=a/0;
		   }
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}	
		String s=null;		
		try{
			System.out.println(s.length());
		 }
		catch(NullPointerException e )
		{
			System.out.println(e);
		}
		 int arr[]=new int[5];
		 
		try {
			arr[7]=24;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
				 String str="abc";
				 try {
				 int i=Integer.parseInt(str);
				 }
				 catch(Exception e)
				 {
					 System.out.println(e);
				 }
		int p=a*z;
		System.out.println(p);
		r=x*z;
		System.out.println(r);      
	}

}
