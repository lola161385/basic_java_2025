package week_3.w3_9_pokemon;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Pokedex {
    private int number;                  // 도감번호
    private String name;                 // 포켓몬 이름
    private ArrayList<String> types;     // 타입 (여러 개 가능)
    private String category;             // 분류 (전설, 희귀, 일반, 환상 등)
    private String description;          // 포켓몬 설명
    private int evolvLevel;              // 진화 레벨
    private String nextEvolv;            // 다음 진화

    public Pokedex(int number, String name, ArrayList<String> types, String category, String description, int evolvLevel, String nextEvolv) {
        this.number = number;
        this.name = name;
        this.types = types;
        this.category = category;
        this.description = description;
        this.evolvLevel = evolvLevel;
        this.nextEvolv = nextEvolv;
    }

    // 포켓몬 정보 출력
    public void displayPokedexEntry() {
        System.out.println("도감번호: " + number);
        System.out.println("포켓몬 이름: " + name);
        System.out.println("타입: " + String.join(", ", types));
        System.out.println("분류: " + category);
        System.out.println("설명: " + description);
        if (!nextEvolv.equals("최종 진화 단계")) {
            System.out.println(evolvLevel + "레벨 달성 시 진화: " + nextEvolv);
        } else {
            System.out.println("최종 진화 단계입니다.");
        }
        System.out.println("--------------------");
    }

    public static class PokedexData {
        private static Map<Integer, Pokedex> pokedexMap = new TreeMap<>(); // 도감번호 순서대로 정렬하기 위해 TreeMap 사용

        static {
            // 포켓몬 데이터를 Map에 추가
            addPokemon(1, "피츄", createTypes("전기"), "일반", "작은 전기 포켓몬으로, 귀여운 외모를 자랑합니다.", 40, "피카츄");
            addPokemon(2, "피카츄", createTypes("전기"), "일반", "전기를 사용하는 피츄의 진화 형태.", 80, "라이츄");
            addPokemon(3, "라이츄", createTypes("전기"), "일반", "피카츄의 최종 진화 형태로, 전기 공격이 강력합니다.", 100, "최종 진화 단계");
            addPokemon(4, "파이리", createTypes("불꽃"), "일반", "작은 불꽃 포켓몬", 40, "리자드");
            addPokemon(5, "리자드", createTypes("불꽃"), "일반", "불꽃을 사용하는 파이리의 진화 형태", 80, "리자몽");
            addPokemon(6, "리자몽", createTypes("불꽃, 비행"), "일반", "리자드의 최종 진화 형태로, 용이되어 날수있으며 강력합니다.", 100, "최종 진화 단계");
            addPokemon(7, "펄기아", createTypes("물, 드래곤"), "전설", "평행으로 늘어선 공간의 틈새에 산다고 전해진다. 신화에 등장하는 포켓몬이다", 100, "최종 진화 단계");
            addPokemon(8, "아르세우스", createTypes("멀티"), "환상", "지니고 있는 플레이트나 Z크리스탈 타입에 따라 자신의 타입이 바뀐다. 이 특성은 무시할 수 없다.", 100, "최종 진화 단계");
        }

        // 포켓몬 추가 메서드
        private static void addPokemon(int number, String name, ArrayList<String> types, String category, String description, int evolvLevel, String nextEvolv) {
            Pokedex pokedex = new Pokedex(number, name, types, category, description, evolvLevel, nextEvolv);
            pokedexMap.put(number, pokedex); // 도감번호를 키로 사용
        }

        // 타입 리스트 생성 유틸리티 메서드
        private static ArrayList<String> createTypes(String... types) {
            ArrayList<String> typeList = new ArrayList<>();
            for (String type : types) {
                typeList.add(type);
            }
            return typeList;
        }

        // 포켓몬 생성시 타입 반환
        public static ArrayList<String> getTypes(String name) {
            for (Pokedex pokedex : pokedexMap.values()) {
                if (pokedex.name.equalsIgnoreCase(name)) {
                    // 포켓몬을 찾은 경우, 타입을 반환
                    return pokedex.types;
                }
            }
            // 포켓몬을 찾지 못한 경우
            System.out.println(name + "은(는) 도감에 없습니다.");
            return null; // 또는 빈 ArrayList를 반환할 수도 있습니다.
        }

        public static String getCategory(String name) {
            for (Pokedex pokedex : pokedexMap.values()) {
                if (pokedex.name.equalsIgnoreCase(name)) {
                    return pokedex.category;
                }
            }
            // 포켓몬을 찾지 못한 경우
            System.out.println(name + "은(는) 도감에 없습니다.");
            return null; // 또는 빈 ArrayList를 반환할 수도 있습니다.
        }

        // 도감 출력
        public static void displayAllPokemons() {
            System.out.println("=== 포켓몬 도감 ===");
            for (Pokedex pokedex : pokedexMap.values()) {
                pokedex.displayPokedexEntry();
            }
        }

        // 포켓몬 검색 (도감 정보 출력 없이 데이터만 반환)
        public static Pokedex getPokemon(String name) {
            for (Pokedex pokedex : pokedexMap.values()) {
                if (pokedex.name.equalsIgnoreCase(name)) {
                    return pokedex; // 도감 정보 출력 없이 포켓몬 데이터만 반환
                }
            }
            System.out.println(name + "은(는) 도감에 없습니다."); // 포켓몬을 찾지 못한 경우
            return null;
        }

        // 도감 정보를 출력하는 별도의 메서드
        public static void displayPokemon(String name) {
            Pokedex pokedex = getPokemon(name);
            if (pokedex != null) {
                pokedex.displayPokedexEntry();
            }
        }
    }

    // Getter 메서드 추가
    public int getEvolvLevel() {
        return evolvLevel;
    }

    public String getNextEvolv() {
        return nextEvolv;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getTypes() {
        return types;
    }

    public String getCategory() {
        return category;
    }
}