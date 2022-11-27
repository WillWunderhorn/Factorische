package Characters;

public class Characters {
//                                                    WILLIAM
//======================================================================================================================
    public class Will{

        public static void said() {
            String praising[] = {
                    "\033[0;1m" + "Уиллиам: Так держать!" + "\033[0;0m",
                    "\033[0;1m" + "Уиллиам: Теперь гораздо лучше" + "\033[0;0m",
                    "\033[0;1m" + "Уиллиам: Теперь другое дело!" + "\033[0;0m",
                    "\033[0;1m" + "Уиллиам: Здорово!" + "\033[0;0m",
                    "\033[0;1m" + "Уиллиам: Очень неплохо...." + "\033[0;0m",
                    "\033[0;1m" + "Уиллиам захлопал крыльями" + "\033[0;0m"
            };

            int randomReaction = (int)Math.floor(Math.random() * praising.length);
            System.out.println(praising[randomReaction]);
        }
        public static void toyReaction() {
            String praising[] = {
                    "\033[0;1m" + "Уиллиам: Оу! вы нашли ее!" + "\033[0;0m",
                    "\033[0;1m" + "Уиллиам: Так Вот где она была!" + "\033[0;0m",
                    "\033[0;1m" + "Уиллиам смотрит с улыбкой" + "\033[0;0m",
                    "\033[0;1m" + "Уиллиам: Хорошо что она нашлась!" + "\033[0;0m"
            };

            int randomReaction = (int)Math.floor(Math.random() * praising.length);
            System.out.println(praising[randomReaction]);
        }
        public static void ExcursionReaction() {
            String praising[] = {
                    "\033[0;1m" + "Уиллиам: Да да, я помню" + "\033[0;0m",
                    "\033[0;1m" + "Уиллиам: Это что то новенькое!" + "\033[0;0m",
                    "\033[0;1m" + "Уиллиам: Здорово!" + "\033[0;0m",
                    "\033[0;1m" + "Уиллиам: Буду ждать..." + "\033[0;0m"
            };

            int randomReaction = (int)Math.floor(Math.random() * praising.length);
            System.out.println(praising[randomReaction]);
        }

        public static void gangReaction() {
            String praising[] = {
                    "\033[0;1m" + "Из ноздрей Уиллиама пошел дым" + "\033[0;0m",
                    "\033[0;1m" + "Сквозь сжатые зубы Уиллиама просачивается дым" + "\033[0;0m",
            };

            int randomReaction = (int)Math.floor(Math.random() * praising.length);
            System.out.println(praising[randomReaction]);
        }

    }
//                                                    MILLIE
//======================================================================================================================
    public class Millie{
        public static void said() {
            String praising[] = {
                    "\033[0;1m" + "Милли: Так держать!" + "\033[0;0m",
                    "\033[0;1m" + "Милли: Так то лучше" + "\033[0;0m",
                    "\033[0;1m" + "Милли: Теперь тут гораздо уютнее!" + "\033[0;0m",
                    "\033[0;1m" + "Милли: Так, я отходила, что тут случилось?" + "\033[0;0m",
                    "\033[0;1m" + "Милли: Милли: Какая прелесть!" + "\033[0;0m",
                    "\033[0;1m" + "Милли: Я бы еще шторки повесила..." + "\033[0;0m",
                    "\033[0;1m" + "Милли радостно завиляла хвостом" + "\033[0;0m"
            };

            int randomReaction = (int) Math.floor(Math.random() * praising.length);
            System.out.println(praising[randomReaction]);
        }
        public static void toyReaction() {
            String praising[] = {
                    "\033[0;1m" + "Милли: Ура! волчица нашлась!" + "\033[0;0m",
                    "\033[0;1m" + "Милли: Я знала, что вы найдете её!" + "\033[0;0m",
                    "\033[0;1m" + "Милли: Очень мило, что вы вернули её!" + "\033[0;0m",
                    "\033[0;1m" + "Милли: Волчице пора вернуться к своей хозяйке!" + "\033[0;0m",
                    "\033[0;1m" + "Милли умиляется" + "\033[0;0m"
            };

            int randomReaction = (int) Math.floor(Math.random() * praising.length);
            System.out.println(praising[randomReaction]);
        }
        public static void ExcursionReaction() {
            String praising[] = {
                    "\033[0;1m" + "Милли: Ура! дети придут!" + "\033[0;0m",
                    "\033[0;1m" + "Милли: Не часто у нас бывают гости" + "\033[0;0m",
                    "\033[0;1m" + "Милли: Как мило" + "\033[0;0m",
                    "\033[0;1m" + "Милли: Смотрит на дверь, виляя хвостом" + "\033[0;0m"
            };

            int randomReaction = (int)Math.floor(Math.random() * praising.length);
            System.out.println(praising[randomReaction]);
        }
        public static void gangReaction() {
            String praising[] = {
                    "\033[0;1m" + "Милли: Хах! я разорву их, если они придут снова,\n"+
                                  "в следующий раз позовите меня, хорошо?\n" +
                                  "Вы: мне кажется им еще рано умирать)\n" +
                                  "Милли: Если наш завод сожгут, весь город останется без микрочипов...\n" + "\033[0;0m",

                    "\033[0;1m" + "Милли рычит на дверь, плотно прижав уши" + "\033[0;0m"
            };

            int randomReaction = (int) Math.floor(Math.random() * praising.length);
            System.out.println(praising[randomReaction]);
        }
    }
//                                                    VANESSA
//======================================================================================================================
    public class Vanessa{
        public static void ringReaction() {
            String praising[] = {
                    "\033[0;1m" + "Ванесса: Спасибо большое\n" +
                            "*Уиллиам: поет в коридоре" + "\033[0;0m",
                    "\033[0;1m" + "Ванесса: Спасибо, а Генри случайно не заходил?\n" +
                            "*Том: зафыркал" + "\033[0;0m",
            };

            int randomReaction = (int) Math.floor(Math.random() * praising.length);
            System.out.println(praising[randomReaction]);
        }
    }

//                                                    TOM
//======================================================================================================================
    public class Tom{

//        public static void said() {
//            String praising[] = {
//                    "\033[0;1m" + "Том: " + "\033[0;0m",
//                    "\033[0;1m" + "Том: " + "\033[0;0m",
//                    "\033[0;1m" + "Том: " + "\033[0;0m",
//                    "\033[0;1m" + "Том: " + "\033[0;0m",
//                    "\033[0;1m" + "Том: " + "\033[0;0m",
//                    "\033[0;1m" + "Том: " + "\033[0;0m"
//            };
//
//            int randomReaction = (int)Math.floor(Math.random() * praising.length);
//            System.out.println(praising[randomReaction]);
//        }
//        public static void toyReaction() {
//            String praising[] = {
//                    "\033[0;1m" + "Том: " + "\033[0;0m",
//                    "\033[0;1m" + "Том: " + "\033[0;0m",
//                    "\033[0;1m" + "Том: " + "\033[0;0m",
//                    "\033[0;1m" + "Том: " + "\033[0;0m"
//            };
//
//            int randomReaction = (int)Math.floor(Math.random() * praising.length);
//            System.out.println(praising[randomReaction]);
//        }
        public static void ExcursionReaction() {
            String praising[] = {
                    "\033[0;1m" + "Том: Задумчиво почесал рога, и посмотрел на какую-то схему" + "\033[0;0m",
                    "\033[0;1m" + "Том: Мисс Мэй определенно заслуживает всего того уважения, которое она получает со стороны своих коллег и знакомых,\nи как только ей удается столько успевать?" + "\033[0;0m"
            };

            int randomReaction = (int)Math.floor(Math.random() * praising.length);
            System.out.println(praising[randomReaction]);
        }

    }
}
