package CollectionDemo;

import java.util.Scanner;

public class Assignment2Main {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	Assignment2 a=new Assignment2();
	a.setNames();
	a. printNames( );
	a.getName( sc.next() );
	a.printNamesKeySet( );
	a.printSize( );
	a.remove( sc.next());
 a.printNames();
}
}
