// Canguru é uma classe filha de Mamifero.
// Herança para diferença.
package model;

public class Canguru extends Mamifero {

    @Override
    public void locomover() {
        System.out.println("Saltando");
    }

    public void usarBolsa() {
        System.out.println("Usando Bolsa");
    }

}
