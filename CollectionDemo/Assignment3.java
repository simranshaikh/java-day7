package CollectionDemo;
import java.util.Iterator;
import java.util.TreeSet;
public class Assignment3 {

	public static void main(String[] args) {
		
		TreeSet<String> Product=new TreeSet<String>();
		Product.add("Simran");
		Product.add("Shefu");
		Product.add("Pooja");
		Product.add("Shruti");
		Product.add("Simran");
		Product.add("Rehman");
		
		//(1)
		
		Iterator i=Product.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	
		//(2)
		System.out.println("First Name"+Product.first());
		System.out.println("Last Name : "+Product.last());
		
		//3
		System.out.println("The size is : "+Product.size());
		
		//4
		System.out.println("Removing element from treeset "+Product.remove("Rehman"));
		
		//5
		System.out.println("Verifying Size : "+Product.size());
		
	}
}
