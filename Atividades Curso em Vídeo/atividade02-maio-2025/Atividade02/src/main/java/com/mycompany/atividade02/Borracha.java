// Código que cria uma classe chamada Borracha

package com.mycompany.atividade02;

public class Borracha {
    
    String cor;
    float tamanho;
    float espessura;
    boolean estaApagando;
    
    void status(){
        System.out.println("Cor: " + this.cor);
        System.out.println("Tamanho " + this.tamanho);
        System.out.println("Espessura: " + this.espessura);
        System.out.println("A borracha esta apagando? " + this.estaApagando);
    }
    
    
    void apagar(){
        estaApagando = true;
       }
    
    void naoApagar(){
        estaApagando = false;
       }
    
    
    
    
}
