package week_3.w3_9_pokemon;

import java.util.ArrayList;

public class Trainer {
    String name;
    boolean isGymLeader;
    boolean gender;
    ArrayList<Pokemon> myPokemon;

    public Trainer(String name, boolean isGymLeader, boolean gender){
        this.name = name;
        this.isGymLeader = isGymLeader;
        this.gender = gender;
        this.myPokemon = new ArrayList<>();
    }
}
