package week_1.w1_4_controllogics;

public class LoopSample {
    public static void main(String[] args) {
        int n = 10;


        // ######### while ########### //
        //탈출 조건 달성 가능 여부와
        //탈출 조건 달성의 지연 요인 등을 고려해서 사용
        while (n > 0) {
            n -=1;
            System.out.println(n);
        }

        // 선실행 후판단을 구현하는 방식으로
        // 탈출 조건 달성 뿐 아니라
        // 최소한의 코드 실행을 제어하는 구문
        do{
            n -= 1;
            System.out.println(n);
        }while(n > 0);

    }
}
