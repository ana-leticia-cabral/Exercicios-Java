// Configurando visibilidade de atributos e métodos

package com.mycompany.aula02;


public class Aula02 {

    public static void main(String[] args) {
        
        
        Caneta c1 = new Caneta();
        
        c1.modelo = "Bic Cristal";
        c1.cor = "Azul";
     // c1.ponta = 0.5f; - ponta tem acesso privado. Vai dar erro.
        c1.carga = 80;
        c1.tampada = true;
        c1.status();
        
        
       
        
       
        
        
        
    }
}
