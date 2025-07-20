

package com.mycompany.aula02;


public class Aula02 {

    public static void main(String[] args) {
        
        //instanciando um objeto - criando um objeto a partir de uma classe
        Caneta c1 = new Caneta();
        Caneta c2 = new Caneta();
       
        
        c1.modelo = "Bic";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 50;
        
        // objeto c1 chamou os métodos status() e tampar()
        c1.destampar();
        c1.status();
        c1.rabiscar();
        
        
        
        c2.modelo = "Bic";
        c2.cor = "Vermelho";
        c2.ponta = 1.0f;
        c2.carga = 0;
        
        c2.tampar();
        c2.status();
        c2.rabiscar();
        
        
        
        
    }
}
