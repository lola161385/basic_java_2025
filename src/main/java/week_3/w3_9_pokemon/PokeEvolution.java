package week_3.w3_9_pokemon;
public class PokeEvolution {
    // 포켓몬 진화 조건 확인 및 처리
    public static void checkAndEvolve(Pokemon pokemon) {
        Pokedex pokedexData = Pokedex.PokedexData.getPokemon(pokemon.name);
        if (pokedexData != null && pokemon.level >= pokedexData.getEvolvLevel() && !pokedexData.getNextEvolv().equals("최종 진화 단계")) {
            evolve(pokemon, pokedexData.getNextEvolv());
        }
    }

    // 포켓몬 진화 처리
    private static void evolve(Pokemon pokemon, String nextEvolv) {
        Pokedex nextPokedexData = Pokedex.PokedexData.getPokemon(nextEvolv);
        if (nextPokedexData != null) {
            System.out.println("...... 오잉!? " + pokemon.name + "의 상태가.......!\n 축하합니다! " + nextEvolv + "(으)로 진화했습니다!");

            // 포켓몬 정보 업데이트
            pokemon.name = nextPokedexData.getName();
            pokemon.Ptype = nextPokedexData.getTypes();
            pokemon.category = nextPokedexData.getCategory();
        }
    }
}