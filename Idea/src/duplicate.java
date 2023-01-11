import java.util.Scanner;

public class duplicate {

	public static void main(String[] args) {
 
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length of array: ");
		int n=sc.nextInt();
        int [] arr = new int[n];  
        System.out.print("Enter elements of array: ");
        for(int i=0;i<n;i++)
        {
        	arr[i]=sc.nextInt();
        }
        int [] fr = new int [n];  
        int visited = -1;  
        
        //kdfhoisdofih
        for(int i = 0; i < n; i++){  
            if(fr[i]==visited)
            {
            	continue;
            }
        	int count = 1;  
            for(int j = i+1; j <n; j++){  
                if(arr[i] == arr[j]){  
                    count++;  
                    fr[j] = visited;  
                }  
            }  
            if(fr[i] != visited)  
                fr[i] = count;  
        }  
        
        //ewfgdjckjsgsuifsuyvcfdjg,ytdbvdmf
        System.out.println(" Element : Frequency");  
        System.out.println("---------------------------------------");  
        for(int i = 0; i < fr.length; i++){  
            if(fr[i] != visited)  
                System.out.println("    " + arr[i] + "    :    " + fr[i]);  
        }  
  
		
	}

}
