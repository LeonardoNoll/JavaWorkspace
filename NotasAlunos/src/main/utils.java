package main;
import java.util.ArrayList;
import java.util.List;

import dominio.*;

public class utils {
    public void quaisDisciplinasFaltam(Matricula m, Curso c){
        List<Disciplina> disciplinasAprovadas = new ArrayList<Disciplina>();
        List<Disciplina> disciplinasQueFaltam = new ArrayList<Disciplina>();

        for(int i = 0; i < m.listAnoSemestres().size(); i++){
            AnoSemestre semestreAux = m.listAnoSemestres().get(i);
            for(int j = 0; j < semestreAux.listNotaDisciplina().size(); j++){
                NotaDisciplina notaDisciplinaAux = semestreAux.listNotaDisciplina().get(j);
                if (notaDisciplinaAux.getSituacao().getSituacao() == "APROVADO") {
                    disciplinasAprovadas.add(notaDisciplinaAux.getDisciplina());
                }  
            }
            
        }
    };
}
