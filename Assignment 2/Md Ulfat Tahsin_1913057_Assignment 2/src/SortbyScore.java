import java.util.Comparator;

public class SortbyScore implements Comparator<Student> {

	public int compare(Student a, Student b) {
		return b.score - a.score ;
	}

}
