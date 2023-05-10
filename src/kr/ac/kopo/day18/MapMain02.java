package kr.ac.kopo.day18;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Employee {
    private String name;
    private String phone;

    Employee(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((phone == null) ? 0 : phone.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (phone == null) {
            if (other.phone != null)
                return false;
        } else if (!phone.equals(other.phone))
            return false;
        return true;
    }

    /*
     * @Override public boolean equals(Object obj) { Employee e = (Employee)obj;
     * if(this.name.equals(e.name) && this.phone.equals(e.phone)) { return true; }
     * return false; }
     * 
     * @Override public int hashCode() {
     * 
     * return 1000; }
     * 
     */

}

class Car {
    private String model;
    private String no;

    Car(String model, String no) {
        this.model = model;
        this.no = no;
    }

    public String getModel() {
        return model;
    }

    public String getNo() {
        return no;
    }
}

public class MapMain02 {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = new String("Hello");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        Employee e = new Employee("홍길동", "010-1111-2222");
        Employee e2 = new Employee("홍길동", "010-1111-2222");
        if (e.equals(e2)) {
            System.out.println("같다");
        } else {
            System.out.println("다르다");
        }

        System.out.println(e.toString());
        System.out.println(e2.toString());

        Map<Employee, Car> carList = new HashMap<>();

        carList.put(new Employee("홍길동", "010-1111-2222"), new Car("소나타", "123나4567"));
        carList.put(new Employee("고길동", "010-3333-4444"), new Car("산타페", "234라3416"));
        carList.put(new Employee("한길동", "010-7777-8888"), new Car("K5", "567무2478"));
        carList.put(new Employee("홍길동", "010-1111-2222"), new Car("벤츠", "345구7367"));

        System.out.println("등록된 차량 대수 : " + carList.size());

        Set<Employee> setc = carList.keySet();
        for (Employee s : setc) {
            System.out.println(s.getName() + " " + s.getPhone());
            System.out.println(carList.get(s).getModel() + " " + carList.get(s).getNo());
        }
    }

}
