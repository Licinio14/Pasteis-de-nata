package Itens;

import Enums.TipoConsumivel;
import Enums.TipoHeroi;

public abstract class Consumivel extends ItensHeroi{
    protected TipoConsumivel tipo;
    protected boolean arremesavel;
    protected TipoHeroi podeUsar;

    /**
     * Cria um consumivel
     * @param nome Nome do consumivel (string)
     * @param preco Preço do consumivel (int)
     * @param tipo Tipo de consumivel (ENUM TipoConsumivel)
     * @param arremesavel Se pode ser arremesada (boolean)
     * @param podeUsar Quem pode usar (Enum TipoHeroi)
     */
    public Consumivel(String nome, int preco, TipoConsumivel tipo, boolean arremesavel, TipoHeroi podeUsar) {
        super(nome, preco);
        this.tipo = tipo;
        this.arremesavel = arremesavel;
        this.podeUsar = podeUsar;
    }

    /**
     * Retorna o tipo do consumivel
     * @return (ENUM TipoConsumivel)
     */
    public TipoConsumivel getTipo() {
        return tipo;
    }

    /**
     * Retorna se pode ser arremesavel
     * @return (boolean)
     */
    public boolean isArremesavel() {
        return arremesavel;
    }

    /**
     * Retorna o tipo de heroi que pode usar
     * @return (ENUM TipoHeroi)
     */
    public TipoHeroi getPodeUsar() {
        return podeUsar;
    }

    /**
     * Da print dos detalhes do consumivel
     */
    public abstract void ExibirDetalhes();
}
