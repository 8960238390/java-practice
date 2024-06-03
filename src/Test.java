import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		
		List<EmployeeNew> empList = new ArrayList<>();
		
		empList.add(new EmployeeNew(100,"Sharif",300L,"IT"));
		empList.add(new EmployeeNew(101,"Nitin",350L,"Management"));
		empList.add(new EmployeeNew(102,"Saurabh",100L,"Sales"));
		empList.add(new EmployeeNew(103,"Ishti",500L,"IT"));
		
		empList.stream().sorted((emp1, emp2) -> {
			Long sal1 = emp1.getSalary();
			Long sal2 = emp2.getSalary();
			
			return sal1.compareTo(sal2);
		}).forEach(emp -> System.out.println(emp));
		
		System.out.println("**********************");
		
		empList.stream().sorted((emp1,emp2) -> emp2.getSalary().compareTo(emp1.getSalary())).forEach(System.out::println);
		
		System.out.println("**********************");
		
		Map<String, List<EmployeeNew>> collect = empList.stream().collect(Collectors.groupingBy(EmployeeNew::getDept));
		
		System.out.println(collect);
		
	}
}
