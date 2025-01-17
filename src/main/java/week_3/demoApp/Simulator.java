package week_3.demoApp;

import java.util.ArrayList;
import java.util.List;

public class Simulator {
    public static void main(String[] args) {
        // 국가 및 시민 등록
        List<Nation> nations = new ArrayList<>();
        List<Citizen> citizens = new ArrayList<>();

        // 국가 및 시민 생성
        Nation korea = new RepublicNation("South Korea", false, 10.0);
        Nation russia = new NotRepublicNation("Russia", "dictatorship", true, 1.0);

        citizens.add(new Citizen("Kim", "South Korea", true, false));
        citizens.add(new Citizen("Lee", "South Korea", true, true));
        citizens.add(new Citizen("BBOTIN", "Russia", false, true));
        citizens.add(new Citizen("Vladimire", "Russia", false, false));

        nations.add(korea);
        nations.add(russia);

        // 시뮬레이터 실행
        runSimulation(nations, citizens);
    }

    private static void runSimulation(List<Nation> nations, List<Citizen> citizens) {
        System.out.println("=== 시뮬레이터 ===");

        // 국가 및 시민 목록 출력
        System.out.println("\n등록된 국가:");
        nations.forEach(nation -> System.out.println(nation.toString()));

        System.out.println("\n등록된 시민:");
        citizens.forEach(citizen -> System.out.println(citizen.toString()));

        // 여행
        Citizen citizen = citizens.get(0);
        Nation nation = nations.get(0);
        citizen.travel(nation);

        // 이민
        citizen.emigrate(nation);
    }
}