import java.util.ArrayList;

public class Tasks {

    boolean walls = false;
    public static boolean wolfCompleted = false;
    public static boolean ringCompleted = false;

    public enum tasksList{
        RING,
        WALLS,
        TOY,
        POCKET_MIRROR
    }

    static ArrayList<tasksList> tasks = new ArrayList<>();

    public static void plushyToy(){
        Cards.Card_8 card_8 = new Cards.Card_8();
        Cards.deck.add(card_8);
        tasks.add(Tasks.tasksList.TOY);
        System.out.println(Game.GREEN_BRIGHT + "Добавлена новая задача!" + Game.ANSI_RESET);
    }

    public static void silverRing(){
        tasks.add(tasksList.RING);
        System.out.println(Game.GREEN_BRIGHT + "Добавлена новая задача!" + Game.ANSI_RESET);
    }

}
