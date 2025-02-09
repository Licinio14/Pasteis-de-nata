package Entidade.NPC;

import Entidade.Entidade;

import java.util.Random;

public class Inimigo extends Entidade {
    Random rd = new Random();
    protected int gold;
    protected int pocao;

    public Inimigo(String nome, int vidaMaxima, int forca, int defesa, int gold) {
        super(nome, vidaMaxima, forca, defesa);
        this.gold = gold;
        this.pocao = rd.nextInt(3);
    }

    public int getGold() {
        return gold;
    }

    public int getPocao() {
        return pocao;
    }

    @Override
    public void ExibirDetalhes() {
        System.out.println("\n|Nome: " + super.nome + "|\t|❤\uFE0F" + super.vidaMaxima + "❤\uFE0F|\t|\uD83D\uDCAA" + super.forca + "\uD83D\uDCAA|\t|\uD83D\uDEE1\uFE0F" + super.defesa + "\uD83D\uDEE1\uFE0F|\t|\uD83E\uDE99" + this.gold + "\uD83E\uDE99|\n");
    }

}
