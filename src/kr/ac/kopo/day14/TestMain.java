package kr.ac.kopo.day14;

class One {
    private int a;
    protected int b;
    public int c;

    public void print() {
        System.out.println("a : " + this.a);
        System.out.println("b : " + this.b);
        System.out.println("c : " + this.c);
    }
}

class Two extends One {
    private int a;
    protected int b2;
    public int c2;

    public void print() {
        this.c = 10;
        super.c = 20;
    }
}

public class TestMain {
    public static void main(String[] args) {

    }

}
