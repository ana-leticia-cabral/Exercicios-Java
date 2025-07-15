// Código responsável por controlar o cadastro de Livros.
package controller;

import model.Livro;

public class ControllerCadastroLivro {

    private static int id = 1;

    public static void inserirIdLivro(Livro l) {
        l.setIdLivro(id);
        System.out.println("ID: " + l.getIdLivro());
        id++;
    }

    public static boolean inserirTitulo(Livro l) {
        System.out.println("Informe o titulo do livro.");
        String nomeInserido = Leitura.lerString();
        if (!Validacao.validarNome(nomeInserido)) {
            System.out.println("Titulo invalido. Digite um nome com caracteres validos.");
            return false;
        }
        l.setTitulo(nomeInserido);
        System.out.println("Titulo informado: " + Formatacao.formatarNome(l.getTitulo()));
        return true;
    }

    public static boolean inserirAutor(Livro l) {
        System.out.println("Informe o autor.");
        String nomeInserido = Leitura.lerString();
        if (!Validacao.validarNome(nomeInserido)) {
            System.out.println("Nome invalido. Digite um nome com caracteres validos.");
            return false;
        }
        l.setAutor(nomeInserido);
        System.out.println("Nome informado: " + Formatacao.formatarNome(l.getAutor()));
        return true;
    }

    public static boolean inserirTotPaginas(Livro l) {
        System.out.println("Informe o total de paginas do livro.");
        String totPaginas = Leitura.lerString();
        if (!Validacao.validarInt(totPaginas)) {
            System.out.println("Quantidade de paginas invalida. Digite um numero inteiro.");
            return false;
        }
        if(Integer.parseInt(totPaginas) <= 0 ){
            System.out.println("Informe um valor maior que 0.");
            return false;
        }
        l.setTotPaginas(Integer.parseInt(totPaginas));
        System.out.println("Total de paginas: " + l.getTotPaginas());
        return true;

    }

}
