// Código que cria uma classe Pessoa.
package model;

import controller.Formatacao;

public class Pessoa {

    // Atributos
    private int idPessoa;
    private String nome;
    private int idade;
    private SexoPessoa sexo;

    // Métodos
    public void fazerAniver() {
        this.setIdade(this.getIdade() + 1);
    }
    
    public void statusPessoa(){
        System.out.println("------------------------");
        System.out.println("ID: " + this.getId());
        System.out.println("Nome: " + Formatacao.formatarNome(this.getNome()));
        System.out.println("Idade: " + this.getIdade() + " anos.");
        System.out.println("Sexo: " + this.getSexo().getDescricao());
        System.out.println("------------------------");
                
    }

    // Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Setters e Getters
    public int getId() {
        return idPessoa;
    }

    public void setId(int id) {
        this.idPessoa = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public SexoPessoa getSexo() {
        return sexo;
    }

    public void setSexo(SexoPessoa sexo) {
        this.sexo = sexo;
    }

}
