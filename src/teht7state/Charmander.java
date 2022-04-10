package teht7state;

public class Charmander extends PokemonState {
    private int level = 1;

    Charmander(Pokemon pokemon) {
        super(pokemon);
    }

    @Override
    public void evolve(Pokemon pokemon) {
        pokemon.nextState(new Charmeleon(pokemon));
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public void grind() {
        System.out.println("used EMBER!");
        level++;
    }

    @Override
    public String toString() {
        return "Charizard, level " + level;
    }
}
