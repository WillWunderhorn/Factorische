import java.util.ArrayList;
import java.util.Scanner;

// ЕСЛИ КАРТОЧКА DISPOSABLE, ТО checkDisposable() ПИСАТЬ В КАЖДОЙ ОПЦИИ КРОМЕ openMenu() и noSuchACard()

public class Cards {
    static Card_0 card_0;
    static Card_1 card_1;
    static Card_2 card_2;
    static Card_3 card_3;

    public static ArrayList<Cards> deck = new ArrayList();

    public static void addAllCards() {
        Card_0 card_0 = new Card_0();
        Card_1 card_1 = new Card_1();
        Card_2 card_2 = new Card_2();
        Card_3 card_3 = new Card_3();

        deck.add(card_0);
        deck.add(card_1);
        deck.add(card_2);
        deck.add(card_3);
    }

    public static void returnRandomCard() {
        int randomCard = (int)Math.floor(Math.random() * deck.size());
        System.out.println(deck.get(randomCard));
    }

    //=========================================================================
    public static class Card_0 extends Cards implements CardMethods{

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

        @Override
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

        @Override
        public void option1() {
            Game.budget -= 200;
        }
        @Override
        public void option2(){
            Game.rep_wrk -= 20;
            System.out.println("Работники на вас обиделись");
        }
        @Override
        public void option3(){
            Menu.openMenu();
            System.out.println(deck.get(id));
        }

        @Override
        public void option4() {

        }

        @Override
        public void noSuchACard(){
            System.out.println("Такого варианта нет!");
            System.out.println(deck.get(id));
        }

        @Override
        public String toString() {
            selectOption();
            return "";
        }

        @Override
        public void checkDisposable() {
            if (isDisposable == true){
                deck.remove(this);
            }
        }

    }

        //=========================================================================

        static class Card_1 extends Cards implements CardMethods{

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

            @Override
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

            @Override
            public void option1(){
                Game.budget += 500;
                Game.rep_wrk += 10;;
            }

            @Override
            public void option2(){
                System.out.println("Вы вежливо отказались");
            }

            @Override
            public void option3(){
                Menu.openMenu();
                System.out.println(deck.get(id));
            }

            @Override
            public void option4() {

            }

            @Override
            public void noSuchACard(){
                System.out.println("Такого варианта нет!");
                System.out.println(deck.get(id));
            }

            @Override
            public String toString() {
                selectOption();
                return "";
            }

            @Override
            public void checkDisposable() {
                if (isDisposable == true){
                    deck.remove(this);
                }
            }

        }
        //=========================================================================
        public static class Card_2 extends Cards implements CardMethods{

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

            @Override
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

            @Override
            public void option1(){
                Cheats.giveAllItems();
                checkDisposable();
            }

            @Override
            public void option2(){
                System.out.println("Вы прошли мимо");
                checkDisposable();
            }

            @Override
            public void option3(){
                Menu.openMenu();
                System.out.println(deck.get(id));
            }

            @Override
            public void option4() {

            }

            @Override
            public void noSuchACard(){
                System.out.println("Такого варианта нет!");
                System.out.println(deck.get(id));
            }

            @Override
            public String toString() {
                selectOption();
                return "";
            }

            @Override
            public void checkDisposable() {
                if (isDisposable == true){
                    deck.remove(this);
                }
            }

        }
        //=========================================================================
        static class Card_3 extends Cards implements CardMethods{

            public static synchronized Cards getCard(){
                if(card_3 == null){
                    Card_3 card_3 = new Card_3();
                    card_3.selectOption();
                }
                return card_3;
            }

            int id;
            String description;
            boolean isDisposable;
            Scanner sc = new Scanner(System.in);

            public Card_3() {
                this.id = 3;
                this.description = "Кажется кто то забыл свою игрушку на вашем заводе, не могли бы вы ее разыскать?";
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

            @Override
            public void selectOption() {
                System.out.println(this.description);
                System.out.println("0 - открыть меню\n1 - Хорошо");

                String askOption = sc.nextLine();

                switch (askOption){
                    case "1": option1(); break;
                    case "0": option3(); break;
                    default: noSuchACard(); break;
                }
                checkDisposable();
            }

            @Override
            public void option1(){
                Tasks.plushyToy();
                checkDisposable();
            }

            @Override
            public void option2() {

            }

            @Override
            public void option3(){
                Menu.openMenu();
                System.out.println(deck.get(id));
            }

            @Override
            public void option4() {

            }

            @Override
            public void noSuchACard(){
                System.out.println("Такого варианта нет!");
                System.out.println(deck.get(id));
            }

            @Override
            public String toString() {
                selectOption();
                return "";
            }

            @Override
            public void checkDisposable() {
                if (isDisposable == true){
                    deck.remove(this);
                }
            }

        }

        //=========================================================================

}
