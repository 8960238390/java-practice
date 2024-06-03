package practice;

final public class ImmitableClass {

	private final String name;
}

final class Employee{
	
	private final String name;
	private final Long sal;
	private final String dept;
	
	public Employee(String name, Long sal, String dept) {
		super();
		this.name = name;
		this.sal = sal;
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public Long getSal() {
		return sal;
	}

	public String getDept() {
		return dept;
	}
	
	
}
