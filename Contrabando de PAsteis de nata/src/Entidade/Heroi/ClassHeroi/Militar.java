package Entidade.Heroi.ClassHeroi;

import Entidade.NPC.Inimigo;
import Entidade.Heroi.Personagem;
import Itens.Pocao;
import Tools.Tools;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Militar extends Personagem {

    public Militar(String nome, int vidaMaxima, int forca, int gold) {
        super(nome, vidaMaxima, forca, 20, 1, gold);
    }


    @Override
    public boolean Atacar(Inimigo inimigo) {
        int rondas = 0, ataqueInimigo = 0, ataqueHeroi = 0;
        boolean vali;
        //o inimigo ataca primeiro

        do {


            this.MostrarStatus();
            System.out.print("\t\t\t|VS|\t\t\t\t");
            inimigo.MostrarStatus();
            System.out.println();
            this.MostrarVida();
            System.out.print("\t\t\t|VS|\t\t\t\t");
            inimigo.MostrarVida();


            ataqueInimigo = inimigo.getForca() + inimigo.getBufForca();
            ataqueInimigo -= (int) (ataqueInimigo * ( (double) (this.defesa + this.getBufForca()) / 100));

            if (rondas == 0) {
                System.out.println(Tools.ConsoleColors.YELLOW + "\nTentas pegar na tua arma, porem como ja não és agil, o inimigo consegue te atacar primeiro!" + Tools.ConsoleColors.RESET);
            }

            System.out.println(Tools.ConsoleColors.RED + inimigo.getNome() + " tirou-te " + ataqueInimigo + " pontos de vida\n" + Tools.ConsoleColors.RESET);

            if ((this.vidaAtual - ataqueInimigo) < 0) {
                this.setVidaAtual(0);
            } else {
                this.setVidaAtual(this.vidaAtual - ataqueInimigo);
            }

            if (this.vidaAtual == 0){
                break;
            }

            do {
                vali = true;
                Scanner in = new Scanner(System.in);
                int resposta = 0;

                System.out.println(Tools.ConsoleColors.BLUE + "É a tua vez, o que pretendes fazer?");
                System.out.printf(" %15s %15s %15s", "|1|Usar ataque normal|", "|2|Usar ataque especial|", "|3|Usar consumivel|\n" + Tools.ConsoleColors.RESET);

                try {
                    resposta = in.nextInt();

                    switch (resposta) {
                        case 1:
                            ataqueHeroi = this.getForca() + this.getBufForca() + this.arma.getAtaque();
                            System.out.println(ataqueHeroi);
                            ataqueHeroi -= (int) (ataqueHeroi * ((double) (inimigo.getDefesa() + inimigo.getBufDefesa()) / 100));
                            System.out.println(ataqueHeroi);


                            System.out.println(Tools.ConsoleColors.GREEN + "Tiras-te " + ataqueHeroi + " pontos de vida ao inimigo" + Tools.ConsoleColors.RESET);

                            if ((inimigo.getVidaAtual() - ataqueHeroi) < 0) {
                                inimigo.setVidaAtual(0);
                            } else {
                                inimigo.setVidaAtual(inimigo.getVidaAtual() - ataqueInimigo);
                            }

                            vali = false;

                            break;
                        case 2:
                            System.out.println(this.arma.getEspecial());

                            ataqueHeroi = this.getForca() + this.getBufForca() + this.arma.getEspecialDano();
                            ataqueHeroi -= (int) (ataqueHeroi * ((double)(inimigo.getDefesa() + inimigo.getBufDefesa()) / 100));

                            System.out.println(Tools.ConsoleColors.GREEN + "Tiras-te " + ataqueHeroi + " pontos de vida ao inimigo" + Tools.ConsoleColors.RESET);
                            if ((inimigo.getVidaAtual() - ataqueHeroi) < 0) {
                                inimigo.setVidaAtual(0);
                            } else {
                                inimigo.setVidaAtual(inimigo.getVidaAtual() - ataqueInimigo);
                            }

                            if (this.arma.getDefesaDano() != 0) {
                                System.out.println(Tools.ConsoleColors.CYAN + "A defesa do inimigo foi quebrada em " + (this.arma.getDefesaDano() * -1) + " pontos" + Tools.ConsoleColors.RESET);

                                inimigo.setDefesa(this.arma.getDefesaDano());
                            }

                            vali = false;

                            break;
                        case 3:

                            vali = false;

                            break;
                        default:
                            System.out.println(Tools.ConsoleColors.PURPLE + "Escolha uma opção valida!" + Tools.ConsoleColors.RESET);

                            break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println(Tools.ConsoleColors.PURPLE + "Use apenas números indicados no menu!" + Tools.ConsoleColors.RESET);
                }
            } while (vali);


            if (inimigo.getVidaAtual() == 0){
                break;
            }


            rondas++;
        } while (true);

        if (this.getVidaAtual() == 0){
            System.out.println(Tools.ConsoleColors.RED + "GAME OVER");
            System.out.println("Boa sorte para a proxima" + Tools.ConsoleColors.RESET);
            return false;
        }else {
            System.out.println(Tools.ConsoleColors.BLUE_BACKGROUND + "Parabens, subis-te de nivel!" + Tools.ConsoleColors.RESET);
            this.setVidaMaxima(this.vidaMaxima + 50);
            this.setForca(this.forca + 5);
            this.setLvl(this.getLvl() + 1);
            this.setGold(this.getGold() + inimigo.getGold());
        }

        return true;
    }

}
