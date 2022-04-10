package teht7state;

public class Pokemon {
    private PokemonState pokemonState = new Charmander(this);

    public void nextState(PokemonState pokemonState) {
        this.pokemonState = pokemonState;
    }

    public PokemonState getState() {
        return pokemonState;
    }

    public void battle() {
        this.getState().grind();
        System.out.println(this.pokemonState.toString());
        if (pokemonState.getLevel() == 16 || pokemonState.getLevel() == 36) {
            pokemonState.evolve(this);
        }
    }
}
