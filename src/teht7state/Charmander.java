package teht7state;

public class Charmander extends PokemonState {
    private int level;

    Charmander(Pokemon pokemon) {
        super(pokemon);
        level = pokemon.getState().getLevel();
    }

    @Override
    public void evolve(Pokemon pokemon) {
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public void grind() {
        System.out.println("used INFERNO!");
        if (level < 100) {
            level++;
        }
    }

    @Override
    public String toString() {
        return "Charmander, level " + level;
    }
}
