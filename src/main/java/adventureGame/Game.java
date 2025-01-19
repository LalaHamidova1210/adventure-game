package adventureGame;

import com.sun.security.jgss.GSSUtil;

public class Game {

    public  void selectCharacter(){

        System.out.println("---------------------------------------");
        System.out.println(new Samurai());
        System.out.println(new Knight());
        System.out.println(new Archer());
        System.out.println("---------------------------------------");
    }
}
