//*ESTADO: PRONTO */

package dominio;
import java.util.List;
import java.util.ArrayList;

public class Aluno {
    private String cpf;
    private String nome;
    private List<Matricula> matricula = new ArrayList<Matricula>();

    //*Construtor */
    public Aluno(String c, String n){
        if (c == null) throw new RuntimeException("CPF invalido");
        else this.cpf = c;

        if (n == null) throw new RuntimeException("Nome invalido");
        else this.nome = n;
    }


    //*Getters */
    public String getCpf() {
        return cpf;
    }
    public String getNome() {
        return nome;
    }
    public List<Matricula> getMatriculas() {
        return matricula;
    }


    //*Diversos */
    protected void adicionaMatricula(Matricula m){
        if (m == null) throw new RuntimeException("Matricula invalida");  
        else this.matricula.add(m);
    }
}
