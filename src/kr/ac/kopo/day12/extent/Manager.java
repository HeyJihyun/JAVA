package kr.ac.kopo.day12.extent;

public class Manager extends Employee {
	
	Employee[] empList;

	public Manager() {
	}

	public Manager(int no, String name, int salary, String grade, Employee[] empList) {
		super(no, name, salary, grade);
		this.empList = empList;
	}

	@Override
	public void info() {
		super.info();
		System.out.println("----------------------------------------------");
		System.out.println("\t\t< 관리사원 리스트 > ");
		System.out.println("----------------------------------------------");
		for(Employee emp : empList) {
			emp.info();
		}
		System.out.println("----------------------------------------------");
	
		
	} 

	
	
	
}
