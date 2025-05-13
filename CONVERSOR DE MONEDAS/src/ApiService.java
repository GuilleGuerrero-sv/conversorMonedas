import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiService {
    private final String apiKey = "85abe333243f01975ddd9952"; //

    public JsonObject obtenerDatos(String baseCurrency) {
        try {
            String urlStr = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + baseCurrency;
            URL url = new URL(urlStr);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.connect();

            return JsonParser.parseReader(new InputStreamReader(connection.getInputStream()))
                    .getAsJsonObject();
        } catch (Exception e) {
            System.out.println("Error al conectarse a la API: " + e.getMessage());
            return null;
        }
    }
}
