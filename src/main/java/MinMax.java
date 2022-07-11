public class MinMax {
    public static void checkMinMax(){

        if (Game.rep_wrk > 100){
            Game.rep_wrk = 100;
        }

        if (Game.rep_gov > 100){
            Game.rep_gov = 100;
        }

        if (Game.rep_civ > 100){
            Game.rep_civ = 100;
        }
    }
}
