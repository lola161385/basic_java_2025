package week_3.w3_9_pokemon;

public class VisionSkill implements Skill {
    private String name;
    private int damage;
    private String SKillType;
    private String description;

    public VisionSkill(String name, int damage, String description) {
        this.name = name;
        this.damage = damage;
        this.description = description;
        SKillType = "Vision";
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean canUseSkillOutside() {
        return true;
    }

    @Override
    public void use(String context) {
        if(context.equals("Vision")) {
            System.out.println(name + " 스킬 사용" + description);
        } else {
            System.out.println(name + "스킬은 전투중이 아닐때는 사용 불가합니다.");
        }
    }
}
