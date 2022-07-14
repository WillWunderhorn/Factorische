import java.util.ArrayList;
import java.util.Scanner;

public class Cards {
    static Card_0 card_0;
    static Card_1 card_1;
    static Card_2 card_2;

    public static ArrayList<Cards> deck = new ArrayList();

    public static void addAllCards() {
        Card_0 card_0 = new Card_0();
        Card_1 card_1 = new Card_1();
        Card_2 card_2 = new Card_2();

        deck.add(card_0);
        deck.add(card_1);
        deck.add(card_2);
    }

    public static void returnRandomCard() {
        int randomCard = (int)Math.floor(Math.random() * deck.size());
        System.out.println(deck.get(randomCard));
    }

    //=========================================================================
    public static class Card_0 extends Cards {

        public static synchronized Cards getCard(){
            if(card_0 == null){
                Card_0 card_0 = new Card_0();
                card_0.selectOption();
            }
            return card_0;
        }

        int id;
        String description;
        boolean isDisposable;
        Scanner sc = new Scanner(System.in);

        public Card_0() {
            this.id = 0;
            this.description = "На заводе закончились расходники, купить еще?";
            this.isDisposable = false;
        }

        public int getId() {
            return id;
        }

        public boolean isDisposable() {
            return isDisposable;
        }

        public String getDescription() {
            return description;
        }


        public void checkDisposable(){
            if (isDisposable == true){
                deck.remove(this.id);
            }
        }

        public void selectOption() {
            System.out.println(this.description);
            System.out.println("0 - открыть меню");
            if(Game.budget < 200){
                System.out.println(Game.ANSI_RED + "1 - Купить (-200$)" + Game.ANSI_RESET);
            }
            else if(Game.budget >= 200){
                System.out.println("1 - Купить (-200$)");
            }
            System.out.println("2 - Не покупать");
            String askOption = sc.nextLine();

            switch (askOption){
                case "1": option1(); break;
                case "2": option2(); break;
                case "0": option3(); break;
                default: noSuchACard(); break;
            }
            checkDisposable();
        }

        public void option1(){
            Game.budget -= 200;
        }
        public void option2(){
            Game.rep_wrk -= 20;
            System.out.println("Работники на вас обиделись");
        }
        public void option3(){
            Menu.openMenu();
            System.out.println(deck.get(id));
        }
        public void noSuchACard(){
            System.out.println("Такого варианта нет!");
            System.out.println(deck.get(id));
        }

        @Override
        public String toString() {
            selectOption();
            return "";
        }
    }

        //=========================================================================

        static class Card_1 extends Cards {

            public static synchronized Cards getCard(){
                if(card_1 == null){
                    Card_1 card_1 = new Card_1();
                    card_1.selectOption();
                }
                return card_1;
            }

            int id;
            String description;
            boolean isDisposable;
            Scanner sc = new Scanner(System.in);

            public Card_1() {
                this.id = 1;
                this.description = "К вам пришли с подарками";
                this.isDisposable = false;
            }

            public int getId() {
                return id;
            }

            public boolean isDisposable() {
                return isDisposable;
            }

            public String getDescription() {
                return description;
            }

            public void checkDisposable(){
                if (isDisposable == true){
                    deck.remove(this.id);
                }
            }

            public void selectOption() {
                System.out.println(this.description);
                System.out.println("0 - открыть меню\n1 - Принять (+500$)\n2 - Не принимать");

                String askOption = sc.nextLine();

                switch (askOption){
                    case "1": option1(); break;
                    case "2": option2(); break;
                    case "0": option3(); break;
                    default: noSuchACard(); break;
                }
                checkDisposable();
            }

            public void option1(){
                Game.budget += 500;
                Game.rep_wrk += 10;;
            }
            public void option2(){
                System.out.println("Вы вежливо отказались");
            }
            public void option3(){
                Menu.openMenu();
                System.out.println(deck.get(id));
            }
            public void noSuchACard(){
                System.out.println("Такого варианта нет!");
                System.out.println(deck.get(id));
            }

            @Override
            public String toString() {
                selectOption();
                return "";
            }

        }
        //=========================================================================
        public static class Card_2 extends Cards {

            public static synchronized Cards getCard(){
                if(card_2 == null){
                    Card_2 card_2 = new Card_2();
                    card_2.selectOption();
                }
                return card_2;
            }

            int id;
            String description;
            boolean isDisposable;
            Scanner sc = new Scanner(System.in);

            public Card_2() {
                this.id = 2;
                this.description = "Вы нашли молоток!";
                this.isDisposable = true;
            }

            public int getId() {
                return id;
            }

            public boolean isDisposable() {
                return isDisposable;
            }

            public String getDescription() {
                return description;
            }

            public void checkDisposable(){
                if (isDisposable == true){
                    deck.remove(this.id);
                }
            }

            public void selectOption() {
                System.out.println(this.description);
                System.out.println("0 - открыть меню\n1 - Взять\n2 - Оставить");

                String askOption = sc.nextLine();

                switch (askOption){
                    case "1": option1(); break;
                    case "2": option2(); break;
                    case "0": option3(); break;
                    default: noSuchACard(); break;
                }
            }
// ЕСЛИ КАРТОЧКА DISPOSABLE, ТО checkDisposable() ПИСАТЬ В КАЖДОЙ ОПЦИИ КРОМЕ МЕНЮ
            public void option1(){
                Inventory.inventory.add(Inventory.items.JOURNAL);
                Inventory.inventory.add(Inventory.items.MAP);
                Inventory.inventory.add(Inventory.items.NEWSPAPER);

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

                Inventory.inventory.add(Inventory.items.TARP);
                Inventory.inventory.add(Inventory.items.NAILS);
                Inventory.inventory.add(Inventory.items.STICK);
                Inventory.inventory.add(Inventory.items.DUCT_TAPE);
                Inventory.inventory.add(Inventory.items.OIL);
                Inventory.inventory.add(Inventory.items.SCRAP_METAL);
                Inventory.inventory.add(Inventory.items.PAINT);

                checkDisposable();
            }
            public void option2(){
                System.out.println("Вы прошли мимо");
                checkDisposable();
            }
            public void option3(){
                Menu.openMenu();
                System.out.println(deck.get(id));
            }
            public void noSuchACard(){
                System.out.println("Такого варианта нет!");
                System.out.println(deck.get(id));
            }

            @Override
            public String toString() {
                selectOption();
                return "";
            }
        }
}
