package Entidade;

import Itens.Pocao;

public abstract class Entidade {
    protected String nome;
    protected int vidaMaxima;
    protected int vidaAtual;
    protected int forca;
    protected int defesa;

    public Entidade(String nome, int vidaMaxima, int forca, int defesa) {
        this.nome = nome;
        this.vidaMaxima = vidaMaxima;
        this.vidaAtual = 500; //vidaMaxima;
        this.forca = forca;
        this.defesa = defesa;
    }

    public abstract void ExibirDetalhes();

    public void usarPocao(Pocao pocao) {
        if (this.vidaAtual + pocao.getVida() >= this.vidaMaxima) {
            this.vidaAtual = this.vidaMaxima;
        } else if (this.vidaAtual + pocao.getVida() < this.vidaMaxima) {
            this.vidaAtual += pocao.getVida();
        }

        this.forca += pocao.getAtaque();
        this.defesa += pocao.getDefesa();
        this.vidaAtual -= pocao.getDano();

    }
}
