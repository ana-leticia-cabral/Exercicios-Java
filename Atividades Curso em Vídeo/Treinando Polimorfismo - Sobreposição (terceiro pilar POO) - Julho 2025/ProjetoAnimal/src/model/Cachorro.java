// Cachorro é uma classe filha de Mamifero.
// Herança para diferença.
package model;

public class Cachorro extends Mamifero {

    @Override
    public void locomover() {
        System.out.println("Andando");
    }

    @Override
    public void emitirSom() {
        System.out.println("AU AU AU AU");
    }
}
