package practice;

import java.io.File;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

	
	public static void main(String[] args) {
		
		List<Employee> empList= new ArrayList<>();
		empList.add(new Employee("mohamad", "", null, null));
		
		Map<String, Long> collect = empList.stream().collect(Collectors.groupingBy(Employee::getFristName, Collectors.counting()));
		
		System.out.println(collect);
		
		File file = new File("D:\\sample");
		
	}
}

class Employee{
	
	private String fristName;
	private String lastName;
	private Long sal;
	private String dept;
	public Employee(String fristName, String lastName, Long sal, String dept) {
		super();
		this.fristName = fristName;
		this.lastName = lastName;
		this.sal = sal;
		this.dept = dept;
	}
	public String getFristName() {
		return fristName;
	}
	public void setFristName(String fristName) {
		this.fristName = fristName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Long getSal() {
		return sal;
	}
	public void setSal(Long sal) {
		this.sal = sal;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [fristName=" + fristName + ", lastName=" + lastName + ", sal=" + sal + ", dept=" + dept + "]";
	}
	
}
