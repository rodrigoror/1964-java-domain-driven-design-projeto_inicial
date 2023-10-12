package br.com.alura.escola.gamificacao.dominio.selo;

import java.util.List;

public interface RepositorioDeSelos {

        void adicionar(Selo selo);

        List<Selo> obterPorCPF(String cpfDoAluno);

}
