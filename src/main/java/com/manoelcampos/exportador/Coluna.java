package com.manoelcampos.exportador;

public interface Coluna {
    /**
     * Retorna o código para abertura de uma coluna de uma tabela em um formato de dados específico.
     * @param valor valor a ser exibido na coluna
     * @return
     */
    String abrir(String valor);

    /**
     * Retorna o código para fechamento de uma coluna de uma tabela em um formato de dados específico.
     * @return
     */
    String fechar();

    String exportarCabecalho();

    String exportarDado(Produto prod);

}
