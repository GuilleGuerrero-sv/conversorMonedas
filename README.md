# 💱 Conversor de Monedas - Proyecto Java

Este proyecto es una aplicación de consola en Java que permite convertir entre distintas monedas usando datos actualizados desde la **ExchangeRate API**. El usuario puede ingresar una moneda de origen, una de destino y un monto, y el sistema le devuelve el valor convertido.

---

## 🚀 Funcionalidades

- Consulta en tiempo real del tipo de cambio.
- Conversión precisa entre monedas.
- Validación de códigos de moneda.
- Control de errores (API, entrada de datos, etc.).
- Menú interactivo y posibilidad de realizar múltiples conversiones.

---

## 🧱 Estructura del Proyecto

ConversorMonedas/
│
├── src/
│ ├── ConversorMonedas.java # Clase principal con el menú
│ ├── ApiService.java # Lógica para consultar la API
│ ├── JsonParserGson.java # Análisis y filtrado del JSON
│ ├── InterfazUsuario.java # Entrada/salida del usuario
│ └── Conversor.java # Lógica de conversión
│
├── README.md # Este archivo 😊



---

## 📦 Tecnologías utilizadas

- 🟦 Java 8+
- 📦 Gson (para procesar JSON)
- 🌐 [ExchangeRate API](https://www.exchangerate-api.com/)
- 💻 Consola

---

## ⚙️ Instrucciones de uso

1. **Clonar el repositorio**
   ```bash
   git clone https://github.com/tu-usuario/ConversorMonedas.git
   cd ConversorMonedas


🎬 Ejemplo de ejecución (simulado)

=== CONVERSOR DE MONEDAS ===
Ingrese el código de la moneda origen (ej. USD, EUR): USD
Ingrese el código de la moneda destino: EUR
Ingrese la cantidad a convertir: 50
50.0 USD equivale a 45.80 EUR
¿Deseas hacer otra conversión? (s/n): n
Gracias por usar el conversor de monedas. ¡Hasta pronto!
