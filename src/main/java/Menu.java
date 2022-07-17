import Characters.Characters;

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
            System.out.println("\033[0;1m" + "|Понедельник            |" + "\033[0;0m");
        }
        if (dayIndex == 1){
            System.out.println("\033[0;1m" + "|Вторник                |" + "\033[0;0m");
        }
        if (dayIndex == 2){
            System.out.println("\033[0;1m" + "|Среда                  |" + "\033[0;0m");
        }
        if (dayIndex == 3){
            System.out.println("\033[0;1m" + "|Четверг                |" + "\033[0;0m");
        }
        if (dayIndex == 4){
            System.out.println("\033[0;1m" + "|Пятница                |" + "\033[0;0m");
        }
        if (dayIndex == 5){
            System.out.println("\033[0;1m" + "|Суббота                |" + "\033[0;0m");
        }
        if (dayIndex == 6){
            System.out.println("\033[0;1m" + "|Воскресенье            |" + "\033[0;0m");
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
        Menu.openInventory();
            System.out.println("0 - закрыть меню\nt - список задач\nc - меню крафта");
            String menuActions = sc.nextLine();
            switch (menuActions){
                case "0": closeMenu(); break;
                case "t": openTasks(); break;
                case "c": openCraft(); break;
                default: System.out.println(Game.ANSI_RED + "Такого варианта нет!" + Game.ANSI_RESET);
                openMenu();
            }

    }

    public static void closeMenu(){
        System.out.println("меню закрыто\n");
    }

    public static void openInventory(){
        System.out.println(
                        "|* ---| Инвентарь |--- *|\n" +
                        "|                       |\n" +
                        "|-----------------------|");
        if(Inventory.inventory.size() == 0){
            System.out.println(
                            "|                       |\n" +
                            "|    инвентарь пуст(    |");
        }else if(Inventory.inventory.size() != 0){
            Inventory.showInventoryItems();
        }
        System.out.println(
                        "|                       |\n" +
                        "|=========-***-=========|\n" );
    }
//                                                   TASKS
//======================================================================================================================

    public static void checkTask(){
        boolean noTasks = true;
        if (Tasks.tasks.size() == 0){
            System.out.println(
                            "| еще нет задач         |");
        }
        if (Tasks.tasks.contains(Tasks.tasksList.TOY) && Tasks.wolfCompleted == false){
            System.out.println(
                            "| Найти игрушку ☐       |");
            noTasks = false;
            if((Inventory.inventory.contains(Inventory.items.PLUSHY_WOLF))){
                System.out.println(
                                "|1 - отдать             |\n" +
                                "|                       |\n" +
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
            System.out.println(
                            "|Вы нашли волчицу! ☑    |");
        }
    }

    private static void option1() {
        Inventory.inventory.remove(Inventory.items.PLUSHY_WOLF);
        Tasks.wolfCompleted = true;
        System.out.println(
                        "Вы отдали игрушку законной владелице!\n");
        Characters.Will.toyReaction();
        Characters.Millie.toyReaction();
        System.out.println();

        openTasks();
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
            default: System.out.println(Game.ANSI_RED + "Такого варианта нет! Можно только закрыть список!" + Game.ANSI_RESET);
            openTasks();
        }
    }

    public static void closeTask(){
        System.out.println(
                        "список задач закрыт");
        openMenu();
    }


//                                                CRAFT
//======================================================================================================================
    public static void openCraft(){
        System.out.println(
                        "|=======================|\n" +
                        "|==--   СОЗДАНИЕ:   --==|\n" +
                        "|=======================|\n" +
                        "|                       |\n" +
                        "|-РЕСУРСЫ ДЛЯ СОЗДАНИЯ:-|\n" +
                        "|                       |"
        );

        showCraftables();
        System.out.println(
                        "|                       |");
        showPossibleCrafts();

        System.out.println("c - закрыть меню крафта");
        String tasksActions = sc.nextLine();
        switch (tasksActions){
            case "c": openMenu(); break;
            default: System.out.println(Game.ANSI_RED + "Такого варианта нет! Можно только закрыть меню!" + Game.ANSI_RESET);
                openCraft();
        }
    }
    public static void closeCraft(){
        System.out.println("меню крафта задач закрыто");
        openMenu();
    }


    public static void showCraftables(){
        if(Inventory.inventory.contains(Inventory.items.TARP)){
            System.out.println("| кусок брезента        |" + "\n|-----------------------|");
        }
        if(Inventory.inventory.contains(Inventory.items.NAILS)){
            System.out.println("| гвозди                |" + "\n|-----------------------|");
        }
        if(Inventory.inventory.contains(Inventory.items.STICK)){
            System.out.println("| прочная палка         |" + "\n|-----------------------|");
        }
        if(Inventory.inventory.contains(Inventory.items.DUCT_TAPE)){
            System.out.println("| изолента              |" + "\n|-----------------------|");
        }
        if(Inventory.inventory.contains(Inventory.items.GASOLINE)){
            System.out.println("| машинное масло        |" + "\n|-----------------------|");
        }
        if(Inventory.inventory.contains(Inventory.items.SCRAP_METAL)){
            System.out.println("| металлические обломки |" + "\n|-----------------------|");
        }
        if(Inventory.inventory.contains(Inventory.items.PAINT)){
            System.out.println("| краска                |" + "\n|-----------------------|");
        }
        if(Inventory.inventory.contains(Inventory.items.GLUE)){
            System.out.println("| клей                  |" + "\n|-----------------------|");
        }
        if(Inventory.inventory.contains(Inventory.items.PLANK)){
            System.out.println("| Доска                 |" + "\n|-----------------------|");
        }
        if(!Inventory.inventory.contains(Inventory.items.TARP) &&
           !Inventory.inventory.contains(Inventory.items.NAILS) &&
           !Inventory.inventory.contains(Inventory.items.STICK) &&
           !Inventory.inventory.contains(Inventory.items.DUCT_TAPE) &&
           !Inventory.inventory.contains(Inventory.items.GASOLINE) &&
           !Inventory.inventory.contains(Inventory.items.SCRAP_METAL) &&
           !Inventory.inventory.contains(Inventory.items.PAINT) &&
           !Inventory.inventory.contains(Inventory.items.GLUE) &&
           !Inventory.inventory.contains(Inventory.items.PLANK)){
            System.out.println(
                            "| нет ресурсов          |"

            );
        }
    }

    public static void showPossibleCrafts() {
        System.out.println(
                        "|==-- МОЖНО СОЗДАТЬ --==|\n" +
                        "|                       |"

        );
        canCraft();
    }
    public static void canCraft(){
        if(Inventory.inventory.contains(Inventory.items.MAP_FIRST_PART) && Inventory.inventory.contains(Inventory.items.MAP_SECOND_PART)){
            System.out.println(
                    "|древнюю карту          |"
            );
            System.out.println(
                    "|1 - склеить карту      |\n" +
                    "|                       |\n" +
                    "|=========-***-=========|");
            String askOption = sc.nextLine();

            switch (askOption){
                case "1": craftMap(); break;
                default: System.out.println(Game.ANSI_RED + "Такого варианта нет!" + Game.ANSI_RESET);
            }
        }else {
            System.out.println(
                            "| Пока что ничего...    |\n" +
                            "|                       |\n" +
                            "|=========-***-=========|"
                    );
        }



    }

    private static void craftMap() {
        Inventory.inventory.remove(Inventory.items.MAP_FIRST_PART);
        Inventory.inventory.remove(Inventory.items.MAP_SECOND_PART);
        Inventory.inventory.add(Inventory.items.MAP);
        System.out.println(
                        "Вы скрафтили карту!"
        );
    }

}