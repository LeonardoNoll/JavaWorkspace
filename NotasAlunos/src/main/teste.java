package main;
import dominio.*;

public class teste {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        //Instanciando 1 de cada EM ORDEM
        Aluno aluno1 = new Aluno("001", "João");
        Disciplina disciplina1 = new Disciplina("001", "Programação Orientada a Objetos", 60);
        Curso curso1 = new Curso("Sistemas Para a Internet");
        Matricula matricula1 = new Matricula("001", 2021, 1, aluno1, curso1);
        matricula1.registraAnoSemestre(2021, 1);
        Situacao situacao1 = new Situacao("Aprovado");
        matricula1.listAnoSemestre().get(0).registraNotaDisciplina(10, disciplina1, situacao1); //Criar algo q faz isso, ficou muito extenso
        
        

        //Cadastrar Disciplina
        Disciplina disciplina2 = new Disciplina("002", "Matemática", 60);
        Disciplina disciplina3 = new Disciplina("003", "Português", 60);

        System.out.println(disciplina1.getCodigo()); 
        System.out.println(disciplina2.getCodigo()); 
        System.out.println(disciplina3.getCodigo());
        
        //Cadastrar Curso
        curso1.incluiDisciplina(disciplina1);

        System.out.println(curso1.getNome());
        System.out.println(curso1.getDisciplinas()); //Printa bruscamente a lista de disciplinas
        System.out.println(curso1.getDisciplinas().get(0).getCodigo()); //Printa o código da disciplina na posição 0 da lista de disciplinas

        //
    }
}
