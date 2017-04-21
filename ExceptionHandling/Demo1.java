package ExceptionHandling;

import java.util.Scanner;

public class Demo1 {
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);	
int arr[]=new int[4];
arr[0]=1;arr[1]=2;arr[2]=21;arr[3]=22;
try{
System.out.println("for array");
System.out.println("Enter a Index:");
int idx=sc.nextInt();
System.out.println("character at entered index is"+arr[idx]);

String str="Ganesh";
System.out.println("For string");
System.out.println("Enter a Index:");
idx=sc.nextInt();
System.out.println("character at entered index is  "+str.charAt(idx));
}
catch(ArrayIndexOutOfBoundsException a)
{
	System.out.println("Enter array within range of 0 to 3");
	}
catch(StringIndexOutOfBoundsException s)
{
	System.out.println("Enter array within range of 0 to 5");
	}

catch(Exception e)
{
	System.out.println("kuch bhi enter karte hoo yaaar....");
	}


	

	
	

//System.out.println("Enter a numerator:");
//int num=sc.nextInt();
//
//System.out.println("Enter a denomenator:");
//int den=sc.nextInt();
//try
//{
//float ans=num/den;
//System.out.println("ans is:"+ans);
//}
//catch(ArithmeticException a)
//{
//	System.out.println("Please Enter a non-zero value for denomenator:");
//}
//
//}
}
}
