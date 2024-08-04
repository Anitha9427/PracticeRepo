package Assignment;
import java.util.Scanner;
public class Salary {
	int basicSalary;
	int tax;
	int bonus;
	public void sal()
	{
		Scanner tree=new Scanner(System.in);
		System.out.println("The basic salary: ");
		 basicSalary=tree.nextInt();
		Scanner leaf=new Scanner(System.in);
		System.out.println("The deduction on basic by tax: ");
		 tax=leaf.nextInt();
		Scanner fruit=new Scanner(System.in);
		System.out.println("The bonus is: ");
		 bonus=fruit.nextInt();
	}

}						