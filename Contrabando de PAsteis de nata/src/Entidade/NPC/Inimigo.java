package Entidade.NPC;

import Entidade.Entidade;
import Tools.Tools;

import java.util.Random;

public class Inimigo extends Entidade {
    Random rd = new Random();
    protected int gold;
    protected int pocao;

    /**
     * Cria um inimigo
     * @param nome nome do inimigo (string)
     * @param vidaMaxima vida inicial do inimigo (int)
     * @param forca força do inimigo (int)
     * @param defesa defesa do inimigo (int)
     * @param gold quantidade de gold que o inimigo tem (int)
     */
    public Inimigo(String nome, int vidaMaxima, int forca, int defesa, int gold) {
        super(nome, vidaMaxima, forca, defesa);
        this.gold = gold;
        this.pocao = rd.nextInt(2);
    }

    /**
     * Retorna a quantidade de gold que o inimigo tem
     * @return (int)
     */
    public int getGold() {
        return gold;
    }

    /**
     * Retorna a quantidade de poções que o inimigo tem
     * @return (int)
     */
    public int getPocao() {
        return pocao;
    }

    /**
     * Diminui de 1 a quantidade de poções do inimigo sempre que for chamada
     */
    public void setPocao() {
        this.pocao = this.pocao - 1;
    }

    /**
     * Exibe os detalhes do inimigo
     */
    @Override
    public void ExibirDetalhes() {
        System.out.println("\n|Nome: " + super.nome + "|\t|❤\uFE0F" + super.vidaMaxima + "❤\uFE0F|\t|\uD83D\uDCAA" + super.forca + "\uD83D\uDCAA|\t|\uD83D\uDEE1\uFE0F" + super.defesa + "\uD83D\uDEE1\uFE0F|\t|\uD83E\uDE99" + this.gold + "\uD83E\uDE99|\n");
    }

    /**
     * Exibe os detalhes basicos do status do inimigo
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

        System.out.print(cor + "|Nome: " + super.nome + "|\t" + Tools.ConsoleColors.BLUE_BOLD + "|❤\uFE0F" + super.vidaAtual + "❤\uFE0F|\t|\uD83D\uDCAA" + (super.forca + super.bufForca) + "\uD83D\uDCAA|\t|\uD83D\uDEE1\uFE0F" + (super.defesa + super.bufDefesa) + "\uD83D\uDEE1\uFE0F|\t|\uD83E\uDE99" + this.gold + "\uD83E\uDE99|" + Tools.ConsoleColors.RESET);
    }

    /**
     * mostra uma barra de vida colorida conforme a quantidade de vida do inimigo
     */
    public void MostrarVida() {
        String cor;
        int count = 0, quantidade;
        if (super.vidaAtual < 100){
            cor = Tools.ConsoleColors.RED_BACKGROUND_BRIGHT;
            quantidade = 0;
        }else if (super.vidaAtual >= 100 && super.vidaAtual < 300){
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

}
