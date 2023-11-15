package main;
import dominio.*;

public class teste {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        //Instanciando 1 de cada EM ORDEM
        Aluno aluno1 = new Aluno("001", "João");
        Disciplina disciplina1 = new Disciplina("001", "Programação Orientada a Objetos", 60);
        Curso curso1 = new Curso("Sistemas Para a Internet");
        Matricula matricula1 = new Matricula("001", 2021, 1, aluno1, curso1); //4) Efetuar a Matricula de um Aluno em um Curso.
        matricula1.registraAnoSemestre(2021, 1); //5) Criar um registro de AnoSemestre para um Aluno
        Situacao situacao1 = new Situacao("APROVADO");
        matricula1.listAnoSemestre().get(0).registraNotaDisciplina(10, disciplina1, situacao1); //6) Registrar que um Aluno fez uma Disciplina em um determinado AnoSemestre e que tirou determinada nota com tal Situacao (Aprovado, Reprovado Por Nota, Reprovado por Frequencia...)
        
        

        //Cadastrar Disciplina
        Disciplina disciplina2 = new Disciplina("002", "Matemática", 60);
        Disciplina disciplina3 = new Disciplina("003", "Português", 60);
        
        //3) Incluir Disciplina em Curso.
        curso1.incluiDisciplina(disciplina1);
        curso1.incluiDisciplina(disciplina2);
        curso1.incluiDisciplina(disciplina3);


        System.out.println(curso1.getNome());
        System.out.println(curso1.getMatriculas());
        System.out.println(curso1.getDisciplinas()); //Printa bruscamente a lista de disciplinas
        System.out.println(curso1.getDisciplinas().get(0).getCodigo()); //Printa o código da disciplina na posição 0 da lista de disciplinas

        //7) Gerar o histórico referente a uma Matricula de um Aluno (nome do aluno, numero de matricula, disciplinas cursadas: codigo da disciplina, ano, semestre, nota e situação.
        System.out.println("==================================================");
        utils.historico(matricula1);
        System.out.println("==================================================");
        
        //8) Listar todas as Disciplinas de um determinado Curso.
        utils.disciplinasCurso(curso1);
        System.out.println("==================================================");

        //9) Mostrar as Disciplinas que faltam para um Aluno cursar em um determinado Curso.
		utils.printaDisciplinasPendentes(matricula1, curso1);
        System.out.println("==================================================");
    }
}
