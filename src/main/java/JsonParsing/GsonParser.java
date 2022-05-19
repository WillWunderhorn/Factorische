package JsonParsing;

import com.google.gson.Gson;

import java.io.FileReader;

public class GsonParser {

    public Root parse() {

        Gson gson = new Gson();

        try(FileReader reader = new FileReader("src/main/java/JSON/cards.json")){

            Root root = gson.fromJson(reader, Root.class);
            return root;
        }catch (Exception e){
            System.out.println("PARSING ERROR " + e.toString());
        }
        return null;
    }
}
