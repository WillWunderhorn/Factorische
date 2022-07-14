import java.util.ArrayList;

public class Tasks {

    boolean wring = false;
    boolean walls = false;
    public static boolean wolfCompleted = false;

    public enum tasksList{
        RING,
        WALLS,
        TOY
    }

    static ArrayList<tasksList> tasks = new ArrayList<>();

    public static void plushyToy(){
        tasks.add(Tasks.tasksList.TOY);
        System.out.println(Game.GREEN_BRIGHT + "Добавлена новая задача!" + Game.ANSI_RESET);
    }

}
