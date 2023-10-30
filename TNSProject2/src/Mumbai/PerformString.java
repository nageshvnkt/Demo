package Mumbai;
class ConcatTests{  
    public static String concatWithString()    {  
        StringBuilder t = new StringBuilder("Java");  
        for (int i=0; i<10000; i++){  
            t = t.append("Tpoint");  
        }  
        return t.toString();  
    } 
      static String concatWithStringBuffer(){  
        StringBuffer sb = new StringBuffer("Java");  
        for (int i=0; i<10000; i++){  
            sb.append("Tpoint");  
        }  
        return sb.toString();  
    } 
}
public class PerformString {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();  
          ConcatTests.concatWithString();  
System.out.println("Time taken by Concating with StringBuilder: "+(System.currentTimeMillis()-startTime)+"ms");  
	        startTime = System.currentTimeMillis();  
	        ConcatTests.concatWithStringBuffer();  
System.out.println("Time taken by Concating with  StringBuffer: "+(System.currentTimeMillis()-startTime)+"ms");
					  

	}

}
