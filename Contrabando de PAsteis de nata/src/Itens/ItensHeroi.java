package Itens;

import Enums.TipoHeroi;

import java.util.ArrayList;

public abstract class ItensHeroi {
    protected String nome;
    protected int preco;
    protected ArrayList<TipoHeroi> tiposHeroiAceites;

    /**
     * Cria o item
     * @param nome Nome para o item (string)
     * @param preco Preço do item (int)
     */
    public ItensHeroi(String nome, int preco) {
        this.nome = nome;
        this.preco = preco;
        this.tiposHeroiAceites = new ArrayList<TipoHeroi>();
    }

    /**
     * Retorna o nome do item
     * @return (string)
     */
    public String getNome() {
        return nome;
    }

    /***
     * Retorna o preço do item
     * @return (int)
     */
    public int getPreco() {
        return preco;
    }

    /**
     * Da print na consola dos tipos de herois que podem usar o item
     */
    public void getTiposHeroiAceites() {
        System.out.print("\nPode ser usado por: ");
        for (TipoHeroi tipo : tiposHeroiAceites){
            System.out.print(tipo + "\t");
        }
        System.out.println();
    }

    /**
     * Adiciona os tipos de herois que podem usar o item
     * @param tipoHeroi Enum TipoHeroi
     */
    public void AdicionaTipoHeroi(TipoHeroi tipoHeroi) {
        this.tiposHeroiAceites.add(tipoHeroi);
    }

    /**
     * Mostra os detalhes do item
     */
    public abstract void ExibirDetalhes();
}
