package CollectionDemo;

import java.util.ArrayList;
import java.util.Iterator;

import ExceptionHandling.AccountException;

public class ArrayListDemo {
	
public static void main(String[] args) throws AccountException {
	
	ArrayList a =new ArrayList();
	a.add(10);
	a.add('A');
	a.add("Simran");
	a.add(true);
	a.add(1.23);
	a.add(new Account("ACC123","current"));
	//get value
	System.out.println(a.get(4));
	//delete
//	System.out.println(a.remove(1.23));
	//get size
	
	System.out.println(a.size());
	//System.out.println(a); .... to display all the elements
	//1
	//System.out.println(a);
	//2
	for (int i=0; i < a.size() ; i++)
		System.out.println(a.get(i));
	//3
	Iterator i=a.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	System.out.println(a.indexOf(true));
			
}
}
