package Itens;

public final  class ArmaPrincipal extends ItensHeroi{
    private int Ataque;
    private boolean EspecialDisponivel;
    private int EspecialDano;
    private int DefesaDano;
    private String Especial;

    /**
     * Construir uma arma principal
     * @param nome Nome pretendido para a arma (String)
     * @param preco Preço pretendido para a arma (int)
     * @param ataque Dano pretendido para a arma (int)
     * @param especialDano Dano pretendido para o especial (int)
     * @param defesaDano Qebra de defesa pretendida para o especial, numero negativo! (int)
     * @param especial Descrição do que o especial faz (String)
     */
    public ArmaPrincipal(String nome, int preco, int ataque, int especialDano, int defesaDano, String especial) {
        super(nome, preco);
        Ataque = ataque;
        EspecialDisponivel = true;
        EspecialDano = especialDano;
        DefesaDano = defesaDano;
        Especial = especial;
    }

    public int getAtaque() {
        return Ataque;
    }

    public boolean isEspecialDisponivel() {
        return EspecialDisponivel;
    }

    public int getEspecialDano() {
        return EspecialDano;
    }

    public int getDefesaDano() {
        return DefesaDano;
    }

    public String getEspecial() {
        return Especial;
    }

    public void setEspecialDisponivel(boolean especialDisponivel) {
        EspecialDisponivel = especialDisponivel;
    }

    /**
     * Mostra os detalhes da arma
     */
    @Override
    protected void MostrarDetalhes() {
        System.out.println("⚔\uFE0F" + super.getNome() + "⚔\uFE0F");
        System.out.println("\uD83D\uDDE1\uFE0F " + this.Ataque  + "\t\uD83D\uDCA5 " + this.EspecialDano + "\t\uD83D\uDEE1\uFE0F " + this.DefesaDano);
        System.out.println("\uD83C\uDFAB " + this.Especial + " \uD83C\uDFAB" );
    }
}
