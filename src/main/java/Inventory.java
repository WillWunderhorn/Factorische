import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Inventory {
    static ArrayList<items> inventory = new ArrayList<>();
    static String timeStamp = new SimpleDateFormat("(dd_MM_yyyy)").format(Calendar.getInstance().getTime());
    public static void showInventoryItems(){
            if(Inventory.inventory.contains(items.JOURNAL)){
                System.out.println("| журнал                |");
            }
            if(Inventory.inventory.contains(items.MAP)){
                System.out.println("| карта                 |");
            }
            if(Inventory.inventory.contains(items.NEWSPAPER)){
                System.out.println("| газета от " + timeStamp + "|");
            }
            if(Inventory.inventory.contains(items.GOLDEN_BAR)){
                System.out.println("| золотой слиток        |");
            }
            if(Inventory.inventory.contains(items.SILVER_WRING)){
                System.out.println("| серебряное кольцо     |");
            }
            if(Inventory.inventory.contains(items.NECKLACE)){
                System.out.println("| ожерелье              |");
            }
            if(Inventory.inventory.contains(items.OLD_DECLARATIONS)){
                System.out.println("| декларации            |");
            }
            if(Inventory.inventory.contains(items.HAMMER)){
                System.out.println("| молоток               |");
            }
            if(Inventory.inventory.contains(items.CROWBAR)){
                System.out.println("| гвоздодер             |");
            }
            if(Inventory.inventory.contains(items.PLIERS)){
                System.out.println("| плоскогубцы           |");
            }
            if(Inventory.inventory.contains(items.FLASHLIGHT)){
                System.out.println("| фонарик               |");
            }
            if(Inventory.inventory.contains(items.SPRAY)){
                System.out.println("| спрей от насекомых    |");
            }
            if(Inventory.inventory.contains(items.KNIFE)){
                System.out.println("| нож                   |");
            }
            if(Inventory.inventory.contains(items.POCKET_WATCH)){
                System.out.println("| золотые карманные часы|");
            }
            if(Inventory.inventory.contains(items.HAPPY_GREEN_VISIT_CARD)){
                System.out.println("| визитка 'happy green' |");
            }
            if(Inventory.inventory.contains(items.ROSE)){
                System.out.println("| роза                  |");
            }
            if(Inventory.inventory.contains(items.TARP)){
                System.out.println("| кусок брезента        |");
            }
            if(Inventory.inventory.contains(items.NAILS)){
                System.out.println("| гвозди                |");
            }
            if(Inventory.inventory.contains(items.STICK)){
                System.out.println("| прочная палка         |");
            }
            if(Inventory.inventory.contains(items.DUCT_TAPE)){
                System.out.println("| изолента              |");
            }
            if(Inventory.inventory.contains(items.OIL)){
                System.out.println("| машинное масло        |");
            }
            if(Inventory.inventory.contains(items.SCRAP_METAL)){
                System.out.println("| металлические обломки |");
            }
            if(Inventory.inventory.contains(items.PAINT)){
                System.out.println("| краска                |");
            }

    }

    public enum items {
        //      ======================== quests:
        JOURNAL,
        MAP,
        NEWSPAPER,

        //      ======================== money:
        GOLDEN_BAR,
        SILVER_WRING,
        NECKLACE,
        OLD_DECLARATIONS,
        //      ======================== tools:
        HAMMER,
        CROWBAR,
        PLIERS,
        FLASHLIGHT,
        SPRAY,
        KNIFE,

        //      ======================== gifts / requests:
        POCKET_WATCH,
        HAPPY_GREEN_VISIT_CARD,
        ROSE,

        //      ======================== crafting:
        TARP,
        NAILS,
        STICK,
        DUCT_TAPE,
        OIL,
        SCRAP_METAL,
        PAINT
    }



}
