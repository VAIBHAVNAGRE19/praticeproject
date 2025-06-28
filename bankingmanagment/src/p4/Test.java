package p4;

import java.util.Scanner;

import p3.Sbi;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sbi s1=new Sbi();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("0--exit \n 1--account details \n 2--know details account holder \n 3--deposite money \n 4--withdraw money \n 5--check balance");
			int n=sc.nextInt();
			switch(n)
			{
			case 1:
				s1.createAccount();
				break;
				
			case 2:s1.displayAllDetails();
					break;
			
			case 3:s1.depositeMoney();
				break;
				
			case 4:s1.withdrawal();
					break;
			
			case 5:s1.balanceCheck();
			break;
			case 0:System.out.println("thank you");
			System.exit(0);
			}
		}

	}

}
