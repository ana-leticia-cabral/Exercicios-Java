// Código responsável por criar uma SUBCLASSE (classe filha) Funcionario.
// Herança para diferença.
package model;

public class Funcionario extends Pessoa {

    private String setor;
    private boolean trabalhando;

    public void mudaTrabalho() {
        this.trabalhando = !this.trabalhando;
    }

   
    public String status() {
        return "Funcionario{" + "setor=" + setor + ", trabalhando=" + trabalhando + '}';
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

}
