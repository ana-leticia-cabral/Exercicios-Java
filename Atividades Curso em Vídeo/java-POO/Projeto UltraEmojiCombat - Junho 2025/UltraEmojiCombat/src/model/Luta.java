// Código que cria uma classe chamada Luta.
package model;

import controller.Formatacao;
import java.util.Random;

public class Luta {

// Atributos
    private Lutador desafiado; //  Lutador 1
    private Lutador desafiante; // Lutador 2
    private int rounds;
    private boolean aprovada; // Se a luta foi aprovada.

// Métodos
    public boolean agendarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria())
                && l1 != l2 && l1.getGenero().equals(l2.getGenero())) {
            this.setDesafiado(l1);
            this.setDesafiante(l2);
            this.setAprovada(true);
            return true;

        } else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
            return false;
        }
    }

    public void lutar() {
        if (this.getAprovada()) {
            System.out.println("----------------------");
            System.out.println(" DESAFIADO ");
            this.getDesafiado().apresentar();
            System.out.println("----------------------");
            System.out.println(" DESAFIANTE ");
            this.getDesafiante().apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0 1 2

            switch (vencedor) {
                case 0 -> {
                    // Empate
                    System.out.println("----- RESULTADO DA LUTA -----");
                    System.out.println("Empate.");
                    this.getDesafiado().empatarLuta();
                    this.getDesafiante().empatarLuta();
                }
                case 1 -> {
                    // Desafiado vence
                    System.out.println("----- RESULTADO DA LUTA -----");
                    System.out.println("Venceu: " + Formatacao.formatarNome(this.getDesafiado().getNome()));
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                }
                case 2 -> {
                    // Desafiante vence
                    System.out.println("----- RESULTADO DA LUTA -----");
                    System.out.println("Venceu: " + Formatacao.formatarNome(this.getDesafiante().getNome()));
                    this.getDesafiante().ganharLuta();
                    this.getDesafiado().perderLuta();
                }
            }
        } else {
            System.out.println("A luta nao pode acontecer.");
        }
    }

// Setters e Getters 
    public void setDesafiado(Lutador l1) {
        this.desafiado = l1;
    }

    public Lutador getDesafiado() {
        return this.desafiado;
    }

    public void setDesafiante(Lutador l2) {
        this.desafiante = l2;
    }

    public Lutador getDesafiante() {
        return this.desafiante;
    }

    public void setRounds(int r) {
        this.rounds = r;
    }

    public int getRounds() {
        return this.rounds;
    }

    public void setAprovada(boolean a) {
        this.aprovada = a;
    }

    public boolean getAprovada() {
        return this.aprovada;
    }
}
