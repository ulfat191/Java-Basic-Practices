import java.util.*;
public class Employee extends Person {

	private int id, salary;
	
	Employee(){
		super();
		this.id = 0;
		this.salary = 0;
	}
	
	Employee(String first_name, String last_name, String address, int id, int salary){
		super(first_name, last_name, address);
		this.id = id;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return super.toString() + "\n Id: " +getId() + "\n Salary: " +getSalary();
	}
	
	public static void sort(Comparable[] list) {
		Arrays.sort(list);
	}
	
	public static void printList(Object[] object) {
		for(int i=0; i<object.length; i++) {
			Employee employee = (Employee)object[i];
			System.out.println("Employee: " +(i+1)+" details: " +employee.toString());
		}
	}
	
	public static Comparable max(Comparable[] list) {
		Employee employee = (Employee)list[0];
		Employee this_employee;
		
		for(int i=0; i<list.length; i++) {
			this_employee = (Employee)list[i];
			
			if(employee.getSalary() < this_employee.getSalary()) {
				employee = this_employee;
			}
			if(employee.getSalary() == this_employee.getSalary()) {
				System.out.println("Equal salary for:\n" +employee.toString() +"\n and \n" +this_employee.toString());
			}
		}
		return employee;
	}

}
