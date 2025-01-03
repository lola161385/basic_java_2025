package week_1.w1_4_controllogics;

import java.util.Scanner;

public class ConditionSample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a command: ");
        String consoleInput = scan.nextLine();


        // #################if################# //
        // 조건문과 조건식
        // 조건문은 동작을 나타내는 코드 -> 리턴벨류가 없음
        // 조건식은 결과적으로 값을 도출하는 코드 -> 리턴벨류로 수렴함
        // Return Value가 있는 경우 변수에 할당 가능해야 함

        if (consoleInput.equals("true")) {
            System.out.println("This is true");
        } else if (consoleInput.equals("middle")) {
            System.out.println("This is middle");
        }else {
            System.out.println("This is else");
        }


        // ###############switch################ //
        // case별 break 사용 유무 판단 필요
        int commandInt = Integer.parseInt(consoleInput);
        switch (commandInt) {
            case 10:
                System.out.println("Low Score");
                break;

            case 50:
                System.out.println("Middle Score");
                break;

            case 90:
                System.out.println("High Score");
                break;

            default:
                System.out.println("Score: " + commandInt);
                break;
        }
    }
}
