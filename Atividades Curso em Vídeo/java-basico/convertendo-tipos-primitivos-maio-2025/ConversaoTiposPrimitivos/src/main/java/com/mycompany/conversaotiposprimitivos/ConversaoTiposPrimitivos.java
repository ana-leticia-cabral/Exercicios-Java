//Código para converter tipos primitivos
/*package com.mycompany.conversaotiposprimitivos;


public class ConversaoTiposPrimitivos {

    public static void main(String[] args) {
        int idade;
        String valor;
        
        idade = 30;
        valor = Integer.toString(idade);
        System.out.println(valor);
        
        
        
        
    }
}*/

package com.mycompany.conversaotiposprimitivos;

public class ConversaoTiposPrimitivos {

    public static void main(String[] args) {
       int idade;
       String valor;
        
        valor = "30";
        idade = Integer.parseInt(valor);
        System.out.println(idade);
    }
}