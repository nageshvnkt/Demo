package Mumbai;

import java.util.StringTokenizer;

public class Tokenizer {

	public static void main(String[] args) {
		   StringTokenizer st = new StringTokenizer("my father,name,is,khan",",");  
		     while (st.hasMoreTokens()) {  
		         System.out.println(st.nextToken());  


	}
	}
}
