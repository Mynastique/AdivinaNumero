import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) {
        // título del juego
        System.out.println("~~~ Adivina el número del 1 al 100 ~~~");
        // Creación de la instancia random, donde el ordenador elige el número que adivinaremos
        Random r = new Random();
        // Generación del número aleatorio
        int objetivo = r.nextInt(101);
        // Chuleta para pruebas, mantener comentado
        // System.out.println(objetivo);
        //Iniciación del Scanner para la lectura del teclado
        Scanner s = new Scanner(System.in);
        //Iniciación de variable booleana para adivinar
        int contador = 0;
        // bucle para repetir hasta que se haya adivinado
        while (true) {
            //incremento del contador de iteraciones (nº de veces que se llama a la variable)
            contador++;
            // petición de número al usuario como entero
            System.out.println("Dime un número del 1 al 100: ");
            int numero = s.nextInt();
            // Evaluación
            if (numero < 1 || numero > 100) {
                System.err.println("¡Solo números entre 1 e 100!");
                continue;
            }
            if (numero == objetivo) {// numero acertado
                System.out.println("¡Bien! Era " + numero);
                break;
            } else if (numero < objetivo) { // Numero menor
                System.out.println("Mayor, mayor");
            } else { //numero mayor
                System.out.println("Menor, menor");
            } // esta cierra el if acierto/no acierto
        } // esta cierra el while
        // Al terminar se indica el número de intentos
        System.out.println("Lo has conseguido en " + contador + " intentos.");
        s.close();
    } // cierra el inicial de Adivina Numero
}