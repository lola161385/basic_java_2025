package week_3.w3_9_pokemon;

public class BattleSkill implements Skill {
    private String name;
    private int damage;
    private String description;

    public BattleSkill(String name, int damage, String description) {
        this.name = name;
        this.damage = damage;
        this.description = description;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean canUseSkillOutside() {
        return false; // 배틀 스킬은 전투 외에서 사용 불가
    }

    @Override
    public void use(String context) {
        if (context.equals("battle")) {
            System.out.println(name + " 스킬 사용! Effect: " + description + ", Damage: " + damage);
        } else {
            System.out.println(name + " 스킬은 전투 외 상황에서는 사용할 수 없습니다.");
        }
    }
}