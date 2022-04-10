package teht7state;

public class Charmeleon extends PokemonState {
    private int level;

    Charmeleon(Pokemon pokemon) {
        super(pokemon);
        level = pokemon.getState().getLevel();
    }

    @Override
    public void evolve(Pokemon pokemon) {
        pokemon.nextState(new Charizard(pokemon));
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public void grind() {
        System.out.println("used FIRE FANG!");
        level++;
    }

    @Override
    public String toString() {
        return "Charmeleon, level " + level;
    }
}
