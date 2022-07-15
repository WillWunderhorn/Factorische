import java.util.Random;
import java.util.concurrent.TimeUnit;

public class DailyLoop{
    static Random rnd = new Random(System.currentTimeMillis());
    public static void showInfo(){
        if(Game.day == 1){
            System.out.println("Day: " + Game.day + " | " + "efficiency: ???" + " | " + "manpower: ???\n");

            System.out.println(
                              "Rep_wrk: " + "[" + "▮".repeat((Game.rep_wrk)/10) + "▯".repeat(10-(Game.rep_wrk)/10) + "]"
                            + "\n" + "Rep_civ: " + "[" + "▮".repeat((Game.rep_civ)/10) + "▯".repeat(10-(Game.rep_civ)/10) + "]"
                            + "\n" + "Rep_civ: " + "[" + "▮".repeat((Game.rep_gov)/10) + "▯".repeat(10-(Game.rep_gov)/10) + "]"
                            + "\n"
            );
        }
        else if(Game.day != 0){
            System.out.println(
                    "--------------------------------------------------"
                            + "\n"
                            + "Day: " + Game.day + " | " + "efficiency: " + Game.efficiency + "%" + " | " + "manpower: "  + Game.manpower + "%"
            );
            System.out.println(
                    "\n" + "Rep_wrk: " + "[" + "▮".repeat((Game.rep_wrk)/10) + "▯".repeat(10-(Game.rep_wrk)/10) + "]"
                            + "\n" + "Rep_civ: " + "[" + "▮".repeat((Game.rep_civ)/10) + "▯".repeat(10-(Game.rep_civ)/10) + "]"
                            + "\n" + "Rep_civ: " + "[" + "▮".repeat((Game.rep_gov)/10) + "▯".repeat(10-(Game.rep_gov)/10) + "]"
                            + "\n"
            );
        }
    }

    public static void setManpower(){
        int randomManpower = -13 + rnd.nextInt( 2 - (-13) + 1);
        Game.manpower = (Game.rep_wrk) + randomManpower;
        MinMax.checkEffManMinMax();
    }

    public static void setEfficiency(){
        int randomEfficiency = -4 + rnd.nextInt(7 - (-4) + 1);
        Game.efficiency = (Game.manpower/2 + (Game.rep_wrk + randomEfficiency)/2);
        MinMax.checkEffManMinMax();
        DailyLoop.setManpower();
    }

    public static void getRevenue(){
        int randomRevenue = 46 + rnd.nextInt(68 - 46 + 1);
        int rev = (Game.efficiency + randomRevenue + (Game.rep_wrk / 2) + (Game.day));
        Game.budget += rev;
        System.out.println("Заработано за сегодня: " + rev);
        System.out.println("Общий бюджет: " + Game.budget + "\n");
        int totalRev = Game.budget += rev;
        DailyLoop.setEfficiency();
    }


    public static void dailyLoop() throws InterruptedException {
        Cards.addAllCards();
        while (!GameOver.Over()){
//            TimeUnit.MILLISECONDS.sleep(500);
            Game.day++;
            MinMax.checkMinMax();
            DailyLoop.showInfo();
            DailyLoop.getRevenue();
            Cards.returnRandomCard();
        }
    }
}
