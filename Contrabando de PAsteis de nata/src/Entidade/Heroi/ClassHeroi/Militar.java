package Entidade.Heroi.ClassHeroi;

import Entidade.NPC.Inimigo;
import Entidade.Heroi.Personagem;
import Itens.Arremesavel;
import Itens.ItensHeroi;
import Itens.Pocao;
import Tools.Tools;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Militar extends Personagem {

    public Militar(String nome, int vidaMaxima, int forca,int defesa, int gold) {
        super(nome, vidaMaxima, forca, defesa, 1, gold);
    }


    /**
     * Metodo para iniciar a batalha entro o jogador e o inimigo
     * @param inimigo recebe o inimigo com quem o jogador vai batalhar
     * @return retorna true se o jogador ganhar, false se o jogador perder
     */
    @Override
    public boolean Atacar(Inimigo inimigo) {
        int rondas = 0, ataqueInimigo = 0, ataqueHeroi = 0;
        boolean vali, ataqueEspecial = true;

        do {

            MostrarVida(inimigo);


            ataqueInimigo = inimigo.getForca() + inimigo.getBufForca();
            ataqueInimigo -= (int) (ataqueInimigo * ((double) (this.defesa + this.bufDefesa) / 100));

            if (rondas == 0) {
                System.out.println(Tools.ConsoleColors.YELLOW + "\nTentas pegar na tua arma, porem como ja não és agil, o inimigo consegue te atacar primeiro!\n" + Tools.ConsoleColors.RESET);
            }


            if (inimigo.getPocao() > 0 && inimigo.getVidaAtual() <= 100) {
                inimigo.setPocao();
                System.out.println(Tools.ConsoleColors.RED + "\nO inimigo tinha uma poção de vida escondida, o inimigo recuperou 200 pontos de vida!\n" + Tools.ConsoleColors.RESET);
                inimigo.setVidaAtual(inimigo.getVidaAtual() + 200);

                MostrarVida(inimigo);
            } else {
                System.out.println(Tools.ConsoleColors.RED + "\n" + inimigo.getNome() + " tirou-te " + ataqueInimigo + " pontos de vida\n" + Tools.ConsoleColors.RESET);

                if ((this.vidaAtual - ataqueInimigo) < 0) {
                    this.setVidaAtual(0);
                } else {
                    this.setVidaAtual(this.vidaAtual - ataqueInimigo);
                }
            }


            if (this.vidaAtual == 0) {
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

                            Tools.Clear();

                            ataqueHeroi = this.getForca() + this.getBufForca() + this.arma.getAtaque();

                            ataqueHeroi -= (int) (ataqueHeroi * ((double) (inimigo.getDefesa() + inimigo.getBufDefesa()) / 100));


                            System.out.println(Tools.ConsoleColors.GREEN + "Tiras-te " + ataqueHeroi + " pontos de vida ao inimigo" + Tools.ConsoleColors.RESET);

                            if ((inimigo.getVidaAtual() - ataqueHeroi) < 0) {
                                inimigo.setVidaAtual(0);
                            } else {
                                inimigo.setVidaAtual(inimigo.getVidaAtual() - ataqueHeroi);
                            }

                            vali = false;

                            break;
                        case 2:

                            Tools.Clear();

                            if (ataqueEspecial) {
                                System.out.println(this.arma.getEspecial());

                                ataqueHeroi = this.getForca() + this.getBufForca() + this.arma.getEspecialDano();
                                ataqueHeroi -= (int) (ataqueHeroi * ((double) (inimigo.getDefesa() + inimigo.getBufDefesa()) / 100));


                                System.out.println(Tools.ConsoleColors.GREEN + "Tiras-te " + ataqueHeroi + " pontos de vida ao inimigo" + Tools.ConsoleColors.RESET);
                                if ((inimigo.getVidaAtual() - ataqueHeroi) < 0) {
                                    inimigo.setVidaAtual(0);
                                } else {
                                    inimigo.setVidaAtual(inimigo.getVidaAtual() - ataqueHeroi);
                                }

                                if (this.arma.getDefesaDano() != 0) {
                                    System.out.println(Tools.ConsoleColors.CYAN + "A defesa do inimigo foi quebrada em " + (this.arma.getDefesaDano() * -1) + " pontos" + Tools.ConsoleColors.RESET);

                                    inimigo.setDefesa(this.arma.getDefesaDano());
                                }

                                vali = false;
                                ataqueEspecial = false;
                            } else {
                                System.out.println("Já usas-te o ataque especial!");
                            }


                            break;
                        case 3:
                            Tools.Clear();
                            MostrarVida(inimigo);

                            boolean validacao = MostrarPocoesNaBatalha(inimigo);

                            if (validacao) {
                                vali = false;
                            }


                            break;
                        default:
                            System.out.println(Tools.ConsoleColors.PURPLE + "Escolha uma opção valida!" + Tools.ConsoleColors.RESET);

                            break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println(Tools.ConsoleColors.PURPLE + "Use apenas números indicados no menu!" + Tools.ConsoleColors.RESET);
                }
            } while (vali);


            if (inimigo.getVidaAtual() == 0) {
                break;
            }


            rondas++;
        } while (true);

        if (this.getVidaAtual() == 0) {
            System.out.println(Tools.ConsoleColors.RED + "GAME OVER");
            System.out.println("Boa sorte para a proxima" + Tools.ConsoleColors.RESET);
            this.BufReset();
            return false;
        } else {
            System.out.println(Tools.ConsoleColors.BLUE_BACKGROUND + "Parabens, subis-te de nivel!" + Tools.ConsoleColors.RESET);
            this.setVidaMaxima(this.vidaMaxima + 50);
            this.setForca(this.forca + 5);
            this.setLvl(this.getLvl() + 1);
            this.setGold(this.getGold() + inimigo.getGold());
            this.BufReset();
        }

        return true;
    }

    /**
     * Da print a um pequeno hud com informações basicas e as barras de vida do jogador e do player
     *
     * @param inimigo Recebe o objeto inimigo para que possa aceder as suas informações (Inimigo)
     */
    public void MostrarVida(Inimigo inimigo) {
        this.MostrarStatus();
        System.out.print("\t\t\t\t|VS|\t\t\t\t");
        inimigo.MostrarStatus();
        System.out.println();
        this.MostrarVida();
        System.out.print("\t\t\t\t|VS|\t\t\t\t");
        inimigo.MostrarVida();
        System.out.println();
    }

    /**
     * Mostra o inventario do jogador e deixa escolher um consumivel para usar ou nao
     * @param inimigo recebe o inimigo, para caso ele escolha usar alguma coisa no inimigo (Inimigo)
     * @return retorna true se ouver uma jogada, retorna false caso o jogador desista de usar um consumivel
     */
    public boolean MostrarPocoesNaBatalha(Inimigo inimigo) {
        Scanner in = new Scanner(System.in);
        ArrayList<Pocao> pocaos = new ArrayList<>();
        ArrayList<Arremesavel> arremesavel = new ArrayList<>();
        int count = 0;


        for (ItensHeroi item : this.inventario) {
            if (item instanceof Pocao) {
                pocaos.add((Pocao) item);
            } else if (item instanceof Arremesavel) {
                arremesavel.add((Arremesavel) item);
            }
        }

        System.out.println(Tools.ConsoleColors.RED + """
                \n------------------------------------------------------------------------------------------
                |                                   ⚗\uFE0F Poções ⚗\uFE0F                                         |
                ------------------------------------------------------------------------------------------""");

        for (Pocao item : pocaos) {
            System.out.print("|" + ++count + "| - ");
            item.ExibirDetalhes();
        }

        System.out.println(Tools.ConsoleColors.CYAN + """
                \n\n------------------------------------------------------------------------------------------
                |                                   🪃 Arremessaveis 🪃                                   |
                ------------------------------------------------------------------------------------------""");

        for (Arremesavel item : arremesavel) {
            System.out.print("|" + ++count + "| - ");
            item.ExibirDetalhes();
        }

        System.out.println(Tools.ConsoleColors.PURPLE + "\n|0 - Cancelar escolha|\n" + Tools.ConsoleColors.RESET);

        boolean vali = true;

        do {

            System.out.println(Tools.ConsoleColors.BLUE + "Qual item desejas utilizar?" + Tools.ConsoleColors.RESET);

            try {
                in = new Scanner(System.in);

                int resposta = in.nextInt();

                if (resposta == 0) {
                    System.out.println(Tools.ConsoleColors.PURPLE + "Escolha cancelada!" + Tools.ConsoleColors.RESET);
                    return false;
                }

                if (resposta <= pocaos.size()) {

                    int index = resposta - 1;

                    if (pocaos.get(index).isArremesavel()) {

                        boolean vali2 = true;

                        do {

                            try {
                                in = new Scanner(System.in);

                                System.out.println(Tools.ConsoleColors.BLUE + "Queres usar ou atirar ao inimigo?\n|1 - Usar|\t\t|2 - Atirar|" + Tools.ConsoleColors.RESET);

                                resposta = in.nextInt();

                                if (resposta == 1) {

                                    if (this.vidaAtual + pocaos.get(index).getVida() > this.vidaMaxima) {
                                        System.out.println(Tools.ConsoleColors.PURPLE + "O maximo que a tua vida pode atingir é: " + this.vidaMaxima + ". Tens a certeza que queres usar a poção?\n|1 - Sim|\t\t|2 - Não|");
                                    }
                                    do {
                                        try {
                                            in = new Scanner(System.in);
                                            resposta = in.nextInt();
                                            if (resposta == 1) {
                                                this.usarPocao(pocaos.get(index));
                                                System.out.println(Tools.ConsoleColors.GREEN + "Tomas-te a poção " + pocaos.get(index).getNome() + Tools.ConsoleColors.RESET);
                                                this.RmvInventario(pocaos.get(index));
                                                vali2 = false;
                                                vali = false;
                                                break;
                                            } else if (resposta == 2) {
                                                vali2 = false;
                                                break;
                                            } else {
                                                System.out.println(Tools.ConsoleColors.PURPLE + "Insira uma opção valida!" + Tools.ConsoleColors.RESET);
                                            }
                                        } catch (InputMismatchException e) {
                                            System.out.println(Tools.ConsoleColors.PURPLE + "Insira apenas números!!!" + Tools.ConsoleColors.RESET);
                                        }
                                    } while (true);


                                } else if (resposta == 2) {
                                    inimigo.usarPocao(pocaos.get(index));
                                    System.out.println(Tools.ConsoleColors.GREEN + "Atiras-te a poção " + pocaos.get(index).getNome() + " ao inimigo" + Tools.ConsoleColors.RESET);

                                    this.RmvInventario(pocaos.get(index));

                                    vali = false;
                                    vali2 = false;
                                } else {
                                    System.out.println(Tools.ConsoleColors.PURPLE + "Insira uma opção valida!" + Tools.ConsoleColors.RESET);
                                }

                            } catch (Exception e) {
                                System.out.println(Tools.ConsoleColors.PURPLE + "Insira apenas números!!!" + Tools.ConsoleColors.RESET);
                            }


                        } while (vali2);


                    } else {
                        this.usarPocao(pocaos.get(index));
                        System.out.println(Tools.ConsoleColors.GREEN + "Tomas-te a poção " + pocaos.get(index).getNome() + Tools.ConsoleColors.RESET);

                        this.RmvInventario(pocaos.get(index));

                        vali = false;
                    }


                    System.out.println("poçao");
                } else if (resposta <= (pocaos.size() + arremesavel.size())) {

                    int index = resposta - pocaos.size() - 1;

                    inimigo.setVidaAtual(inimigo.getVidaAtual() - arremesavel.get(index).getDano());

                    System.out.println(Tools.ConsoleColors.GREEN + "Causas-te " + arremesavel.get(index).getDano() + " pontos de dano ao inimigo" + Tools.ConsoleColors.RESET);

                    this.RmvInventario(arremesavel.get(index));

                    vali = false;

                } else {
                    System.out.println(Tools.ConsoleColors.PURPLE + "Insira uma opção valida!" + Tools.ConsoleColors.RESET);
                }
            } catch (InputMismatchException e) {
                System.out.println(Tools.ConsoleColors.PURPLE + "Insira apenas números!!!" + Tools.ConsoleColors.RESET);
            }
        } while (vali);

        return true;

    }

}
