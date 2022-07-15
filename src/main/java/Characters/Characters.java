package Characters;

public class Characters {

    public class Will{

        public static void said() {
            String praising[] = {"Уиллиам: Так держать!", "Уиллиам: Теперь гораздо лучше", "Уиллиам: Теперь другое дело!", "Уиллиам: Здорово!", "Уиллиам: Очень неплохо....", "Уиллиам захлопал крыльями"};
            int randomReaction = (int)Math.floor(Math.random() * praising.length);
            System.out.println(praising[randomReaction]);
        }
        public static void toyReaction() {
            String praising[] = {"Уиллиам: Оу! вы нашли ее!", "Уиллиам: Так Вот где она была!", "Уиллиам: Волчице пора вернуться к своей хозяйке", "Уиллиам: Хорошо что она нашлась!", };
            int randomReaction = (int)Math.floor(Math.random() * praising.length);
            System.out.println(praising[randomReaction]);
        }

    }
    public class Millie{
        public static void said() {
            String praising[] = {"Милли: Так держать!", "Милли: Так то лучше", "Милли: Теперь тут гораздо уютнее!", "Милли: Так, я отходила, что тут случилось?", "Милли: Здорово!", "Милли: Какая прелесть!", "Милли: Я бы еще шторки повесила...", "Милли: *Радостно завиляла хвостом"};
            int randomReaction = (int) Math.floor(Math.random() * praising.length);
            System.out.println(praising[randomReaction]);
        }
        public static void toyReaction() {
            String praising[] = {"Милли: Ура! волчица нашлась!", "Милли: Я знала, что вы найдете её", "Милли: Как мило...", "Милли: Очень мило, что вы вернули её!", "Милли: Нашлась все таки!"};
            int randomReaction = (int) Math.floor(Math.random() * praising.length);
            System.out.println(praising[randomReaction]);
        }
    }
}
