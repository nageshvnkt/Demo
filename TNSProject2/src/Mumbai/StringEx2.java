package Mumbai;

public class StringEx2 {

	public static void main(String[] args) {
		   String s1="Sachin";  
		   String s2="SACHIN";  
		   String s3=new String("Sachin");  
		   String s4="Saurav";  
		   System.out.println(s1.equals(s2));//true  
		   System.out.println(s1.equals(s3));//true  
		   System.out.println(s1.equals(s4));//false  
           System.out.println(s1.equalsIgnoreCase(s2));
           
           System.out.println(s1==s2);
           System.out.println(s1==s3);
	}

}
