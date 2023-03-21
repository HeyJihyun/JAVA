package kr.ac.kopo.day11.stat;

public class EmployeeMain {
	
	
	public static void main(String[] args) {
//		System.out.println("입사한 총 사원수 : " + Employee.employeeCnt + "명");
		Employee.employeeCntInfo();
		
		Employee e = new Employee(1, "홍길동", 3_400, "사원"); // 1.7 이상부터 천단위 숫자를 구분하기 위한_삽입가능
		Employee e2 = new Employee(2, "고길동", 3_700, "주임");
		Employee e3 = new Employee(3, "임길동", 3_500, "사원");

		e.info();
		e2.info();
		e3.info();
		
		Employee.employeeCntInfo();
//		System.out.println("입사한 총 사원수 : " + Employee.employeeCnt + "명");
	}

}
