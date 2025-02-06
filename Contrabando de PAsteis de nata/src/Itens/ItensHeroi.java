package Itens;

import Enums.TipoHeroi;

import java.util.ArrayList;

public abstract class ItensHeroi {
    protected String nome;
    protected int preco;
    protected ArrayList<TipoHeroi> tiposHeroiAceites;

    public ItensHeroi(String nome, int preco) {
        this.nome = nome;
        this.preco = preco;
        this.tiposHeroiAceites = new ArrayList<TipoHeroi>();
    }

    public String getNome() {
        return nome;
    }

    public int getPreco() {
        return preco;
    }

    public ArrayList<TipoHeroi> getTiposHeroiAceites() {
        return tiposHeroiAceites;
    }

    protected void AdicionaTipoHeroi(TipoHeroi tipoHeroi) {
        this.tiposHeroiAceites.add(tipoHeroi);
    }

    /**
     * Mostra os detalhes do item
     */
    protected abstract void MostrarDetalhes();
}
