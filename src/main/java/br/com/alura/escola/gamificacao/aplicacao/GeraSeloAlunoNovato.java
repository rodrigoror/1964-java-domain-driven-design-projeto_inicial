package br.com.alura.escola.gamificacao.aplicacao;

import br.com.alura.escola.gamificacao.dominio.selo.RepositorioDeSelos;
import br.com.alura.escola.gamificacao.dominio.selo.Selo;
import br.com.alura.escola.shared.dominio.CPF;
import br.com.alura.escola.shared.evento.Evento;
import br.com.alura.escola.shared.evento.Ouvinte;
import br.com.alura.escola.shared.evento.TipoDeEvento;

import java.util.Map;

import static java.lang.System.*;

public class GeraSeloAlunoNovato extends Ouvinte {

    private RepositorioDeSelos repositorioDeSelos;

    public GeraSeloAlunoNovato(RepositorioDeSelos repositorioDeSelos) {
        super();
        this.repositorioDeSelos = repositorioDeSelos;
    }

    public void reageAo(Evento evento) {
        out.println("Evento recebido: " + evento);
        Map<String, Object> info = evento.informacoes();
        Selo novato = new Selo(new CPF(info.get("cpf").toString()), "Novato");
        repositorioDeSelos.adicionar(novato);
        out.printf("Aluno com CPF %s ganhou o selo %s%n",
                novato.getCpfDoAluno().getNumero(),
                novato.getNome());
    }

    public boolean deveProcessar(Evento evento) {
        return evento.tipo() == TipoDeEvento.ALUNO_MATRICULADO;
    }
}
