//*ESTADO: PRONTO */
package dominio;
public class Situacao {
    private String situacao;

    public Situacao(String s){ 
        setSituacao(s);
    }

    public String getSituacao() {
        return situacao;
    }

    //Não esta explicito mas ache importante ter um setter para a situacao
    public void setSituacao(String s) {
        if (s == null) throw new RuntimeException("Situacao invalida");
        else this.situacao = s;
    }
}
