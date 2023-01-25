package banking;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		
		int ch=0,amount;
		String acc_no;
		String name;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter your account no: ");
		acc_no=sc.next();
		System.out.print("Enter your name: ");
		name=sc.next();
		SavingsAccount checking = new SavingsAccount(acc_no,name);

		
		
		

		while(ch!=4) {
			System.out.println("1. Deposite.");
			System.out.println("2. Withdraw.");
			System.out.println("3. Check Balance.");
			System.out.println("4. Exit.");
			
			
			System.out.print("Choose: ");
			ch=sc.nextInt();
			
		switch(ch)
		{
		case 1:
			System.out.print("Enter Amount to deposite: ");
			amount=sc.nextInt();
			checking.deposit(amount);
			System.out.println("Your Balance: " + checking.getBalance());
			break;
		case 2:
			System.out.print("Enter Amount to withdraw: ");
			amount=sc.nextInt();
			checking.withdraw(amount);
			System.out.println("Your Balance: " + checking.getBalance());
			break;
		case 3:
			System.out.println("Your Balance: " + checking.getBalance());
			break;
		case 4:
			System.out.println("Exit");
			break;
		default:
			System.out.println("Invalid Option!!!");	
		}
		System.out.println("____________________________________");
		System.out.println("\n");
		
	}
		

	   	

	}

}
