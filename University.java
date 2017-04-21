
import java.util.Scanner;
public class University {
	static int count=0;
	private static Professor professor;
	Exam exam;
	static Course course;


	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		University.count = count;
	}

	public static Professor getProfessor() {
		return professor;
	}

	public static void setProfessor(Professor professor) {
		University.professor = professor;
	}

	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public static Course getCourse() {
		return course;
	}

	public static void setCourse(Course course) {
		University.course = course;
	}

	boolean studentVerificationProcess(Student student)
	{
		if (Validator.validateStudent(student))
			System.out.println(student.getSname()+"registered successfully");
		return true;
		
	}

	public void writeExamGetResult(Exam exam)
	{
		exam.setMarks(90);
		System.out.println("Marks:->"+exam.getMarks());
	}

	public void studentAdmission(Student student,Course course)
	{
System.out.println("your student id is "+(++count));
System.out.println(student.getSname()+"registred for"+course.getCname());
	}

	public void studentCertificationProcess(Student student,Course course)
	{
System.out.println(student.getSname()+"are java professional certified");
	} 


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s=new Student();


		System.out.println("Enter Student Name : ");
		String sname=sc.next();
		s.setSname(sname);

		System.out.println("Enter Student age : ");
		int age=sc.nextInt();
		s.setAge(age);


		System.out.println("Enter Student marks : ");
		int previousMarks=sc.nextInt();
		s.setPreviousMarks(previousMarks);

		System.out.println("Enter course id");
		int cid=sc.nextInt();


		System.out.println("Enter course name");
		String cname=sc.next();


		System.out.println("Enter course duration");
		int duration=sc.nextInt();
		Course c=new Course(cid,cname,duration);

		System.out.println("Enter Professor name");
		String pname=sc.next();
		System.out.println("Student "+s.getSname()+" Applied for university......");

		Professor p=new Professor();
		University u=new University();
		u.studentCertificationProcess(s, c);
		
		p.setPname(pname);
		p.setStudent(s);

Exam e=new Exam();

University uo=new University();

uo.setExam(e);
uo.setCourse(c);
uo.setProfessor(p);
p.teaches(c);
uo.studentVerificationProcess(s);
uo.studentAdmission(s, c);

p.conductingExam(e);
p.evaluatingPaper(e);
uo.writeExamGetResult(e);
uo.studentCertificationProcess(s, c);
	}
}
