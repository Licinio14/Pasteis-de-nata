package Entidade.Heroi;

import Entidade.Entidade;
import Enums.TipoHeroi;
import Itens.ArmaPrincipal;
import Itens.CriacoesItens.CriarArmasPrincipais;
import Itens.ItensHeroi;
import Itens.Pocao;

import java.util.ArrayList;

public class Personagem extends Entidade {
    protected int lvl;
    protected int gold;
    protected ArmaPrincipal arma;
    protected ArrayList<ItensHeroi> inventario;

    /**
     * Cria o heroi com quem o utilizador vai jogar
     * @param nome Nome do Heroi (string)
     * @param vidaMaxima Vida maxima com que o heroi vai começar (int)
     * @param vidaAtual
     * @param forca
     * @param defesa
     * @param lvl
     * @param gold
     */
    public Personagem(String nome, int vidaMaxima, int vidaAtual, int forca, int defesa, int lvl, int gold) {
        super(nome, vidaMaxima, vidaAtual, forca, defesa);
        this.lvl = lvl;
        this.gold = gold;
        this.arma = CriarArmasPrincipais.maos;
        this.inventario = new ArrayList<>();
    }

    public int getLvl() {
        return lvl;
    }

    public int getGold() {
        return gold;
    }

    public ArmaPrincipal getArma() {
        return arma;
    }

    public void AddInventario(ItensHeroi hero) {
        inventario.add(hero);
    }

    public void RmvInventario(int index) {
        inventario.remove(index);
    }

    public void ExibirDetalhes(){
        System.out.println("\nNome: " + super.nome + "\tVida Maxima: " + super.vidaMaxima + "\tForça: " + super.forca + "\tDefesa: " + super.defesa + "\tLvl: " + this.lvl + "\tGold: " + this.gold + "\n");
        this.arma.ExibirDetalhes();
        ExibirInventario();
    }

    public void ExibirInventario(){
        int i = 0;
        System.out.println();
        for (ItensHeroi item : inventario) {
            item.ExibirDetalhes();
            System.out.println();
        }
    }
}
