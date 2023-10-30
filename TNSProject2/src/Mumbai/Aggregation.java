package Mumbai;

class Address
{
	String city;
	String state;
	String country;
	public Address(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + "]";
	}
		
}
class Employee
{
	int empid;
	String name;
	Address address;
	public Employee(int empid, String name, Address address) {
		super();
		this.empid = empid;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", address=" + address + "]";
	}
	
	
	}

public class Aggregation {

	public static void main(String[] args) {
		Address address1=new Address("agra","Delhi","India");
		Address address2=new Address("Lahore","Islamabad","Pakistan");
		Employee emp1=new Employee(23,"Krishna",address1);
		Employee emp2=new Employee(45,"Mohan",address2);
		System.out.println(emp1);
		
	}

}
