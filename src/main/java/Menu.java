import java.util.Scanner;

public class Menu {

    public enum weather{
        SUNNY,
        FOG,
        CLOUDY,
        THUNDERSTORM,
    }
    static Scanner sc = new Scanner(System.in);

    public static void getDayOfWeek(){
        int dayIndex = Game.getDay() - 1;
        if(Game.getDay() % 8 == 0){
            dayIndex = 0;
        }
        if (dayIndex == 0){
            System.out.println("|Понедельник            |");
        }
        if (dayIndex == 1){
            System.out.println("|Вторник                |");
        }
        if (dayIndex == 2){
            System.out.println("|Среда                  |");
        }
        if (dayIndex == 3){
            System.out.println("|Четверг                |");
        }
        if (dayIndex == 4){
            System.out.println("|Пятница                |");
        }
        if (dayIndex == 5){
            System.out.println("|Суббота                |");
        }
        if (dayIndex == 6){
            System.out.println("|Воскресенье            |");
        }
    }


    public static void openMenu(){
        System.out.println();

        System.out.println(
                "|=======================|\n" +
                "|==--   * МЕНЮ: *   --==|\n" +
                "|=======================|\n" +
                "|                       |"
        );
        getDayOfWeek();
        System.out.println(
                "|                       |");
        Menu.openInventory();
            System.out.println("0 - закрыть меню\nt - список задач");
            String menuActions = sc.nextLine();
            switch (menuActions){
                case "0": closeMenu(); break;
                case "t": openTasks(); break;
                default: System.out.println(Game.ANSI_RED + "Такого варианта нет!" + Game.ANSI_RESET);
                openMenu();
            }

    }

    public static void closeMenu(){
        System.out.println("меню закрыто\n");
    }

    public static void openInventory(){
        System.out.println("|   --- Инвентарь ---   |");
        if(Inventory.inventory.size() == 0){
            System.out.println("|    инвентарь пуст(    |");
        }else if(Inventory.inventory.size() != 0){
            Inventory.showInventoryItems();
        }
        System.out.println(
                "|                       |\n" +
                        "|=========-***-=========|\n" );
    }
//======================================================================================================================

    public static void checkTask(){
        if (Tasks.tasks.contains(Tasks.tasksList.TOY) && Tasks.wolfCompleted == false){
            System.out.println("| Найти игрушку ☐       |");
            if((Inventory.inventory.contains(Inventory.items.PLUSHY_WOLF))){
                System.out.println(
                        "|1 - отдать             |\n" +
                        "|=========-***-=========|");
                String askOption = sc.nextLine();

                switch (askOption){
                    case "1": option1(); break;
                    default: System.out.println(Game.ANSI_RED + "Такого варианта нет!" + Game.ANSI_RESET);
                    checkTask();
                }
            }
        }
        else if (Tasks.tasks.contains(Tasks.tasksList.TOY) && Tasks.wolfCompleted == true){
            System.out.println("|Вы нашли волчицу! ☑    |");
        }
    }

    private static void option1() {
        Inventory.inventory.remove(Inventory.items.PLUSHY_WOLF);
        Tasks.wolfCompleted = true;
        System.out.println("|Вы отдали волчицу...   |\n" +
                           "|обновите список задач  |");
        Game.rep_civ += 10;
        Game.rep_wrk += 10;
    }


    public static void openTasks(){
        System.out.println(
                        "|=======================|\n" +
                        "|==--  * ЗАДАЧИ: *  --==|\n" +
                        "|=======================|\n" +
                        "|                       |"
        );
        checkTask();
        System.out.println(
                        "|                       |\n" +
                        "|=========-***-=========|\n");

        System.out.println("t - закрыть список задач");
        String tasksActions = sc.nextLine();
        switch (tasksActions){
            case "t": closeTask(); break;
            default: System.out.println(Game.ANSI_RED + "Такого варианта нет!" + Game.ANSI_RESET);
            openTasks();
        }
    }

    public static void closeTask(){
        System.out.println("список задач закрыт");
        openMenu();
    }

}