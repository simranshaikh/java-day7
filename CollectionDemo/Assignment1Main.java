package CollectionDemo;

import java.util.Scanner;

public class Assignment1Main {
	public static void main(String[] args) {
		Assignment1 o=new Assignment1 ();
		o.setNames();
		o.SearchName("Simran");
		
		o.printNames();
		o.removeName("Sim");
		o.printNames();
		
	}

}
