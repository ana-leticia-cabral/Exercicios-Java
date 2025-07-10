// Código responsável por controlar o cadastro de Pessoas.
package controller;

import model.Pessoa;
import model.SexoPessoa;

public class ControllerCadastroPessoa {

    private static int id = 1;

    public static void inserirIdPessoa(Pessoa p) {
        p.setId(id);
        System.out.println("ID: " + p.getId());
        id++;
    }

    public static boolean inserirNome(Pessoa p) {
        System.out.println("Informe o nome.");
        String nomeInserido = Leitura.lerString();
        if (!Validacao.validarNome(nomeInserido)) {
            System.out.println("Nome invalido. Digite um nome com caracteres validos.");
            return false;
        }
        p.setNome(nomeInserido);
        System.out.println("Nome informado: " + Formatacao.formatarNome(p.getNome()));
        return true;
    }

    public static boolean inserirIdade(Pessoa p) {
        System.out.println("Informe a idade.");
        String idadeInserida = Leitura.lerString();
        if (!Validacao.validarInt(idadeInserida)) {
            System.out.println("Idade invalida. Digite um numero inteiro.");
            return false;
        }
        p.setIdade(Integer.parseInt(idadeInserida));
        System.out.println("Idade informada: " + p.getIdade());
        return true;

    }

    public static boolean inserirSexo(Pessoa p) {
        System.out.println("Informe o sexo.");
        String generoInserido = Leitura.lerString();
        if (!Validacao.validarSexo(generoInserido)) {
            System.out.println("Genero invalido. Digite 'F' (Feminino) ou 'M' (Masculino).");
            return false;
        }
        p.setSexo(SexoPessoa.valueOf(generoInserido.toUpperCase()));
        System.out.println("Genero informado: " + p.getSexo().getDescricao());
        return true;
    }
}
