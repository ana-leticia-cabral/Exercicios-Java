// Código responsável por validar as entradas do usuário.
package controller;

import model.SexoPessoa;

public class Validacao {

// Número inteiro
    public static boolean validarInt(String i) {
        if (i == null || i.trim().isEmpty()) {
            return false;
        }
        try {
            Integer.valueOf(i);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
// NOME
    public static boolean validarNome(String n) {
        return n != null && !n.trim().isEmpty() && n.trim().matches("[a-zA-ZÀ-ÿ ]+");
    }
     

// SEXO
    public static boolean validarSexo(String s){
        try {
            SexoPessoa.valueOf(s.toUpperCase());
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }
}
