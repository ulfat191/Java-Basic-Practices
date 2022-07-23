
public class Person implements Comparable<Person>{

	private String first_name, last_name, address;
	
	Person(){
		this.first_name = " ";
		this.last_name = " ";
		this.address = " ";
	}
	
	Person(String first_name, String last_name, String address){
		this.first_name = first_name;
		this.last_name = last_name;
		this.address = address;
	}
	

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		return "Name: " +getFirst_name() + " " + getLast_name() + "\n Address: " +getAddress();
	}
	
	public int compareTo(Person p) {
	    return this.last_name.compareTo(p.last_name);
	}
}
