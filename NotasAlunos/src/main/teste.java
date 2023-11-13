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

        System.out.println(disciplina1.getCodigo()); 
        System.out.println(disciplina2.getCodigo()); 
        System.out.println(disciplina3.getCodigo());
        
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
        System.out.println("Aluno: " + matricula1.getAluno().getNome());
        System.out.println("Numero de matricula: " + matricula1.getMatricula());
        for(int i = 0; i < matricula1.listAnoSemestre().size(); i++){
            AnoSemestre anoSemestreAtual = matricula1.listAnoSemestre().get(i);
            System.out.println("DISCIPLINAS CURSADAS NO SEMESTRE " + anoSemestreAtual.getAno() + "/" + anoSemestreAtual.getSemestre());
            for(int j = 0; j < anoSemestreAtual.listNotaDisciplina().size(); j++){
                NotaDisciplina notaDisciplinaAtual = anoSemestreAtual.listNotaDisciplina().get(j);
                System.out.println(notaDisciplinaAtual.getDisciplina().getNome() +" - "+ notaDisciplinaAtual.getDisciplina().getCodigo() + ": Nota " + notaDisciplinaAtual.getNota() + " " + notaDisciplinaAtual.getSituacao().getSituacao());
            }
        }
        System.out.println("==================================================");
        
        //8) Listar todas as Disciplinas de um determinado Curso.
        System.out.println("Disciplinas do curso 1");
        for (int i = 0; i < curso1.getDisciplinas().size(); i++){
            System.out.println(curso1.getDisciplinas().get(i).getNome());
        }
        System.out.println("==================================================");

        //9) Mostrar as Disciplinas que faltam para um Aluno cursar em um determinado Curso.
        System.out.println("Quais disciplinas faltam para o aluno");
        Curso cursoAux = curso1;
        Matricula matriculaAux = matricula1;
        quaisDisciplinasFaltam(matricula1,curso1);

    }
}
