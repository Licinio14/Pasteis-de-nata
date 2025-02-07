package Itens;

import Enums.TipoHeroi;

public final  class ArmaPrincipal extends ItensHeroi{
    private int Ataque;
    private boolean EspecialDisponivel;
    private int EspecialDano;
    private int DefesaDano;
    private String Especial;
    private TipoHeroi quemPodeUsar;

    /**
     * Construir uma arma principal
     * @param nome Nome pretendido para a arma (String)
     * @param preco Preço pretendido para a arma (int)
     * @param ataque Dano pretendido para a arma (int)
     * @param especialDano Dano pretendido para o especial (int)
     * @param defesaDano Qebra de defesa pretendida para o especial, numero negativo! (int)
     * @param especial Descrição do que o especial faz (String)
     */
    public ArmaPrincipal(String nome, int preco, int ataque, int especialDano, int defesaDano, String especial,TipoHeroi tipo) {
        super(nome, preco);
        Ataque = ataque;
        EspecialDisponivel = true;
        EspecialDano = especialDano;
        DefesaDano = defesaDano;
        Especial = especial;
        quemPodeUsar = tipo;
    }

    /**
     * Retorna o ataque da arma
     * @return (int)
     */
    public int getAtaque() {
        return Ataque;
    }

    /**
     * Retorna se o Ataque especial está disponivel
     * @return (boolean)
     */
    public boolean isEspecialDisponivel() {
        return EspecialDisponivel;
    }

    /**
     * Retorna o dano do ataque especial
     * @return (int)
     */
    public int getEspecialDano() {
        return EspecialDano;
    }

    /**
     * Retorna o dano que o ataque especial da na defesa do opunente
     * @return (int)
     */
    public int getDefesaDano() {
        return DefesaDano;
    }

    /**
     * Retorna o que o especial da arma faz
     * @return (string)
     */
    public String getEspecial() {
        return Especial;
    }

    /**
     * Muda o especial para disponivel ou usado
     * @param especialDisponivel (boolean)
     */
    public void setEspecialDisponivel(boolean especialDisponivel) {
        EspecialDisponivel = especialDisponivel;
    }

    /**
     * Mostra os detalhes da arma
     */
    @Override
    public void ExibirDetalhes() {

        System.out.printf("⚔\uFE0F" + super.getNome() + "⚔\uFE0F" + "|\uD83D\uDDE1\uFE0F " + this.Ataque + " \uD83D\uDDE1\uFE0F|" + "|\uD83D\uDCA5 " + this.EspecialDano + "\uD83D\uDCA5|" +"|\uD83D\uDEE1\uFE0F " + this.DefesaDano + "\uD83D\uDEE1\uFE0F|");
        System.out.printf("\n\uD83C\uDFAB " + this.Especial + " \uD83C\uDFAB" + "\t \uD83E\uDE99" + super.preco + "\uD83E\uDE99");
        super.getTiposHeroiAceites();

    }
}
