package Itens;

import Enums.TipoConsumivel;
import Enums.TipoHeroi;

public final class Arremesavel extends Consumivel{
    private int dano;
    private String descricao;

    /**
     * Cria uma arma arremesavel
     * @param nome Nome da arma (string)
     * @param preco Preço da arma (int)
     * @param tipo Tipo da arma (ENUM TipoConsumivel)
     * @param dano Dano que vai causar (int)
     * @param descricao Descrição da arma (string)
     */
    public Arremesavel(String nome, int preco, TipoConsumivel tipo, TipoHeroi tipoHeroi, int dano, String descricao) {
        super(nome, preco, tipo, true,tipoHeroi);
        this.dano = dano;
        this.descricao = descricao;
    }

    /**
     * Retorna o dano que a arma vai causar
     * @return (int)
     */
    public int getDano() {
        return dano;
    }

    /**
     * Retorna a descrição da arma
     * @return (string)
     */
    public String getDescricao() {
        return descricao;
    }


    /**
     * Da print na consola dos detalhes da arma arremesavel
     */
    @Override
    public void ExibirDetalhes() {
        System.out.printf("|⚔\uFE0F " + super.nome + " ⚔\uFE0F|" + "|\uD83D\uDDE1\uFE0F " + this.dano + " \uD83D\uDDE1\uFE0F|" + "|\uD83E\uDE99" + super.preco + "\uD83E\uDE99|");
        System.out.printf("\n\uD83E\uDE84 " + this.descricao + " \uD83E\uDE84\n");
    }
}
