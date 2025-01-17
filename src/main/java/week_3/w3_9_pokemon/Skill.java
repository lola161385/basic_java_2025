package week_3.w3_9_pokemon;

public interface Skill {
    String getName();
    boolean canUseSkillOutside();
    void use(String context);
}
