import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        // Clase para ingresar datos
        Scanner scanner = new Scanner(System.in);

        // Declaraciones y asignaciones    
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // Arreglo para mostrar letras adivinadas
        char[] letrasAdivinadas = new char[palabraSecreta.length()];
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        // Bucle principal del juego
        while (!palabraAdivinada && intentos < intentosMaximos) {
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas));
            System.out.println("Introduce una letra, por favor:");

            char letra = scanner.next().charAt(0);
            boolean letraCorrecta = false;

            // Verifica si la letra está en la palabra
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }

            if (!letraCorrecta) {
                intentos++;
                System.out.println("¡Incorrecto! Te quedan " + (intentosMaximos - intentos) + " intentos.");
            }

            // Verifica si ya se adivinó toda la palabra
            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("¡Felicidades, has adivinado la palabra secreta: " + palabraSecreta + "!");
            }
        }

        // Si no se adivinó la palabra
        if (!palabraAdivinada) {
            System.out.println("¡Qué pena, te has quedado sin intentos! GAME OVER.");
        }

        scanner.close();
    }
}
