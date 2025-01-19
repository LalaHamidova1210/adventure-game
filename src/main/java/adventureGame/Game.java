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

        Player[] character ={new Samurai(),new Knight(),new Archer()};

        System.out.print("Select your character:");
        int selectedId=sc.nextInt();
        Player selectedCharacter;

        switch (selectedId){

            case 1:
                selectedCharacter=new Samurai();
                break;
            case 2:
                selectedCharacter=new Knight();
            case 3:
                selectedCharacter=new Archer();

            default:
                System.out.println("Wrong id!");
        }
    }
}
