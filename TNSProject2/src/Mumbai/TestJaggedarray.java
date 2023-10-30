package Mumbai;

public class TestJaggedarray {

	public static void main(String[] args) {
        int arr[][] = new int[3][];  
        arr[0] = new int[3];  
        arr[1] = new int[4];  
        arr[2] = new int[2];  
        //initializing a jagged array  
        int count = 0;  
        for (int i=0; i<arr.length; i++)  
            for(int j=0; j<arr[i].length; j++)  
                arr[i][j] = count++;  
   
        //printing the data of a jagged array   
        for (int i=0; i<arr.length; i++){  
            for (int j=0; j<arr[i].length; j++){  
                System.out.print(arr[i][j]+" ");  
            }  
            System.out.println();//new line  
        }  

        
        int d[][] = { { 10, 20, 30 }, { 40 }, { 12, 21 }, { 11 } };

		System.out.println("Total Rows in Array d : " + d.length);

		 
        
        
        
        
        
        
        
        
        
        
        
	}

}
