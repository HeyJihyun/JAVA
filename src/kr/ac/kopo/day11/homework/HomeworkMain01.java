package kr.ac.kopo.day11.homework;

public class HomeworkMain01 {

    public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
        ScannerUtil scan = new ScannerUtil();

//		System.out.println("문자를 입력 : ");
//		char c = sc.nextLine().charAt(0);
        char c = scan.nextChar("문자를 입력 : ");

        StringUtil util = new StringUtil();
        // 대문자 여부 판단
        boolean bool = util.isUpperChar(c);

        if (bool)
            System.out.println(c + " : 대문자가 맞습니다.");
        else
            System.out.println(c + " : 대문자가 아닙니다.");

        int num1 = scan.nextInt("첫번째 정수를 입력 : ");
        int num2 = scan.nextInt("두번째 정수를 입력 : ");
        int maxNum = util.max(num1, num2);
        System.out.println(num1 + ", " + num2 + "중 큰수 : " + maxNum);

    }

}
