//Código que coloca em prática o uso da classe ControleRemoto
package com.mycompany.aula06;

public class Aula06 {

    public static void main(String[] args) {
        ControleRemoto cr1 = new ControleRemoto(50, false, false);
        cr1.ligar();
        cr1.maisVolume();
        cr1.abrirMenu();
        cr1.fecharMenu();
        
    }
}
