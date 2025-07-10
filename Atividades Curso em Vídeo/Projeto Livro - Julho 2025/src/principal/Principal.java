/* Atividade realizada durante o Curso de Java POO do Curso em Vídeo.
 * O objetivo desta atividade é criar um projeto chamado "Livro", no qual
 * deverão ser criadas uma classe chamada Pessoa e outra classe chamada Livro.
 * Uma interface chamada Publicacao também deverá ser criada para ser implementada pela classe Livro.
 * 
 * No código principal, será implementada uma interação com o usuário por meio de um menu de opções,
 * permitindo realizar ações como cadastrar pessoas e livros, exibir informações e simular a leitura dos livros.
 */
package principal;

import controller.ControllerMenu;
import controller.Leitura;
import controller.Validacao;

public class Principal {

    public static void main(String args[]) {
        while (true) {
            System.out.println("-------------- BIBLIOTECA PESSOAL --------------");
            System.out.println("          Escolha a opcao desejada          ");
            System.out.println("1 - Cadastrar pessoa (Leitor).");
            System.out.println("2 - Registrar livro.");
            System.out.println("3 - Realizar leitura.");
            System.out.println("4 - Listar Pessoas cadastradas.");
            System.out.println("5 - Listar Livros cadastrados.");
            System.out.println("6 - Editar registro de Pessoas.");
            System.out.println("7 - Editar registro de Livros");
            System.out.println("8 - Excluir registro (do leitor ou livro).");
            System.out.println("9 - Encerrar programa.");
   
            String entrada = Leitura.lerString();

            if (!Validacao.validarInt(entrada)) {
                System.out.println("Entrada invalida!");
                continue;

            }

            int opcao = Integer.parseInt(entrada);

            switch (opcao) {
                case 1 ->
                    ControllerMenu.cadastrarPessoa();
                case 2 ->
                    ControllerMenu.registrarLivro();
                case 3 ->
                    ControllerMenu.realizarLeitura();
                case 4->
                    ControllerMenu.listarPessoas();
                case 5 ->
                    ControllerMenu.listarLivros();
                case 6 ->
                    ControllerMenu.editarPessoas();
                case 7 ->
                    ControllerMenu.editarLivros();
                case 8 ->
                    ControllerMenu.excluir();
                case 9 ->
                    System.exit(0);
                default ->
                    System.out.println("Informe um valor entre 1 e 9.");

            }

        }

    }
}

