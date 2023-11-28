//*ESTADO PRONTO */
package dominio;
public class NotaDisciplina {
    private float nota;
    private Disciplina disciplina;
    private Situacao situacao;
    private AnoSemestre anoSemestre; 

    //*Construtor
    protected NotaDisciplina(float n, Disciplina d, Situacao s) {
        setDisciplina(d); //1..1
        
        if (n > 10 || n < 0) throw new RuntimeException("Nota invalida");
        else this.nota = n;
        
        if (s == null) throw new RuntimeException("Situacao invalida"); //1..1
        else this.situacao = s;
    }


    //*Getters
    public float getNota() {
        return nota;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public AnoSemestre getAnoSemestre() {
        return anoSemestre;
    }


    //*Setters
    protected void setAnoSemestre(AnoSemestre as) {
        if (as == null) throw new RuntimeException("Ano/semestre invalido");
        else this.anoSemestre = as; 
    }

    protected void setDisciplina(Disciplina d) {
        if (d == null) throw new RuntimeException("Disciplina invalida");
        else this.disciplina = d; 
    }
    
}
