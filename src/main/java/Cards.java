import Characters.Characters;

import java.util.ArrayList;
import java.util.Scanner;

//=========================================================================
public class Cards {
    static Card_0 card_0;
    static Card_1 card_1;
    static Card_2 card_2;
    static Card_3 card_3;
    static Card_4 card_4;
    static Card_5 card_5;
    static Card_6 card_6;
    static Card_7 card_7;
    static Card_8 card_8;
    static Card_9 card_9;
    static Card_10 card_10;

    public static ArrayList<Cards> deck = new ArrayList();

    public static void addAllCards() {
        Card_0 card_0 = new Card_0();
        Card_1 card_1 = new Card_1();
        Card_3 card_3 = new Card_3();
        Card_6 card_6 = new Card_6();
        Card_9 card_9 = new Card_9();
        Card_10 card_10 = new Card_10();

        deck.add(card_0);
        deck.add(card_1);
        deck.add(card_3);
        deck.add(card_6);
        deck.add(card_9);
        deck.add(card_10);
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
            System.out.println(this.description + "\n");
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
        }

        @Override
        public void option1() {
            Game.budget -= 200;
        }
        @Override
        public void option2(){
            Game.rep_wrk -= 15;
            Game.manpower -= 50;
            System.out.println("Эффективность упала, без воды работать нельзя!");
        }
        @Override
        public void option3(){
            Menu.openMenu();
            System.out.println(this);
        }

        @Override
        public void option4() {
        }

        @Override
        public void noSuchACard(){
            System.out.println(Game.ANSI_RED + "Такого варианта нет!" + Game.ANSI_RESET);
            System.out.println(this);
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

        public static class Card_1 extends Cards implements CardMethods{

            public static synchronized Cards getCard(){
                if(card_1 == null && !Inventory.inventory.contains(Inventory.items.HAMMER)){
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
                this.description = "Вы нашли кусочек древней карты!";
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
                System.out.println(this.description + "\n");
                System.out.println("0 - открыть меню\n1 - Взять");

                String askOption = sc.nextLine();

                switch (askOption){
                    case "1": option1(); break;
                    case "0": option3(); break;
                    default: noSuchACard(); break;
                }
            }

            @Override
            public void option1(){
                Inventory.inventory.add(Inventory.items.MAP_FIRST_PART);
                Card_4 card_4 = new Card_4();
                deck.add(card_4);
                checkDisposable();
            }

            @Override
            public void option2(){
            }

            @Override
            public void option3(){
                Menu.openMenu();
                System.out.println(this);
            }

            @Override
            public void option4() {
            }

            @Override
            public void noSuchACard(){
                System.out.println(Game.ANSI_RED + "Такого варианта нет!" + Game.ANSI_RESET);
                System.out.println(this);
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
        static class Card_2 extends Cards implements CardMethods{

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
                this.description = "=====================================\n" +
                        "Вам пришло письмо от воспитательницы из детского сада.\n" +
                        "Одна из девочек оставила свою любимую игрушку на вашем заводе,\n" +
                        "не могли бы вы ее разыскать?";
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
                System.out.println(this.description + "\n");
                System.out.println("0 - открыть меню\n1 - Хорошо, обязательно поищем");

                String askOption = sc.nextLine();

                switch (askOption){
                    case "1": option1(); break;
                    case "0": option2(); break;
                    default: noSuchACard(); break;
                }
            }

            @Override
            public void option1(){
                Game.rep_wrk += 5;
                Game.rep_civ += 3;
                Tasks.plushyToy();
                checkDisposable();
            }

            @Override
            public void option2() {
                Menu.openMenu();
                System.out.println(this);
            }

            @Override
            public void option3(){

            }

            @Override
            public void option4() {
            }

            @Override
            public void noSuchACard(){
                System.out.println(Game.ANSI_RED + "Такого варианта нет!" + Game.ANSI_RESET);
                System.out.println(this);
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
    static class Card_8 extends Cards implements CardMethods{

        public static synchronized Cards getCard(){
            if(card_8 == null){
                Card_8 card_8 = new Card_8();
                card_8.selectOption();
            }
            return card_8;
        }

        int id;
        String description;
        boolean isDisposable;
        Scanner sc = new Scanner(System.in);

        public Card_8() {
            this.id = 8;
            this.description = "=====================================\n" +
                    "Работники жалуются, что манипулятор постоянно 'трещит', чего обычно от него не ожидаешь,\n" +
                    "возможно потребуется дорогостоящий ремонт!";
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
            System.out.println(this.description + "\n");
            System.out.println("0 - открыть меню\n1 - Проверить станок самостоятельно");
            if(Game.budget < 1200){
                System.out.println(Game.ANSI_RED + "2 - вызвать специалиста (-1200$)" + Game.ANSI_RESET);
            }
            else if(Game.budget >= 1200){
                System.out.println("2 - вызвать специалиста (-1200$)");
            }

            String askOption = sc.nextLine();

            switch (askOption){
                case "1": option1(); break;
                case "2": option3(); break;
                case "0": option2(); break;
                default: noSuchACard(); break;
            }
        }

        @Override
        public void option1(){
            System.out.println("=====================================\n" +
                    "Проверив работоспособность кремне-иглового манипулятора,\n" +
                    "оказалось что он и вправду издает странные звуки.\n" +
                    "Его сервоприводы плавно тормозили сами по себе, не давая кремниевой игле ощупывать поверхность,\n" +
                    "Остановив манипулятор и засунув в него руку, вы, на удивление нащупали что то мягкое.\n" +
                    "кажется прокладку защитного отсека вывернуло из ее желоба, вызвав разгерметизацию некоторых элементов.\n" +
                    "Как вдруг... ");
            System.out.println("Вы нашли игрушку!");
            Inventory.inventory.add(Inventory.items.PLUSHY_WOLF);
            checkDisposable();
        }

        @Override
        public void option2() {
            Menu.openMenu();
            System.out.println(this);
        }

        @Override
        public void option3(){
            Game.budget -= 50;
            Game.rep_wrk += 5;
            Game.rep_civ += 3;
            System.out.println("=====================================\n" +
                    "Покапавшись в кишках манипулятора, через пять минут мастер с улыбкой сказал:\n" +
                    "Эта деталь тут лишняя! и протянул вам плюшевую игрушку.\n" +
                    "Она была внутри механизма... \n" +
                    "все посмеялись, и мастер уехал, взяв небольшую часть денег...");
            Inventory.inventory.add(Inventory.items.PLUSHY_WOLF);
            checkDisposable();
        }

        @Override
        public void option4() {
        }

        @Override
        public void noSuchACard(){
            System.out.println(Game.ANSI_RED + "Такого варианта нет!" + Game.ANSI_RESET);
            System.out.println(this);
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

    public static class Card_3 extends Cards implements CardMethods{

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
            this.description = "В кулерах закончилась вода, нужна новая партия!";
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
            System.out.println(this.description + "\n");
            System.out.println("0 - открыть меню");
            if(Game.budget < 350){
                System.out.println(Game.ANSI_RED + "1 - Купить (-350$)" + Game.ANSI_RESET);
            }
            else if(Game.budget >= 200){
                System.out.println("1 - Купить (-350$)");
            }
            System.out.println("2 - Не покупать");
            String askOption = sc.nextLine();

            switch (askOption){
                case "1": option1(); break;
                case "2": option2(); break;
                case "0": option3(); break;
                default: noSuchACard(); break;
            }
        }

        @Override
        public void option1() {
            Game.budget -= 350;
            Game.rep_wrk += 3;
            Game.rep_civ += 2;
        }
        @Override
        public void option2(){
            Game.rep_wrk -= 8;
            Game.manpower -= 50;
        }
        @Override
        public void option3(){
            Menu.openMenu();
            System.out.println(this);
        }

        @Override
        public void option4() {
        }

        @Override
        public void noSuchACard(){
            System.out.println(Game.ANSI_RED + "Такого варианта нет!" + Game.ANSI_RESET);
            System.out.println(this);
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

    static class Card_4 extends Cards implements CardMethods{

        public static synchronized Cards getCard(){
            if(card_4 == null){
                Card_4 card_4 = new Card_4();
                card_4.selectOption();
            }
            return card_4;
        }

        int id;
        String description;
        boolean isDisposable;
        Scanner sc = new Scanner(System.in);

        public Card_4() {
            this.id = 4;
            this.description = "=====================================\n" +
                    "Сегодня днем со стены упала картина,\n" +
                    "из под ее рамки выпала какая то бумажка,\n" +
                    "по цвету напоминающая тот самый кусочек...";
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
            System.out.println(this.description + "\n");
            System.out.println("0 - открыть меню\n1 - Подобрать!");

            String askOption = sc.nextLine();

            switch (askOption){
                case "1": option1(); break;
                case "0": option3(); break;
                default: noSuchACard(); break;
            }
        }

        @Override
        public void option1(){
            Inventory.inventory.add(Inventory.items.MAP_SECOND_PART);
            checkDisposable();
        }

        @Override
        public void option2() {
        }

        @Override
        public void option3(){
            Menu.openMenu();
            System.out.println(this);
        }

        @Override
        public void option4() {
        }

        @Override
        public void noSuchACard(){
            System.out.println(Game.ANSI_RED + "Такого варианта нет!" + Game.ANSI_RESET);
            System.out.println(this);
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

    static class Card_5 extends Cards implements CardMethods{

        public static synchronized Cards getCard(){
            if(card_5 == null){
                Card_5 card_5 = new Card_5();
                card_5.selectOption();
            }
            return card_5;
        }

        int id;
        String description;
        boolean isDisposable;
        Scanner sc = new Scanner(System.in);

        public Card_5() {
            this.id = 5;
            this.description = "=====================================\n" +
                    "Кажется вы поняли, что за место было указано на той древней карте!\n" +
                    "Отправиться туда посмотреть?";
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
            System.out.println(this.description + "\n");
            System.out.println("0 - открыть меню\n1 - Вперед!\n2 - Остаться");

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
            Inventory.inventory.add(Inventory.items.SILVER_WRING);
            Inventory.inventory.add(Inventory.items.OLD_DECLARATIONS);
            System.out.println("=====================================\n" +
                    "По прибытии на место вы нашли то старое дерево,\n" +
                    "в дупле которого, по описанию на карте, что то спрятано.\n" +
                    "Засунув руку в дупло, вы обнаружили небольшой сундук,\n" +
                    "со ржавым замочком. На крышек было написано:\n" +
                    "'WESTFETCH', что бы это ни значило\n" +
                    "вскрыв его ловким движением руки,\n" +
                    "вы обнаружили внутри серебряное кольцо и какие то старые бумаги.\n" +
                    "Судя по датам на этих документах, вряд ли правнуки их владельцев\n" +
                    "все еще живы... вы забрали все содержимое сундука себе");
            System.out.println("Решив что карта больше не нужна, вы убрали ее в карман");
            Inventory.inventory.remove(Inventory.items.MAP);
            checkDisposable();
        }

        @Override
        public void option2() {
            System.out.println("Даже если эта карта настоящая, вряд ли это все еще там...\nДа и дел на заводе много...");
            checkDisposable();
        }

        @Override
        public void option3(){
            Menu.openMenu();
            System.out.println(this);
        }

        @Override
        public void option4() {
        }

        @Override
        public void noSuchACard(){
            System.out.println(Game.ANSI_RED + "Такого варианта нет!" + Game.ANSI_RESET);
            System.out.println(this);
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
static class Card_6 extends Cards implements CardMethods{

    public static synchronized Cards getCard(){
        if(card_6 == null){
            Card_6 card_6 = new Card_6();
            card_6.selectOption();
        }
        return card_6;
    }

    int id;
    String description;
    boolean isDisposable;
    Scanner sc = new Scanner(System.in);

    public Card_6() {
        this.id = 6;
        this.description = "=====================================\n" +
                "Сегодня день открытых дверей на вашем производстве!\n" +
                "И ваша старая знакомая Мисс Мэй,\n" +
                "(воспитательница из местного детсада) позаботилась о полезном времяпрепровождении\n" +
                "детей из своей группы! Как вы уже догадались,\n" +
                "скоро они приедут на экскурсию! Подготовьтесь!";
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
        System.out.println(this.description + "\n");
        System.out.println("0 - открыть меню\n1 - Напомнить всем об этом");

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
        System.out.println("Вы рассказали по скорый визит группы по громкой связи");
        System.out.println();
        Characters.Will.ExcursionReaction();
        Characters.Millie.ExcursionReaction();
        Characters.Tom.ExcursionReaction();
        System.out.println();
        checkDisposable();
        Card_7 card_7 = new Card_7();
        card_7.getCard();
    }

    @Override
    public void option2() {

    }

    @Override
    public void option3(){
        Menu.openMenu();
        System.out.println(this);
    }

    @Override
    public void option4() {
    }

    @Override
    public void noSuchACard(){
        System.out.println(Game.ANSI_RED + "Такого варианта нет!" + Game.ANSI_RESET);
        System.out.println(this);
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
    static class Card_7 extends Cards implements CardMethods{

        public static synchronized Cards getCard(){
            if(card_7 == null){
                Card_7 card_7 = new Card_7();
                card_7.selectOption();
            }
            return card_7;
        }

        int id;
        String description;
        boolean isDisposable;
        Scanner sc = new Scanner(System.in);

        public Card_7() {
            this.id = 7;
            this.description = "=====================================\n" +
                    "Вскоре к вам на завод пришла целая толпа детей,\n" +
                    "все они были очень заинтересованы устройством вашего завода.\n" +
                    "Так же как и процессом производства...\n" +
                    "В ходе экскурсии, вы подробно рассказали о работе\n" +
                    "вашего производства, о том, какой станок\n" +
                    "для каких целей предназначается,\n" +
                    "и как из сырья получается готовый продукт\n" +
                    "Всем детям очень понравилась экскурсия,\n" +
                    "многие из них захотели в будущем тоже работать на вашем заводе!";
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
            System.out.println(this.description + "\n");
            System.out.println("0 - открыть меню\n1 - Завершить экскурс");

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
            Card_2 card_2 = new Card_2();
            deck.add(card_2);
            System.out.println("вы угостили всех детей на последок, и сказали что будете рады видеть их снова!");
            checkDisposable();
        }

        @Override
        public void option2() {

        }

        @Override
        public void option3(){
            Menu.openMenu();
            System.out.println(this);
        }

        @Override
        public void option4() {
        }

        @Override
        public void noSuchACard(){
            System.out.println(Game.ANSI_RED + "Такого варианта нет!" + Game.ANSI_RESET);
            System.out.println(this);
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

    static class Card_9 extends Cards implements CardMethods{

        public static synchronized Cards getCard(){
            if(card_9 == null){
                Card_9 card_9 = new Card_9();
                card_9.selectOption();
            }
            return card_9;
        }

        int id;
        String description;
        boolean isDisposable;
        Scanner sc = new Scanner(System.in);

        public Card_9() {
            this.id = 9;
            this.description = "=====================================\n" +
                    "К вам в кабинет постучалась Ванесса, она рассказала,\n" +
                    "что похоже где то оставила свое кольцо...\n" +
                    "Это был ее подарок от Генри.\n" +
                    "Ей бы очень не хотелось остаться без кольца и без уважения от последнего\n" +
                    "Не могли бы вы помочь ей в поисках?";
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
            System.out.println("0 - открыть меню\n1 - Согласиться");

            String askOption = sc.nextLine();

            switch (askOption){
                case "1": option1(); break;
                case "0": option3(); break;
                default: noSuchACard(); break;
            }
        }

        @Override
        public void option1(){
            Tasks.silverRing();
            checkDisposable();
        }

        @Override
        public void option2() {

        }

        @Override
        public void option3(){
            Menu.openMenu();
            System.out.println(this);
        }

        @Override
        public void option4() {
        }

        @Override
        public void noSuchACard(){
            System.out.println(Game.ANSI_RED + "Такого варианта нет!" + Game.ANSI_RESET);
            System.out.println(this);
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

    static class Card_10 extends Cards implements CardMethods{

        public static synchronized Cards getCard(){
            if(card_10 == null){
                Card_10 card_10 = new Card_10();
                card_10.selectOption();
            }
            return card_10;
        }

        int id;
        String description;
        boolean isDisposable;
        Scanner sc = new Scanner(System.in);

        public Card_10() {
            this.id = 10;
            this.description = "=====================================\n" +
                    "В дверь постучали какие то люди,\n" +
                    "они утверждают что они тут 'главные'\n" +
                    "Они пообещали спалить к чертовой матери весь ваш завод,\n" +
                    "если вы не заплатите им 2400$\n" +
                    "Что делать?\n";
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
            System.out.println("0 - открыть меню\n2 - Послать их");
            if(Game.budget < 2400){
                System.out.println(Game.ANSI_RED + "1 - Заплатить (-2400$)" + Game.ANSI_RESET);
            }
            else if(Game.budget >= 2400){
                System.out.println("1 - Заплатить (-2400$)");
            }

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
            Game.budget -= 2400;
            System.out.println("Вы трусливо отдали деньги своим обидчикам");
            Game.rep_wrk -= 15;
            Game.rep_civ -= 10;
            checkDisposable();
        }

        @Override
        public void option2() {
            System.out.println(
                    "Вы оборвали этих животных на середине слова\n" +
                    "сказав, что если через 5 секунд они не уберутся с вашей территории\n" +
                    "то их похороны будут стоить дороже\n");
            Game.rep_wrk += 7;
            Game.rep_civ += 5;
            Characters.Millie.gangReaction();
            Characters.Will.gangReaction();
            checkDisposable();
        }

        @Override
        public void option3(){
            Menu.openMenu();
            System.out.println(this);
        }

        @Override
        public void option4() {
        }

        @Override
        public void noSuchACard(){
            System.out.println(Game.ANSI_RED + "Такого варианта нет!" + Game.ANSI_RESET);
            System.out.println(this);
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
