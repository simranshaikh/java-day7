package CollectionDemo;

public abstract class Assignment4 implements Comparable{
	private int rollNo;
	private String name;
	public Assignment4(int rollNo, String name) {
		
		this.rollNo = rollNo;
		this.name = name;
	}
	
	
	public int getRollNo() {
		return rollNo;
	}
	public String getName() {
		return name;
	}
	
	public int compareTo(Object o)
	{
		Assignment4 a=(Assignment4) o;
		if(this.rollNo<a.rollNo)
			return -1;
		else if(this.rollNo>a.rollNo)
			return 1;
		else
			return 0;
		
		
	}
	
	@Override
	public String toString() {
		return "Assignment4 [rollNo=" + rollNo + ", name=" + name + "]";
	}

	
}
