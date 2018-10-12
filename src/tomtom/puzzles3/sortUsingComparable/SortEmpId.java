package tomtom.puzzles3.sortUsingComparable;

import java.util.Comparator;

public class SortEmpId implements Comparator{

	
	public int compare(Object o1, Object o2) {
		
		
		Employee e1 = (Employee) o1;
		Employee e2 = (Employee) o2;
		
		if(SortUsingComparable.baseList.indexOf(e1.id) > SortUsingComparable.baseList.indexOf(e2.id))
		return 1;
		else if(SortUsingComparable.baseList.indexOf(e1.id) < SortUsingComparable.baseList.indexOf(e2.id))
			return -1;
		else 
			return 0;
	}
	
	
}
