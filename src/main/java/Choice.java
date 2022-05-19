import JsonParsing.Cards;

import java.util.Scanner;

public class Choice {
    public static void choice(){
        System.out.println(Cards.getDescription());
        System.out.println("What is your choice?");
        Scanner sc = new Scanner(System.in);
        int ask = sc.nextInt();

        if(ask == 1){
            Game.setBudget(Game.budget -= 100);
        }
        if(ask == 2){
            Game.setBudget(Game.budget += 100);
        }else {
            System.out.println("There is no such an option");
        }
    }
}
