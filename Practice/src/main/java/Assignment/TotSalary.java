package Assignment;

public class TotSalary extends SalCal{
	public void tot()
	{
	double tot=basicSalary+hra-pf-tax+bonus;
	System.out.println("The total salary is: "+tot);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TotSalary obj=new TotSalary();
obj.sal();
obj.cal1();
obj.tot();
	}

}
