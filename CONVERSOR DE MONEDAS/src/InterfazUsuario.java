import com.google.gson.JsonObject;
import java.util.Scanner;

public class InterfazUsuario {
    private final Scanner scanner = new Scanner(System.in);

    public String leerMoneda(String tipo, JsonObject tasas) {
        String codigo;
        while (true) {
            System.out.print("Ingrese el código de la moneda " + tipo + " (ej. USD, ARS, BOB, BRL, CLP, COP): ");
            codigo = scanner.nextLine().toUpperCase();
            if (tasas.has(codigo)) {
                break;
            } else {
                System.out.println("⚠ Código de moneda inválido. Intente nuevamente.");
            }
        }
        return codigo;
    }

    public double leerCantidad() {
        double cantidad = 0;
        boolean valido = false;
        while (!valido) {
            System.out.print("Ingrese la cantidad a convertir: ");
            try {
                cantidad = Double.parseDouble(scanner.nextLine());
                if (cantidad > 0) {
                    valido = true;
                } else {
                    System.out.println("⚠ La cantidad debe ser mayor que cero.");
                }
            } catch (NumberFormatException e) {
                System.out.println("⚠ Entrada inválida. Ingrese un número válido.");
            }
        }
        return cantidad;
    }

    public void mostrarResultado(double cantidadOriginal, String monedaOrigen,
                                 double resultado, String monedaDestino) {
        System.out.printf("%.2f %s equivale a %.2f %s%n", cantidadOriginal, monedaOrigen, resultado, monedaDestino);
    }
}
