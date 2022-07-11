public class Game {
    private static Game game;
    public static int day;
    public static int budget;
    public static int rep_wrk;
    public static int rep_civ;
    public static int rep_gov;
    public static int efficiency;
    public static int manpower;

    public static synchronized Game getGame(){
        if(game == null){
            game = new Game(0, 100000, 50, 50,50, 50, 100);
        }
        return game;
    }

    public Game(int day, int budget, int rep_wrk, int rep_civ, int rep_gov, int efficiency, int manpower) {
        this.day = day;
        this.budget = budget;
        this.rep_wrk = rep_wrk;
        this.rep_civ = rep_civ;
        this.rep_gov = rep_gov;
        this.efficiency = efficiency;
        this.manpower = manpower;
    }

    public void start(){
        DailyLoop.dailyLoop();

    }
    public static int getBudget() {
        return budget;
    }
    public int getDay() {
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