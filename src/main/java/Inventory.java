import java.text.SimpleDateFormat;
import java.util.*;

public class Inventory {
    static Map<Enum<items>, Integer> inventory = new HashMap() {
    };
    static String timeStamp = new SimpleDateFormat("dd.MM.yyyy  ").format(Calendar.getInstance().getTime());
    public static void showInventoryItems(){
            if(Inventory.inventory.containsKey(items.JOURNAL) ){
                System.out.println("| журнал                |" );
            }
            if(Inventory.inventory.containsKey(items.MAP)){
                System.out.println("| древняя карта         |");
            }
            if(Inventory.inventory.containsKey(items.NEWSPAPER)){
                System.out.println("| газета от " + timeStamp + "|");
            }
        if(Inventory.inventory.containsKey(items.PLUSHY_WOLF)){
                System.out.println("|" + Game.YELLOW_BRIGHT + " плюшевая волчица *    "+ Game.ANSI_RESET +"| <- уникальный предмет");
        }
            if(Inventory.inventory.containsKey(items.GOLDEN_BAR)){
                System.out.println("| золотой слиток        |");
            }
            if(Inventory.inventory.containsKey(items.SILVER_WRING)){
                System.out.println("| серебряное кольцо     |");
            }
            if(Inventory.inventory.containsKey(items.NECKLACE)){
                System.out.println("| ожерелье              |");
            }
            if(Inventory.inventory.containsKey(items.OLD_DECLARATIONS)){
                System.out.println("| декларации            |");
            }
            if(Inventory.inventory.containsKey(items.HAMMER)){
                System.out.println("| молоток               |");
            }
            if(Inventory.inventory.containsKey(items.CROWBAR)){
                System.out.println("| гвоздодер             |");
            }
            if(Inventory.inventory.containsKey(items.PLIERS)){
                System.out.println("| плоскогубцы           |");
            }
            if(Inventory.inventory.containsKey(items.FLASHLIGHT)){
                System.out.println("| фонарик               |");
            }
            if(Inventory.inventory.containsKey(items.SPRAY)){
                System.out.println("| спрей от насекомых    |");
            }
            if(Inventory.inventory.containsKey(items.KNIFE)){
                System.out.println("| нож                   |");
            }
            if(Inventory.inventory.containsKey(items.POCKET_WATCH)){
                System.out.println("| золотые карманные часы|");
            }
            if(Inventory.inventory.containsKey(items.HAPPY_GREEN_VISIT_CARD)){
                System.out.println("| визитка 'happy green' |");
            }
            if(Inventory.inventory.containsKey(items.ROSE)){
                System.out.println("| роза                  |");
            }
            if(Inventory.inventory.containsKey(items.TARP)){
                System.out.println("| кусок брезента        | \uD83D\uDD28");
            }
            if(Inventory.inventory.containsKey(items.NAILS)){
                System.out.println("| гвозди                | \uD83D\uDD28");
            }
            if(Inventory.inventory.containsKey(items.STICK)){
                System.out.println("| прочная палка         | \uD83D\uDD28");
            }
            if(Inventory.inventory.containsKey(items.DUCT_TAPE)){
                System.out.println("| изолента              | \uD83D\uDD28");
            }
            if(Inventory.inventory.containsKey(items.OIL)){
                System.out.println("| машинное масло        | \uD83D\uDD28");
            }
            if(Inventory.inventory.containsKey(items.SCRAP_METAL)){
                System.out.println("| металлические обломки | \uD83D\uDD28");
            }
            if(Inventory.inventory.containsKey(items.PAINT)){
                System.out.println("| краска                | \uD83D\uDD28");
            }
            if(Inventory.inventory.containsKey(items.GLUE)){
                System.out.println("| клей                  | \uD83D\uDD28");
            }
            if(Inventory.inventory.containsKey(items.PLANK)){
                System.out.println("| Доска                 | \uD83D\uDD28");
            }

    }

    public enum items {
        //      ======================== quests:
        JOURNAL,
        MAP,
        NEWSPAPER,
        PLUSHY_WOLF,

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
        PAINT,
        GLUE,
        PLANK
    }


// идеи для крафтов: (что вообще может скрафитить управляющий заводом?)
// факел
//
//
//

}
