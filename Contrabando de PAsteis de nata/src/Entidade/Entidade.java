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

    /**
     * Metudo para criar uma entidade
     * @param nome nome da entidade (string)
     * @param vidaMaxima vida inicial da entidade (int)
     * @param forca força da entidade (int)
     * @param defesa defesa da entidade (int)
     */
    public Entidade(String nome, int vidaMaxima, int forca, int defesa) {
        this.nome = nome;
        this.vidaMaxima = vidaMaxima;
        this.vidaAtual = vidaMaxima;
        this.forca = forca;
        this.defesa = defesa;
    }

    /**
     * Retorna o nome da entidade
     * @return (string)
     */
    public String getNome() {
        return nome;
    }

    /**
     * Retorna a vida maxima que o heroi pode atingir naquele momento
     * @return (int)
     */
    public int getVidaMaxima() {
        return vidaMaxima;
    }

    /**
     * Retorna a vida atual do heroi
     * @return (int)
     */
    public int getVidaAtual() {
        return vidaAtual;
    }

    /**
     * Retorna a força do heroi
     * @return (int)
     */
    public int getForca() {
        return forca;
    }

    /**
     * Retorna a defesa do heroi
     * @return (int)
     */
    public int getDefesa() {
        return defesa;
    }

    /**
     * Retorna a quantidade de buf de força que o heroi tem
     * @return (int)
     */
    public int getBufForca() {
        return bufForca;
    }

    /**
     * Retorna a quantidade de buf de defesa que o heroi tem
     * @return (int)
     */
    public int getBufDefesa() {
        return bufDefesa;
    }

    /**
     * Muda a vida maxima que o heroi pode ter
     * @param vidaMaxima (int)
     */
    public void setVidaMaxima(int vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
    }

    /**
     * Muda a vida atual que o heroi tem
     * @param vidaAtual (int)
     */
    public void setVidaAtual(int vidaAtual) {
        this.vidaAtual = vidaAtual;
    }

    /**
     * Muda a força que o heroi tem
     * @param forca (int)
     */
    public void setForca(int forca) {
        this.forca = forca;
    }

    /**
     * Muda a defesa que o heroi tem
     * @param defesa (int)
     */
    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    /**
     * Muda o buff de força que o heroi tem
     * @param bufForca (int)
     */
    public void setBufForca(int bufForca) {
        this.bufForca = bufForca;
    }

    /**
     * Muda o buf de defesa que o heroi tem
     * @param bufDefesa (int)
     */
    public void setBufDefesa(int bufDefesa) {
        this.bufDefesa = bufDefesa;
    }

    /**
     * Mostra os detalhes da entidade
     */
    public abstract void ExibirDetalhes();


    /**
     * Metudo para usar uma poção
     * @param pocao poção a ser usada (Pocao)
     */
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

    /**
     * Mostra os status basicos de uma entidade
     */
    public abstract void MostrarStatus();

    /**
     * Da reset aos bufs da entidade para 0
     */
    public void BufReset(){
        this.bufDefesa = 0;
        this.bufForca = 0;
    }
}
