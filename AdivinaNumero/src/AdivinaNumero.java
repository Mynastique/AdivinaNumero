import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) {
        // título del juego
        System.out.println("~~~ Adivina el número del 1 al 100 ~~~");
        // Creación de la instancia random, donde el ordenador elige el número que adivinaremos
        Random r = new Random();
        // Generación del número aleatorio
        int objetivo = r.nextInt(100);
        // Chuleta para pruebas, mantener comentado
    // System.out.println(objetivo);
        //Iniciación del Scanner para la lectura del teclado
        Scanner s = new Scanner(System.in);
        //Iniciación de variable booleana para adivinar
        boolean adivinado = false;
        int contador = 0;
        // bucle para repetir hasta que se haya adivinado
        while (!adivinado) {
            //incremento del contador de iteraciones (nº de veces que se llama a la variable)
            contador++;
            // petición de número al usuario como entero
            System.out.println("Dime un número del 1 al 100: ");
            int numero = s.nextInt();

            // Evaluación
            if (numero == objetivo) { // acierto
                adivinado = true;
                System.out.println("¡Bien! Era " + numero);
            } else { // Numero menor
                if (numero < objetivo) {
                    System.out.println("Mayor, mayor");
                } else if (numero > objetivo) { //numero mayor
                    System.out.println("Menor, menor");
                } // esta llave cierra el if mayor/menor

            } // esta cierra el if acierto/no acierto
        } // esta cierra el while
        // Al terminar se indica el número de intentos
        System.out.println("Lo has conseguido en " + contador + " intentos.");
        s.close();
    } // cierra el inicial de Adivina Numero
}