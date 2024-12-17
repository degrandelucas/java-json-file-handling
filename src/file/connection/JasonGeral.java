package file.connection;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

public class JasonGeral {

    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static String conversionToJson(List list) {
        return gson.toJson(list);
    }
}
