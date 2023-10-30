package Mumbai;

public class Wrapper1 {

	public static void main(String[] args) {
		//Autoboxing
		int a=20;  
		Integer i=Integer.valueOf(a);
		Integer j=a;//autoboxing, now compiler will write Integer.valueOf(a) internally    
		System.out.println(a+" "+i+" "+j);  

		//AutoUnboxing
		Integer c=new Integer(3);    
		int x=c.intValue();  
		int y=c;    
		System.out.println(c+" "+x+" "+y);    


	}

}
