
public abstract class Vehicle {

	protected String color, IDnumber, model;
	
	Vehicle()
	{
		
	}
	
	Vehicle(String color, String IDnumber, String model)
	{
		this.color = color;
		this.IDnumber = IDnumber;
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	protected void setColor(String color) {
		this.color = color;
	}

	protected String getIDnumber() {
		return IDnumber;
	}

	protected void setIDnumber(String iDnumber) {
		IDnumber = iDnumber;
	}

	public String getModel() {
		return model;
	}

	protected void setModel(String model) {
		this.model = model;
	}
	
	public abstract void wheels();
}
