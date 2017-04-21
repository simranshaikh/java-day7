package CollectionDemo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Assignment1 
{
	ArrayList<String> names = new ArrayList<String>();	

	public void setNames()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		
		System.out.println("enter the name");
	for (int i=0; i<n ; i++)
	{
		String s=sc.next();
		names.add(s);
	}

	}

	public void SearchName(String n)
	{
if(names.contains(n))
{
	System.out.println("Found !!!");
}
else
{
	System.out.println("Not Found !!!!");
	}
}

public void searchName(int index) 
{
	String s=names.get(index);
	if(s.equals(null))
	{
		System.out.println("Not Found");
	}
	else
	{
		System.out.println("Found");
	}
}

public void printNames( )
{
	Iterator i=names.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
}

public void removeName( String sn ) 
{
	System.out.println(names.remove(sn));
}


}