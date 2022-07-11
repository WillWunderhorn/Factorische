public class DailyLoop{
    public static void showInfo(){
        System.out.println(
                "--------------------------------------------------"
                        + "\n"
                        + "\n"
                        + "Day: " + Game.day + " | " + "efficiency: " + Game.efficiency + " | " + "manpower: " + Game.manpower + "\n"
                        + "\n"
                        + "Budget: " + Game.budget
                        + "\n" + "Rep_wrk: " + "[" + "▮".repeat((Game.rep_wrk)/10) + "▯".repeat(10-(Game.rep_wrk)/10) + "]"
                        + "\n" + "Rep_civ: " + "[" + "▮".repeat((Game.rep_civ)/10) + "▯".repeat(10-(Game.rep_civ)/10) + "]"
                        + "\n" + "Rep_civ: " + "[" + "▮".repeat((Game.rep_gov)/10) + "▯".repeat(10-(Game.rep_gov)/10) + "]"
                        + "\n"
        );
    }


    public static void dailyLoop(){
        Cards.addAllCards();
        System.out.println("All cards added");
        while (!GameOver.Over()){
            Game.day++;
            DailyLoop.showInfo();
            Cards.returnRandomCard();
//            System.out.println("deck" + Cards.deck);
            Game.budget -= 200;
        }
    }
}
