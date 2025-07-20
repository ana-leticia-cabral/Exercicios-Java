 // Código que cria um CONTROLADOR para a classe Principal (MENU com as opções)
package controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import model.Livro;
import model.Pessoa;

public class ControllerMenu {

    private static final ArrayList<Pessoa> pessoasCadastradas = new ArrayList<>();
    private static final ArrayList<Livro> livrosCadastrados = new ArrayList<>();
    public static final Set<Integer> idCadastradosPessoa = new HashSet<>();
    public static final Set<Integer> idCadastradosLivro = new HashSet<>();

// MÉTODOS AUXILIARES
    private static boolean tentarCadastroPessoa(String campo, Pessoa pessoa) {
        while (true) {
            boolean tentativa = switch (campo.toLowerCase()) {
                case "nome" ->
                    ControllerCadastroPessoa.inserirNome(pessoa);
                case "idade" ->
                    ControllerCadastroPessoa.inserirIdade(pessoa);
                case "sexo" ->
                    ControllerCadastroPessoa.inserirSexo(pessoa);
                default ->
                    false;

            };

            if (!tentativa) {
                System.out.println("Deseja retornar ao MENU? Digite 'S' para SIM ou"
                        + " qualquer outro valor para indicar NAO (Continuar o CADASTRO.)");
                String escolha = Leitura.lerString();
                if (escolha.equalsIgnoreCase("S")) {
                    return false;
                }
            } else {
                return true;
            }
        }
    }

    private static boolean tentarCadastroLivro(String campo, Livro livro) {
        while (true) {
            boolean tentativa = switch (campo.toLowerCase()) {
                case "titulo" ->
                    ControllerCadastroLivro.inserirTitulo(livro);
                case "autor" ->
                    ControllerCadastroLivro.inserirAutor(livro);
                case "paginas" ->
                    ControllerCadastroLivro.inserirTotPaginas(livro);
                default ->
                    false;

            };

            if (!tentativa) {
                System.out.println("Deseja retornar ao MENU? Digite 'S' para SIM ou"
                        + " qualquer outro valor para indicar NAO (Continuar o CADASTRO.)");
                String escolha = Leitura.lerString();
                if (escolha.equalsIgnoreCase("S")) {
                    return false;
                }
            } else {
                return true;
            }
        }
    }

    private static Pessoa buscarPessoaPorId(int id) {

        for (Pessoa p : pessoasCadastradas) {
            if (p.getId() == id) {
                return p;
            }
        }

        return null; // retorna null se não for encontrado

    }

    private static Livro buscarLivroPorId(int id) {

        for (Livro l : livrosCadastrados) {
            if (l.getIdLivro() == id) {
                return l;
            }
        }

        return null; // retorna null se não for encontrado

    }

// OPÇÕES DO MENU PRINCIPAL
    // Opção 1
    public static void cadastrarPessoa() {
        Pessoa p = new Pessoa("Nome indefinido", 0);
        if (!ControllerMenu.tentarCadastroPessoa("nome", p)) {
            return;
        } else {
            ControllerCadastroPessoa.inserirIdPessoa(p);
        }
        if (!ControllerMenu.tentarCadastroPessoa("idade", p)) {
            return;
        }
        if (!ControllerMenu.tentarCadastroPessoa("sexo", p)) {
            return;
        }
        p.statusPessoa();
        System.out.println("Pessoa cadastrada com sucesso!!!");
        pessoasCadastradas.add(p);
        idCadastradosPessoa.add(p.getId());

    }

    // Opção 2
    public static void registrarLivro() {

        Livro l = new Livro(0, false);

        if (!ControllerMenu.tentarCadastroLivro("titulo", l)) {
            return;
        } else {
            ControllerCadastroLivro.inserirIdLivro(l);
        }
        if (!ControllerMenu.tentarCadastroLivro("autor", l)) {
            return;
        }
        if (!ControllerMenu.tentarCadastroLivro("paginas", l)) {
            return;
        }

        System.out.println(l.detalhes());
        livrosCadastrados.add(l);
        idCadastradosLivro.add(l.getIdLivro());

    }

    // Opção 3
    public static void realizarLeitura() {
        // Verifica se ha pessoas e livros cadastrados.
        if (idCadastradosPessoa.isEmpty()) {
            System.out.println("Nao ha pessoas cadastradas.");
            return;
        }
        if (idCadastradosLivro.isEmpty()) {
            System.out.println("Nao ha livros registrados.");
            return;
        }

        // Pede pra informar o Leitor.
        System.out.println("Informe o ID da PESSOA.");
        String idPessoa = Leitura.lerString();
        if (!Validacao.validarInt(idPessoa)) {
            System.out.println("id invalido.");
            return;
        }

        int idProcurarP = Integer.parseInt(idPessoa);

        Pessoa p = ControllerMenu.buscarPessoaPorId(idProcurarP);
        if (p == null) {
            System.out.println("Pessoa nao encontrada.");
            return;
        }

        // Pede pra informar o Livro.
        System.out.println("Informe o ID do LIVRO.");
        String idLivro = Leitura.lerString();
        if (!Validacao.validarInt(idLivro)) {
            System.out.println("id invalido.");
            return;
        }

        int idProcurarL = Integer.parseInt(idLivro);

        Livro l = ControllerMenu.buscarLivroPorId(idProcurarL);
        if (l == null) {
            System.out.println("Livro nao encontrado.");
            return;
        }

        // Inicia o processo de Leitura.
        l.abrir();
        l.setLeitor(p);

        while (true) {
            System.out.println("O leitor " + Formatacao.formatarNome(p.getNome()) + " esta lendo o livro com as seguintes informacoes: \n" + l.detalhes());
            System.out.println("-----------------------------");
            System.out.println("   SELECIONE O QUE DESEJAR:  ");
            System.out.println("1 - Folhear pagina.");
            System.out.println("2 - Avancar pagina.");
            System.out.println("3 - Voltar pagina livro.");
            System.out.println("4 - Ver detalhes do livro.");
            System.out.println("5 - Finalizar leitura.");

            String escolha = Leitura.lerString();
            if (!Validacao.validarInt(escolha)) {
                System.out.println("Entrada invalida!");
                continue;

            }

            int opcao = Integer.parseInt(escolha);
            switch (opcao) {
                case 1 -> {
                    System.out.println("Digite o numero da pagina que deseja acessar.");
                    String pagina = Leitura.lerString();
                    if (!Validacao.validarInt(pagina)) {
                        System.out.println("Pagina invalida. Digite um numero inteiro.");
                    }
                    l.folhear(Integer.parseInt(pagina));
                    System.out.println("Mudando de pagina...");
                    System.out.println("Pagina atual: " + l.getPagAtual());
                }

                case 2 -> {
                    l.avancarPag();
                    System.out.println("Paginal atual: " + l.getPagAtual());
                }

                case 3 -> {
                    l.voltarPag();
                    System.out.println("Pagina atual: " + l.getPagAtual());
                }

                case 4 -> {
                    System.out.println("Detalhes do livro: " + l.detalhes());
                }

                case 5 -> {
                    System.out.println("Finalizando leitura...");
                    l.fechar();
                    l.setLeitor(null);
                    System.out.println("Status final da leitura: \n" + l.detalhes());
                    return;

                }
                default ->
                    System.out.println("Insira um valor entre 1 e 5.");

            }
        }
    }

    // Opção 4
    public static void listarPessoas() {
        if (pessoasCadastradas.isEmpty()) {
            System.out.println("Nao ha pessoas cadastradas.");
            return;
        }
        for (Pessoa p : pessoasCadastradas) {
            p.statusPessoa();
        }
    }

    // Opção 5
    public static void listarLivros() {
        if (livrosCadastrados.isEmpty()) {
            System.out.println("Nao ha livros cadastrados.");
            return;
        }
        for (Livro l : livrosCadastrados) {
            System.out.println(l.detalhes());
        }
    }

    // Opção 6
    public static void editarPessoas() {
        if (idCadastradosPessoa.isEmpty()) {
            System.out.println("Sem pessoas cadastradas.");
            return;
        }

        System.out.println("Digite o ID da Pessoa que queira MODIFICAR os dados:");
        String id = Leitura.lerString();

        if (!Validacao.validarInt(id)) {
            System.out.println("ID invalido.");
            return;
        }

        int idProcurar = Integer.parseInt(id);

        Pessoa p = ControllerMenu.buscarPessoaPorId(idProcurar);
        if (p == null) {
            System.out.println("ID nao encontrado.");
            return;
        }

        while (true) {
            System.out.println("Escolha o dado que deseja editar:");
            System.out.println("1 - Nome.");
            System.out.println("2 - Sexo.");
            System.out.println("3 - Idade.");
            System.out.println("4 - Fazer aniversario.");
            System.out.println("5 - Finalizar edicao.");

            String escolha = Leitura.lerString();
            if (!Validacao.validarInt(escolha)) {
                System.out.println("Entrada invalida!");
                continue;

            }

            int opcao = Integer.parseInt(escolha);

            switch (opcao) {
                case 1 -> {
                    System.out.println("Digite o novo NOME:");
                    if (ControllerCadastroPessoa.inserirNome(p)) {
                        System.out.println("NOME atualizado com sucesso!");
                    }
                }

                case 2 -> {
                    System.out.println("Digite o novo SEXO:");
                    if (ControllerCadastroPessoa.inserirSexo(p)) {
                        System.out.println("SEXO atualizado com sucesso!");
                    }
                }

                case 3 -> {
                    System.out.println("Digite a nova IDADE:");
                    if (ControllerCadastroPessoa.inserirIdade(p)) {
                        System.out.println("IDADE atualizada com sucesso!");
                    }
                }

                case 4 -> {
                    p.fazerAniver();
                    System.out.println("IDADE atualizada com sucesso! " + p.getIdade());
                }

                case 5 -> {
                    System.out.println("Finalizando edicao dessa pessoa...");
                    return;
                }

                default ->
                    System.out.println("Opção inválida. Escolha de 1 a 5.");
            }

        }
    }

    // Opção 7
    public static void editarLivros() {
        if (idCadastradosLivro.isEmpty()) {
            System.out.println("Sem livros cadastrados.");
            return;
        }

        System.out.println("Digite o ID do Livro que queira MODIFICAR os dados:");
        String id = Leitura.lerString();

        if (!Validacao.validarInt(id)) {
            System.out.println("ID invalido.");
            return;
        }

        int idProcurar = Integer.parseInt(id);

        Livro l = ControllerMenu.buscarLivroPorId(idProcurar);
        if (l == null) {
            System.out.println("ID nao encontrado.");
            return;
        }

        while (true) {
            System.out.println("Escolha o dado que deseja editar:");
            System.out.println("1 - Titulo.");
            System.out.println("2 - Autor.");
            System.out.println("3 - Total de paginas.");
            System.out.println("4 - Finalizar edicao.");

            String escolha = Leitura.lerString();
            if (!Validacao.validarInt(escolha)) {
                System.out.println("Entrada invalida!");
                continue;

            }

            int opcao = Integer.parseInt(escolha);

            switch (opcao) {
                case 1 -> {
                    System.out.println("Digite o novo TITULO:");
                    if (ControllerCadastroLivro.inserirTitulo(l)) {
                        System.out.println("TITULO atualizado com sucesso!");
                    }
                }

                case 2 -> {
                    System.out.println("Digite o novo AUTOR:");
                    if (ControllerCadastroLivro.inserirAutor(l)) {
                        System.out.println("AUTOR atualizado com sucesso!");
                    }
                }

                case 3 -> {
                    System.out.println("Digite o novo TOTAL DE PAGINAS :");
                    if (ControllerCadastroLivro.inserirTotPaginas(l)) {
                        System.out.println("TOTAL DE PAGINAS atualizado com sucesso!");
                    }
                }

                case 4 -> {
                    System.out.println("Finalizando edicao desse Livro...");
                    return;
                }

                default ->
                    System.out.println("Opção inválida. Escolha de 1 a 4.");
            }

        }
    }

    // Opção 8
    public static void excluir() {

        System.out.println("Deseja excluir o registro de uma Pessoa ou de um Livro?");
        System.out.println("Digite 'P' ou 'L' para indicar Pessoa ou Livro.");
        String opcaoExcluir = Leitura.lerString();

        if (opcaoExcluir.equalsIgnoreCase("P")) {
            if (idCadastradosPessoa.isEmpty()) {
                System.out.println("Nao ha pessoas cadastradas.");
                return;
            }
            System.out.println("Digite o ID da Pessoa que queira EXCLUIR.");
            String id = Leitura.lerString();

            if (!Validacao.validarInt(id)) {
                System.out.println("id invalido.");
                return;
            }

            int idProcurar = Integer.parseInt(id);

            Pessoa p = ControllerMenu.buscarPessoaPorId(idProcurar);
            if (p == null) {
                System.out.println("Pessoa nao encontrada.");
                return;
            }
            pessoasCadastradas.remove(p);
            idCadastradosPessoa.remove(idProcurar);
            System.out.println("Pessoa removida com sucesso!");

        } else if (opcaoExcluir.equalsIgnoreCase("L")) {

            if (idCadastradosLivro.isEmpty()) {
                System.out.println("Nao ha livros registrados.");
                return;
            }
            System.out.println("Digite o ID do Livro que queira EXCLUIR.");
            String id = Leitura.lerString();

            if (!Validacao.validarInt(id)) {
                System.out.println("id invalido.");
                return;
            }

            int idProcurar = Integer.parseInt(id);

            Livro l = ControllerMenu.buscarLivroPorId(idProcurar);
            if (l == null) {
                System.out.println("Livro nao encontrado.");
                return;
            }
            livrosCadastrados.remove(l);
            idCadastradosLivro.remove(idProcurar);
            System.out.println("Livro removido com sucesso!");
        } else {
            System.out.println("Opcao invalida. Retornando ao MENU...");
        }
    }

}
