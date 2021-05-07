package br.com.alura.escola.aplicacao.aluno.matricular;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.RepositorioDeAluno;

public class MatricularAluno {
    private final RepositorioDeAluno repositorio;

    public MatricularAluno(RepositorioDeAluno repositorio) {
        this.repositorio = repositorio;
    }

    public void executa(MatricularAlunoDto dados) {
        Aluno novo = dados.criarAluno();
        repositorio.matricular(novo);
    }
}
