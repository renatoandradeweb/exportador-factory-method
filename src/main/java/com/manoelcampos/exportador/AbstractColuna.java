package com.manoelcampos.exportador;

import java.util.function.Function;

public abstract class AbstractColuna implements Coluna {
    private String titulo;

    private Function<Produto, Object> funcaoValor;

    AbstractColuna(String titulo, Function<Produto, Object> funcaoValor) {
        this.titulo = titulo;
        this.funcaoValor = funcaoValor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String exportarCabecalho() {
        return abrir(titulo) + fechar();
    }

    @Override
    public String exportarDado(Produto prod) {
        String valor = funcaoValor.apply(prod).toString();
        return abrir(valor) + fechar();
    }
}
