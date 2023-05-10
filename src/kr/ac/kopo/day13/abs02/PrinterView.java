package kr.ac.kopo.day13.abs02;

import java.util.Scanner;

public class PrinterView {

    private Scanner sc = new Scanner(System.in);

    public void work() {

        Printer p = null;
        System.out.println("출력할 프린터를 선택하세요(1.LG 2.HP) : ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
        case 1:
            p = new LGPrinter();
            break;
        case 2:
            p = new HPPrinter();
            break;
        default:
            System.out.println("잘못입력하셨습니다.");
        }
        p.print();

    }

}
