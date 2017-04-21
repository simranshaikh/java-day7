package ExceptionHandling;

import java.util.Scanner;

public class Bank {
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
//	Account a=new Account();
//	try {
//		a.setAccId(sc.next());
//	} catch (AccountException e) {
//		
//		//e.printStackTrace();
//		System.out.println(e.getMessage());   //to write user defined message only
//	}
//	a.setAccType(sc.next());
//	System.out.println(a);



try {
	Account a = new Account(sc.next(),sc.next());
	System.out.println(a);
} catch (AccountException e1) {
	
	e1.printStackTrace();
	System.out.println(e1.getMessage());
}


}
}
