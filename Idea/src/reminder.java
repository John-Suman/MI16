import java.util.Scanner;

public class reminder {

	public static void main(String[] args) {
		int n,m;
		System.out.print("Enter Number: ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.print("Enter Number to divide: ");
		m=sc.nextInt();
		while(m<=n)
		{
			n=n-m;
		}
		System.out.print("Reminder: "+n);
	}

}
