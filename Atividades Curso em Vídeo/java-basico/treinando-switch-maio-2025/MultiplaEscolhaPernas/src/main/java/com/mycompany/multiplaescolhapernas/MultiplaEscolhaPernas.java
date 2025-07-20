// Código para exemplificar o uso do Switch

package com.mycompany.multiplaescolhapernas;

import java.util.Scanner;

public class MultiplaEscolhaPernas {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        int pernas;
        String tipo;
        
        System.out.println("Digite a quantidade de pernas: ");
        pernas = teclado.nextInt();
        
        System.out.print("Essa quantidade de pernas indica que e um(a): ");
        
        switch (pernas){
            case 1: 
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6,8:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
        }
        System.out.println(tipo);
    }
}
