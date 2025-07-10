// Código que faz a formatação dos dados informados.
package controller;

public class Formatacao {
    public static String formatarNome(String nome) {
        String[] partes = nome.trim().toLowerCase().split("\\s+");
        StringBuilder formatado = new StringBuilder();

        for (String p : partes) {
            formatado.append(p.substring(0, 1).toUpperCase())
                    .append(p.substring(1))
                    .append(" ");
        }

        return formatado.toString().trim();
    }
    
}
