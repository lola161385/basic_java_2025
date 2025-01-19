package week_3.w3_9_pokemon;

public class VisionSkill implements Skill {
    private String name;
    private int damage;
    private String description;
    private String UseSkillIsNotBattle;

    public VisionSkill(String name, int damage, String description, String UseSkillIsNotBattle) {
        this.name = name;
        this.damage = damage;
        this.description = description;
        this.UseSkillIsNotBattle = UseSkillIsNotBattle;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean canUseSkillOutside() {
        return true; // 비전 스킬은 전투 외에서 사용 가능
    }

    @Override
    public void use(String context) {
        if (context.equals("outside")) {
            System.out.println(name + " 스킬 사용: " + UseSkillIsNotBattle);
        } else {
            System.out.println(name + " 스킬 사용! Effect: " + description + ", Damage: " + damage);
        }
    }
    public int getDamage() {
        return damage;
    }
}