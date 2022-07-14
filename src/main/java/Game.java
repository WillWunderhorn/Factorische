public class Game {
    private static Game game;
    public static int day;
    public static int budget;
    public static int rep_wrk;
    public static int rep_civ;
    public static int rep_gov;
    public static int efficiency;
    public static int manpower;
    public static Menu.weather weather;

    public static final String ANSI_RED = "\u001B[31m";
    public static final String GREEN_BRIGHT = "\033[0;92m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static synchronized Game getGame() {
        if(game == null){
            DailyLoop.setEfficiency();
            game = new Game(0, 1000, 50, 50,50, efficiency, manpower);
        }
        return game;
    }



    public Game(int day, int budget, int rep_wrk, int rep_civ, int rep_gov, int efficiency, int manpower) {
        this.day = day;
        this.budget = budget;
        this.rep_wrk = rep_wrk;
        this.rep_civ = rep_civ;
        this.rep_gov = rep_gov;
        this.efficiency = 0;
        this.manpower = 0;
    }

    public void start() throws InterruptedException {
        DailyLoop.dailyLoop();

    }
    public static int getBudget() {
        return budget;
    }
    public static int getDay() {
        return day;
    }
    public int getRep_wrk() {
        return rep_wrk;
    }
    public static int getRep_civ() {
        return rep_civ;
    }
    public int getRep_gov() {
        return rep_gov;
    }
    public int getEfficiency() {
        return efficiency;
    }
    public int getManpower() {
        return manpower;
    }
    public static void setBudget(int budget) {
        Game.budget = budget;
    }

}