package Assignment2;
class Employee{
	private int id;
	private String FirstName;
	private String lastName;
	private int salary;
	private int percentage;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	

public Employee(int id,String firstName,String lastName,int salary) {
	this.id=id;
	this.FirstName=firstName;
	this.lastName=lastName;
	this.salary=salary;
}

public int getAnnualSalary() {
	return salary*12;
}


public void raiseSalary(int percebtage) {
	this.salary=this.salary*(100+percentage)/100;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", FirstName=" + FirstName + ", lastname=" + lastName + ", salary=" + salary + "]";
}
}
public class question1UML {
	public static void main(String[] args) {
		Employee employee=new Employee(1,"abhi","pandey",45000);
		employee.raiseSalary(10);
		System.out.println(employee);
		
	}

}
