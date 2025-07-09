// Classe responsável pela Leitura.
package controller;

import java.util.Scanner;

public class Leitura {

    private static final Scanner teclado = new Scanner(System.in);

    public static String lerString() {
        return teclado.nextLine();
    }
}
