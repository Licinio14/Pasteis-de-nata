package Entidade.Heroi;

import Entidade.Entidade;
import Entidade.NPC.Inimigo;
import Itens.ArmaPrincipal;
import Itens.Arremesavel;
import Itens.CriacoesItens.CriarArmasPrincipais;
import Itens.ItensHeroi;
import Itens.Pocao;
import Tools.Tools;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

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

    /**
     * Retorna o nivel do heroi
     * @return (int)
     */
    public int getLvl() {
        return lvl;
    }

    /**
     * Retorna a quantidade de gold que o heroi tem
     * @return (int)
     */
    public int getGold() {
        return gold;
    }

    /**
     * Retorna a arma que o heroi tem
     * @return (ArmaPrincipal)
     */
    public ArmaPrincipal getArma() {
        return arma;
    }

    /**
     * Muda o nivel do heroi
     * @param lvl (int)
     */
    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    /**
     * Muda o gold que o heroi tem
     * @param gold (int)
     */
    public void setGold(int gold) {
        this.gold = gold;
    }

    /**
     * Muda a arma que o heroi tem equipada
     * @param arma (ArmaPrincipal)
     */
    public void setArma(ArmaPrincipal arma) {
        this.arma = arma;
    }

    /**
     * Adiciona um item ao inventario do heroi
     * @param hero (ItensHeroi)
     */
    public void AddInventario(ItensHeroi hero) {
        inventario.add(hero);
    }

    /**
     * Remove o item do inventario do heroi
     * @param item (ItensHeroi)
     */
    public void RmvInventario(ItensHeroi item) {
        inventario.remove(item);
    }

    /**
     * Mostra os detalhes do heroi
     */
    public void ExibirDetalhes(){
        System.out.println("\n|Nome: " + super.nome + "|\t|❤\uFE0F" + super.vidaAtual + "❤\uFE0F|\t|\uD83D\uDCAA" + super.forca + "\uD83D\uDCAA|\t|\uD83D\uDEE1\uFE0F" + super.defesa + "\uD83D\uDEE1\uFE0F|\t|\uD83C\uDF96" + this.lvl + "\uD83C\uDF96|\t|\uD83E\uDE99" + this.gold + "\uD83E\uDE99|\n");
        this.arma.ExibirDetalhes();
        ExibirInventario();
    }

    /**
     * Mostra o inventario do heroi
     */
    public void ExibirInventario(){
        int i = 0;
        System.out.println();
        for (ItensHeroi item : inventario) {
            item.ExibirDetalhes();
            System.out.println();
        }
    }

    /**
     * Metudo para iniciar a batalha entre o heroi e o inimigo
     * @param inimigo inimigo com quem vai batalhar (Inimigo)
     * @return true se o heroi ganhar / false se o heroi perder
     */
    public abstract boolean Atacar(Inimigo inimigo);


    /**
     * Mostra os status basicos do heroi
     */
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

        System.out.print(cor + "|Nome: " + super.nome + "|\t" + Tools.ConsoleColors.BLUE_BOLD + "|❤\uFE0F" + super.vidaAtual + "❤\uFE0F|\t|\uD83D\uDCAA" + (super.forca + super.bufForca + this.getArma().getAtaque()) + "\uD83D\uDCAA|\t|\uD83D\uDEE1\uFE0F" + (super.defesa + super.bufDefesa) + "\uD83D\uDEE1\uFE0F|\t|\uD83E\uDE99" + this.gold + "\uD83E\uDE99|" + Tools.ConsoleColors.RESET);
    }

    /**
     * Mostra uma barra de vida colorida do heroi
     */
    public void MostrarVida() {
        String cor;
        int count = 0, quantidade;
        if (super.vidaAtual < 100){
            cor = Tools.ConsoleColors.RED_BACKGROUND_BRIGHT;
            quantidade = 0;
        }else if (super.vidaAtual < 300){
            cor = Tools.ConsoleColors.RED_BACKGROUND_BRIGHT;
            quantidade = 1;
        }else if (super.vidaAtual >= 300 && super.vidaAtual < 600){
            cor = Tools.ConsoleColors.PURPLE_BACKGROUND_BRIGHT;
            quantidade = 2;
        }else if (super.vidaAtual >= 600 && super.vidaAtual < 900){
            cor = Tools.ConsoleColors.YELLOW_BACKGROUND_BRIGHT;
            quantidade = 3;
        }else {
            cor = Tools.ConsoleColors.GREEN_BACKGROUND_BRIGHT;
            quantidade = 4;
        }

        for (int i = 0; i < 60; i++) {

            switch (quantidade){
                case 0:
                    if (i<5){
                        System.out.print(cor + " " + Tools.ConsoleColors.RESET);
                    }else {
                        System.out.print(" ");
                    }
                    break;
                case 1:
                    if (i<15){
                        System.out.print(cor + " " + Tools.ConsoleColors.RESET);
                    }else {
                        System.out.print(" ");
                    }
                    break;
                case 2:
                    if (i<30){
                        System.out.print(cor + " " + Tools.ConsoleColors.RESET);
                    }else {
                        System.out.print(" ");
                    }
                    break;
                case 3:
                    if (i<45){
                        System.out.print(cor + " " + Tools.ConsoleColors.RESET);
                    }else {
                        System.out.print(" ");
                    }
                    break;
                case 4:
                    System.out.print(cor + " " + Tools.ConsoleColors.RESET);
                    break;
                default:
                    System.out.println(Tools.ConsoleColors.RED + "ERRO AO EXIBIR A BARRA DE VIDA");
            }

        }
    }

    /**
     * Metudo para mostrar e usar poções fora da batalha
     */
    public void MostrarUsarPocaoDoInventario() {
        Scanner in = new Scanner(System.in);
        ArrayList<Pocao> pocaos = new ArrayList<>();
        int count, resposta = 0, index = 0;

        for (ItensHeroi item : this.inventario) {
            if (item instanceof Pocao) {
                pocaos.add((Pocao) item);
            }
        }

        do {

            Tools.Clear();

            System.out.println(Tools.ConsoleColors.RED + """
                \n------------------------------------------------------------------------------------------
                |                                   ⚗\uFE0F Poções ⚗\uFE0F                                         |
                ------------------------------------------------------------------------------------------""");

            count = 0;

            for (Pocao item : pocaos) {
                System.out.print("|" + ++count + "| - ");
                item.ExibirDetalhes();
            }

            System.out.println(Tools.ConsoleColors.RESET);

            this.MostrarStatus();

            do {
                System.out.println(Tools.ConsoleColors.BLUE + "\n\nQual é poção que desejas usar?\t\t\t|0 - Sair|");

                try {
                    resposta = in.nextInt();

                    if (resposta == 0){
                        return;
                    }else if (resposta > 0 && resposta <= pocaos.size()) {
                        index = resposta - 1;

                        if (this.vidaAtual + pocaos.get(index).getVida() > this.vidaMaxima) {
                            System.out.println(Tools.ConsoleColors.PURPLE + "O maximo que a tua vida pode atingir é: " + this.vidaMaxima + ". Tens a certeza que queres usar a poção?\n|1 - Sim|\t\t|2 - Não|");

                            do {
                                try {
                                    in = new Scanner(System.in);
                                    resposta = in.nextInt();
                                    if (resposta == 1) {
                                        this.usarPocao(pocaos.get(index));
                                        System.out.println(Tools.ConsoleColors.GREEN + "Tomas-te a poção " + pocaos.get(index).getNome() + Tools.ConsoleColors.RESET);
                                        this.RmvInventario(pocaos.get(index));
                                        pocaos.remove(index);
                                        break;
                                    } else if (resposta == 2) {
                                        break;
                                    } else {
                                        System.out.println(Tools.ConsoleColors.PURPLE + "Insira uma opção valida!" + Tools.ConsoleColors.RESET);
                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println(Tools.ConsoleColors.PURPLE + "Insira apenas números!!!" + Tools.ConsoleColors.RESET);
                                }
                            } while (true);
                        }else {
                            this.usarPocao(pocaos.get(index));
                            System.out.println(Tools.ConsoleColors.GREEN + "Tomas-te a poção " + pocaos.get(index).getNome() + Tools.ConsoleColors.RESET);
                            this.RmvInventario(pocaos.get(index));
                            pocaos.remove(index);
                        }



                        break;
                    }else {
                        System.out.println(Tools.ConsoleColors.PURPLE + "Insira uma opção valida!" + Tools.ConsoleColors.RESET);
                    }
                }catch (InputMismatchException e) {
                    System.out.println(Tools.ConsoleColors.PURPLE + "Insira apenas números!" + Tools.ConsoleColors.RESET);
                }
            }while (true);


        }while (true);


    }
}
