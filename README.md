<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Conversor de Monedas en Java</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #f4f4f9;
            color: #333;
            line-height: 1.6;
            padding: 20px;
            max-width: 900px;
            margin: auto;
        }
        h1, h2 {
            color: #2c3e50;
        }
        code {
            background-color: #eaeaea;
            padding: 2px 5px;
            border-radius: 3px;
        }
        pre {
            background-color: #eee;
            padding: 15px;
            border-left: 5px solid #2c3e50;
            overflow-x: auto;
        }
        ul {
            list-style-type: square;
            padding-left: 20px;
        }
        .section {
            margin-bottom: 30px;
        }
    </style>
</head>
<body>
    <h1>💱 Conversor de Monedas en Java</h1>
    <p>Aplicación de consola que permite convertir monedas en tiempo real usando la API de <a href="https://www.exchangerate-api.com/" target="_blank">ExchangeRate API</a>.</p>
    
    <div class="section">
        <h2>🚀 Características</h2>
        <ul>
            <li>Conversión en tiempo real</li>
            <li>Validación de entradas</li>
            <li>Menú interactivo</li>
            <li>Uso de GSON para analizar JSON</li>
        </ul>
    </div>

    <div class="section">
        <h2>🧰 Tecnologías Usadas</h2>
        <ul>
            <li>Java 17+</li>
            <li>Gson</li>
            <li>ExchangeRate API</li>
        </ul>
    </div>

    <div class="section">
        <h2>📦 Estructura del Proyecto</h2>
        <pre><code>ConversorMonedas/
├── src/
│   ├── ConversorMonedas.java
│   ├── ApiService.java
│   ├── JsonParserGson.java (opcional)
│   ├── InterfazUsuario.java
│   └── Conversor.java
└── README.html</code></pre>
    </div>

    <div class="section">
        <h2>⚙️ Cómo usarlo</h2>
        <ol>
            <li>Clona el repositorio</li>
            <li>Configura Java y Gson</li>
            <li>Consigue una API Key en <a href="https://app.exchangerate-api.com/sign-up" target="_blank">ExchangeRate API</a></li>
            <li>Coloca tu API Key en <code>ApiService.java</code></li>
            <li>Ejecuta el programa desde consola</li>
        </ol>
    </div>

    <div class="section">
        <h2>🖥️ Ejemplo de uso</h2>
        <pre><code>=== CONVERSOR DE MONEDAS ===
Ingrese el código de la moneda origen (ej. USD): USD
Ingrese el código de la moneda destino (ej. EUR): EUR
Ingrese la cantidad a convertir: 100
100.00 USD equivale a 92.45 EUR
¿Deseas hacer otra conversión? (s/n): n
Gracias por usar el conversor de monedas. ¡Hasta pronto!</code></pre>
    </div>

    <div class="section">
        <h2>✨ Futuras mejoras</h2>
        <ul>
            <li>Interfaz gráfica con JavaFX</li>
            <li>Historial de conversiones</li>
            <li>Modo offline</li>
        </ul>
    </div>

    <div class="section">
        <h2>👨‍💻 Autor</h2>
        <p>Desarrollado por: <strong>Tu Nombre</strong><br>Universidad Don Bosco</p>
    </div>
</body>
</html>
