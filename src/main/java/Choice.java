import java.util.Scanner;

public class Choice {
    public static void choice(){
        System.out.println(" 1 or 2 ?");
        Scanner sc = new Scanner(System.in);
        int ask = sc.nextInt();

        if(ask == 1){
            Game.setBudget(Game.budget -= 100);
        }else {
            Game.setBudget(Game.budget += 100);
        }
    }
}
