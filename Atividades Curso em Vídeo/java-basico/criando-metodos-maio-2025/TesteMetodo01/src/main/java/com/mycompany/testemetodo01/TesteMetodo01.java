
package com.mycompany.testemetodo01;


public class TesteMetodo01 {

    static int soma(int a, int b){
        int s = a + b;
        return s;
    }
    
    public static void main(String[] args) {
        int soma = soma(10,2);
        System.out.println ("A soma dos valores é: " + soma);
    }
}
