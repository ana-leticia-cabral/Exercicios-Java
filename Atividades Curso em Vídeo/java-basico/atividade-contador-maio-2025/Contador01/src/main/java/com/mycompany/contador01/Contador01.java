// Código que cria um contador

package com.mycompany.contador01;

public class Contador01 {

    public static void main(String[] args) {
        int cc;
        cc  = 0;
        
        while (cc < 20) {
            
            cc ++;
            if (cc == 2 || cc == 3 || cc == 4) {
                continue;   
            }
            if (cc == 7){
                break;
            }
            System.out.println("Cambalhota" + cc
            );
            
            
        }
    }
}
