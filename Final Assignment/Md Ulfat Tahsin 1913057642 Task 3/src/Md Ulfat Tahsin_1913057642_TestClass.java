import java.util.*;
public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
	   Employee[] employee_array = new Employee[3];
	   
       try {
    	   for(int i=0; i<employee_array.length; i++) {
    		   System.out.println("Enter first name of Employee: " +(i+1));
    		   String first_name = input.next();
    		   System.out.println("Enter last name of Employee: " +(i+1));
    		   String last_name = input.next();
    		   System.out.println("Enter ID of Employee: " +(i+1));
    		   int id = input.nextInt();
    		   System.out.println("Enter address of Employee: " +(i+1));
    		   String address = input.next();
    		   System.out.println("Enter salary of Employee: " +(i+1));
    		   int salary = input.nextInt();
    		   
               employee_array[i] = new Employee(first_name, last_name, address, id, salary);
    	        }
    	   }catch(Exception a) {
    		   System.out.println("Invalid input: " +a);
    	   }
       
       System.out.println("The list of employees after arranging them according to alphabetical order of their last name is as follows: ");
       Employee.sort(employee_array);
       Employee.printList(employee_array);
       
       System.out.println("The employee with the highest salary is: " +Employee.max(employee_array)); 
}
}
