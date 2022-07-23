
import java.util.*;

public class testclass {

	public static void main(String[] args) {
	
		try {
			Formatter formatter = new Formatter("Student Record.txt");
			
			Student[] studentarray = new Student[10];
			Scanner input = new Scanner(System.in);
			System.out.println("Enter name, id and score of student: ");
			
			for(int i=0; i<studentarray.length; i++) {
				System.out.println("Student #: " +(i+1));
				String name = input.next();
				String id = input.next();
				int score = input.nextInt();
				studentarray[i] = new Student(name, id, score);
				
				formatter.format("%s\r\n", name);
				formatter.format("%s\r\n", id);
				formatter.format("%d\r\n", score);		
			}
			
			Arrays.sort(studentarray, new SortbyScore());
			
			System.out.println("Sorted according to score: ");
			for(int i=0; i<studentarray.length; i++) {
				System.out.println(studentarray[i]);}
				
			System.out.println("Highest scorer: " +studentarray[0].toString());
			
			formatter.close();
			
		}catch(Exception a) {
			System.out.println(a);
		}
	}
}
