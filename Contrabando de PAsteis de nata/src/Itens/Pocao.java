package Itens;

import Enums.TipoConsumivel;
import Enums.TipoHeroi;

public final class Pocao extends Consumivel {
    private int vida;
    private int ataque;
    private int defesa;
    private int dano;
    private int turnos;
    private String descricao;

    /**
     * Cria uma poção de qualquer tipo
     * @param nome Nome da poção (String)
     * @param preco Preço da poção (int)
     * @param tipo Tipo da poção (ENUM TipoConsumivel)
     * @param arremesavel Se pode ser atirada (boolean)
     * @param vida Quanta vida vai recuperar (int)
     * @param ataque Quanto ataque vai dar (int)
     * @param defesa Quanta defesa vai dar (int)
     * @param dano Qanto dano vai dar (int)
     * @param turnos Quantos turnos vai durar (int)
     * @param descricao Descrição de todos os efeitos e historia da poção (String)
     */
    public Pocao(String nome, int preco, TipoConsumivel tipo, boolean arremesavel, int vida, int ataque, int defesa, int dano, int turnos, String descricao) {
        super(nome, preco, tipo, arremesavel, TipoHeroi.TODOS);
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.dano = dano;
        this.turnos = turnos;
        this.descricao = descricao;
    }

    /**
     * Retorna a vida que a poção restaura
     * @return (int)
     */
    public int getVida() {
        return vida;
    }

    /**
     * Retorna o ataque que a poção ira adicionar ao utilizador
     * @return (int)
     */
    public int getAtaque() {
        return ataque;
    }

    /**
     * Retorna a defesa dada ou retirada (numero negativo) ao utilizador
     * @return (int)
     */
    public int getDefesa() {
        return defesa;
    }

    /**
     * Retorna o dano que a poção ira causar
     * @return (int)
     */
    public int getDano() {
        return dano;
    }

    /**
     * Retorna a quantidade de turnos que a poção tera efeito
     * @return (int)
     */
    public int getTurnos() {
        return turnos;
    }

    /**
     * Retorna a descrição da poção
     * @return (string)
     */
    public String getDescricao() {
        return descricao;
    }

    public void ExibirDetalhes(){
        System.out.printf("|⚗\uFE0F " + super.nome + " ⚗\uFE0F|" + "|❤\uFE0F\u200D\uD83E\uDE79 " + this.vida + " ❤\uFE0F\u200D\uD83E\uDE79|" + "|\uD83D\uDCAA " + this.ataque + " \uD83D\uDCAA|" + "|\uD83D\uDEE1\uFE0F" + this.defesa + " \uD83D\uDEE1\uFE0F|" + "|\uD83D\uDC94 " + this.dano + " \uD83D\uDC94|" + "|♻\uFE0F " + this.turnos + " ♻\uFE0F|" + "|\uD83E\uDE99" + super.preco + "\uD83E\uDE99|");
        System.out.printf("\n\uD83E\uDE84 " + this.descricao + " \uD83E\uDE84\n");
    }
}
