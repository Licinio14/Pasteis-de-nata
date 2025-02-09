package Entidade.NPC;

import Entidade.Entidade;

import java.util.Random;

public class Inimigo extends Entidade {
    protected int gold;
    protected int pocao;

    public Inimigo(String nome, int vidaMaxima, int vidaAtual, int forca, int defesa, int gold) {
        Random rd = new Random();
        super(nome, vidaMaxima, vidaAtual, forca, defesa);
        this.gold = gold;
        this.pocao = rd.nextInt(4);
    }

    public int getGold() {
        return gold;
    }

    public int getPocao() {
        return pocao;
    }
}
