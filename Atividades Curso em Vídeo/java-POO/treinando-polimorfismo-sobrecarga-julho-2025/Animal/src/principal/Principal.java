/*
 * Atividade desenvolvida durante o curso de Java POO, do Curso em Vídeo.
 *
 * Esta atividade tem como objetivo aplicar os conceitos de POLIMORFISMO por sobrecarga,
 * permitindo que o mesmo método reaja de formas diferentes dependendo dos parâmetros recebidos.
 *
 * No código principal, um objeto Cachorro é criado e seus métodos sobrecarregados 'reagir' são testados
 * com diferentes tipos e números de argumentos, demonstrando a flexibilidade do polimorfismo por sobrecarga em Java.
 */


package principal;

import model.Cachorro;

public class Principal {

    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        
        // Cachorro reagindo conforme frase.
        c.reagir("Olá"); // Abanar e Latir
        c.reagir("Vai apanhar!"); // Rosnar
        
        // Cachorro reagindo conforme horário
        System.out.println("--------");
        c.reagir(11, 45); // Abanar 
        c.reagir(21, 00); // Ignorar
        
        // Cachorro reagindo conforme dono
        System.out.println("--------");
        c.reagir(true); // Abanar
        c.reagir(false); // Rosnar e Latir
        
        // Cachorro reagindo conforme idade e peso
        System.out.println("--------");
        c.reagir(2, 12.5f); // Latir
        c.reagir(17, 4.5f); // Rosnar
    }

}
