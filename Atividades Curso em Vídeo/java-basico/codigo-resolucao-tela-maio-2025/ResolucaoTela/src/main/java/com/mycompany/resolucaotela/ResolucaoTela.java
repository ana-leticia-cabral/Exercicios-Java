// Código para mostrar a resolução da tela do sistema

package com.mycompany.resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela {

    public static void main(String[] args) {
        Dimension tamanhoTela = Toolkit.getDefaultToolkit().getScreenSize();
        
        System.out.println("A resolução da tela é: ");
        System.out.println(tamanhoTela.getWidth() + " x " + tamanhoTela.getHeight());
       
       
    }
}
