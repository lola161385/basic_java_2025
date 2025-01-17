package week_3.w3_9_pokemon;

import java.util.ArrayList;

public class Pokemon {
    String name;
    ArrayList<String> Ptype;
    String category;
    ArrayList<Skill> Pskill;
    int level;
    int hp;

    public Pokemon(String name, ArrayList<String> Ptype, String category, ArrayList<Skill> Pskill, int level, int hp) {
        this.name = name;
        this.Ptype = Ptype;
        this.category = category;
        this.Pskill = Pskill;
        this.level = level;
        this.hp = hp;
    }

    // 스킬 사용 메서드
    public void useSkill(String skillName, String context) {
        for (Skill skill : Pskill) {
            if (skill.getName().equals(skillName)) {
                if (context.equals("outside") && !skill.canUseSkillOutside()) {
                    System.out.println(skillName + " 스킬은 전투 외에서는 사용할 수 없습니다.");
                } else {
                    skill.use(context);
                }
                return;
            }
        }
        System.out.println(this.name + "은(는) 스킬 " + skillName + "을(를) 배우지 않았습니다.");
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