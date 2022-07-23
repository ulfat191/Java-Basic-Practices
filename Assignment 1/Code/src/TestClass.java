import java.util.*;
public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		Vehicle vehicle[] = new Vehicle[10];
			
		System.out.println("Select vehicle option: \n \nPress (1) for car\n \nPress (2) for bicycle\n");
	    int option = input.nextInt();
		
			if(option==1)
			{
				for(int i=0; i<vehicle.length; i++)
				{
					System.out.println("Enter color, ID number and model for car # " +(i));
					String color = input.next();
					String IDnumber = input.next();
					String model = input.next();
					vehicle[i] = new Car(color, IDnumber, model);
				}
				
				for(int i=0; i<vehicle.length; i++) 
				{
					System.out.println("Information for # " +(i) + " " +vehicle[i].toString());
				}
				System.out.println("\nIf the model of the existing car matches with the immediate next one then the boolean value of that pair will be shown true\n \nThe existing car will also compare with itself and show a true value\n" );
				for(int i=0; i<vehicle.length; i++) 
				{
					System.out.println("For car #0: "  +" and " +(i));
					System.out.println(vehicle[0].model.equals(vehicle[i].model));
				}
				for(int i=1; i<vehicle.length; i++) 
				{
					System.out.println("For car #1: "  +" and " +(i));
					System.out.println(vehicle[1].model.equals(vehicle[i].model));
				}
				for(int i=2; i<vehicle.length; i++) 
				{
					System.out.println("For car #2: "  +" and " +(i));
					System.out.println(vehicle[2].model.equals(vehicle[i].model));
				}
				for(int i=3; i<vehicle.length; i++) 
				{
					System.out.println("For car #3: "  +" and " +(i));
					System.out.println(vehicle[3].model.equals(vehicle[i].model));
				}
				for(int i=4; i<vehicle.length; i++) 
				{
					System.out.println("For car #4: "  +" and " +(i));
					System.out.println(vehicle[4].model.equals(vehicle[i].model));
				}
				for(int i=5; i<vehicle.length; i++) 
				{
					System.out.println("For car #5: "  +" and " +(i));
					System.out.println(vehicle[5].model.equals(vehicle[i].model));
				}
				for(int i=6; i<vehicle.length; i++) 
				{
					System.out.println("For car #6: "  +" and " +(i));
					System.out.println(vehicle[6].model.equals(vehicle[i].model));
				}
				for(int i=7; i<vehicle.length; i++) 
				{
					System.out.println("For car #7: "  +" and " +(i));
					System.out.println(vehicle[7].model.equals(vehicle[i].model));
				}
				for(int i=8; i<vehicle.length; i++) 
				{
					System.out.println("For car #8: "  +" and " +(i));
					System.out.println(vehicle[8].model.equals(vehicle[i].model));
				}
			}
			
			if(option==2)
			{
				for(int i=0; i<vehicle.length; i++)
				{
					System.out.println("Enter color, ID number and model for bicycle # " +(i));
					String color = input.next();
					String IDnumber = input.next();
					String model = input.next();
					vehicle[i] = new Bicycle(color, IDnumber, model);
				}
				
				for(int i=0; i<vehicle.length; i++) 
				{
					System.out.println("Information for # " +(i) + " " +vehicle[i].toString());
				}
				
				System.out.println("\nIf the model of the existing bicycle matches with the immediate next one then the boolean value of that pair will be shown true\n\\nThe existing bicycle will also compare with itself and show a true value\\n");
				for(int i=0; i<vehicle.length; i++) 
				{
					System.out.println("For bicycle #0: "  +" and " +(i));
					System.out.println(vehicle[0].model.equals(vehicle[i].model));
				}
				for(int i=1; i<vehicle.length; i++) 
				{
					System.out.println("For bicycle #1: "  +" and " +(i));
					System.out.println(vehicle[1].model.equals(vehicle[i].model));
				}
				for(int i=2; i<vehicle.length; i++) 
				{
					System.out.println("For bicycle #2: "  +" and " +(i));
					System.out.println(vehicle[2].model.equals(vehicle[i].model));
				}
				for(int i=3; i<vehicle.length; i++) 
				{
					System.out.println("For bicycle #3: "  +" and " +(i));
					System.out.println(vehicle[3].model.equals(vehicle[i].model));
				}
				for(int i=4; i<vehicle.length; i++) 
				{
					System.out.println("For bicycle #4: "  +" and " +(i));
					System.out.println(vehicle[4].model.equals(vehicle[i].model));
				}
				for(int i=5; i<vehicle.length; i++) 
				{
					System.out.println("For bicycle #5: "  +" and " +(i));
					System.out.println(vehicle[5].model.equals(vehicle[i].model));
				}
				for(int i=6; i<vehicle.length; i++) 
				{
					System.out.println("For bicycle #6: "  +" and " +(i));
					System.out.println(vehicle[6].model.equals(vehicle[i].model));
				}
				for(int i=7; i<vehicle.length; i++) 
				{
					System.out.println("For bicycle #7: "  +" and " +(i));
					System.out.println(vehicle[7].model.equals(vehicle[i].model));
				}
				for(int i=8; i<vehicle.length; i++) 
				{
					System.out.println("For bicycle #8: "  +" and " +(i));
					System.out.println(vehicle[8].model.equals(vehicle[i].model));
				}
			}
	}
}
