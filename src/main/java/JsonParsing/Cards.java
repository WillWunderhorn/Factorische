package JsonParsing;

import java.util.ArrayList;
import java.util.List;

public class Cards {
    private int id;
    private static String description;
    private String rarity;
    private String category;
    private boolean isActive;
    private boolean isQueued;
    private boolean isDisposable;
    private List<Options>  options;

    private ArrayList commonCards = new ArrayList();

    public Cards(int id, String description, String rarity, String category, boolean isActive, boolean isQueued, boolean isDisposable, Options options) {
        this.id = id;
        this.description = description;
        this.rarity = rarity;
        this.category = category;
        this.isActive = isActive;
        this.isQueued = isQueued;
        this.isDisposable = isDisposable;
        this.options = (List<Options>) options;

    }

    public int getId() {
        return id;
    }

    public static String getDescription() {
        return description;
    }

    public String getRarity() {
        return rarity;
    }

    public String getCategory() {
        return category;
    }

    public boolean isActive() {
        return isActive;
    }

    public boolean isQueued() {
        return isQueued;
    }

    public boolean isDisposable() {
        return isDisposable;
    }

    public Options getOptions() {
        return (Options) options;
    }



    @Override
    public String toString() {
        return  " id=" + id + '\n' +
                " description: " + description + '\n' +
                " rarity=" + rarity + '\n' +
                " category=" + category + '\n' +
                " isActive=" + isActive + '\n' +
                " isQueued=" + isQueued +'\n' +
                " isDisposable=" + isDisposable + '\n' +
                "\n" +
                " options: " + "\n" + options + '\n';
    }
}
