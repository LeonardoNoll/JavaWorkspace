package main;
import java.util.ArrayList;
import java.util.List;
import dominio.*;

public class utils {

    //7) Print para o sistema o histórico do aluno baseado na matrícula
    public static void historico (Matricula m){
        System.out.println("HISTORICO DO ALUNO: " + m.getAluno().getNome() + " / " + m.getMatricula());
        System.out.println(" - Codigo/Disciplina - Nota/Situacao");
        for(int i = 0; i < m.listAnoSemestre().size(); i++){
            AnoSemestre anoSemestreAtual = m.listAnoSemestre().get(i);
            System.out.println("SEMESTRE " + anoSemestreAtual.getAno() + "/" + anoSemestreAtual.getSemestre());
            for(int j = 0; j < anoSemestreAtual.listNotaDisciplina().size(); j++){
                NotaDisciplina notaDisciplinaAtual = anoSemestreAtual.listNotaDisciplina().get(j);
                System.out.println(" - "+ notaDisciplinaAtual.getDisciplina().getCodigo()+ "/" + notaDisciplinaAtual.getDisciplina().getNome() + " - " + notaDisciplinaAtual.getNota() + "/" + notaDisciplinaAtual.getSituacao().getSituacao());
            }
        }
    }

    //8)
    public static void disciplinasCurso (Curso c){
        System.out.println("DISCIPLINAS DE: " + c.getNome());
        for (int i = 0; i < c.getDisciplinas().size(); i++){
            System.out.println(" - " + c.getDisciplinas().get(i).getCodigo() + "/" + c.getDisciplinas().get(i).getNome());
        }   
    }

    //9) Devolve um array de Materias não concluidas
    public static List<Disciplina> quaisDisciplinasFaltam(Matricula m, Curso c){
        List<Disciplina> disciplinasAprovadas = new ArrayList<Disciplina>();
        List<Disciplina> disciplinasQueFaltam = new ArrayList<Disciplina>();

        //Povoa o array
        for(int i = 0; i < m.listAnoSemestres().size(); i++){
            AnoSemestre semestreAux = m.listAnoSemestres().get(i);
            for(int j = 0; j < semestreAux.listNotaDisciplina().size(); j++){
                NotaDisciplina notaDisciplinaAux = semestreAux.listNotaDisciplina().get(j);
                if (notaDisciplinaAux.getSituacao().getSituacao() == "APROVADO") {
                    disciplinasAprovadas.add(notaDisciplinaAux.getDisciplina());
                    // System.out.println(notaDisciplinaAux.getDisciplina().getNome());
                }
                System.out.println(notaDisciplinaAux.getDisciplina().getNome());
            }      
        }
        //Povoa o array disciplinasQueFaltam
        // if (disciplinasAprovadas != null){
            for(int i = 0; i < c.getDisciplinas().size(); i++){
                boolean aprovada = false;
                for(int j = 0; j < disciplinasAprovadas.size(); j++){
                    if (c.getDisciplinas().get(i) == disciplinasAprovadas.get(j)){
                        aprovada = true;
                    }
                }
                if (!aprovada) {
                    disciplinasQueFaltam.add(c.getDisciplinas().get(i));
                }
            }
            return disciplinasQueFaltam;
        // }
    };
    public static void printaDisciplinasPendentes (Matricula m, Curso c){
        List<Disciplina> disciplinasQueFaltam = utils.quaisDisciplinasFaltam(m,c);
        if (disciplinasQueFaltam.size() == 0) {
            System.out.println("NENHUMA DISCIPLINA PENDENTE");
        } else {
            System.out.println("DISCIPLINAS PENDENTES DE: " + m.getAluno().getNome() + " - " + c.getNome());
            for(int i = 0; i < disciplinasQueFaltam.size(); i++){
                System.out.println(" - " + disciplinasQueFaltam.get(i).getCodigo() + "/" + disciplinasQueFaltam.get(i).getNome());
            }
        }
    }
}
