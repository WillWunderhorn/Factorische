package JsonParsing;

import JsonParsing.Requirements;
import JsonParsing.Results;

import java.util.List;

public class Options {
    private int id;
    private String description;
    private List<Options> options;
    private Requirements requirements;
    private Results results;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Options> getOptions() {
        return options;
    }

    public void setOptions(List<Options> options) {
        this.options = options;
    }

    public Requirements getRequirements() {
        return requirements;
    }

    public void setRequirements(Requirements requirements) {
        this.requirements = requirements;
    }

    public Results getResults() {
        return results;
    }

    public void setResults(Results results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return  " id=" + id + "\n" +
                " description: " + description + "\n" +
                " requirements: " + "\n" + requirements + "\n" +
                " results: " + "\n" + results + '\n';
    }
}
