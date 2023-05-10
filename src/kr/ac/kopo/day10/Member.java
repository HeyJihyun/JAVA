package kr.ac.kopo.day10;

public class Member {

    /** 이름 */
    String name;
    /** 나이 */
    int age;
    /** 혈액형 */
    String bloodType;

    /** 디폴트 생성자 */
    Member() {
        this("알수없음");
    }

    /** 이름 초기화 생성자 */
    Member(String name) {
        this(name, -1);
    }

    /** 이름, 나이 초기화 생성자 */
    Member(String name, int age) {
        this(name, age, "알수없음");
    }

    /** 이름, 나이, 혈액형 초기화 생성자 */
    Member(String name, int age, String bloodType) {
        this.name = name;
        this.age = age;
        this.bloodType = bloodType;
    }

    /** Member 클래스 정보 출력 메소드 */
    void info() {
        System.out.println("이름 : " + name + ", 나이 : " + age + ", 혈액형 : " + bloodType);
    }

}
