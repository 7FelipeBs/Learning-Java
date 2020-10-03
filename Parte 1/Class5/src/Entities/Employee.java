package Entities;

public class Employee {
	
	public Integer Id;
	public String Name;
	public Double Salary;
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Double getSalary() {
		return Salary;
	}
	public void setSalary(Double salary) {
		Salary = salary;
	}
	
	public Employee() {
		super();
	}
	public Employee(Integer id, String name, Double salary) {
		Id = id;
		Name = name;
		Salary = salary;
	}
	
	public void Increase (double percentue, int id) {
		if(Id == id) {
			Salary = (Salary / 100 *  percentue) + Salary;
		}
	}
	
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", Name=" + Name + ", Salary=" + Salary + "]";
	}
	
}
