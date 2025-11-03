package com.back;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("== 명언 앱 ==");
        Scanner sc = new Scanner(System.in);
        List<SayList> sayList = new ArrayList<>();
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

                sayList.add(new SayList(number, saying, author));
                System.out.println(number + "번 명언이 등록되었습니다.");
                number++;

            } else if (cmd.equals("목록")){
                System.out.println("번호 / 작가 / 명언");
                System.out.println("--------------------");

                for (int i = sayList.size() - 1; i >= 0; i--) {
                    SayList say = sayList.get(i);
                    System.out.println(say.id + " / " + say.author + " / " + say.saying  );
                }
            } else if (cmd.startsWith("삭제?id=")) {
                String idStr = cmd.substring("삭제?id=".length());
                int id = Integer.parseInt(idStr);

                boolean found = false;
                for (int i = 0; i < sayList.size(); i++) {
                    SayList say = sayList.get(i);
                    if (say.id == id) {
                        sayList.remove(i);
                        System.out.println(id +"번 명언이 삭제되었습니다.");
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println(id + "번 명언은 존재하지 않습니다.");
                }


            }
        }

        sc.close();
    }
}