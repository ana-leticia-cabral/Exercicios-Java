// Código que faz a validação das entradas do usuário.
package controller;

import model.NacionalidadeLutador;
import model.GeneroLutador;

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

// float
    public static boolean validarFloat(String f) {
        if (f == null || f.trim().isEmpty()) {
            return false;
        }
        try {
            Float.valueOf(f);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

// NOME
    public static boolean validarNome(String n) {
        return n != null && !n.trim().isEmpty() && n.trim().matches("[a-zA-ZÀ-ÿ ]+");
    }

// GÊNERO
    public static boolean validarGenero(String g) {
        if (g == null || g.trim().isEmpty()) {
            return false;
        }
        try {
            GeneroLutador.valueOf(g.toUpperCase());
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

// NACIONALIDADE
    public static boolean validarNacionalidade(String n) {
        if (n == null || n.trim().isEmpty()) {
            return false;
        }
        try {
            NacionalidadeLutador.valueOf(n.toUpperCase());
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

// ALTURA
    public static boolean validarAltura(float a) {
        return a >= 1.40f && a <= 2.7f;
    }

// PESO
    public static boolean validarPeso(float p) {
        return p >= 50f && p <= 120.2f;
    }

}
