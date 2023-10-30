package Mumbai;

public class StringEx {

	public static void main(String[] args) {
		String s1="Welcome";
		String s2=new String("Example");
		String s3=new String("HelloWorld");
		System.out.println(s1);
		System.out.println(s2);
		s2=s2.replace('x','g');
		System.out.println(s2);
		System.out.println(s3.indexOf('W'));
		System.out.println(s3.contains("World"));
	}

}
