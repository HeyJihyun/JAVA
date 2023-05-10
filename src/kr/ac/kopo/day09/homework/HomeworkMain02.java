package kr.ac.kopo.day09.homework;

import java.util.Scanner;

public class HomeworkMain02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student[] stuArr = new Student[5];

        for (int i = 0; i < stuArr.length; i++) {
            stuArr[i] = new Student();
            System.out.print((i + 1) + "\'s 성적 : ");
            stuArr[i].score = sc.nextInt();
        }

        System.out.println(" < PRINT > ");
        System.out.println("번호\t 성적\t 학점\t");
        int total = 0;
        int cntError = 0;
        for (int i = 0; i < stuArr.length; i++) {
            if (stuArr[i].score <= 100) {
                stuArr[i].grade = stuArr[i].score >= 90 ? 'A'
                        : stuArr[i].score >= 80 ? 'B' : stuArr[i].score >= 70 ? 'C' : stuArr[i].score >= 60 ? 'D' : 'F';
                System.out.printf("%d\t %d\t %c\n", i + 1, stuArr[i].score, stuArr[i].grade);
                total += stuArr[i].score;
            } else {
                System.out.printf("%d\t %s", i + 1, "ERROR!!\n");
                cntError++;
            }
        }
        System.out.println();
        System.out.println(stuArr.length + "명의 입력중 [" + cntError + "]회 에러발생");
        System.out.printf("총점 : %5d점\n", total);
        System.out.printf("평균 : %.2f점", (double) total / stuArr.length);

        sc.close();

    }

}
