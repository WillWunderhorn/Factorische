import java.util.ArrayList;
import java.util.Scanner;

public class Cards {
    static Card_0 card_0;
    static Card_1 card_1;

    public static ArrayList<Cards> deck = new ArrayList();

    public static void addAllCards() {
        Card_0 card_0 = new Card_0();
        Card_1 card_1 = new Card_1();

        deck.add(card_0);
        deck.add(card_1);
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

        public void selectOption() {
            System.out.println(this.description);
            System.out.println("1 - Купить (-200$)" + "\n" + "2 - Не покупать");

            int askOption = sc.nextInt();

            switch (askOption){
                case 1: option1(); break;
                case 2: option2(); break;
                default: noSuchACard(); break;
            }
        }

        public void option1(){
            Game.budget -= 200;
        }
        public void option2(){
            Game.rep_wrk -= 20;
            System.out.println("Работники на вас обиделись");
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

            public void selectOption() {
                System.out.println(this.description);
                System.out.println("1 - Принять (+500$)" + "\n" + "2 - Не принимать");

                int askOption = sc.nextInt();

                switch (askOption){
                    case 1: option1(); break;
                    case 2: option2(); break;
                    default: noSuchACard(); break;
                }
            }

            public void option1(){
                Game.budget += 500;
                Game.rep_wrk += 10;;
            }
            public void option2(){
                System.out.println("Вы вежливо отказались");
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
}
