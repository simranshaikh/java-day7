package ExceptionHandling;

import java.util.Scanner;

public class Clinic {
public static void main(String[] args) throws DoctorException{
	Scanner sc=new Scanner(System.in);
	Doctor d=new Doctor();
	
	System.out.println("Enter doctor's degree");
	try{
d.setDegree(sc.useDelimiter("\n").next());
	}
	catch(DoctorException e){
		System.out.println("enter valid  degree");
	}
	System.out.println("Enetr doctor's name");
	String nm=sc.next();
	d.setName(nm);

}
}
