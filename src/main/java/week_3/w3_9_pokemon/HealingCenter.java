package week_3.w3_9_pokemon;

public class HealingCenter {
    // 치료실 이름
    private String name;

    public HealingCenter(String name) {
        this.name = name;
    }

    // 포켓몬 치료 메서드
    public void healPokemon(Trainer trainer) {
        System.out.println("\n=== " + this.name + " 치료실 ===");
        System.out.println(trainer.getName() + "의 포켓몬을 치료합니다.");

        // 현재 포켓몬 상태 출력
        System.out.println("현재 포켓몬 상태:");
        for (Pokemon pokemon : trainer.getMyPokemon()) {
            int maxHp = pokemon.level * 10; // 최대 HP 계산
            System.out.println("- " + pokemon.name + ": HP " + pokemon.hp + " / " + maxHp);
        }

        // 포켓몬 HP 회복
        for (Pokemon pokemon : trainer.getMyPokemon()) {
            int maxHp = pokemon.level * 10; // 최대 HP 계산
            pokemon.hp = maxHp; // HP를 최대치로 회복
        }

        System.out.println("모든 포켓몬의 HP가 회복되었습니다!");
    }
}