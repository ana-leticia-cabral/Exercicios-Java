// Código que cria uma classe chamada Caderno

package com.mycompany.atividade02caderno;


public class Caderno {
    
    int tamanho;
    int quantidadeFolha;
    String tipoFolha;
    String encadernamento;
    String capa;
    boolean aberto;
    boolean estaEscrevendo;
    boolean estaApagando;
    boolean estaLendo;
   
    
    
    
    void status(){
        
        System.out.println("Tamanho: " + this.tamanho + " cm" );
        System.out.println("Quantidade de folha: " + this.quantidadeFolha);
        System.out.println("Tipo de folha: " + this.tipoFolha);
        System.out.println("Encadernamento: " + this.encadernamento);
        System.out.println("Capa: " + this.capa);
        System.out.println("O caderno esta aberto? " + this.aberto);
        System.out.println("O caderno esta sendo escrito? " + this.estaEscrevendo);
        System.out.println("Tem alguem apagando algo nele? " + this.estaApagando);
        System.out.println("Ele esta sendo lido? " + this.estaLendo);
    }
    
    
    void abrir(){
        aberto = true;
    }
    
    
    void fechar(){
        aberto = false;
    }
    
    
    void escrever(){
        
        if (aberto == false){
            System.out.println("O caderno esta fechado. Nao e possivel escrever.");
            estaEscrevendo = false;
            
        } else {
            System.out.println("O caderno esta sendo escrito.");
            estaEscrevendo = true;
        }
    }
    
    
    void naoEscrever(){
        estaEscrevendo = false;
    }
    
    
    
    void apagar(){
        
        if (aberto == true){
           System.out.println("Apagando conteudo.");
           estaApagando = true; 
           
        } else {
           System.out.println("O caderno esta fechado. Nao e possivel apagar.");    
           estaApagando = false;
        }
        
    }
    
    
    void naoApagar(){
        estaApagando = false;
    }
    
    
    
    
    void lerConteudo(){
        
        if(aberto == true){
           System.out.println("Lendo conteudo.");
           estaLendo = true; 
           
        } else {
           System.out.println("O caderno esta fechado. Nao e possivel ler o conteudo.");
           estaLendo = false;
        }
       
    }
    
    
    void naoLer(){
        estaLendo = false;
    }
    
    
}
