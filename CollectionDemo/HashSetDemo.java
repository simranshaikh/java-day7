package CollectionDemo;
import java.util.HashSet;
public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add(true);
		hs.add("Simran");
		hs.add(1.45);
		
		System.out.println(hs);
		System.out.println(hs.size());
		
	}
}
