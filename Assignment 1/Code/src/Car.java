
public class Car extends Vehicle implements Comparable{

	Car()
	{
		super();
	}
	
	Car(String color, String IDnumber, String model)
	{
		super(color, IDnumber, model);
	}

	public void wheels() {
		System.out.println("A car has four wheels \n");
	}
   
	public boolean equals(Object o)
	{
		if(this.getModel() == ((Vehicle)o).getModel())
			return true;
		else 
			return false;
	}
	
	 public String toString()
	 {
	    	return "Car \n" + "Color: " +color + " ID number: " +IDnumber + " Model: " +model;
	 }

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
