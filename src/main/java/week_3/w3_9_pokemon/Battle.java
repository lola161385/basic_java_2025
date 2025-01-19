package week_3.w3_9_pokemon;

import java.util.Scanner;

public class Battle {
    private Trainer trainer1;
    private Trainer trainer2;

    public Battle(Trainer trainer1, Trainer trainer2) {
        this.trainer1 = trainer1;
        this.trainer2 = trainer2;
    }

    public void start() {
        System.out.println(trainer1.getName() + "이(가) " + trainer2.getName() + "에게 전투를 신청했습니다!");
        System.out.println("전투 시작!");

        Scanner scanner = new Scanner(System.in);
        int myIndex = 0; // 현재 사용 중인 포켓몬의 인덱스
        int oppIndex = 0; // 상대방의 현재 포켓몬 인덱스

        while (myIndex < trainer1.getMyPokemon().size() && oppIndex < trainer2.getMyPokemon().size()) {
            Pokemon myPokemon = trainer1.getMyPokemon().get(myIndex);
            Pokemon oppPokemon = trainer2.getMyPokemon().get(oppIndex);

            System.out.println("\n" + trainer1.getName() + "의 " + myPokemon.name + " vs " + trainer2.getName() + "의 " + oppPokemon.name);

            // 내 포켓몬의 턴
            System.out.println("\n" + trainer1.getName() + "의 차례!");
            System.out.println(myPokemon.name + "의 스킬: " + myPokemon.getSkillNames());
            System.out.print("사용할 스킬을 선택하세요: ");
            String mySkill = scanner.nextLine(); // 사용자 입력 대기
            myPokemon.useSkill(mySkill, "battle");

            // 상대 포켓몬의 HP 감소
            for (Skill skill : myPokemon.Pskill) {
                if (skill.getName().equals(mySkill)) {
                    if (skill instanceof BattleSkill) {
                        oppPokemon.hp -= ((BattleSkill) skill).getDamage();
                    } else if (skill instanceof VisionSkill) {
                        oppPokemon.hp -= ((VisionSkill) skill).getDamage();
                    }
                    break;
                }
            }

            System.out.println(oppPokemon.name + "의 남은 HP: " + oppPokemon.hp);

            // 상대 포켓몬이 쓰러졌는지 확인
            if (oppPokemon.hp <= 0) {
                System.out.println(oppPokemon.name + "이(가) 쓰러졌습니다!");
                oppIndex++;
                if (oppIndex >= trainer2.getMyPokemon().size()) {
                    System.out.println(trainer2.getName() + "의 모든 포켓몬이 쓰러졌습니다!");
                    System.out.println(trainer1.getName() + "의 승리!");
                    trainer1.winBattle(); // 승리한 트레이너의 포켓몬 레벨 업
                    return;
                }
                oppPokemon = trainer2.getMyPokemon().get(oppIndex);
                System.out.println(trainer2.getName() + "은(는) 다음 포켓몬으로 " + oppPokemon.name + "을(를) 꺼냈습니다!");
            }

            // 상대 포켓몬의 턴
            System.out.println("\n" + trainer2.getName() + "의 차례!");
            System.out.println(oppPokemon.name + "의 스킬: " + oppPokemon.getSkillNames());
            System.out.print("사용할 스킬을 선택하세요: ");
            String oppSkill = scanner.nextLine(); // 사용자 입력 대기
            oppPokemon.useSkill(oppSkill, "battle");

            // 내 포켓몬의 HP 감소
            for (Skill skill : oppPokemon.Pskill) {
                if (skill.getName().equals(oppSkill)) {
                    if (skill instanceof BattleSkill) {
                        myPokemon.hp -= ((BattleSkill) skill).getDamage();
                    } else if (skill instanceof VisionSkill) {
                        myPokemon.hp -= ((VisionSkill) skill).getDamage();
                    }
                    break;
                }
            }

            System.out.println(myPokemon.name + "의 남은 HP: " + myPokemon.hp);

            // 내 포켓몬이 쓰러졌는지 확인
            if (myPokemon.hp <= 0) {
                System.out.println(myPokemon.name + "이(가) 쓰러졌습니다!");
                myIndex++;
                if (myIndex >= trainer1.getMyPokemon().size()) {
                    System.out.println(trainer1.toString());
                    System.out.println(trainer1.getName() + "의 모든 포켓몬이 쓰러졌습니다!");
                    System.out.println(trainer2.getName() + "의 승리!");
                    trainer2.winBattle(); // 승리한 트레이너의 포켓몬 레벨 업
                    return;
                }
                myPokemon = trainer1.getMyPokemon().get(myIndex);
                System.out.println(trainer1.getName() + "은(는) 다음 포켓몬으로 " + myPokemon.name + "을(를) 꺼냈습니다!");
            }
        }
    }
}