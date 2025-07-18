// Código que chama os atributos e métodos da classe Borracha

package com.mycompany.atividade02;

public class Atividade02 {

    public static void main(String[] args) {
       
        Borracha b1 = new Borracha() ;
        
            b1.cor = "Branco";
            b1.tamanho = 3.5f;
            b1.espessura = 1.7f;
        
            b1.apagar();
            b1.status();
        
        Borracha b2 = new Borracha();
            
            b2.cor = "Verde";
            b2.tamanho = 2.0f;
            b2.espessura = 3.2f;
            
            b2.naoApagar();
            b2.status();
            
        
        
       
    }
}




