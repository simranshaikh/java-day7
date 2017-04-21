package CollectionDemo;


import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Assignment2 {

	HashMap<String,String> hm=new HashMap<String,String>();

	public void setNames()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();

		
		for (int i=0; i<n ; i++)
		{
		
			System.out.println("Enter the roll number");
			String rno=sc.next();
			System.out.println("Enter the name");
			String nm=sc.next();
			hm.put(rno,nm);
		}
	}

	
	public void printNames( )
	{
		Iterator i=hm.entrySet().iterator();
		while(i.hasNext())
		{
			Map.Entry m=(Map.Entry)i.next();
			System.out.println(m.getKey()+" "+m.getValue());
			
		}
	}

	public void getName( String key ) 
	{
		String s=hm.get(key);
		System.out.println(s);
	}

	public void printNamesKeySet( ) 
	{
		Set s=hm.keySet();
		
		System.out.println(hm.keySet());
	}

	
	public void printSize( ) 
	{
		System.out.println(hm.size());
	}
	
	public void remove( String key )
	{
		System.out.println(hm.remove(key));
	}
	
}
