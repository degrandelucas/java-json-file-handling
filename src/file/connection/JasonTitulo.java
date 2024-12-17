package file.connection;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import file.models.Titulo;

import java.awt.*;

public class JasonTitulo {

    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static String toJson(List list) {
        return gson.toJson(list);
    }
}
