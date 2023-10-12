package br.com.alura.escola.academico.dominio.aluno;

import br.com.alura.escola.shared.evento.Evento;
import br.com.alura.escola.shared.dominio.CPF;
import br.com.alura.escola.shared.evento.TipoDeEvento;

import java.time.LocalDateTime;
import java.util.Map;

public class AlunoMatriculado implements Evento {

    private final CPF cpfDoAluno;
    private final LocalDateTime momento;

    public AlunoMatriculado(CPF cpfDoAluno) {
        this.cpfDoAluno = cpfDoAluno;
        this.momento = LocalDateTime.now();
    }

    @Override
    public LocalDateTime momento() {
        return this.momento;
    }

    @Override
    public TipoDeEvento tipo() {
        return TipoDeEvento.ALUNO_MATRICULADO;
    }

    @Override
    public Map<String, Object> informacoes() {
        return Map.of(
                "cpf", this.cpfDoAluno.getNumero()
        );
    }

    public String getCpfDoAluno() {
        return cpfDoAluno.getNumero();
    }

    @Override
    public String toString() {
        return "AlunoMatriculado{" +
                "cpfDoAluno=" + cpfDoAluno.getNumero() +
                ", momento=" + momento +
                '}';
    }
}
