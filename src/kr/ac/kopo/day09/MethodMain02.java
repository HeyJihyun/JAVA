package kr.ac.kopo.day09;

public class MethodMain02 {

    public static void main(String[] args) {
        Method m = new Method();
        m.call();
        m.call(3);
        m.call("aaa", 12);
        m.call('a'); // 가까운 크기의 형변환 char < int < double 이기 때문에 int 로 형변환
        m.call(12.34);
    }

}
