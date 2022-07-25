public class Cheats {
    public static void giveAllItems(){
        Inventory.inventory.add(Inventory.items.JOURNAL);
        Inventory.inventory.add(Inventory.items.NEWSPAPER);
//        Inventory.inventory.add(Inventory.items.MAP);
//        Inventory.inventory.add(Inventory.items.PLUSHY_WOLF);

        Inventory.inventory.add(Inventory.items.GOLDEN_BAR);
        Inventory.inventory.add(Inventory.items.SILVER_WRING);
        Inventory.inventory.add(Inventory.items.NECKLACE);
        Inventory.inventory.add(Inventory.items.OLD_DECLARATIONS);

        Inventory.inventory.add(Inventory.items.HAMMER);
        Inventory.inventory.add(Inventory.items.CROWBAR);
        Inventory.inventory.add(Inventory.items.PLIERS);
        Inventory.inventory.add(Inventory.items.FLASHLIGHT);
        Inventory.inventory.add(Inventory.items.SPRAY);
        Inventory.inventory.add(Inventory.items.KNIFE);

        Inventory.inventory.add(Inventory.items.POCKET_WATCH);
        Inventory.inventory.add(Inventory.items.HAPPY_GREEN_VISIT_CARD);
        Inventory.inventory.add(Inventory.items.ROSE);

        Inventory.inventory.add(Inventory.items.MAP_FIRST_PART);
        Inventory.inventory.add(Inventory.items.MAP_SECOND_PART);
        Inventory.inventory.add(Inventory.items.TARP);
        Inventory.inventory.add(Inventory.items.NAILS);
        Inventory.inventory.add(Inventory.items.STICK);
        Inventory.inventory.add(Inventory.items.DUCT_TAPE);
        Inventory.inventory.add(Inventory.items.GASOLINE);
        Inventory.inventory.add(Inventory.items.SCRAP_METAL);
        Inventory.inventory.add(Inventory.items.PAINT);
        Inventory.inventory.add(Inventory.items.GLUE);
        Inventory.inventory.add(Inventory.items.PAINT);
    }

    public static void giveAllRequestedItems(){
        Inventory.inventory.add(Inventory.items.PLUSHY_WOLF);
    }

    public static void killPlayer(){
        GameOver.die();
    }

    public static void goodBoss(){
        Game.rep_wrk = 100;
        Game.rep_gov = 100;
        Game.rep_civ = 100;
    }

    public static void imRich(){
        Game.budget += 1000000;
    }

}
