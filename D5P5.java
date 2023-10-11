import java.util.*;
class Employee 
{
	int id;
	String name;
	String department;
	double salary;
	public Employee() 
	{
		id=0;
		name=" ";
		department=" ";
		salary=0.0;

	}
	public Employee(int id, String name, String department, double salary)
	{
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public void display() 
	{
		System.out.println("ID:" + id);
		System.out.println("Name:" + name);
		System.out.println("Department:" + department);
		System.out.println("Salary:" + salary);
	}
}
class Manager extends Employee 
{
	private double bonus;
	public Manager(int id, String name, String department, double salary, double bonus) 
	{
		super(id, name, department, salary);
		this.bonus = bonus;
	}
	//Override
	public void display() 
	{
		super.display();
		System.out.println("Bonus:" + bonus);
	}
	public double getTotalSalary() 
	{
		return salary + bonus;
	}
}
class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of managers:");
		int n = sc.nextInt();
		Manager[] managers = new Manager[n];
		for (int i = 0; i<n; i++) 
		{
			System.out.print("Enter manager ID:");
			int id = sc.nextInt();
			System.out.print("Enter manager name:");

			String name = sc.next();
			System.out.print("Enter manager department:");
			String department = sc.next();
			System.out.print("Enter manager salary:");
			double salary = sc.nextDouble();
			System.out.print("Enter manager bonus:");
			double bonus = sc.nextDouble();
			managers[i] = new Manager(id, name, department, salary, bonus);
		}
		Manager highestPaidManager = managers[0];
		for (int i = 1; i <n; i++) 
		{
			if (managers[i].getTotalSalary() > highestPaidManager.getTotalSalary()) 
			{
				highestPaidManager = managers[i];
			}
		}
		System.out.println("\nDetails of the Manager with the Maximum Total Salary:");
		highestPaidManager.display();
	}
}