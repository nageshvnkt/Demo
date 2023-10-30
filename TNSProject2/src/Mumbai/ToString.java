package Mumbai;


class Students
{
	 int rollno;
	 String name;
	 double fees;
	
	public Students(int rollno, String name, double fees) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Students [rollno=" + rollno + ", name=" + name + ", fees=" + fees + "]";
	}
	
}
public class ToString {

	public static void main(String[] args) {
	Students ob1= new Students(23,"Rajendra",70056.0);
	Students ob2=new Students(56,"naveen",6725.0);
	System.out.println(ob1.rollno+" "+ob1.name+" "+ob1.fees);	
	System.out.println(ob2);;
	//System.out.println(ob2);

	}

}
