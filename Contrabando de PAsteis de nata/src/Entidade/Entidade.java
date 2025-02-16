package Entidade;

import Itens.Pocao;

public abstract class Entidade {
    protected String nome;
    protected int vidaMaxima;
    protected int vidaAtual;
    protected int forca;
    protected int bufForca = 0;
    protected int defesa;
    protected int bufDefesa = 0;

    public Entidade(String nome, int vidaMaxima, int forca, int defesa) {
        this.nome = nome;
        this.vidaMaxima = vidaMaxima;
        this.vidaAtual = vidaMaxima;
        this.forca = forca;
        this.defesa = defesa;
    }

    public String getNome() {
        return nome;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public int getVidaAtual() {
        return vidaAtual;
    }

    public int getForca() {
        return forca;
    }

    public int getDefesa() {
        return defesa;
    }

    public int getBufForca() {
        return bufForca;
    }

    public int getBufDefesa() {
        return bufDefesa;
    }

    public void setVidaMaxima(int vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
    }

    public void setVidaAtual(int vidaAtual) {
        this.vidaAtual = vidaAtual;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public void setBufForca(int bufForca) {
        this.bufForca = bufForca;
    }

    public void setBufDefesa(int bufDefesa) {
        this.bufDefesa = bufDefesa;
    }

    public abstract void ExibirDetalhes();


    public void usarPocao(Pocao pocao) {
        if (this.vidaAtual + pocao.getVida() >= this.vidaMaxima) {
            this.vidaAtual = this.vidaMaxima;
        } else if (this.vidaAtual + pocao.getVida() < this.vidaMaxima) {
            this.vidaAtual += pocao.getVida();
        }

        this.bufForca += pocao.getAtaque();

        if (this.bufDefesa + this.defesa + pocao.getDefesa() >= 100) {
            this.bufDefesa += 100;
        }else {
            this.bufDefesa += pocao.getDefesa();
        }


        this.vidaAtual -= pocao.getDano();

    }

    public abstract void MostrarStatus();

    public void BufReset(){
        this.bufDefesa = 0;
        this.bufForca = 0;
    }
}
