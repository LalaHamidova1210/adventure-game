package adventureGame;

public class Knight extends Player {
    public Knight() {
        super(2, "Knight", 6, 23, 25);
    }

    @Override
    public String toString() {
        return "Knight: "+super.toString();
    }
}
