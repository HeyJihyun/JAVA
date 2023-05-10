package kr.ac.kopo.day15;

class Super {
    final int NO = 100;

    Super() {
    }

    Super(int no) {
//		this.NO = no;
    }

    void print() {
        System.out.println("super...");
    }
}

class Sub extends Super {
    @Override
    void print() {
        System.out.println("sub...");
    }
}

public class FinalMain {

    public static void main(String[] args) {

        Super s = new Super();
        System.out.println(s.NO);

    }

}
