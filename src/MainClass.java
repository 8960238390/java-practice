import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {

		/*
		int[] numbers = { 5, 3, 6, 3, 2, 1 };

		Arrays.sort(numbers);

		System.out.println(Arrays.toString(numbers));

		Employee[] emp = new Employee[4];
		emp[0] = new Employee(4, "Ishti");
		emp[1] = new Employee(2, "Saurabh");
		emp[2] = new Employee(1, "Rahul");
		emp[3] = new Employee(3, "Nitin");
			
		//Arrays.sort(emp);

		Arrays.sort(emp,Employee.NameComprator);
		System.out.println(Arrays.toString(emp));
		
		*/
		 
		Employee emp1 = new Employee(1, "Sharif");
		Employee emp2 = new Employee(1, "Sharif");
		
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp1 == emp2);
		System.out.println(emp1.equals(emp2));
		 
		
	}
}
