package p3;

import p2.Rbi;

import java.util.Scanner;

import p1.Account;
public class Sbi implements Rbi {
	double bal;
Scanner sc=new Scanner(System.in);
Account s=new Account();
	@Override
	public void createAccount() {
		
System.out.println("Enter Details to create Account");	
int acc=sc.nextInt();
s.setAccNo(acc);
System.out.println(acc);

System.out.println("Enter Name");
String nm=sc.next();
s.setName(nm);
System.out.println(nm);

System.out.println("Enetr Mobile no");
String mobn=sc.next();
s.setMobNo(mobn);
System.out.println(mobn);

System.out.println("enter Addar no");
String adhar=sc.next();
String len="123456789123";
int len1=adhar.length();
int len2=len.length();

if(len1==len2) {
s.setAdharNo(adhar);
System.out.println(adhar);
}else {System.out.println("Correct adhar No");}

System.out.println("Enter Gender");
String gen=sc.next();
s.setGender(gen);
System.out.println(gen);

System.out.println("Enter ege");
int ag=sc.nextInt();
s.setAge(ag);
System.out.println(ag);

System.out.println("balance");
double bal=sc.nextDouble();
if(bal>500)
{
s.setBalance(bal);
System.out.println(bal);
}else {System.out.println("Deposit min amount is 500rs");}
	}

	@Override
	public void displayAllDetails() {
		// TODO Auto-generated method stub
	bal=s.getBalance();
		if(bal>500) {
		System.out.println("Account No is="+s.getAccNo());
		System.out.println("Name="+s.getName());
		System.out.println("Mobile No="+s.getMobNo());
		System.out.println("Adhar No="+s.getAdharNo());
		System.out.println("Gender="+s.getGender());
		System.out.println("age="+s.getAge());
		System.out.println("Balance="+s.getBalance());
		System.out.println("Thank You");
		}else {System.out.println("deposite min 500rs to open account");}
		}

	@Override
	public void depositeMoney() {
		// TODO Auto-generated method stub
		//double bal=0;
		System.out.println("To Create account min deposit is 500rs");
	double amt=sc.nextDouble();
	double ball=s.getBalance();
	double bal=ball+amt;
	s.setBalance(bal);
	System.out.println(bal);
	
	}

	@Override
	public void withdrawal() {
		// TODO Auto-generated method stub
		System.out.println("withdraw money");
		double amt=sc.nextDouble();
		double ball=s.getBalance();
		double bal=ball-amt;
		s.setBalance(bal);
		System.out.println(bal);
		
	}

	@Override
	public void balanceCheck() {
		// TODO Auto-generated method stub
		System.out.println("your account balance is"+s.getBalance());
	}

}
