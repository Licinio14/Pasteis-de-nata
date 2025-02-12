package Entidade.Heroi;

import Entidade.Entidade;
import Entidade.NPC.Inimigo;
import Itens.ArmaPrincipal;
import Itens.CriacoesItens.CriarArmasPrincipais;
import Itens.ItensHeroi;
import Tools.Tools;

import java.util.ArrayList;

public abstract class Personagem extends Entidade {
    protected int lvl;
    protected int gold;
    protected ArmaPrincipal arma;
    protected ArrayList<ItensHeroi> inventario;

    /**
     * Cria o heroi com quem o utilizador vai jogar
     * @param nome Nome do Heroi (string)
     * @param vidaMaxima Vida maxima com que o heroi vai começar (int)
     * @param forca
     * @param defesa
     * @param lvl
     * @param gold
     */
    public Personagem(String nome, int vidaMaxima, int forca, int defesa, int lvl, int gold) {
        super(nome, vidaMaxima, forca, defesa);
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

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public void setArma(ArmaPrincipal arma) {
        this.arma = arma;
    }

    public void AddInventario(ItensHeroi hero) {
        inventario.add(hero);
    }

    public void RmvInventario(int index) {
        inventario.remove(index);
    }

    public void ExibirDetalhes(){
        System.out.println("\n|Nome: " + super.nome + "|\t|❤\uFE0F" + super.vidaAtual + "❤\uFE0F|\t|\uD83D\uDCAA" + super.forca + "\uD83D\uDCAA|\t|\uD83D\uDEE1\uFE0F" + super.defesa + "\uD83D\uDEE1\uFE0F|\t|\uD83C\uDF96" + this.lvl + "\uD83C\uDF96|\t|\uD83E\uDE99" + this.gold + "\uD83E\uDE99|\n");
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

    public abstract boolean Atacar(Inimigo inimigo);

    //public abstract void MostrarStatus();

    @Override
    public void MostrarStatus() {
        String cor;
        if (super.vidaAtual < 300){
            cor = Tools.ConsoleColors.RED_BOLD;
        }else if (super.vidaAtual > 300 && super.vidaAtual < 600){
            cor = Tools.ConsoleColors.PURPLE_BOLD;
        }else if (super.vidaAtual > 600 && super.vidaAtual < 900){
            cor = Tools.ConsoleColors.YELLOW_BOLD;
        }else {
            cor = Tools.ConsoleColors.GREEN_BOLD;
        }

        System.out.print(cor + "|Nome: " + super.nome + "|\t" + Tools.ConsoleColors.BLUE_BOLD + "|❤\uFE0F" + super.vidaAtual + "❤\uFE0F|\t|\uD83D\uDCAA" + super.forca + "\uD83D\uDCAA|\t|\uD83D\uDEE1\uFE0F" + super.defesa + "\uD83D\uDEE1\uFE0F|\t|\uD83E\uDE99" + this.gold + "\uD83E\uDE99|" + Tools.ConsoleColors.RESET);
    }

    public void MostrarVida() {
        String cor;
        int count = 0;
        if (super.vidaAtual < 300){
            cor = Tools.ConsoleColors.RED_BACKGROUND_BRIGHT;
        }else if (super.vidaAtual > 300 && super.vidaAtual < 600){
            cor = Tools.ConsoleColors.PURPLE_BACKGROUND_BRIGHT;
        }else if (super.vidaAtual > 600 && super.vidaAtual < 900){
            cor = Tools.ConsoleColors.YELLOW_BACKGROUND_BRIGHT;
        }else {
            cor = Tools.ConsoleColors.GREEN_BACKGROUND_BRIGHT;
        }

        for (int i = 0; i < 61; i++) {
            System.out.print(cor + " " + Tools.ConsoleColors.RESET);
        }
    }
}
