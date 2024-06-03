import java.util.Comparator;

public class Employee implements Comparable<Employee>{

	private int empno;
	private String name;
	
	public Employee(int empno, String name) {
		this.empno = empno;
		this.name=name;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", name=" + name + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj == null || this.getClass() != obj.getClass()) {
			return false;
		}
		
		if(obj == this) {
			return true;
		}
		
		Employee emp = (Employee)obj;
		return this.getEmpno() == emp.getEmpno();
	}
	
	@Override
	public int hashCode() {
		
		return this.getEmpno();
	}

	@Override
	public int compareTo(Employee emp) {
		
		return this.empno-emp.empno;
	}
	
	public static Comparator<Employee> NameComprator = new Comparator<Employee>() {
		
		@Override
		public int compare(Employee o1, Employee o2) {
			
			return o1.getName().compareTo(o2.getName());
		}
	};
}
