package main;
import java.util.List;
import java.util.ArrayList;
import dominio.*;
import telas.*;

public class teste {
    public static void main(String[] args) {
        //Instanciamento de Telas
        Tela6 tela6 = new Tela6();
        Tela8 tela8 = new Tela8();

        //Instanciamento de Listas para armazenar os objetos
        List<Matricula> matriculas = new ArrayList<Matricula>();
        List<Curso> cursos = new ArrayList<Curso>();

        //Instanciando EM ORDEM
        Aluno aluno1 = new Aluno("001", "João");
        Aluno aluno2 = new Aluno("002", "Maria");
        Aluno aluno3 = new Aluno("003", "José");

        //Registrando disciplinas
        Disciplina disciplina1 = new Disciplina("001", "Programação Orientada a Objetos", 60);
        Disciplina disciplina2 = new Disciplina("002", "Matemática", 60);
        Disciplina disciplina3 = new Disciplina("003", "Português", 60);
        Disciplina disciplina4 = new Disciplina("004", "Inglês", 60);
        Disciplina disciplina5 = new Disciplina("005", "Física", 60);

        //Registrando cursos
        Curso curso1 = new Curso("Sistemas Para a Internet");
        cursos.add(curso1);
        Curso curso2 = new Curso("Ciência da Computação");
        cursos.add(curso2);
        Curso curso3 = new Curso("Engenharia de Software");
        cursos.add(curso3);

        //4) Efetuar a Matricula de um Aluno em um Curso.
        Matricula matricula001 = new Matricula("001", 2021, 1, aluno1, curso1); 
        matriculas.add(matricula001);
        Matricula matricula002 = new Matricula("002", 2021, 1, aluno2, curso2);
        matriculas.add(matricula002);
        Matricula matricula003 = new Matricula("003", 2021, 1, aluno3, curso3);
        matriculas.add(matricula003);
    
        //5) Criar um registro de AnoSemestre para um Aluno
        matricula001.registraAnoSemestre(2021, 1); 
        matricula001.registraAnoSemestre(2021, 2);
        matricula001.registraAnoSemestre(2022, 1);
        matricula002.registraAnoSemestre(2022, 2);
        matricula003.registraAnoSemestre(2021, 1);

        //Instanciando Situações
        Situacao situacao1 = new Situacao("APROVADO");
        Situacao situacao2 = new Situacao("REPROVADO POR NOTA");
        Situacao situacao3 = new Situacao("REPROVADO POR FREQUENCIA");

        //6) Registrar que um Aluno fez uma Disciplina em um determinado AnoSemestre e que tirou determinada nota com tal Situacao (Aprovado, Reprovado Por Nota, Reprovado por Frequencia...)
        matricula001.listAnoSemestre().get(0).registraNotaDisciplina(10, disciplina1, situacao1);
        matricula001.listAnoSemestre().get(0).registraNotaDisciplina(6, disciplina2, situacao3);
        matricula002.listAnoSemestre().get(0).registraNotaDisciplina(7, disciplina2, situacao1);        
        matricula003.listAnoSemestre().get(0).registraNotaDisciplina(2, disciplina2, situacao2);

        //3) Incluir Disciplina em Curso.
        curso1.incluiDisciplina(disciplina1);
        curso1.incluiDisciplina(disciplina2);
        curso1.incluiDisciplina(disciplina3);
        curso2.incluiDisciplina(disciplina2);
        curso2.incluiDisciplina(disciplina3);
        curso2.incluiDisciplina(disciplina4);
        curso3.incluiDisciplina(disciplina3);
        curso3.incluiDisciplina(disciplina4);
        curso3.incluiDisciplina(disciplina5);

        //7) Gerar o histórico referente a uma Matricula de um Aluno (nome do aluno, numero de matricula, disciplinas cursadas: codigo da disciplina, ano, semestre, nota e situação.
        System.out.println("\n==================================================");
        utils.historico(matricula001);
        System.out.println("==================================================\n");

        //8) Listar todas as Disciplinas de um determinado Curso.
        System.out.println("\n==================================================");
        utils.disciplinasCurso(curso1);
        System.out.println("==================================================\n");
        
        //9) Mostrar as Disciplinas que faltam para um Aluno cursar em um determinado Curso.
        System.out.println("\n==================================================");
		utils.printaDisciplinasPendentes(matricula001, curso1);
        System.out.println("==================================================\n");
        
        //Tela 6)
        System.out.println("\n==================================================");
        tela6.leRegistraNotaDisciplina(matriculas);
        System.out.println("==================================================\n");
        
        //Tela 8)
        System.out.println("\n==================================================");
        tela8.lePrintaDisciplinasCurso(cursos);
        System.out.println("==================================================\n");

        //8) Listar todas as Disciplinas de um determinado Curso.
        System.out.println("\n==================================================");
        utils.disciplinasCurso(curso1);
        System.out.println("==================================================\n");
        
        //9) Mostrar as Disciplinas que faltam para um Aluno cursar em um determinado Curso.
        //Para testar se a tela 6 está funcionando
        //Exemplo: se na tela 6 cadastrarmos uma disciplina previamente incompleta
        //com situacao "APROVADO", ela não deve aparecer na lista de disciplinas pendentes
        System.out.println("\n==================================================");
		utils.printaDisciplinasPendentes(matricula001, curso1);
        System.out.println("==================================================\n");

        //7) Gerar o histórico referente a uma Matricula de um Aluno (nome do aluno, numero de matricula, disciplinas cursadas: codigo da disciplina, ano, semestre, nota e situação.
        System.out.println("\n==================================================");
        utils.historico(matricula001);
        System.out.println("==================================================\n");
    }
}
