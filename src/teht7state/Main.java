package teht7state;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Pokemon pokemon = new Pokemon();
        int i = 0;
        while (i < 120) {
            pokemon.battle();
            Thread.sleep(100);
            i++;
        }
    }
}
