package JsonParsing;

import JsonParsing.Stats;

public class Requirements {
    private Stats stats;

    public Requirements(Stats stats) {
        this.stats = stats;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    @Override
    public String toString() {
        return " stats: " + "\n" + stats;
    }
}
