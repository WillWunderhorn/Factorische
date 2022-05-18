public class GameOver {
    public static boolean alive = true;

    public void die(){
        alive = false;
    }

    public static boolean Over(){
        if (Game.getBudget() <= 0){
            System.out.println("Вы обанкротились...");
            return true;
        }
        if (alive == false){
            System.out.println("Вы погибли...");
            return true;
        }
        if (Game.getRep_civ() <= 0){
            System.out.println("Вас решили заменить в связи с негодованием граждан...");
            return true;
        }
        return false;
    }
}
