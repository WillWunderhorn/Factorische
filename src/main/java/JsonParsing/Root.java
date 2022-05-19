package JsonParsing;

import com.sun.jdi.Value;

import java.util.List;

public class Root {
    private int id;
    private List<Cards> cards;
    private List<Options> options;

    public void setOptions(List<Options> options) {
        this.options = options;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Cards> getCards() {
        return cards;
    }

    public List<Options> getOptions() {
        return options;
    }
    public void setCards(List<Cards> cards) {
        this.cards = cards;
    }

    @Override
    public String toString() {
        return String.valueOf(cards.get((int) (Math.random()*cards.size())));
    }
}
