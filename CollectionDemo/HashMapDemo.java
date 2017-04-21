package CollectionDemo;
import java.util.Enumeration;

import java.util.HashMap;

public class HashMapDemo {
	
public static void main(String[] args) {
	HashMap<Integer,String> hm=new HashMap<Integer,String>();
	hm.put(10, "Simran");
	hm.put(11, "Shefu");
	hm.put(15, "Prajoti");
	hm.put(18, "Rachana");
	//1
	System.out.println(hm);
	//2
	Enumeration e=(Enumeration) hm.entrySet();
	while(e.hasMoreElements())
		System.out.println(e.nextElement());
	

	
	
}
}
