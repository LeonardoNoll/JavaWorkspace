package telas;

import java.util.List;
import java.util.Scanner;
import main.*;
import dominio.*;

public class Tela8 {
    Scanner in = new Scanner(System.in);
    
    public Tela8() {
    }

    public void lePrintaDisciplinasCurso(List<Curso> cursos) {
        System.out.println("Digite o codigo de um curso cadastrado: ");
        for (int i = 0; i < cursos.size(); i++) {
            System.out.println(i + " - " + cursos.get(i).getNome());
        }
        int codigo = in.nextInt();
        if (codigo < 0 || codigo >= cursos.size()) throw new RuntimeException("Curso invalido");
        utils.disciplinasCurso(cursos.get(codigo));
    }
}
