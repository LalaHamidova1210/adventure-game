package adventureGame;

import java.util.Scanner;

public class Game {

    public  void selectCharacter(){

        Scanner sc =new Scanner(System.in);

        System.out.println("---------------------------------------");
        System.out.println(new Samurai());
        System.out.println(new Knight());
        System.out.println(new Archer());
        System.out.println("---------------------------------------");

        System.out.print("Select your character:");
        if(sc.nextInt()==1){

        }
    }
}
