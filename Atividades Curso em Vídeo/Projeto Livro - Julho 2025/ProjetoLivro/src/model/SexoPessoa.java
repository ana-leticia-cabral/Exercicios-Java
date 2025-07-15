// Código responsável por enumerar os Sexos das Pessoas.
package model;

public enum SexoPessoa {

    // Objetos com descrição
    F("Feminino"), 
    M("Masculino");

    private final String descricao;

    // Construtor
    SexoPessoa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }
}
