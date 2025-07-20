// Código responsável pelo controle de cadastro dos Lutadores.
package controller;

import model.Lutador;

public class ControllerCadastro {

    private static int id = 1;

    public static void inserirId(Lutador lutador) {
        lutador.setId(id);
        System.out.println("ID: " + lutador.getId());
        id ++;    

    }

    public static boolean inserirNome(Lutador lutador) {
        System.out.println("Informe o nome.");
        String nomeInserido = Leitura.lerString();
        if (!Validacao.validarNome(nomeInserido)) {
            System.out.println("Nome invalido. Digite um nome com caracteres validos.");
            return false;
        }
        lutador.setNome(nomeInserido);
        System.out.println("Nome informado: " + Formatacao.formatarNome(lutador.getNome()));
        return true;
    }

    public static boolean inserirGenero(Lutador lutador) {
        System.out.println("Informe o genero.");
        String generoInserido = Leitura.lerString();
        if (!Validacao.validarGenero(generoInserido)) {
            System.out.println("Genero invalido. Digite 'F' (Feminino) ou 'M' (Masculino).");
            return false;
        }
        lutador.setGenero(generoInserido);
        System.out.println("Genero informado: " + Formatacao.formatarGenero(lutador.getGenero()));
        return true;
    }

    public static boolean inserirNacionalidade(Lutador lutador) {
        System.out.println("Informe a nacionalidade.");
        String nacionalidadeInserida = Leitura.lerString();
        if (!Validacao.validarNacionalidade(nacionalidadeInserida)) {
            System.out.println("""
                               Nacionalidade invalida. Digite uma dessas opcoes: 
                                   BRASILEIRO/BRASILEIRA;
                                   ARGENTINO/ARGENTINA;
                                   AMERICANO/AMERICANA;
                                   ALEMÃO/ALEMÃ;
                                   JAPONÊS/JAPONESA;
                                   FRANCÊS/FRANCESA;
                                   ITALIANO/ITALIANA;
                                   PORTUGUÊS/PORTUGUESA;
                                   RUSSO/RUSSA;
                                   CHINÊS/CHINESA;
                                   INDIANO/INDIANA;
                                   CANADENSE""");
            return false;
        }
        lutador.setNacionalidade(nacionalidadeInserida);
        System.out.println("Nacionalidade informada: " + lutador.getNacionalidade());
        return true;
    }

    public static boolean inserirIdade(Lutador lutador) {
        System.out.println("Informe a idade.");
        String idadeInserida = Leitura.lerString();
        if (!Validacao.validarInt(idadeInserida)) {
            System.out.println("Idade invalida. Digite um numero inteiro.");
            return false;
        } else if (Integer.parseInt(idadeInserida) < 18) {
            System.out.println("Idade invalida. Digite uma idade maior ou igual a 18 anos.");
            return false;
        }
        lutador.setIdade(Integer.parseInt(idadeInserida));
        System.out.println("Idade informada: " + lutador.getIdade());
        return true;

    }

    public static boolean inserirAltura(Lutador lutador) {
        System.out.println("Informe a altura.");
        String alturaInserida = Leitura.lerString();
        if (!Validacao.validarFloat(alturaInserida)) {
            System.out.println("Altura invalida. Insira um valor real. Exemplo: 1.75");
            return false;
        } else if (!Validacao.validarAltura(Float.parseFloat(alturaInserida))) {
            System.out.println("Altura invalida. Insira um valor entre 1.65 e 2.0 metros.");
            return false;
        }
        lutador.setAltura(Float.parseFloat(alturaInserida));
        System.out.println("Altura informada: " + lutador.getAltura());
        return true;

    }

    public static boolean inserirPeso(Lutador lutador) {
        System.out.println("Informe o peso.");
        String pesoInserido = Leitura.lerString();
        if (!Validacao.validarFloat(pesoInserido)) {
            System.out.println("Peso invalido. Insira um valor real. Exemplo 80.9");
            return false;
        } else if (!Validacao.validarPeso(Float.parseFloat(pesoInserido))) {
            System.out.println("Peso invalido. Insira um valor entre 50.0 e 120.2 kg.");
            return false;
        }
        lutador.setPeso(Float.parseFloat(pesoInserido));
        System.out.println("Peso informado: " + lutador.getPeso());
        return true;
    }

}
