// Código que cria uma classe ContaBanco
package com.mycompany.aula05;

import java.util.Random;

public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual() {
        System.out.println("------ ESTADO ATUAL DA CONTA ------");
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Numero: " + this.getNumConta());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());

    }

    public void abrirConta(String t, String d) {

        t = t.toUpperCase();

        if (!t.equals("CP") && !t.equals("CC")) {
            System.out.println("Tipo de conta invalido. Use 'CP' ou 'CC'.");

            return;
        }
        this.setTipo(t);

        // Gera o número da conta.
        int g;
        g = Gerador.geradorInt();
        this.setNumConta(g);

        // Valida o nome do dono.
        if (!d.matches("[a-zA-Z ]+")) {
            System.out.println("Nome invalido.");

            return;
        }
        this.setDono(d);
        this.setStatus(true);

        if (t.equals("CP")) {
            this.setSaldo(150f);
            System.out.println("Certo! A sua conta bancaria do tipo Poupanca esta aberta. Como valor inicial, sera depositado R$ 150,00.");

        } else if (t.equals("CC")) {
            this.setSaldo(50f);
            System.out.println("Certo! A sua conta bancaria do tipo Corrente esta aberta. Como valor inicial, sera depositado R$ 50,00.");
        }
    }

    public void fecharConta() {

        if (this.getSaldo() > 0f) {
            System.out.println("A conta ainda esta com dinheiro. Por favor, retire o valor antes de fechar.");
        } else if (this.getSaldo() < 0f) {
            System.out.println("A conta esta em debito. Quite a divida antes de fechar.");
        } else {
            this.setStatus(false);
            System.out.println("A conta foi fechada com sucesso.");
        }
    }

    public void depositar(float v) {

        if (this.getStatus() == true) {

            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado na conta de " + this.getDono());

        } else {
            System.out.println("A conta esta fechada. Nao e possivel depositar.");
        }

    }

    public void sacar(float v) {

        if (this.getStatus() == true) {
            if (this.getSaldo() >= v) {

                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de: " + this.getDono());
                System.out.println("Saldo final: " + this.getSaldo());
            } else {
                System.out.println("Saldo insuficiente para saque.");
            }
        } else {
            System.out.println("A conta esta fechada. Nao e possivel sacar.");
        }
    }

    public void pagarMensalidade() {

        int v;

        if (this.getStatus() == true) {

            if (this.getTipo().equals("CP")) {
                v = 20;

            } else {
                v = 12;
            }

            if (this.getSaldo() > v) {
                this.setSaldo(getSaldo() - v);
                System.out.println("Mensalidade paga com sucesso por " + this.getDono());
            } else {
                System.out.println("Saldo Insuficiente.");
            }

        } else {
            System.out.println("A conta esta fechada. Nao ha mensalidades para pagar.");
        }
    }

    public ContaBanco() {
        this.saldo = 0f;
        this.status = false;
    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean st) {
        this.status = st;
    }

}

class Gerador {

    public static Random gerador = new Random();

    public static int geradorInt() {
        int aleatorio;
        aleatorio = gerador.nextInt(1000);
        return aleatorio;
    }
}
