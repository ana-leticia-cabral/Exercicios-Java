// Classe Tecnico é uma especialização de Aluno.
// Herança para diferença.
package model;

public class Tecnico extends Aluno {

    private int registroProfissional;

    public void praticar() {
        System.out.println("Tecnico de registro " + this.getRegistroProfissional() + " praticando...");
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

}
