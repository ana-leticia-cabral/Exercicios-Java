// Código que chama os atributos e métodos da classe Caderno

package com.mycompany.atividade02caderno;


public class Atividade02Caderno {

    public static void main(String[] args) {
        
        Caderno c1 = new Caderno ();
        
        c1.tamanho = 20;
        c1.quantidadeFolha = 200;
        c1.tipoFolha = "Pautado";
        c1.encadernamento = "Espiral";
        c1.capa = "Imagem Harry Potter";
        
        
        
        c1.fechar();
        c1.escrever();
        c1.apagar();
        c1.lerConteudo();
        
        System.out.println("------ Status do Caderno ------");
        c1.status();
        
    }
}
