package registrodeboda;

import java.util.Scanner;

/**
 *
 * @author maryse
 *
 * While
 * Programa RegistroDeBoda con un ciclo while y una terminación por petición del usuario.
 * Este programa solicita los registros para regalos en una boda.
 *
 */

public class RegistroDeBoda {

    Scanner stdIn = new Scanner(System.in);
    String registro = "";

    public void Boda()
    {
        char mas;
        System.out.print("¿Desea crear una lista de registro de bodas? (s/n): ");
        mas = stdIn.nextLine().charAt(0);
        while (mas == 's') {
            System.out.print("Introduzca el nombre del artículo: ");
            registro += stdIn.nextLine() + " - ";
            System.out.print("Tienda: ");
            registro += stdIn.nextLine() + "\n";
            System.out.print("¿Algún otro artículo? (s/n): ");
            mas = stdIn.nextLine().charAt(0);
        } // fin del while
        if (!registro.equals("")) {
            System.out.println("\nRegistro de bodas:\n" + registro);
        } //fin del if
    } //fin del metodo Boda.

    public static void main(String[] args) {

        RegistroDeBoda rune = new RegistroDeBoda();
        rune.Boda();
        
    } // fin del main
} // fin de la clase RegistroDeBoda
