// Código que cria uma classe caneta e que cria seus métodos acessores, modificadores e construtor

package com.mycompany.aula04;


public class Caneta {
   private String modelo;
   private float ponta;
   private String cor;
   private boolean tampada;
   
   
    public Caneta(String m, String c, float p){
     this.setModelo(m);
     this.setCor(c);
     this.setPonta(p);
     this.tampar();
     
  }
   
   
   
   
   
   public String getCor(){
       return this.cor;
   }
   
   public void setCor(String c){
       this.cor = c;
   }
   
   
   
   
   
   public String getModelo(){
       return this.modelo;
   }
   
   public void setModelo(String m){
       this.modelo = m;
   }
   
   
   
   
   
   public float getPonta(){
       return this.ponta;
   }
   
   public void setPonta(float p){
       this.ponta = p;
   }
   
   
   
 
   public void tampar(){
       this.tampada = true;
   }
   public void destampar(){
       this.tampada = false;
   }
   
   
   
   public boolean getTampada(){
       return this.tampada;
   }
  
  
   
   public void status(){
       System.out.println("Modelo: " + this.getModelo());
       System.out.println("Ponta: " + this.getPonta());
       System.out.println("Cor: " + this.getCor());
       System.out.println("Tampada: " + this.getTampada());
   }
}


  