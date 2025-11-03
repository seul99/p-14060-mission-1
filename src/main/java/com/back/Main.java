package com.back;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("== 명언 앱 ==");
        Scanner sc = new Scanner(System.in);
        int number = 1;

        while(true){
            System.out.print("명령) ");

            String cmd = sc.nextLine();

            if (cmd.equals("종료")){
                System.out.println("명언 앱을 종료합니다.");
                break;
            } else if (cmd.equals("등록")){
                System.out.print("명언 : ");
                String saying = sc.nextLine();

                System.out.print("작가 : ");
                String author = sc.nextLine();

                System.out.println(number + "번 명언이 등록되었습니다.");
                number++;

            }
        }

        sc.close();
    }
}