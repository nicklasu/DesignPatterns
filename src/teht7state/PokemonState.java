package teht7state;

public abstract class PokemonState {
    private int level;
    PokemonState(Pokemon pokemon) {
    }

    public abstract void grind();

    public abstract void evolve(Pokemon pokemon);

    public abstract int getLevel();
}
