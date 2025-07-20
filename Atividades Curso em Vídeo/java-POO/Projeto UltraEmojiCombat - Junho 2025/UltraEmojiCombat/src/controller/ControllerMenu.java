// Código responsável por controlar as ações executadas a partir do programa Principal (MENU com as opções).
package controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import model.Luta;
import model.Lutador;

public class ControllerMenu {

    private static final ArrayList<Lutador> lutadoresCadastrados = new ArrayList<>();
    public static final Set<Integer> idCadastrados = new HashSet<>();

// Buscar Lutador por ID.
    private static Lutador buscarLutadorPorId(int id) {

        for (Lutador l : lutadoresCadastrados) {
            if (l.getId() == id) {
                return l;
            }
        }

        return null; // retorna null se não for encontrado

    }

// Método auxiliar para ajudar a evitar repetição no meu código.
    private static boolean tentarCadastroCampo(String campo, Lutador lutador) {
        while (true) {
            boolean inserido = switch (campo.toLowerCase()) {

                case "nome" ->
                    ControllerCadastro.inserirNome(lutador);
                case "genero" ->
                    ControllerCadastro.inserirGenero(lutador);
                case "nacionalidade" ->
                    ControllerCadastro.inserirNacionalidade(lutador);
                case "idade" ->
                    ControllerCadastro.inserirIdade(lutador);
                case "altura" ->
                    ControllerCadastro.inserirAltura(lutador);
                case "peso" ->
                    ControllerCadastro.inserirPeso(lutador);
                default ->
                    false;
            };

            if (!inserido) {
                System.out.println("Deseja retornar ao MENU? Digite 'S' para SIM ou"
                        + " qualquer outro valor para indicar NAO(Continuar o cadastro).");
                String escolha = Leitura.lerString();
                if (escolha.equalsIgnoreCase("s")) {
                    return false;
                }
            } else {
                return true;
            }
        }
    }

    public static void cadastrar() {
        Lutador lutador = new Lutador();

        

        if (!tentarCadastroCampo("nome", lutador)) {
            return;
        } else {
            ControllerCadastro.inserirId(lutador);
        }
        
        if (!tentarCadastroCampo("genero", lutador)) {
            return;
        }
        if (!tentarCadastroCampo("nacionalidade", lutador)) {
            return;
        }
        if (!tentarCadastroCampo("idade", lutador)) {
            return;
        }
        if (!tentarCadastroCampo("altura", lutador)) {
            return;
        }
        if (!tentarCadastroCampo("peso", lutador)) {
            return;
        }

        lutadoresCadastrados.add(lutador);
        idCadastrados.add(lutador.getId());

        System.out.println("Lutador cadastrado com sucesso!");
    }

    public static void modificar() {
        if (idCadastrados.isEmpty()) {
            System.out.println("Sem lutadores cadastrados.");
            return;
        }

        System.out.println("Digite o ID do lutador que queira MODIFICAR os dados:");
        String id = Leitura.lerString();

        if (!Validacao.validarInt(id)) {
            System.out.println("ID invalido.");
            return;
        }

        int idProcurar = Integer.parseInt(id);

        Lutador lutador = ControllerMenu.buscarLutadorPorId(idProcurar);
        if (lutador == null) {
            System.out.println("ID nao encontrado.");
            return;
        }

        while (true) {
            System.out.println("Escolha o dado que deseja editar:");
            System.out.println("1 - Nome");
            System.out.println("2 - Genero");
            System.out.println("3 - Nacionalidade");
            System.out.println("4 - Idade");
            System.out.println("5 - Altura");
            System.out.println("6 - Peso");
            System.out.println("7 - Finalizar edicao do Lutador.");

            String escolha = Leitura.lerString();
            if (!Validacao.validarInt(escolha)) {
                System.out.println("Entrada invalida!");
                continue;

            }

            int opcao = Integer.parseInt(escolha);

            switch (opcao) {
                case 1 -> {
                    System.out.println("Digite o novo NOME:");
                    if (ControllerCadastro.inserirNome(lutador)) {
                        System.out.println("NOME atualizado com sucesso!");
                    }
                }

                case 2 -> {
                    System.out.println("Digite o novo GÊNERO:");
                    if (ControllerCadastro.inserirGenero(lutador)) {
                        System.out.println("GENERO atualizado com sucesso!");
                    }
                }

                case 3 -> {
                    System.out.println("Digite a nova NACIONALIDADE:");
                    if (ControllerCadastro.inserirNacionalidade(lutador)) {
                        System.out.println("NACIONALIDADE atualizada com sucesso!");
                    }
                }

                case 4 -> {
                    System.out.println("Digite a nova IDADE:");
                    if (ControllerCadastro.inserirIdade(lutador)) {
                        System.out.println("IDADE atualizada com sucesso!");
                    }
                }

                case 5 -> {
                    System.out.println("Digite a nova ALTURA:");
                    if (ControllerCadastro.inserirAltura(lutador)) {
                        System.out.println("ALTURA atualizada com sucesso!");
                    }
                }

                case 6 -> {
                    System.out.println("Digite o novo PESO:");
                    if (ControllerCadastro.inserirPeso(lutador)) {
                        System.out.println("PESO atualizado com sucesso!");
                    }
                }

                case 7 -> {
                    System.out.println("Finalizando edicao dessa pessoa...");
                    return;
                }

                default ->
                    System.out.println("Opção inválida. Escolha de 1 a 7.");
            }

        }
    }

    public static void listar() {
        if (lutadoresCadastrados.isEmpty()) {
            System.out.println("Sem lutadores cadastrados.");
            return;
        }
        for (Lutador lista : lutadoresCadastrados) {
            lista.status();
        }
    }

    public static void excluir() {
        if (idCadastrados.isEmpty()) {
            System.out.println("Sem lutadores cadastrados.");
            return;
        }

        System.out.println("Digite o ID do lutador que queira EXCLUIR os dados:");
        String id = Leitura.lerString();

        if (!Validacao.validarInt(id)) {
            System.out.println("id invalido.");
            return;
        }

        int idProcurar = Integer.parseInt(id);

        Lutador lutador = ControllerMenu.buscarLutadorPorId(idProcurar);
        if (lutador == null) {
            System.out.println("Lutador nao encontrado.");
            return;
        }
        lutadoresCadastrados.remove(lutador);
        idCadastrados.remove(idProcurar);
        System.out.println("Lutador removido com sucesso!");

    }

    private static Luta lutaAtual;

    public static void marcarLuta() {

        // Verifica se tem Lutadores cadastrados.
        if (lutadoresCadastrados.isEmpty()) {
            System.out.println("Nao ha lutadores cadastrados. Nao eh possivel marcar uma luta.");
            return;
        }

        // Primeiro Lutador
        System.out.println("Digite o ID do primeiro Lutador.");
        String id1 = Leitura.lerString();

        if (!Validacao.validarInt(id1)) {
            System.out.println("id invalido.");
            return;
        }

        int id1Procurar = Integer.parseInt(id1);

        Lutador lutador1 = ControllerMenu.buscarLutadorPorId(id1Procurar);

        if (lutador1 == null) {
            System.out.println("Lutador nao encontrado");
            return;
        }

        // Segundo Lutador
        System.out.println("Digite o ID do segundo Lutador.");
        String id2 = Leitura.lerString();

        if (!Validacao.validarInt(id2)) {
            System.out.println("id invalido.");
            return;
        }

        int id2Procurar = Integer.parseInt(id2);

        Lutador lutador2 = ControllerMenu.buscarLutadorPorId(id2Procurar);

        if (lutador2 == null) {
            System.out.println("Lutador nao encontrado.");
            return;
        }

        // Tenta marcar a Luta
        Luta luta = new Luta();
        if (!luta.agendarLuta(lutador1, lutador2)) {
            System.out.println("Nao foi possivel MARCAR a luta.");
            System.out.println("Verifique se os Lutadores possuem o mesmo GENERO E CATEGORIA.");
            System.out.println("Lutadores do sexo FEMININO nao podem lutar com Lutadores do sexo MASCULINO.");
            System.out.println("Lutadores das categorias LEVE, MEDIO ou PESADO nao podem lutar entre si.");
            return;
        }
        lutaAtual = luta;
        System.out.println("Luta MARCADA com sucesso!!!");

        System.out.println("Quer INICIAR a luta? Digite 'S' para SIM ou qualquer outro valor para indicar NAO");
        String iniciarLuta = Leitura.lerString();
        if (!iniciarLuta.equalsIgnoreCase("S")) {
            return;
        }
        lutaAtual.lutar();
        lutaAtual = null;

    }

    public static void iniciarLuta() {
        if (lutaAtual == null) {
            System.out.println("Nao ha luta marcada.");
            return;
        }
        lutaAtual.lutar();
        lutaAtual = null;
    }

}
