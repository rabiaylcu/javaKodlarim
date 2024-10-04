// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Gamer gamer1 = new Gamer("gamer1");
        Gamer gamer2 = new Gamer("gamer2");

        Arena arena = new Arena();
        arena.addGamers(gamer1,gamer2);
        arena.StartGame();

    }
}