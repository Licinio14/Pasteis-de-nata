package Jogo;

import Assets.SoundFiles.Audio;
import Entidade.Heroi.ClassHeroi.Fugitivo;
import Entidade.Heroi.ClassHeroi.Militar;
import Entidade.Heroi.ClassHeroi.Programador;
import Entidade.Heroi.Personagem;
import Loja.CriarMercado;
import Loja.Mercado;
import Tools.Tools;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Jogo {
    /**
     * Inicia o jogo
     * @throws InterruptedException
     */
    public static void Iniciar() throws InterruptedException {
        int podeSeguir = 0;
        Personagem copia, player;
        Scanner in = new Scanner(System.in);
        boolean mesmaPersonagem = true;

        //iniciar musica
        Audio.playMusic("src/Assets/SoundFiles/Naruto Shippuden opening 3 - Blue Bird (8bit).wav");

        System.out.println("Iniciando Jogo...");

        //iniciar o mercado
        Mercado loja = CriarMercado.getMercadoCriado();
        CriarMercado.AdicionarTiposNasArmas();

        //Mostrar o inicio da historia
        Inicializacao.InicioHistoria();

        player = Inicializacao.Inicializacao();

        int vidaMax = player.getVidaMaxima();
        int forca = player.getForca();
        String nome = player.getNome();


        do {



            if (!mesmaPersonagem) {
                //Mostrar o inicio da historia
                Inicializacao.InicioHistoria();

                player = Inicializacao.Inicializacao();
            }else {
                if (player instanceof Programador){
                    player = new Programador(nome,vidaMax,forca,0,120);
                } else if (player instanceof Militar) {
                    player = new Militar(nome,vidaMax,forca,20,80);
                } else if (player instanceof Fugitivo) {
                    player = new Fugitivo(nome,vidaMax,forca,-10,150);
                }
            }


            // verifica se o player morreu ou nao
            podeSeguir = Portugal.iniciarPortugal(player,loja);
            if (podeSeguir == 1){
                System.out.println(Tools.ConsoleColors.RED + "Infelizmente morres-te, mais sorte para a proxima!");
                Tools.Pause(4000);
            }

            do {
                Tools.Clear();

                System.out.println(Tools.ConsoleColors.BLUE + "Queres jogar novamente?\n|1 - Sim|\t\t\t\t|2 - Não|" + Tools.ConsoleColors.RESET);

                try {
                    in = new Scanner(System.in);
                    int resposta = in.nextInt();

                    if (resposta == 1) {

                        //para decidir se o jogador quer a mesma personagem
                        System.out.println(Tools.ConsoleColors.BLUE + "\n\n\nQueres usar a mesma personagem?\n|1 - Sim|\t\t\t\t|2 - Não|" + Tools.ConsoleColors.RESET);

                        do {
                            try {
                                in = new Scanner(System.in);
                                resposta = in.nextInt();
                                if (resposta == 1) {
                                    mesmaPersonagem = true;
                                    break;
                                } else if (resposta == 2) {
                                    mesmaPersonagem = false;
                                    break;
                                } else {
                                    System.out.println(Tools.ConsoleColors.PURPLE + "Insere uma opção valida!" + Tools.ConsoleColors.RESET);
                                }
                            } catch (InputMismatchException e) {
                                System.out.println(Tools.ConsoleColors.PURPLE + "Insere apenas números!" + Tools.ConsoleColors.RESET);
                            }
                        } while (true);

                        break;
                    } else if (resposta == 2) {
                        Creditos.start();
                        return;
                    } else {
                        System.out.println(Tools.ConsoleColors.PURPLE + "Insere uma opção valida!" + Tools.ConsoleColors.RESET);
                    }

                } catch (InputMismatchException e) {
                    System.out.println(Tools.ConsoleColors.PURPLE + "Insere apenas números!" + Tools.ConsoleColors.RESET);
                }

            } while (true);


        }while (true);

    }
}
