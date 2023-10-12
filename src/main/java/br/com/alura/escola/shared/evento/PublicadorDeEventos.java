package br.com.alura.escola.shared.evento;

import java.util.ArrayList;
import java.util.List;

public class PublicadorDeEventos {

    private List<Ouvinte> ouvinteList = new ArrayList<>();
    public void adicionar(Ouvinte ouvinte){
        this.ouvinteList.add(ouvinte);
    }
    public void publicar(Evento evento){
        this.ouvinteList.forEach(o -> o.processa(evento));
    }
}
