package br.com.alura.escola.academico.dominio.aluno;

import br.com.alura.escola.shared.dominio.CPF;

import java.util.List;

public interface RepositorioDeAluno {

    void matricular(Aluno aluno);

    Aluno buscarAlunoPorCpf(CPF cpf);

    List<Aluno> listarTodosAlunosMatriculados();
}
