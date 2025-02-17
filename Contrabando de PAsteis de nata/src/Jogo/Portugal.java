package Jogo;

import Entidade.Heroi.Personagem;
import Entidade.NPC.CriarNPC.CriarInimigo;
import Entidade.NPC.Inimigo;
import Loja.Mercado;
import Tools.Tools;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Nivel de jogo passado em Portugal
 */
public class Portugal {
    public static int iniciarPortugal(Personagem player, Mercado loja) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("""
                \t\t\t\t\t\t\t\t\033[0;32m▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\033[0;31m████████████████████████████████████████████████████████████
                \t\t\t\t\t\t\t\t\033[0;32m▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\033[0;33m▒░░░░░░░░▒▓\033[0;31m██████████████████████████████████████████████████████
                \t\t\t\t\t\t\t\t\033[0;32m▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\033[0;33m▒░░░▒▓▓▓░░▓█▓▒▒░░▒▓\033[0;31m██████████████████████████████████████████████████
                \t\t\t\t\t\t\t\t\033[0;32m▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\033[0;33m▒░░▒▓▓▓▓▓▓▓░░▓█████▓▓░░▓\033[0;31m████████████████████████████████████████████████
                \t\t\t\t\t\t\t\t\033[0;32m▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\033[0;33m▒░░▓▓▒▓████▓▓▒▓████▓▒▓░░░░▓\033[0;31m██████████████████████████████████████████████
                \t\t\t\t\t\t\t\t\033[0;32m▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\033[0;33m▒░░░░▓░░▒████▓░░▓████░░▒░█▓░░▓\033[0;31m█████████████████████████████████████████████
                \t\t\t\t\t\t\t\t\033[0;32m▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\033[0;33m░░░░░▓███░          ░███░░░▒▒░\033[0;31m█████████████████████████████████████████████
                \t\t\t\t\t\t\t\t\033[0;32m▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\033[0;33m░░░░░░▓███░   ░▓▓    ░███░███▓░░\033[0;31m████████████████████████████████████████████
                \t\t\t\t\t\t\t\t\033[0;32m▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\033[0;33m░▒▓▒░░▓▓▓▓░    ░░    ░█▒█░▒▒▓█▒░▓\033[0;31m███████████████████████████████████████████
                \t\t\t\t\t\t\t\t\033[0;32m▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\033[0;33m▒░░░▒▒▓▓░░▒░░▓▒░▓▓ ▓▓▓░▒▒▒░▓▒▒░░░▒\033[0;31m███████████████████████████████████████████
                \t\t\t\t\t\t\t\t\033[0;32m▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\033[0;33m▒░░░░▒▒▓▓▓▓░░▓▒ ▓▓ ▒▓▒░▓▓▓░▓▒▒░░░▒\033[0;31m███████████████████████████████████████████
                \t\t\t\t\t\t\t\t\033[0;32m▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\033[0;33m░▒▓▓▒▒▓███▒    ░░    ░███░▒▒▓█▒░▓\033[0;31m███████████████████████████████████████████
                \t\t\t\t\t\t\t\t\033[0;32m▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\033[0;33m░░▓▓▓▓▒▓██▓░  ░▒▓    ███▓░░░▓▓░░\033[0;31m████████████████████████████████████████████
                \t\t\t\t\t\t\t\t\033[0;32m▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\033[0;33m░░▒░░░░▓▒▒▒▒      ▒▒▒▒▓▒░░░░░░▓\033[0;31m████████████████████████████████████████████
                \t\t\t\t\t\t\t\t\033[0;32m▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\033[0;33m▒░░▓▓▓▓▒▓▒██████████▒▓▒░░░░░░▒\033[0;31m█████████████████████████████████████████████
                \t\t\t\t\t\t\t\t\033[0;32m▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\033[0;33m░░░░░░░░▒▓██████▓▒░░░░░░░░▓\033[0;31m██████████████████████████████████████████████
                \t\t\t\t\t\t\t\t\033[0;32m▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\033[0;33m▒░░▒▓▓▓▓▓▓▓░░▓██████▓░░▓\033[0;31m████████████████████████████████████████████████
                \t\t\t\t\t\t\t\t\033[0;32m▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\033[0;33m░░░▒▒▓▓▓░░▓█▓▓▒░░░▓\033[0;31m██████████████████████████████████████████████████
                \t\t\t\t\t\t\t\t\033[0;32m▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\033[0;33m▒░░░░░░░░░░▓▓\033[0;31m█████████████████████████████████████████████████████
                \t\t\t\t\t\t\t\t\033[0;32m▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\033[0;31m████████████████████████████████████████████████████████████
                """);


        System.out.println("""
                \n\n\n\033[0;34m
                Hoje sais-te de casa a pensar na situação em que te encontras, esta cada vez mais dificil de conseguires arranjar pasteis de nata, o teu dealer cada vez te cobra mais caro!
                
                Quando chegas a beira do teu dealer, vez que ele mais que duplicou o preço dos pasteis de nata e nem um consegues comprar. No entanto, como já és um cliente de confiança,
                o dealer chama-te a um canto e faz-te uma proposta:
                \033[0;36m
                Eu tou com dificuldades para conseguir levar remessas de pasteis para o Porto, precisava de alguem de confiançã como tu, não te vou mentir, cada vez ta mais apertado o cerco.
                Reparei que vinhas comprar, mas quando olhas-te para o preço ja ias embora, presumo que nao tenhas bitcoins suficientes certo?
                \033[0;32m
                Sim, estou completamente liso, não sei como vou conseguir arranjar tantas bitcoins para continuar a comprar estes pastes.
                \033[0;36m
                Bem, tenho uma proposta para ti, se me conseguires levar esta remessa de 500 pasteis segura ate ao porto, podes ficar com 10%, mas aviso-te ja, que vai ser dificil, vais poder
                apanhar a policia de Belem, bandidos, ou mesmo pessoas que ja nao comem um pastel a anos. Todos eles vao tentar te tirar os pasteis a força. Que dizes?
                \033[0;34m
                Aceitas a porposta? |1 - Sim|\t\t\t\t|2 - Não|
                """);

        boolean vali = true;
        do {
            try {
                int resposta = in.nextInt();

                switch (resposta) {
                    case 1:
                        vali = false;
                        break;
                    case 2:
                        FimJogo();
                        return 0;
                    default:
                        System.out.println(Tools.ConsoleColors.PURPLE + "Insere uma opção valida!" + Tools.ConsoleColors.RESET);
                }
            } catch (InputMismatchException e) {
                System.out.println(Tools.ConsoleColors.PURPLE + "Insere apenas números!" + Tools.ConsoleColors.RESET);
            }
        } while (vali);

        Tools.Clear();

        System.out.println("""
                \033[0;36m
                Bem, não ha mais nada a fazer a não ser começar a viagem, estes pasteis nao se vão entregar sozinhos!
                Hum, olha, ta ali uma loja dos 300, sera que deveria ir la ver se tem algo que me ajude?
                """);

        System.out.println(Tools.ConsoleColors.BLUE + "Tenho " + player.getGold() + " bitcoins no bolso. Sera que visito a loja antes de arrancar?\n|1 - Sim|\t\t\t\t|2 - Não|");
        vali = true;
        do {
            try {
                int resposta = in.nextInt();

                switch (resposta) {
                    case 1:
                        loja.Vender(player);
                        vali = false;
                        break;
                    case 2:
                        vali = false;
                        break;
                    default:
                        System.out.println(Tools.ConsoleColors.PURPLE + "Insere uma opção valida!" + Tools.ConsoleColors.RESET);
                }
            } catch (InputMismatchException e) {
                System.out.println(Tools.ConsoleColors.PURPLE + "Insere apenas números!" + Tools.ConsoleColors.RESET);
            }
        } while (vali);

        Tools.Clear();

        System.out.println("""
                \033[0;34m
                Entras no teu renalt clio e começas a tua jornada.
                
                Passado uns quilometros, deparas-te com uma interseção onde consegues ir para o Porto, pela auto-estrada ou pela nacional.
                \033[0;36m
                Por onde deverei seguir?
                Pela auto estrada seria mais perto, mas provavelmente vou apanhar a policia. No entanto, pela nacional demoro mais, e se calha de aparecer algum ladrão?
                
                \033[0;34m|1 - Ir pela auto-estrada|\t\t\t\t|2 - Ir pela nacional|
                """);

        vali = true;
        do {
            try {
                int resposta = in.nextInt();

                switch (resposta) {
                    case 1:
                        Tools.Clear();

                        System.out.println("""
                                \033[0;36m
                                Merda, já sabia que ia apanhar a policia na auto-estrada, nao vai ter jeito, vou ter de fugir!
                                """);
                        Inimigo policia = CriarInimigo.CriarInimigo(4, "Policia dos Pasteis");

                        boolean sobreviveu = player.Atacar(policia);

                        if (!sobreviveu) {
                            return 1;
                        } else {
                            System.out.println(Tools.ConsoleColors.CYAN + "Ufa, esta foi por pouco, tenho de começar a ter mais cuidado!" + Tools.ConsoleColors.RESET);
                            System.out.println(Tools.ConsoleColors.BLUE + "Desejas usar alguma poçao antes de seguir caminho?\n|1 - Sim|\t\t\t\t|2 - Não|" + Tools.ConsoleColors.RESET);

                            do {
                                try {
                                    resposta = in.nextInt();
                                    if (resposta == 1) {
                                        player.MostrarUsarPocaoDoInventario();
                                    } else if (resposta == 2) {
                                        break;
                                    } else {
                                        System.out.println(Tools.ConsoleColors.PURPLE + "Insere uma opção valida!" + Tools.ConsoleColors.RESET);
                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println(Tools.ConsoleColors.PURPLE + "Insere apenas números!" + Tools.ConsoleColors.RESET);
                                }
                            } while (true);

                        }

                        vali = false;
                        break;
                    case 2:
                        System.out.println("""
                                \033[0;36m
                                Olha, parece o Luis ali a pedir boleia, deixa-me parar para ver para onde ele vai!
                                
                                Então, como estas? Queres boleia, eu tou a ir para o Porto.
                                \033[0;33m
                                Sim, eu tambem quero ir para o Porto, tenho de ir para a aula no Cesae, até ja tou atrasado! Obrigado por me dares boleia.
                                \033[0;34m
                                Ves que o Luis esta a tirar qualquer coisa da mala, parece uma garrafa termica.
                                """);

                        int provavilidade = rd.nextInt(101);

                        if (provavilidade < 90){
                            System.out.println("\033[0;33m Luis pergunta:\nQueres cafe?" + Tools.ConsoleColors.RESET);
                        }else {
                            System.out.println("\033[0;33m Luis pergunta:\nQueres guayoyo?" + Tools.ConsoleColors.RESET);
                        }


                        vali = false;
                        break;
                    default:
                        System.out.println(Tools.ConsoleColors.PURPLE + "Insere uma opção valida!" + Tools.ConsoleColors.RESET);
                }
            } catch (InputMismatchException e) {
                System.out.println(Tools.ConsoleColors.PURPLE + "Insere apenas números!" + Tools.ConsoleColors.RESET);
            }
        } while (vali);

        return 2;
    }

    /**
     * Metudo que termina o jogo caso o player nao aceite a proposta para iniciar a jornada
     */
    public static void FimJogo() {
        Tools.Clear();
        System.out.println("""
                \033[0;34m
                Infelizmente nao tives-te coragem para aceitar a oferta, entao viveras para sempre com o peso na consciencia de que nunca mais iras comer um pastel de nada!
                
                Fim do jogo
                """);
    }
}
