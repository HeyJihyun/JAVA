package kr.ac.kopo.day12;

import kr.ac.kopo.day11.homework.ScannerUtil;

public class IceCreamMarket {

    void open() {

        ScannerUtil scan = new ScannerUtil();

        int cnt = scan.nextInt("아이스크림 몇 개 입력할래 ? =>");
        IceCream[] iceArr = new IceCream[cnt];

        for (int i = 0; i < iceArr.length; i++) {
            System.out.printf("*** %d번째 아이스크림 구매정보 입력 ***\n", i + 1);
            String name = scan.nextStr("아이스크림 명 : ");
            int price = scan.nextInt("아이스크림 가격 : ");

            iceArr[i] = new IceCream(name, price);
        }

        System.out.printf("< 총 %d개 아이스크림 구매정보 출력 >\n", cnt);
        System.out.println("----------------------------------");
        System.out.println("번호 \t  아이스크림명 \t 아이스크림 가격 ");
        System.out.println("----------------------------------");
        for (int i = 0; i < iceArr.length; i++) {
            System.out.println((i + 1) + "\t" + iceArr[i].getName() + "\t\t" + iceArr[i].getPrice());
        }
        System.out.println("----------------------------------");

        IceCream.totalInfo();

    }

}
