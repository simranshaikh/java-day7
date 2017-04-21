package ExceptionHandling;

import java.util.Scanner;

public class Array {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[10];
	arr[0]=1;arr[1]=11;arr[2]=12;arr[3]=13;arr[3]=14;arr[4]=15;arr[5]=16;arr[6]=17;arr[7]=18;arr[8]=19;arr[9]=10;
	try
	{
		System.out.println("For array");
		System.out.println("Enter a index ");
		int val=sc.nextInt();
		System.out.println("value at index is:  "+arr[val]);
	}
	catch(ArrayIndexOutOfBoundsException a)
	{
		System.out.println("enter proper range of index in range of 0 to 9");
	}
	catch(Exception e)
	{
		System.out.println("invalid");
	}
}
}
