package Characters;

public class Characters {

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

    }
    public class Millie{
        public static void said() {
            String praising[] = {
                    "\033[0;1m" + "Милли: Так держать!" + "\033[0;0m",
                    "\033[0;1m" + "Милли: Так то лучше" + "\033[0;0m",
                    "\033[0;1m" + "Милли: Теперь тут гораздо уютнее!" + "\033[0;0m",
                    "\033[0;1m" + "Милли: Так, я отходила, что тут случилось?" + "\033[0;0m",
                    "\033[0;1m" + "Милли: Здорово!", "Милли: Какая прелесть!" + "\033[0;0m",
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
    }
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
                    "\033[0;1m" + "Том: Поправил очки" + "\033[0;0m",
                    "\033[0;1m" + "Том: Задумчиво почесал рога, и посмотрел на какую-то схему" + "\033[0;0m",
                    "\033[0;1m" + "Том: Здорово, что детей с малых лет приучают к постижению сложных сфер,\nа не оставляют их наедине с тик-током или ютубом" + "\033[0;0m",
                    "\033[0;1m" + "Том: Мисс Мэй определенно заслуживает всего того уважения, которое она получает со стороны своих коллег и знакомых,\nи как только ей удается столько успевать?" + "\033[0;0m"
            };

            int randomReaction = (int)Math.floor(Math.random() * praising.length);
            System.out.println(praising[randomReaction]);
        }

    }
}
