package br.com.alura.escola.academico.dominio.aluno;

import br.com.alura.escola.shared.evento.Evento;
import br.com.alura.escola.shared.evento.Ouvinte;

import java.time.format.DateTimeFormatter;

public class LogDeAlunoMatriculado extends Ouvinte {

    public void reageAo(Evento evento) {
        System.out.println(
                String.format(
                        "Aluno com CPF %s matriculado em %s", ((AlunoMatriculado) evento).getCpfDoAluno(), getMomentoFormatado(evento)
                ));
    }

    private String getMomentoFormatado(Evento evento) {
        return evento.momento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
    }


    @Override
    protected boolean deveProcessar(Evento evento) {
        return evento instanceof AlunoMatriculado;
    }
}
