package JsonParsing;

public class Results {
    private Stats_delta stats_delta;

    public Results(Stats_delta stats_delta) {
        this.stats_delta = stats_delta;
    }

    public Stats_delta getStats_delta() {
        return stats_delta;
    }

    public void setStats_delta(Stats_delta stats_delta) {
        this.stats_delta = stats_delta;
    }

    @Override
    public String toString() {
        return " stats_delta: " + stats_delta;
    }
}

