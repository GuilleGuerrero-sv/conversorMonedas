import com.google.gson.JsonObject;
import java.util.Scanner;

public class ConversorMonedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InterfazUsuario interfaz = new InterfazUsuario();
        ApiService apiService = new ApiService();
        Conversor conversor = new Conversor();

        boolean continuar = true;

        System.out.println("=== CONVERSOR DE MONEDAS ===");

        while (continuar) {
            // 1. Obtener lista de tasas (por defecto usando USD como base)
            JsonObject datos = apiService.obtenerDatos("USD");

            if (datos != null && datos.get("result").getAsString().equals("success")) {
                JsonObject tasas = datos.getAsJsonObject("conversion_rates");

                // 2. Leer moneda origen y destino (con validación)
                String monedaOrigen = interfaz.leerMoneda("origen", tasas);
                String monedaDestino = interfaz.leerMoneda("destino", tasas);

                // 3. Leer cantidad (con validación)
                double cantidad = interfaz.leerCantidad();

                // 4. Obtener tasas actualizadas desde la moneda origen seleccionada
                JsonObject datosActualizados = apiService.obtenerDatos(monedaOrigen);

                if (datosActualizados != null && datosActualizados.get("result").getAsString().equals("success")) {
                    JsonObject tasasActualizadas = datosActualizados.getAsJsonObject("conversion_rates");

                    double tasaDestino = tasasActualizadas.get(monedaDestino).getAsDouble();

                    // 5. Convertir y mostrar resultado
                    double resultado = conversor.convertir(cantidad, tasaDestino);
                    interfaz.mostrarResultado(cantidad, monedaOrigen, resultado, monedaDestino);
                } else {
                    System.out.println("⚠ No se pudo obtener información actualizada desde la API.");
                }
            } else {
                System.out.println("⚠ No se pudo obtener la lista de monedas disponibles.");
            }

            // 6. Preguntar si desea continuar
                        System.out.print("¿Deseas hacer otra conversión? (s/n): ");
            String opcion = scanner.nextLine().toLowerCase();
            if (!opcion.equals("s")) {
                continuar = false;
                System.out.println("Gracias por usar el conversor de monedas. ¡Hasta pronto!");
            }

        }
    }
}
