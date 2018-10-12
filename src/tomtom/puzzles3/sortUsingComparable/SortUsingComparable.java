package tomtom.puzzles3.sortUsingComparable;

import java.util.ArrayList;
import java.util.Collections;

public class SortUsingComparable {
	
	static ArrayList<Integer> baseList = new ArrayList<>();
	
	public static void main(String[] args) {
		
		SortUsingComparable sort = new SortUsingComparable();
		sort.listOfValuesforSorting();
		
		ArrayList<Employee> emp = new ArrayList<>();
		
		emp.add(new Employee(10, "ten"));
		emp.add(new Employee(13, "thirteen"));
		emp.add(new Employee(8, "eight"));
		emp.add(new Employee(18, "eighteen"));
		emp.add(new Employee(6, "six"));
		emp.add(new Employee(5, "five"));
		emp.add(new Employee(12, "twelve"));
		Collections.sort(emp, new SortEmpId());
		
		for (Employee employee : emp) {
			System.out.println(employee.id+"  "+employee.name);
		}
	}
	
	
	public void listOfValuesforSorting() {
		
		baseList.add(12);
		baseList.add(5);
		baseList.add(18);
		baseList.add(6);
		baseList.add(8);
		baseList.add(10);
		baseList.add(13);

	}
	
}
