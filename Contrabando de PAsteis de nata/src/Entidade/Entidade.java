package Entidade;

public abstract class Entidade {
    protected String nome;
    protected int vidaMaxima;
    protected int vidaAtual;
    protected int Força;
    protected int defesa;

    public Entidade(String nome, int vidaMaxima, int vidaAtual, int força, int defesa) {
        this.nome = nome;
        this.vidaMaxima = vidaMaxima;
        this.vidaAtual = vidaAtual;
        Força = força;
        this.defesa = defesa;
    }

    public abstract void ExibirDetalhes();
}
