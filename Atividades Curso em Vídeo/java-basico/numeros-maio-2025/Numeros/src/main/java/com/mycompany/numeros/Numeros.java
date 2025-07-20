

package com.mycompany.numeros;

import java.util.Scanner;

public class Numeros {

    public static void main(String[] args) {
        int numero, soma;
        String resp;
        
        numero =0;
        soma = 0;
        
        Scanner teclado = new Scanner (System.in);
        
        
        do {
            System.out.println("Digite um número");  
            numero = teclado.nextInt();
            soma += numero;
            System.out.println("Quer Continuar?[S/N]");
            resp = teclado.next();
        } while (resp.equals("S"));
        System.out.println("A soma de todos os valores eh: " + soma);
        
    }
           
}
