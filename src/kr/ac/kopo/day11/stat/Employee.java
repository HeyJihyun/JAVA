package kr.ac.kopo.day11.stat;

public class Employee {
	
	int no;
	String name;
	int salary;
	String grade;
	static int employeeCnt;
	
	Employee(){
		++employeeCnt;
	}
	
	Employee(int no, String name, int salary, String grade){
		this.no = no;
		this.name = name;
		this.salary = salary;
		this.grade = grade;
		++employeeCnt;
	}
	
	void info() {
		System.out.println("사번 : " + no + ", 이름 " + name + ", 연봉 : " + salary + "만 원, 직급 : " + grade);
	}
	
	static void employeeCntInfo() {
		System.out.println("입사한 총 사원수 : " + Employee.employeeCnt + "명");
	}

}
