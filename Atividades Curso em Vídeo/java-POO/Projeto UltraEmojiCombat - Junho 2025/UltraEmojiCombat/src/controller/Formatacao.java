// Código que faz a formatação do NOME informado.
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
    
    public static String formatarGenero(String genero) {
        if(genero.equals("M")){
            return "Masculino";
        } else {
            return "Feminino";
        }
    }

}
