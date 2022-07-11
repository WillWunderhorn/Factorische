import java.util.Random;

public class DailyLoop{
    static Random rnd = new Random(System.currentTimeMillis());
    public static void showInfo(){
        System.out.println(
                "--------------------------------------------------"
                        + "\n"
                        + "\n"
                        + "Day: " + Game.day + " | " + "efficiency: " + Game.efficiency + "%" + " | " + "manpower: "  + Game.manpower + "%" + "\n"
                        + "\n"
                        + "Budget: " + Game.budget
                        + "\n" + "Rep_wrk: " + "[" + "▮".repeat((Game.rep_wrk)/10) + "▯".repeat(10-(Game.rep_wrk)/10) + "]"
                        + "\n" + "Rep_civ: " + "[" + "▮".repeat((Game.rep_civ)/10) + "▯".repeat(10-(Game.rep_civ)/10) + "]"
                        + "\n" + "Rep_civ: " + "[" + "▮".repeat((Game.rep_gov)/10) + "▯".repeat(10-(Game.rep_gov)/10) + "]"
                        + "\n"
        );
    }

    public static void setManpower(){
        int randomManpower = -13 + rnd.nextInt( 2 - (-13) + 1);
        Game.manpower = (50 + (Game.rep_wrk / 2) + randomManpower);
        if (Game.manpower > 100){
            Game.manpower = 100;
        }
    }

    public static void setEfficiency(){
        int randomEfficiency = -4 + rnd.nextInt(4 - (-4) + 1);
        Game.efficiency = (Game.rep_wrk + randomEfficiency);
        if (Game.efficiency > 100){
            Game.efficiency = 100;
        }
        DailyLoop.setManpower();
    }

    public static void getRevenue(){
        int randomRevenue = 46 + rnd.nextInt(68 - 46 + 1);
        int rev = (Game.efficiency + randomRevenue + (Game.rep_wrk / 2) + (Game.day));
        Game.budget += 0;
        System.out.println("Revenue: " + rev);
        DailyLoop.setEfficiency();
    }


    public static void dailyLoop(){
        Cards.addAllCards();
        System.out.println("All cards added");
        while (!GameOver.Over()){
            Game.day++;
            MinMax.checkMinMax();
            DailyLoop.showInfo();
            DailyLoop.getRevenue();
            Cards.returnRandomCard();
//            System.out.println("deck" + Cards.deck);
//            Game.budget -= 200;

        }
    }
}
