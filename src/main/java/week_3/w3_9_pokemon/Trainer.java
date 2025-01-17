package week_3.w3_9_pokemon;

import java.util.ArrayList;

public class Trainer {
    String name;
    boolean isGymLeader;
    boolean gender; // true = 남자, false = 여자

    ArrayList<Pokemon> myPokemon;   // 트레이너가 소지하고있는 포켓몬
    ArrayList<Pokemon> myPokemonPc; // 트레이너의 포켓몬이 꽉차면 저장할 PC 창고

    private static final int MAX_POKEMON = 6; // 트레이너가 소지할 수 있는 최대 포켓몬 수

    public Trainer(String name, boolean isGymLeader, boolean gender) {
        this.name = name;
        this.isGymLeader = isGymLeader;
        this.gender = gender;
        this.myPokemon = new ArrayList<>(MAX_POKEMON);
        this.myPokemonPc = new ArrayList<>();
    }

    // 포켓몬 추가 메서드
    public boolean addPokemon(Pokemon pokemon) {
        if (myPokemon.size() < MAX_POKEMON) {
            myPokemon.add(pokemon);
            System.out.println(myPokemon.size() + "번째 포켓몬 추가 성공");
            return true; // 추가 성공
        } else {
            System.out.println(this.name + "은(는) 이미 최대 " + MAX_POKEMON + "마리의 포켓몬을 보유하고 있습니다.");
            System.out.println(pokemon.name + " 을 pc에 저장합니다.");
            myPokemonPc.add(pokemon);
            return false; // 추가 실패
        }
    }

    // 트레이너 pc에 있는 포켓몬 출력
    public String getPcPokemon() {
        int pcnt = 1;
        StringBuilder sb = new StringBuilder();
        sb.append("===" + this.name + " 트레이너의 pc ===");
        if (myPokemonPc.isEmpty()) {
            sb.append("\nPC가 비어있습니다.");
        } else {
            for (Pokemon pokemon : myPokemonPc) {
                sb.append("\n").append(pcnt++).append(". ").append(pokemon.name)
                        .append(", 레벨: ").append(pokemon.level)
                        .append(", HP: ").append(pokemon.hp)
                        .append(", 보유 스킬: ").append(pokemon.getSkillNames());
            }
        }
        return sb.toString();
    }

    // Trainer 정보 출력
    public String toString() {
        int pcnt = 1;
        StringBuilder sb = new StringBuilder();
        sb.append("=== 트레이너 정보 ===")
                .append("\n트레이너 이름: ").append(this.name)
                .append("\n체육관 관장 여부: ").append(this.isGymLeader ? "예" : "아니오")
                .append("\n성별: ").append(this.gender ? "남자" : "여자")
                .append("\n보유 포켓몬: ");
        if (myPokemon.isEmpty()) {
            sb.append("없음");
        } else {
            for (Pokemon pokemon : myPokemon) {
                sb.append("\n- 포켓몬" + pcnt++ + ": ").append(pokemon.name)
                        .append(", 레벨: ").append(pokemon.level)
                        .append(", HP: ").append(pokemon.hp)
                        .append(", 보유 스킬: ").append(pokemon.getSkillNames());
            }
        }
        return sb.toString();
    }

    /*// 전투 외에서 스킬 사용
    public void useSkillOutside(String pokemonName, String skillName) {
        for (Pokemon pokemon : myPokemon) {
            if (pokemon.name.equals(pokemonName)) {
                pokemon.useSkill(skillName, "outside");
                return;
            }
        }
        System.out.println(pokemonName + "을(를) 찾을 수 없습니다.");
    }*/
}