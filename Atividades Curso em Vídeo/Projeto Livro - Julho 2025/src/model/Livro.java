// Código que cria uma classe chamada Livro
package model;

import controller.Formatacao;

public class Livro implements Publicacao {

    private int idLivro;
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    // Métodos
    public String detalhes() {
        String nomeLeitor;
        if (this.getLeitor() == null){
            nomeLeitor = "Nenhum leitor.";
        } else {
            nomeLeitor = Formatacao.formatarNome(leitor.getNome());
        }
        return """
               ------------------------------------
               ID: """ + this.getIdLivro() + "\n"
                + "Titulo: " + Formatacao.formatarNome(this.getTitulo()) + "\n"
                + "Autor: " + Formatacao.formatarNome(this.getAutor()) + "\n"
                + "Total de paginas: " + this.getTotPaginas() + "\n"
                + "Pagina atual: " + this.getPagAtual() + "\n"
                + "Esta aberto? " + this.getAberto() + "\n"
                + "Leitor: " + nomeLeitor +"\n"
                +"------------------------------------";
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
        this.setPagAtual(0);
    }

    @Override
    public void folhear(int p) {
        if (p > this.getTotPaginas()) {
            this.setPagAtual(0);
        } else {
            this.setPagAtual(p);
        }
    }

    @Override
    public void avancarPag() {
        this.setPagAtual(this.getPagAtual() + 1);
    }

    @Override
    public void voltarPag() {
        this.setPagAtual(this.getPagAtual() - 1);
    }

    //Construtor 
    public Livro(int pagAtual, boolean aberto) {
        this.setPagAtual(pagAtual);
        this.setAberto(aberto);
    }

    // Setters e Getters
    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

}
