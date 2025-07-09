/* Atividade realizada durante o Curso de Java POO do Curso em Vídeo.
 * O objetivo desta atividade é criar um projeto chamado "UltraEmojiCombat", no qual
 * deverão ser criadas uma classe chamada Lutador e outra classe chamada Luta.
 *
 * No código principal, será implementada uma interação com o usuário por meio de um menu de opções,
 * permitindo realizar ações como cadastrar lutadores, exibir informações e simular uma luta.
 */

package principal;

import controller.ControllerMenu;
import controller.Validacao;
import controller.Leitura;

public class Principal {

    public static void main(String args[]) {

        while (true) {
            System.out.println("###### ULTRA EMOJI COMBAT #######");
            System.out.println("--- Escolha a opcao desejada: ---");
            System.out.println("1 - Cadastrar lutador.");
            System.out.println("2 - Modificar dados do lutador.");
            System.out.println("3 - Listar lutadores.");
            System.out.println("4 - Excluir lutador.");
            System.out.println("5 - Marcar Luta.");
            System.out.println("6 - Iniciar Luta.");
            System.out.println("7 - Finalizar o programa.");

            String entrada = Leitura.lerString();

            if (!Validacao.validarInt(entrada)) {
                System.out.println("Entrada invalida!");
                continue;

            }

            int opcao = Integer.parseInt(entrada);

            switch (opcao) {
                case 1 ->
                    ControllerMenu.cadastrar();
                case 2 ->
                    ControllerMenu.modificar();
                case 3 ->
                    ControllerMenu.listar();
                case 4 ->
                    ControllerMenu.excluir();
                case 5 ->
                    ControllerMenu.marcarLuta();
                case 6 ->
                    ControllerMenu.iniciarLuta();
                case 7 ->
                    System.exit(0);
                default ->
                    System.out.println("Informe um valor entre 1 e 7.");

            }

        }

    }
}
