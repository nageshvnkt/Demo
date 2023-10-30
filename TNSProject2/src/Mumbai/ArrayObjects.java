package Mumbai;

class Employees
{
	int empid;
	String name;
	double salary;
	public Employees(int empid, String name, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	
	void display()
	{
		System.out.println("EmpID="+empid+"EmpName="+name+"Sal="+salary);
	}
}
public class ArrayObjects {

	public static void main(String[] args) {
		Employees emp[]=new Employees[3];
		emp[0]=new Employees(23,"Mohan",34000.0);
		emp[1]=new Employees(33,"Suhan",94000.0);
		emp[2]=new Employees(43,"Suhas",64000.0);
		
		System.out.println("Employee details");
		emp[0].display();
		emp[1].display();
		emp[2].display();
		
	}

}
