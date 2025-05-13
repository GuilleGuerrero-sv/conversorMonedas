import com.google.gson.JsonObject;

public class JsonParserGson {

    public void extraerYMostrarTasas(JsonObject datos) {
        try {
            if (datos.get("result").getAsString().equals("success")) {
                JsonObject tasas = datos.getAsJsonObject("conversion_rates");

                // Monedas comunes para mostrar al usuario
                String[] monedas = {"EUR", "MXN", "JPY", "BRL", "COP"};

                System.out.println("Tasas de cambio respecto al USD:");
                for (String moneda : monedas) {
                    double tasa = tasas.get(moneda).getAsDouble();
                    System.out.println("1 USD = " + tasa + " " + moneda);
                }
            } else {
                System.out.println("Respuesta inválida de la API.");
            }
        } catch (Exception e) {
            System.out.println("Error al analizar el JSON: " + e.getMessage());
        }
    }
}

