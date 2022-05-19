package JsonParsing;

public class Stats {
    private int budget;

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return " budget: " + budget;
    }
}
