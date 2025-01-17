package week_3.w3_9_pokemon;

import java.util.ArrayList;

import static week_3.w3_9_pokemon.Pokedex.PokedexData.getPokemon;

public class Main {
    public static void main(String[] args) {
        // 1. 트레이너 생성
        Trainer trainer1 = new Trainer("이슬", false, true);
        Trainer trainer2 = new Trainer("지우", true, false);

        // 2. 스킬 생성
        Skill thunderbolt = new BattleSkill("백만볼트", 90, "백만볼트의 전류를 방출");
        Skill quickAttack = new BattleSkill("전광석화", 80, "빛의 속도로 적을 가격");
        Skill bodyAttack = new BattleSkill("몸통박치기", 40, "몸통으로 박치기");
        Skill firecar = new BattleSkill("화염자동차", 60, "화염자동차");
        Skill dragonBreath = new BattleSkill("용의숨결", 100, "용의 숨결을 내뿜는다");
        Skill dandan = new BattleSkill("단단해지기", 0, "단단해진다");

        Skill surf = new VisionSkill("파도타기", 50, "파도를 타고 공격","등에 업혔다 바다를 건널 수 있다.");
        Skill stoneBrake = new VisionSkill("바위깨기", 50, "바위를 깰정도의 공격", "가로막고 있는 바위를 부쉈다.");
        Skill fly = new VisionSkill("공중날기", 50, "공중으러 나라올라 공격","등에 탑승했다");


        // 3. 포켓몬 생성
        //TODO: 문제점 - 스킬배열을 만들고 포켓몬 객체에 스킬을 넣음. 포켓몬이 생성되고 스킬을 넣게 하고 싶음
        ArrayList<Skill> pikachuSkills = new ArrayList<>();
        pikachuSkills.add(thunderbolt);
        pikachuSkills.add(quickAttack);
        pikachuSkills.add(fly);
        pikachuSkills.add(surf);

        ArrayList<Skill> lizardSkills = new ArrayList<>();
        lizardSkills.add(dragonBreath);
        lizardSkills.add(fly);

        Pokemon pikachu1 = new Pokemon("피카츄", Pokedex.PokedexData.getTypes("피카츄"), Pokedex.PokedexData.getCategory("피카츄"), pikachuSkills, 45, 450);
        Pokemon lizard1 = new Pokemon("리자드", Pokedex.PokedexData.getTypes("리자드"), Pokedex.PokedexData.getCategory("리자드"), lizardSkills, 41, 410);


        // 4. 트레이너가 포켓몬 소유
        trainer1.addPokemon(pikachu1); // Trainer 클래스의 addPokemon 메서드 사용
        trainer1.addPokemon(lizard1);  // Trainer 클래스의 addPokemon 메서드 사용
        trainer1.addPokemon(pikachu1); // Trainer 클래스의 addPokemon 메서드 사용
        trainer1.addPokemon(pikachu1); // Trainer 클래스의 addPokemon 메서드 사용
        trainer1.addPokemon(pikachu1); // Trainer 클래스의 addPokemon 메서드 사용
        trainer1.addPokemon(pikachu1); // Trainer 클래스의 addPokemon 메서드 사용
        trainer1.addPokemon(pikachu1); // Trainer 클래스의 addPokemon 메서드 사용

        // 5. 시뮬레이션 시작
        /*System.out.println("=== 트레이너 정보 ===");
        System.out.println("트레이너 이름: " + trainer1.name);
        System.out.println("체육관 리더 여부: " + (trainer1.isGymLeader ? "Yes" : "No"));
        System.out.println("=== "+ trainer1.name +" 소유 포켓몬 ===");
        for (Pokemon pokemon : trainer1.myPokemon) {
            System.out.println("- 포켓몬: " + pokemon.name + ", 레벨: " + pokemon.level + ", HP: " + pokemon.hp);
            System.out.println("  보유 스킬: " + pokemon.getSkillNames()); // 스킬 이름 출력
        }*/
        System.out.println(trainer1.toString());
        System.out.println(trainer2.toString());

        System.out.println(trainer1.getPcPokemon());
        System.out.println(trainer2.getPcPokemon());
        // 6. 포켓몬이 기술 사용
        System.out.println("\n=== 전투 상황 ===");
        pikachu1.useSkill("파도타기","battle"); // 피카츄 기술 사용
        pikachu1.useSkill("백만볼트","battle");
        pikachu1.useSkill("화염자동차","battle");

        System.out.println("\n=== 탐험 상황 ===");
        pikachu1.useSkill("파도타기","outside"); // 피카츄 기술 사용 (탐험 중)
        pikachu1.useSkill("백만볼트","outside"); // 피카츄 기술 사용 (탐험 중)
        pikachu1.useSkill("화염자동차","outside");

        // 도감 출력
        Pokedex.PokedexData.displayAllPokemons();

        // 특정 포켓몬 검색
        System.out.println("\n=== 특정 포켓몬 검색 ===");
        String searchName = "Mew";
        getPokemon(searchName);
        System.out.println("\n=== 특정 포켓몬 검색2 ===");
        String searchName2 = "아르세우스";
        getPokemon(searchName2);
        
    }
}
