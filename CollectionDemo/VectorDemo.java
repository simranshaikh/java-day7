package CollectionDemo;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
	
public static void main(String[] args) {
	Vector v=new Vector();
	v.add(10);
	v.add(12);
	v.add(13);
	v.add(14);
	//1
//	System.out.println(v);
	//2
	/*
	for (int i=0; i < v.size() ; i++)
		System.out.println(v.get(i));
		*/
	//3
	Iterator i=v.iterator();
	while(i.hasNext())
		System.out.println(i.next());
	
}
}
