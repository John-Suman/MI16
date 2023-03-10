import java.util.Scanner;

public class duplicate {

	public static void main(String[] args) {
        //Initialize array  
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length of array: ");
		int n=sc.nextInt();
        int [] arr = new int[n];  
        System.out.print("Enter elements of array: ");
        for(int i=0;i<n;i++)
        {
        	arr[i]=sc.nextInt();
        }
	
	
        //Array fr will store frequencies of element  
        int [] fr = new int [n];  
        int visited = -1;  
        
        
        for(int i = 0; i < n; i++){  
            if(fr[i]==visited)
            {
            	continue;
            }
        	int count = 1;  
            for(int j = i+1; j <n; j++){  
                if(arr[i] == arr[j]){  
                    count++;  
                    //To avoid counting same element again  
                    fr[j] = visited;  
                }  
            }  
            if(fr[i] != visited)  
                fr[i] = count;  
        }  
  
        //Displays the frequency of each element present in array  
        System.out.println(" Element : Frequency");  
        System.out.println("---------------------------------------");  
        for(int i = 0; i < fr.length; i++){  
            if(fr[i] != visited)  
                System.out.println("    " + arr[i] + "    :    " + fr[i]);  
        }  
  
		
	}

}
