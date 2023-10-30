package Mumbai;

public class ExceptionEx {
	public static void main(String[] args) {
		int a,b,c,d,x,f,z;
		a=6;
		System.out.println(a);
		b=10;
		
		int arr[]=new int[5];
		try {
		arr[9]=25;
		
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		System.out.println(b);
		c=b/10;
		System.out.println(c);
		try {
		z=a/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		x=17;
		System.out.println(x);
		f=x*2;
		
		String s2=null;
		try {
		System.out.println(s2.length());
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		System.out.println(f);
		String s="TNS";
		System.out.println(s);
		
	}

}
