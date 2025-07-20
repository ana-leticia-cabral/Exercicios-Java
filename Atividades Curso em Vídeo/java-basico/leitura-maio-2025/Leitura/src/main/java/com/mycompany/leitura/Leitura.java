

package com.mycompany.leitura;

import java.util.Scanner;

public class Leitura {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        double salario;
        int idade;
        
        System.out.println("Informe seu salario: ");
        salario = teclado.nextDouble();
        
        System.out.println("Informe sua idade");
        idade = teclado.nextInt();
        
        System.out.printf("O salario informado foi: %.2f\n",salario);
        System.out.println("A idade informada foi: " + idade);
    }
}
