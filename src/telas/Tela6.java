package telas;

import java.util.List;
import java.util.Scanner;
import dominio.*;

public class Tela6 {
    
    Scanner in = new Scanner(System.in);

    public Tela6() {

    }
    
    public void leRegistraNotaDisciplina(List<Matricula> matriculas){
        int codigo = 0;
        
        System.out.println("Digite o numero de uma matricula cadastrada: ");
        for (int i = 0; i < matriculas.size(); i++) {
            System.out.println(i + " - " + matriculas.get(i).getAluno().getNome()+ " " + matriculas.get(i).getMatricula());
        }
        codigo = in.nextInt();
        if (codigo < 0 || codigo >= matriculas.size()) throw new RuntimeException("Matricula invalida");
        Matricula matricula = matriculas.get(codigo);

        
        System.out.println("Digite o codigo de um ano/semestre dessa matricula: ");
        for (int i = 0; i < matricula.listAnoSemestres().size(); i++) {
            System.out.println(i + " - " + matricula.listAnoSemestres().get(i).getAno()+ "/" + matricula.listAnoSemestres().get(i).getSemestre());
        }
        codigo = in.nextInt();
        if (codigo < 0 || codigo >= matricula.listAnoSemestres().size()) throw new RuntimeException("AnoSemestre invalido");
        AnoSemestre anoSemestre = matricula.listAnoSemestres().get(codigo);

        System.out.println("Digite o codigo de uma disciplina cadastrada: ");
        for (int i = 0; i < matricula.getCurso().getDisciplinas().size(); i++) {
            System.out.println(i + " - " + matricula.getCurso().getDisciplinas().get(i).getNome());
        }
        codigo = in.nextInt();
        if (codigo < 0 || codigo >= matricula.getCurso().getDisciplinas().size()) throw new RuntimeException("Disciplina invalida");
        Disciplina disciplina = matricula.getCurso().getDisciplinas().get(codigo);
        
        System.out.println("Digite a nota do aluno: ");
        int nota = in.nextInt();

        System.out.println("Digite a situacao do aluno (ex: APROVADO): ");
        in.nextLine(); //Limpa o buffer
        String situacaoString = in.nextLine();
        Situacao situacao = new Situacao(situacaoString);

        anoSemestre.registraNotaDisciplina(nota, disciplina, situacao);
    }
}
