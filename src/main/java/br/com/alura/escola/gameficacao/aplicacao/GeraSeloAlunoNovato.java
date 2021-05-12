package br.com.alura.escola.gameficacao.aplicacao;

import br.com.alura.escola.gameficacao.dominio.selo.RepositorioDeSelo;
import br.com.alura.escola.gameficacao.dominio.selo.Selo;
import br.com.alura.escola.shared.dominio.CPF;
import br.com.alura.escola.shared.dominio.evento.Evento;
import br.com.alura.escola.shared.dominio.evento.Ouvinte;
import br.com.alura.escola.shared.dominio.evento.TipoDeEvento;

public class GeraSeloAlunoNovato extends Ouvinte {
    private final RepositorioDeSelo repositorioDeSelo;

    public GeraSeloAlunoNovato(RepositorioDeSelo repositorioDeSelo) {
        this.repositorioDeSelo = repositorioDeSelo;
    }

    @Override
    protected void reageAo(Evento evento) {
        CPF cpfAluno = (CPF) evento.informcoes().get("cpf");
        Selo novato = new Selo(cpfAluno, "Novato ");

        repositorioDeSelo.adicionar(novato);
        System.out.println("Aluno do CPF: " + cpfAluno.getNumero() + " ganhou o selo: Novato");
    }

    @Override
    protected boolean deveProcessar(Evento evento) {
        return evento.tipo() == TipoDeEvento.ALUNO_MATRICULADO;
    }
}
