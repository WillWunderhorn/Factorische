import java.util.Scanner;

public class Menu {
    public static String dayOfWeek;
    static Scanner sc = new Scanner(System.in);

    public static void getDayOfWeek(){
        switch (dayOfWeek){
            case Game.day = 0: dayOfWeek = "sunday";
        }
        if(Game.day % 1 == 0){
            dayOfWeek = "sunday";
        }
    }

    public static void openMenu(){
        System.out.println("|=======================|\n" +
                           "|         МЕНЮ:         |"


        );
        Menu.openInventory();
        System.out.println("0 - закрыть меню");
        String menuActions = sc.nextLine();
        switch (menuActions){
            case "3": closeMenu(); break;
        }
    }

    public static void closeMenu(){
        System.out.println("меню закрыто");
    }

    public static void openInventory(){
        System.out.println("|   --- Инвентарь ---   |");
        if(Inventory.inventory.size() == 0){
            System.out.println("|инвентарь пуст...      |");
        }else if(Inventory.inventory.size() != 0){
            Inventory.showInventoryItems();
        }
        System.out.println("|                       |\n" +
                           "|                       |\n" +
                           "|                       |\n" +
                           "|                       |\n" +
                           "|                       |\n" );
    }

}