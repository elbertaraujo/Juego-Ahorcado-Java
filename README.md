# Juego del Ahorcado en Java 🧠🎮

Este proyecto es una implementación básica del clásico **juego del ahorcado** utilizando el lenguaje de programación **Java**. El jugador debe adivinar una palabra secreta letra por letra, con un número limitado de intentos.

## 📋 Descripción

El juego selecciona una palabra secreta (por defecto: `inteligencia`) y el jugador tiene hasta **10 intentos** para adivinarla. En cada turno, se muestra el progreso actual y se solicita al jugador que introduzca una letra. Si adivina correctamente, la letra se revela en su posición correspondiente. Si falla, pierde un intento.

El juego termina cuando:
- Se adivina toda la palabra correctamente ✅
- Se agotan los intentos ❌

## 🛠️ Tecnologías utilizadas

- Java (probado con JDK 24)
- IDE recomendada: Visual Studio Code, IntelliJ IDEA, Eclipse, etc.
- Entrada por consola (clase `Scanner`)

> ⚠️ Se recomienda usar Java 17 o superior para aprovechar mejoras del lenguaje y mantener compatibilidad con versiones modernas.

## ▶️ Cómo ejecutar

1. Asegúrate de tener Java instalado en tu sistema. Puedes verificarlo con:
   ```bash
   java -version
