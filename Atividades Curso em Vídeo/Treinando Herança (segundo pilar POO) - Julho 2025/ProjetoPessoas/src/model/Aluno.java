// Código responsável por criar uma SUBCLASSE (classe filha) Aluno.
// Herança para diferença.
package model;

public class Aluno extends Pessoa{
   private int mat;
   private String curso;
   
   public void pagarMensalidade(){
       System.out.println("Pagando mensalidade do aluno " + this.nome);
   }
   public void cancelarMatr(){
       System.out.println("Matrícula será cancelada!");
   }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
   
}
