package Assignment;

public class Address {
String AddressDet;
Student student;
public Address(String AddressDet,Student student)
{
	this.AddressDet=AddressDet;
	this.student=student;
}
public void dis()
{
	System.out.println("The name of the student: "+student.name+" , "+"The Roll No: of the student: "+student.rollNo);
	System.out.println("The address of the student: "+AddressDet);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student obj=new Student("Ananya",10);
Address obj1=new Address("Lekshmi Bhavan,Nilamel,Tvm",obj);
obj1.dis();

	}

}
