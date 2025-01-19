package adventureGame;

public class Archer extends Player {

    public  Archer(){
        super(2,"Archer",7,25,25);
    }

    @Override
    public String toString() {
        return "Archer: "+super.toString();
    }
}

