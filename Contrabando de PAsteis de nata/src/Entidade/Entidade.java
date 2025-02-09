package Entidade;

public abstract class Entidade {
    protected String nome;
    protected int vidaMaxima;
    protected int vidaAtual;
    protected int forca;
    protected int defesa;

    public Entidade(String nome, int vidaMaxima, int vidaAtual, int forca, int defesa) {
        this.nome = nome;
        this.vidaMaxima = vidaMaxima;
        this.vidaAtual = vidaAtual;
        this.forca = forca;
        this.defesa = defesa;
    }

    public abstract void ExibirDetalhes();
}
