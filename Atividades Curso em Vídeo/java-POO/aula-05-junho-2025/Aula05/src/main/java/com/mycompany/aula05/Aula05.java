

package com.mycompany.aula05;


public class Aula05 {

    public static void main(String[] args) {
      ContaBanco p1 = new ContaBanco();
      
     
     
      p1.abrirConta("cp", "Joana");
      p1.depositar(500);
      p1.sacar(1000);
      p1.fecharConta();
      
      p1.estadoAtual();
      
      
    }
}
