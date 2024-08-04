package Assignment;

public class SalCal extends Salary {
	double hra;
	double pf;
	public void cal1()
	{
	hra=basicSalary*0.05;
	System.out.println("The hra is: "+hra);
	pf=basicSalary*0.20;
	System.out.println("The pf is: "+pf);
	}
	

}
