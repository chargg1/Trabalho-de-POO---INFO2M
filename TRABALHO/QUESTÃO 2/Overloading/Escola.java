package Overloading;

import java.util.ArrayList;
import java.util.List;

public class Escola {
    private List<Aluno> alunos = new ArrayList<>();

    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void buscarInformações(String nome) {
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equalsIgnoreCase(nome)) {
                aluno.exibirInformações();
                return;
            }
        }
        System.out.println("Não há ninguém com o nome " + nome + " encontrado(a).");
    }


    public void buscarInformações(int matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula() == matricula) {
                aluno.exibirInformações();
                return;
            }
        }
        System.out.println("Não há ninguem com a matrícula " + matricula + " encontrado.");
    }
}
