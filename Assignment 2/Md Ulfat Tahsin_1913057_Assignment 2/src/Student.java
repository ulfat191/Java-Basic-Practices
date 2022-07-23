
public class Student {

	private String name, id;
	protected int score;
	
	Student()
	{
		
	}
	
	Student(String name, String id, int score)
	{
		this.name = name;
		this.id = id;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	protected int getScore() {
		return score;
	}

	protected void setScore(int score) {
		this.score = score;
	}
	
	public String toString() {
		return "Name: " + name + " ID: " +id + " Score: " +score;
 	}
}
