// Código para mostrar o idioma do sistema

package com.mycompany.idiomasistema;

import java.util.Locale;

public class IdiomaSistema {

    public static void main(String[] args) {
        Locale local = Locale.getDefault();
        System.out.print("O idioma do sistema é: "); 
        System.out.print(local.getDisplayLanguage());
        System.out.print(local.toString());
    }
}
