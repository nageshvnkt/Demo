package Mumbai;

public class TestArray {

	public static void main(String[] args) {		
		int a[]=new int[5];
		a[0]=2;
		a[1]=3;
		a[2]=4;
		a[3]=9;
		a[4]=5;

		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		int arr[]={33,3,4,5};    
		for(int i:arr)  
		System.out.println(i);  

	}

}
