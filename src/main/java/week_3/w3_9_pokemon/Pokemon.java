package week_3.w3_9_pokemon;

import java.util.ArrayList;

public class Pokemon {
    // 포켓몬 객체 생성
    // 이름, 타입(여러개 가능), 분류, 보유 기술(4개)
    String name;
    ArrayList<String> Ptype;
    String category;
    ArrayList<Skill> Pskill;
    int level;
    int hp;

    public Pokemon(String name, ArrayList<String> Ptype, String category, ArrayList<Skill> Pskill,  int level, int hp) {
        this.name = name;
        this.Ptype = Ptype;
        this.category = category;
        this.Pskill = Pskill;
        this.level = level;
        this.hp = hp;
    }

    public void useSkill(String skillName) {
        for (Skill skill : Pskill) {
            if (skill.getName().equals(skillName)) {
                skill.use("battle"); // 전투 상황에서 기술 사용
                return;
            }
        }
        System.out.println("스킬 " + skillName + "을(를) 찾을 수 없습니다.");
    }

    // 스킬 이름을 반환하는 메서드
    public ArrayList<String> getSkillNames() {
        ArrayList<String> skillNames = new ArrayList<>();
        for (Skill skill : Pskill) {
            skillNames.add(skill.getName());
        }
        return skillNames;
    }
}
