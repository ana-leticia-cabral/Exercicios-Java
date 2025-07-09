// Código que cria uma classe chamada Lutador.
package model;

import controller.Formatacao;

public class Lutador {

    // Atributos
    private int id;
    private String nome;
    private String genero;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    // Métodos   
    public void apresentar() {
        
        System.out.println("CHEGOU A HORA! Apresentamos o lutador: " + Formatacao.formatarNome(this.getNome()));
        System.out.println("De nacionalidade: " + this.getNacionalidade().toLowerCase());
        System.out.println("com " + this.getIdade() + " anos");
        System.out.println("pesando " + this.getPeso() + "Kg");
        System.out.println(this.getVitorias() + " vitorias");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + " empates");
        
    }

    public void status() {
        System.out.println("----------------------------------------------------------");
        System.out.println(Formatacao.formatarNome(this.getNome()) + " eh um peso " + this.getCategoria());
        System.out.println("ID: " + this.getId());
        System.out.println("Ganhou " + this.getVitorias() + " vezes");
        System.out.println("Perdeu " + this.getDerrotas() + " vezes");
        System.out.println("Empatou " + this.getEmpates() + " vezes");
        System.out.println("----------------------------------------------------------");

    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }

    //Construtor
    public Lutador() {
        //System.out.println("Lutador sem dados.");
    }

    //Setters e Getters
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setGenero(String g) {
        this.genero = g;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public String getNome() {
        return this.nome;

    }

    public void setNacionalidade(String n) {
        this.nacionalidade = n;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public void setIdade(int i) {
        this.idade = i;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setAltura(float a) {
        this.altura = a;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setPeso(float p) {
        this.peso = p;
        this.setCategoria();
    }

    public float getPeso() {
        return this.peso;
    }

    private void setCategoria() {

        if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Medio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        }
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setVitorias(int v) {
        this.vitorias = v;
    }

    public int getVitorias() {
        return this.vitorias;
    }

    public void setDerrotas(int d) {
        this.derrotas = d;
    }

    public int getDerrotas() {
        return this.derrotas;
    }

    public void setEmpates(int e) {
        this.empates = e;
    }

    public int getEmpates() {
        return this.empates;
    }
}
