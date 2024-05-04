import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Introducir un número en base10 para calcular su binario

        int dividendo = 0;
        int cociente = 0;
        int resto = 0;
        String cadena = "";
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca un número: ");
        dividendo = entrada.nextInt();

        // El primer dividendo entra por consola, por lo que se ejecuta directamente la operación.

        do {
           /*
           Se establece directamente en 2 el valor del divisor ya que el propio enunciado indica que es una
           traducción a número binario.
           En el caso de que hubiera que elegir entre distintas bases, crearíamos una variable "base",
           solicitar el tipo de base al usuario y actualizar las fórmulas:
           P. ejemplo: cociente = dividendo / base; resto = dividendo % base.
           En el caso de la condición de parada también se actualizaría:
           p. ejemplo: while (cociente >= base)
            */

            cociente = dividendo / 2;
            resto = dividendo % 2;

            /*
            Para poder organizar los valores en el orden necesario (de atrás a adelante), guardamos
            los valores de resto generados en una cadena pero, en vez de ir añadiéndolos al final de la misma,
            los añadimos al principio y vamos concatenando con los que ya estaban incluidos en ella.
             */
            cadena = resto + cadena;

            /*
            En la primera operación, el valor de "dividendo" entra por consola. A partir de la segunda
            iteración es el valor de "cociente" quien ocupa la posición de "dividendo", por lo que se
            actualiza la asignación de valores en cada ejecución del bucle y sobrescribe el valor anterior.
             */
            dividendo = cociente;
        } while (cociente >= 2);
        /*
        Dado que el bucle acaba puesto que el último cociente generado no cumple la condición (es menor de 2),
        debemos incluirlo como parte del resultado.
         */
        cadena = cociente + cadena;

        System.out.println("El número introducido en base2 es: " + cadena);



    }
}