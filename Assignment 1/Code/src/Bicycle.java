
public class Bicycle extends Vehicle implements Comparable{

	Bicycle()
	{
		super();
	}
	
	Bicycle(String color, String IDnumber, String model)
	{
		super(color, IDnumber, model);
	}
	
	public boolean equals(Object o)
	{
		if(this.getModel() == ((Vehicle)o).getModel())
			return true;
		else 
			return false;
	}
	
	public void wheels() 
	{
        System.out.println("A bicycle has two wheels");
	}

	 public String toString()
	 {
	    	return "Bicycle: \n" + "Color: " +color + " ID number: " +IDnumber + " Model: " +model;
	 }

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
