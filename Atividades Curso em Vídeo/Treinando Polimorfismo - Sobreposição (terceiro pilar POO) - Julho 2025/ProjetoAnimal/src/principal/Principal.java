/*
 * Atividade desenvolvida durante o curso de Java POO, do Curso em Vídeo.
 *
 * O objetivo desta atividade é colocar em prática os conceitos de POLIMORFISMO apresentados nas aulas teóricas,
 * com foco no polimorfismo por sobreposição (Override), que é um dos pilares fundamentais da Programação Orientada a Objetos.
 *
 * No código principal, serão instanciados objetos e atribuídas suas características,
 * a fim de treinar a aplicação correta dos conceitos estudados.
 */

package principal;

import model.Arara;
import model.Ave;
import model.Cachorro;
import model.Canguru;
import model.Cobra;
import model.GoldFish;
import model.Mamifero;
import model.Peixe;
import model.Reptil;
import model.Tartaruga;

public class Principal {

    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        Canguru canguru = new Canguru();
        Cachorro cachorro = new Cachorro();
        Cobra cobra = new Cobra();
        Tartaruga tartaruga = new Tartaruga();
        GoldFish goldFish = new GoldFish();
        Arara arara = new Arara();
        
        canguru.locomover();
        cachorro.locomover();
        cobra.locomover();
        tartaruga.locomover();
        goldFish.locomover();
        arara.locomover();
        
        System.out.println("----------");
        canguru.emitirSom();
        cachorro.emitirSom();
        cobra.emitirSom();
        tartaruga.emitirSom();
        goldFish.emitirSom();
        arara.emitirSom();
        
        System.out.println("----------");
        // Mamífero
        m.setPeso(35.3f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();
        
        System.out.println("----------");
        // Réptil
        r.setPeso(3.7f);
        r.setCorEscama("Verde");
        r.alimentar();
        r.locomover();
        r.emitirSom();
        
        System.out.println("----------");
        // Peixe
        p.setPeso(5.0f);
        p.setCorEscama("Cinza");
        p.alimentar();
        p.locomover();
        p.emitirSom();
        p.soltarBolha();
        
        System.out.println("---------");
        // Ave
        a.setPeso(2.6f);
        a.setCorPena("Preto");
        a.alimentar();
        a.locomover();
        a.emitirSom();
        a.fazerNinho();
    }

}
