package br.com.alura.escola.gamificacao.infra.selo;

import br.com.alura.escola.gamificacao.dominio.selo.RepositorioDeSelos;
import br.com.alura.escola.gamificacao.dominio.selo.Selo;

import java.util.ArrayList;
import java.util.List;

public class RepositorioDeSelosEmMemoria implements RepositorioDeSelos {

    private List<Selo> selos = new ArrayList<>();

    @Override
    public void adicionar(Selo selo) {
        this.selos.add(selo);
    }

    @Override
    public List<Selo> obterPorCPF(String cpfDoAluno) {
        List<Selo> list = new ArrayList<>();
        for (Selo a : this.selos) {
            if (a.getCpfDoAluno().equals(cpfDoAluno)) {
                list.add(a);
            }
        }
        return list;
    }
}
