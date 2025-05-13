public class Conversor {

    /**
     * Convierte una cantidad en base a la tasa de cambio.
     * @param cantidad Monto en moneda origen.
     * @param tasaDestino Tasa de cambio de la moneda destino.
     * @return Resultado convertido.
     */
    public double convertir(double cantidad, double tasaDestino) {
        return cantidad * tasaDestino;
    }
}

