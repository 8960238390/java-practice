
public class EmployeeNew {

	private int id;
	private String name;
	private Long salary;
	private String dept;

	public EmployeeNew() {
		super();
	}

	public EmployeeNew(int id, String name, Long salary, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "EmployeeNew [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}

}
