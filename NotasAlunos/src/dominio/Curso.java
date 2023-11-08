//*ESTADO: COMPLETO */
package dominio;
import java.util.List;
import java.util.ArrayList;

public class Curso {
    private String nome;
    private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
    private List<Matricula> matriculas = new ArrayList<Matricula>();

    //*Construtor */
    public Curso(String n){
        if (n == null) throw new RuntimeException("Nome invalido");
        else this.nome = n;
    }


    //*Getters */
    public String getNome() {
        return nome;
    }
    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }
    public List<Matricula> getMatriculas() {
        return matriculas;
    }


    //*Diversos */
    public void incluiDisciplina(Disciplina d){
        if (d == null) throw new RuntimeException("Disciplina invalida");
        else this.disciplinas.add(d);
    }
    public void incluiMatricula(Matricula m){ 
        if (m == null) throw new RuntimeException("Matricula invalida");
        else this.matriculas.add(m);
    }
}
