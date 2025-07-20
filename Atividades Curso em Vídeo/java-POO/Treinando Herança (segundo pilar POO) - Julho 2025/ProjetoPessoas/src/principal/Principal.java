/*
 * Atividade desenvolvida durante o curso de Java POO, do Curso em Vídeo.
 *
 * O objetivo desta atividade é colocar em prática os conceitos de HERANÇA abordados nas aulas teóricas,
 * com foco no segundo pilar da Programação Orientada a Objetos.
 *
 * No código principal, serão instanciados objetos e atribuídas suas características,
 * como forma de treinar a aplicação correta da herança em Java.
 *
 * A proposta inclui o uso de técnicas como Herança de Implementação e Herança para Diferença,
 * com o intuito de compreender como organizar melhor a hierarquia de classes e reaproveitar código de forma eficiente.
 */

package principal;

import model.Aluno;
import model.Bolsista;
import model.Funcionario;
import model.Professor;
import model.Tecnico;
import model.Visitante;

//Programa Principal
public class Principal {

    public static void main(String args[]) {
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        Visitante v1 = new Visitante();
        Aluno a1 = new Aluno();
        Bolsista b1 = new Bolsista();
        Tecnico t1 = new Tecnico();

        // Nome
        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Fabiana");
        v1.setNome("Juvenal");
        a1.setNome("Claudio");
        b1.setNome("Carla");
        t1.setNome("Ana");

        // Sexo
        p2.setSexo("F");
        p3.setSexo("M");
        p4.setSexo("F");
        v1.setSexo("M");
        a1.setSexo("M");
        b1.setSexo("F");
        t1.setSexo("F");

        // Idade
        p2.setIdade(19);
        p3.setIdade(25);
        p4.setIdade(18);
        v1.setIdade(22);
        a1.setIdade(16);
        b1.setIdade(20);
        t1.setIdade(20);

        // Aluno
        p2.setMat(1111);
        p2.setCurso("Informatica");

        // Professor
        p3.setSalario(2500.75f);

        // Funcionário 
        p4.setSetor("Estoque");
        p4.setTrabalhando(true);

        // Aluno
        a1.setCurso("Informatica");
        a1.setMat(2222);
        a1.pagarMensalidade();

        // Bolsista
        b1.setCurso("Informatica");
        b1.setMat(5998);
        b1.setBolsa(12.5f);
        b1.pagarMensalidade();

        // Técnico
        t1.setCurso("Informatica");
        t1.setMat(2244);
        t1.setRegistroProfissional(1234);
        t1.praticar();

        System.out.println("----------------------");
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(v1.toString());
        System.out.println(a1.toString());
        System.out.println(b1.toString());
        System.out.println(t1.toString());
        System.out.println(p4.status());

    }
}
