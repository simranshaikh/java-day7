package ExceptionHandling;

import java.util.Scanner;

public class Doctor{
	Scanner sc=new Scanner(System.in);

	private String degree;
	private String name;
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) throws DoctorException {
		if(degree.length()>0||degree.isEmpty()||degree.equals(null))
			//throw new DoctorException("please enter degree");
			throw new DoctorException();
		else
		this.degree = degree;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


		}
	
