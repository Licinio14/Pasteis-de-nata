package Jogo;

import Entidade.Heroi.Personagem;
import Entidade.NPC.CriarNPC.CriarInimigo;
import Entidade.NPC.Inimigo;
import Itens.ArmaPrincipal;
import Itens.CriacoesItens.CriacaoArremesaveis;
import Itens.CriacoesItens.CriarArmasPrincipais;
import Loja.Mercado;
import MiniJogos.MiniGames;
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

        //inicio da historia
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
                in = new Scanner(System.in);
                int resposta = in.nextInt();

                switch (resposta) {
                    case 1:
                        vali = false;
                        break;
                    case 2:
                        FimJogo();
                        return 1;
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
        //primeira sala, visitar a loja
        System.out.println(Tools.ConsoleColors.BLUE + "Tenho " + player.getGold() + " bitcoins no bolso. Sera que visito a loja antes de arrancar?\n|1 - Sim|\t\t\t\t|2 - Não|");
        vali = true;
        do {
            try {
                in = new Scanner(System.in);
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

        //decição se vai para a sala da autoestrada ou da nacional
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
                in = new Scanner(System.in);
                int resposta = in.nextInt();

                switch (resposta) {
                    case 1:
                        Tools.Clear();

                        System.out.println("""
                                \033[0;36m
                                Merda, já sabia que ia apanhar a policia na auto-estrada, nao vai ter jeito, vou ter de fugir!
                                
                                (Ganha a batalha para poderes escapar)
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
                                    in = new Scanner(System.in);
                                    resposta = in.nextInt();
                                    if (resposta == 1) {
                                        player.MostrarUsarPocaoDoInventario();
                                        break;
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
                        Tools.Clear();

                        System.out.println("""
                                \033[0;36m
                                Olha, parece o Luis ali a pedir boleia, deixa-me parar para ver para onde ele vai!
                                
                                Então, como estas? Queres boleia, eu tou a ir para o Porto.
                                \033[0;33m
                                Sí, también quiero ir a Oporto, tengo que ir a clase en Cesae, ¡incluso llego tarde! Gracias por darme un aventón.
                                \033[0;34m
                                Ves que o Luis esta a tirar qualquer coisa da mala, parece uma garrafa termica.
                                """);

                        int provavilidade = rd.nextInt(101);

                        if (provavilidade < 95) {
                            System.out.println("\033[0;33mLuis pergunta: Quieres café?\n|1 - Sim|\t\t\t\t|2 - Não|" + Tools.ConsoleColors.RESET);
                            do {
                                try {
                                    in = new Scanner(System.in);
                                    resposta = in.nextInt();
                                    if (resposta == 1) {
                                        System.out.println(Tools.ConsoleColors.BLUE + "O café estava a ferver e tu queimas-te ao beber, no entanto sentes-te mais forte e com mais energia!\n|Vida - 10|\t|Força + 10|\t|Defesa + 3|" + Tools.ConsoleColors.RESET);
                                        player.AddStatus(-10, 10, 3);
                                        System.out.println(Tools.ConsoleColors.BLUE + "(Prima enter para continuar)" + Tools.ConsoleColors.RESET);
                                        in.nextLine();
                                        break;
                                    } else if (resposta == 2) {
                                        break;
                                    } else {
                                        System.out.println(Tools.ConsoleColors.PURPLE + "Insere uma opção valida!" + Tools.ConsoleColors.RESET);
                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println(Tools.ConsoleColors.PURPLE + "Insere apenas números!" + Tools.ConsoleColors.RESET);
                                }
                            } while (true);
                        } else {
                            System.out.println("\033[0;33mLuis pergunta: Queres guayoyo?\n|1 - Sim|\t\t\t\t|2 - Não|" + Tools.ConsoleColors.RESET);
                            do {
                                try {
                                    in = new Scanner(System.in);
                                    resposta = in.nextInt();
                                    if (resposta == 1) {
                                        System.out.println(Tools.ConsoleColors.RED + "Infelizmente o guayoyo estava envenenado, enquanto das os ultimos suspiros, ves-lo a tirar-te do carro e a fugir com todos os pasteis de nata!" + Tools.ConsoleColors.RESET);
                                        System.out.println(Tools.ConsoleColors.BLUE + "(Prima enter para continuar)" + Tools.ConsoleColors.RESET);
                                        in.nextLine();
                                        return 1;
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
                    default:
                        System.out.println(Tools.ConsoleColors.PURPLE + "Insere uma opção valida!" + Tools.ConsoleColors.RESET);
                }
            } catch (InputMismatchException e) {
                System.out.println(Tools.ConsoleColors.PURPLE + "Insere apenas números!" + Tools.ConsoleColors.RESET);
            }
        } while (vali);


        Tools.Clear();

        //sala das raspadinhas
        if (player.getLvl() == 2) {
            System.out.println(Tools.ConsoleColors.BLUE + "Finalmente chegas-te ao fim da auto estra, quando sais, ves uma pequena estação de serviço, onde decides parar para tomar o pequeno almoço." + Tools.ConsoleColors.RESET);
        } else {
            System.out.println(Tools.ConsoleColors.BLUE + "Depois de muitos quilometros na nacional, ves uma pequena estação de serviço, onde decides parar para tomar o pequeno almoço." + Tools.ConsoleColors.RESET);
        }

        System.out.println("""
                \033[0;34m
                Depois de tomares o pequeno almoço, quando vais para pagar, reparas que tem algumas raspadinhas na montra.
                \033[0;36m
                Hum sera que hoje é o meu dia de sorte? Não me caia nada mal mais umas bitcoins no bolso!
                \033[0;34m|1 - Comprar raspadinha|\t\t\t\t|2 - Ir embora|
                """);

        do {
            try {
                in = new Scanner(System.in);
                int resposta = in.nextInt();
                if (resposta == 1) {

                    MiniGames.Raspadinhas(player);

                    do {
                        Tools.Clear();
                        System.out.println(Tools.ConsoleColors.BLUE + "Desejas comprar outra raspadinha?\n|1 - Sim|\t\t\t\t|2 - Não|" + Tools.ConsoleColors.RESET);

                        try {
                            in = new Scanner(System.in);
                            resposta = in.nextInt();

                            if (resposta == 1) {
                                MiniGames.Raspadinhas(player);
                            } else if (resposta == 2) {
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
                    break;
                } else {
                    System.out.println(Tools.ConsoleColors.PURPLE + "Insere uma opção valida!" + Tools.ConsoleColors.RESET);
                }
            } catch (InputMismatchException e) {
                System.out.println(Tools.ConsoleColors.PURPLE + "Insere apenas números!" + Tools.ConsoleColors.RESET);
            }
        } while (true);


        Tools.Clear();

        //Sala da batalha com o ChatGPT
        System.out.println("""
                \033[0;34m
                Quando sais do cafe, deparas-te com uma pessoa muito estranha a tentar arrumbar o teu carro.
                
                Quando chegas mais perto, ves que é um grande inimigo teu, sempre que precisas dele é quando ele mais te falha!
                \033[0;36m
                Oh não! ChatGPT, o que estas a fazer ao meu carro! Vai-te embora!
                \033[0;33m
                HAHAHAHA, pensas que eu nao sei o que tens no carro? Não te lembras a quem perguntaste qual seria a melhor rota para traficar pasteis de nata de Lisboa para o Porto?
                Como foste tão burro para seguir as minhas intrusões? Agora vou ficar com todos os teus pasteis de nata!
                """ + Tools.ConsoleColors.RESET);

        System.out.println();

        player.MostrarStatus();

        System.out.println(Tools.ConsoleColors.BLUE + "\n\nQueres usar alguma poção antes do combate?\n|1 - Sim|\t\t\t\t|2 - Não|" + Tools.ConsoleColors.RESET);

        do {
            try {
                in = new Scanner(System.in);
                int resposta = in.nextInt();

                if (resposta == 1) {
                    player.MostrarUsarPocaoDoInventario();
                    break;
                } else if (resposta == 2) {
                    break;
                } else {
                    System.out.println(Tools.ConsoleColors.PURPLE + "Insere uma opção valida!" + Tools.ConsoleColors.RESET);
                }

            } catch (InputMismatchException e) {
                System.out.println(Tools.ConsoleColors.PURPLE + "Insere apenas números!" + Tools.ConsoleColors.RESET);
            }

        } while (true);

        Tools.Clear();

        System.out.println(Tools.ConsoleColors.BLUE + "Vence a batalhar para conseguires continuar!\n\n" + Tools.ConsoleColors.RESET);

        boolean sobreviveu = player.Atacar(CriarInimigo.CriarInimigo(3, "ChatGPT"));

        if (!sobreviveu) {
            return 1;
        } else {
            System.out.println(Tools.ConsoleColors.CYAN + "Toma la seu desgraçado! Apartir de agora só uso o DeepSeek!" + Tools.ConsoleColors.RESET);

            System.out.println(Tools.ConsoleColors.BLUE + "Desejas usar alguma poçao antes de seguir caminho?\n|1 - Sim|\t\t\t\t|2 - Não|" + Tools.ConsoleColors.RESET);

            do {
                try {
                    in = new Scanner(System.in);
                    int resposta = in.nextInt();
                    if (resposta == 1) {
                        player.MostrarUsarPocaoDoInventario();
                        break;
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

        Tools.Clear();

        //Sala para utilizar a loja, ou conseguir armas ocultas
        System.out.println("""
                \033[0;34m
                A luta com o ChatGPT foi bastante dolurida, porem ele ficou sem creditos e tu conseguiste vencer!
                \033[0;36m
                Ofa, quause que tinha de pedir ajuda ao Claud ai, ainda bem que nao foi necessario.
                
                Vamos mas é entrar no carro e pirar-nos daqui para fora!
                \033[0;34m
                Depois de algum tempo, e de passar por algumas estradas manhosas, avistas uma loja dos chineses, infelismente nao tem pasteis de nata baratos, mas pode ser que
                tenha algo que te ajude na tua jornada!
                
                Desejas visitar a loja dos chineses?
                |1 - Sim|\t\t\t\t|2 - Não|
                """ + Tools.ConsoleColors.RESET);

        do {
            try {
                in = new Scanner(System.in);
                int resposta = in.nextInt();
                if (resposta == 1) {
                    int quantidade = rd.nextInt(10, 351);

                    System.out.println(Tools.ConsoleColors.BLUE + "Quando estas a sair do carro, ves algumas bitcoins no chão e apanhas!" + Tools.ConsoleColors.RESET);
                    System.out.println(Tools.ConsoleColors.GREEN + "Apanhas-te " + quantidade + " de bitcoins!\n\n(Enter para continuar)" + Tools.ConsoleColors.RESET);
                    player.setGold(player.getGold() + quantidade);

                    in = new Scanner(System.in);
                    in.nextLine();

                    Tools.Clear();

                    System.out.println("""
                            \033[0;37m██████████▒▒█▓▓▒▒▒▒▒▒▒▓▒▒░░▒▒▒▒▒░▒▒▓▓▓▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▒▒▒▒▒▒▓▒▒▒▒▒▒▓▒▒▒▓▓▓▓▓░░░▒░▒░▒▓▓░▒░░░░▒░░░░░░░░░░░░░░░██████████
                            ██████████▓█░░░░░░░░░░░░░▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒░░░▒░██████████
                            ███████████▓░░░░░░░█████░░██████░░░░░▓▓█▓░██▓░▓█▒░▓▓▒▒▓▓▓▒▒▒░▒▓▓▓░░░░░░▒▒█▓░██▓░▓█░░▓█▒░▓▓▒▒▓▓▒▓▓▓░░░░░░░░░░░░░░░▓██████████
                            ██████████▓█░░▒▒░░▒█░░▓█░▓█░░░▓█▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒░▒░░░░░░░░░░░░░▓░░░░░░░░░░░░░░░░░▓░░░░░░░░▒░░███████████
                            ██████████▓█░░▒▒░░██████░░█▓▓█▓█░░█░░░░░░░░░░░░░░░░▒▒▒░░░░░░░░░░░░░░░░▒▒░█▓█▓███▓░░█▓█▓▓█░░░█▒▓██░██░████░░▒▒▒░░░▓██████████
                            ██████████▒█░░▒░░██▒░░▓▒░░██▒▒░▓▓░▓░░▒█████░░█▓▓█▒░░▒▒░▒██▓██▓░▓▓▓█▓░▒▒▒░░██░▓██░▒██░░█▒▓░░██░░░░████████░░░░▒▒░░███████████
                            ██████████▓█░░▒░░██▓█▒██████░▓▓████░░▓▓▓▒█▓░░█▓▓█▒░▒░░░░█▓▒█▓░░▓▓█▓▓░░▒▒░▒█▓▒██░░░░█░███▒░░░░░███░░▒░░░░░▒░▓▒▒▒░░███████████
                            ██████████▓█░░░░▒█████████████████░░░░░▒░░░░░▒▒░░░░░▒░░░▒░░░░░░▒░░░░░░░░░░░░▓░░▒▓░░█░░░░░░▒█████████████░░░░░░░░░███████████
                            ██████████▒█░█▓▓▒░░▒▓▓▓░░░░░░▒▒▓▒████████████████████████████████████████████████████▓▓█░██████░░░░░▓█████░█████░███████████
                            ██████████▓█░████░▒░▒░░██████▒░█░▒░██▓▓▓▓▒░░░▒░▒▓▓▓▓▓█▓░░░░▓▓▓▓▓▓█░▒░▒░▓█▓▓▓▓█░░░░░░█▒██▒█▓█░░░░░▒░░░░░█▓██░████░▓██████████
                            ██████████▓▓░▓▓▓█▒▓░░░░██▓▓▓█░░░░░░░▓▓▓▓███░██░██▓▓▓▓█░░░░░░█▓▓▓▓█░░░░░▒█▓▒▓▓▒░░▓▓░░▒░█░███▒░░░░░░░░░░░████░█▓▓█░███████████
                            ██████████▓▒▒▓▓▓░░▒▓▓░▒▒█▓▓▓█░▒███░░█▓▓▓▓░░░░░░░▓▓▓▓▓▓░░▒▒░▒▓▓▓▓▓███▒▒▒░▒▓▓▓▓█░▒░░▓░█░█░█▓█▒░█▓░░░▒███░█▓▓█░█▓▓█░▓██████████
                            ██████████▓░▓████████████████████████████████████████████████████████████████████████░█░▓███▒░██████░░▓█▓██░████░▓██████████
                            ███████████▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██░██▓███░░░░░██████░░░░░░░███████████
                            ██████████▒▓████▒░░░▒▓▓▒░░░░░░▒▒░░░░▒▒▒▒░▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██░▒█▓█▓█████████▒░███▓███▒██████████
                            ██████████░░▓░██████▒░░███░████████████████████████████████████████████████████████████████░░█▒██░░░██░░███▓▒░▒░░░██████████
                            ██████████░░░░▓░▓░██████▓░░███████████████████████████▓░░░▓███████████████████████████████████░░░░░▓▓████▓▒▒▒▒░░░░██████████
                            ██████████░░▓▓███░██▒████░▒████░░██████░░░░░█████░░░████▓███████░░░░░███████░░░░░██████░░░░░██████▓░█████▓░▒▓████░██████████
                            ██████████░░░▓░▓░▓▒▓█████░█████░░████░░░▓██░░░███░░████░░░████░░░██▒░░▒█████░░██░░░░█▓░░▒██░░░█████░███░█▓███░░░░░██████████
                            █████████████▓▒█░▓▒██▒██▓░█████░░████░░█████░░▓██░░███░░█░░██░░░█████░░█████░░████░░█░░█████░░░████░▒██▓██▓▒███░▓▓██████████
                            ██████████░░█▒░█░▓▒▓█░██▓░█████░░████░░▓████░░███▒░██▒░░█▓░░██░░████░░░█████░░████░░█░░░████░░▒████░▒███▓▒█▒█░░▒░░██████████
                            ██████████░░█░░█░▓▓██▓██░░█████░░░░░░█░░░░░░░██░░░░█░░░▓░▒░░░██░░░░░░░██████░░░░░░░███░░░░░░░███████░▒▓█▒██░█░▓▓░░██████████
                            ██████████▓██▒░█▓██░░▓██░▓██████████████████████████████████████████████████████████████████████████░█▓█▒█▓░█▒░▒█▓██████████
                            ██████████░░░▒░█░▓█░▓▓▒░░░░░░░░░░░░░░░░░████▓▓█████▓▓▓▓▓▓▓▓▓▓▓▓▓█████▓▓▓▓▓▓▓▓▓▓████▓▓▓▓█████▓▓▓█░░░▒░███▓█▒▓█▓░░░░██████████
                            ██████████░░░▓░█░░▓▒▒█▓▓█▓▓░░▒░░▒▓░▓███░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓░░▓▒▒▒▒▒▒▒▒▒▒▒▒▓░███░░░░░▓█░█▓█▓░░██████████
                            ██████████░░░▓░████▒░█░███████████░████░▓▓▓▓▓████████████▓████████████▓▓▓██████▓████████████▓▓▓█░▓███▓███▒▓▓▒▓░░▒░██████████
                            ██████████░░▓▒░██▓█▓███████░▒███▓█░▓██▓░█▓▓▓██░░░░░░█▒░░█▓█░░░█▒░░██░▓███▓░░██░░░░░░█░░░░░░█▓▓▓█░░▒█▓███▒█▒████░░░██████████
                            ██████████░░▓▓▒░░░▒░█▓██░░▓██▓▒░░░░░██░░█▓▓██░░▓███░█▓░░███▓░▒██░░██░░░▓██░░██░░█████░░█████▓▓▓█▓░░░█░░█░░░████░░░██████████
                            ██████████░░▓▓███▓█░░░░█▓▒█████████▒█░░▒█▓▓█▒░▒██▓███▓░░░░░░░▓██░░██░░░░░▓░░██░░░░░░██░░░░██▓▓▓▓█░███░█████░░░░▒░░██████████
                            ██████████░░▒▒███▓█░███▒░░░░░░░░░░░░▓█░▓█▓▓██░░███████░░████░▓██░░██░░██░░░░██░░█████████░░▓▓▓▓▓█░▓▓██▓█░▓███████░██████████
                            ██████████▒██░█▓░██░░▒█▒░░░░░░▒░░░░░▓█░▓▓▓▓▓██░░░░░░█▒░░█▓█░░░█▒░░██░░▓███░░██░░░░░░█░░░░░░█▓▓▓▓█░▒░▓█░█░▒░██▒░░░░██████████
                            ██████████░██▓█████░░▒█▒▒░░░░░░░░░░░██░██████████████████████████████████████████████████████████▓▓░█▓█▒▒██░█████░██████████
                            ████████████▓▓▒▒▒░░░░░░░░▒█████▓███▒██▒▒░░░░░░░░░░░░▒▓░░░░░░░░░░░░░▓░▓▒▒▒▓▒▒▓▒▓░░░░░░░░░░░░░░░░░░▒█▒██▓▒▓██░░▒█▒░░██████████
                            ██████████▓█████████████▒░░░░░░░░░░░░░░░░░▒▒▓███░▓██▒░▓█▒▒█████████░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█████████▒░▓▓████████████
                            ███████████████████▒░░▒▓▓▓▓▓▓▓██▓▓█▓▓▓███▓▓▓▓▓▓███▓▒▓▓▒▓█████████████▒▒▒▓▒▓▓▒▓▓▓▓▓▓▓▓▓▓█▓▓████████▓▒░░░░▒▓▓▒▓▓▒░░░██████████
                            ██████████░▓█▒░░░░░░░▒░▒▒▒▒▒▒▒░▒▒▒▒▒▒▒▒▒▒░▒▒░░░░░░░▒░░▒░░░░░░░░░░░░░░░▒▒▒▒▒▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░▒▒▒▒▒▒░░░░░░▒▒▒▒░░██████████
                            ██████████░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██████████
                            """ + Tools.ConsoleColors.RESET);

                    loja.Vender(player);
                    break;
                } else if (resposta == 2) {
                    int probavilidade = rd.nextInt(1, 101);

                    System.out.println(Tools.ConsoleColors.BLUE + """
                            \nApesar de nao entrares na loja, desides parar para descançar um pouco.
                            
                            Passados alguns segundos de estacionares, um endivido estrado bate ao vidro.
                            
                            Tu abaixas o vidro e perguntas:
                            \033[0;36m
                            Bom-dia, posso o ajudar em alguma coisa?
                            \033[0;33m
                            Boas amigo, tenho aqui algo muito valioso, por acaso nao queres comprar? Faço-te um preço de amigo, apenas 100 bitcoins!
                            """ + Tools.ConsoleColors.RESET);

                    if (player.getGold() > 100) {
                        System.out.println(Tools.ConsoleColors.BLUE + "Dejesas comprar o item valioso? Tens " + player.getGold() + " bitcoins.\n|1 - Sim|\t\t\t\t|2 - Não|" + Tools.ConsoleColors.RESET);
                        do {
                            try {
                                in = new Scanner(System.in);
                                resposta = in.nextInt();
                                if (resposta == 1) {
                                    if (probavilidade >= 50) {
                                        System.out.println(Tools.ConsoleColors.GREEN + "Compraste uma arma muito estranha, nem o nome dela consegues perceber!\n" + Tools.ConsoleColors.RESET);
                                        player.setArma(CriarArmasPrincipais.error);
                                        CriarArmasPrincipais.error.ExibirDetalhes();
                                        System.out.println(Tools.ConsoleColors.BLUE + "\n\n(Enter para continuar)" + Tools.ConsoleColors.RESET);
                                        in = new Scanner(System.in);
                                        in.nextLine();
                                    } else {
                                        System.out.println(Tools.ConsoleColors.RED + "O vendedor enganou-te bem, quando deste por ela, pagaste 100 bitcoins por 5 porções de pipocas!\n" + Tools.ConsoleColors.RESET);
                                        for (int i = 0; i < 5; i++) {
                                            player.AddInventario(CriacaoArremesaveis.pipocas);
                                        }
                                        CriacaoArremesaveis.pipocas.ExibirDetalhes();
                                        System.out.println(Tools.ConsoleColors.BLUE + "\n\n(Enter para continuar)" + Tools.ConsoleColors.RESET);
                                        in = new Scanner(System.in);
                                        in.nextLine();
                                    }
                                    break;
                                } else if (resposta == 2) {
                                    break;
                                } else {
                                    System.out.println(Tools.ConsoleColors.PURPLE + "Insere uma opção valida!" + Tools.ConsoleColors.RESET);
                                }
                            } catch (InputMismatchException e) {
                                System.out.println(Tools.ConsoleColors.PURPLE + "Insere apenas números!" + Tools.ConsoleColors.RESET);
                            }
                        } while (true);
                    } else {
                        System.out.println(Tools.ConsoleColors.RED + "Infelizmente não tens dinheiro!\n\033[0;36mDesculpa, mas nao tenho dinheiro que chegue, fica para a proxima, prometo!" + Tools.ConsoleColors.RESET);
                    }

                    break;
                } else {
                    System.out.println(Tools.ConsoleColors.PURPLE + "Insere uma opção valida!" + Tools.ConsoleColors.RESET);
                }
            } catch (InputMismatchException e) {
                System.out.println(Tools.ConsoleColors.PURPLE + "Insere apenas números!" + Tools.ConsoleColors.RESET);
            }
        } while (true);


        Tools.Clear();

        if (player.getArma() == CriarArmasPrincipais.error) {
            System.out.println(Tools.ConsoleColors.BLUE + "Segues viagem com a tua nova arma fantastica, sentes-te invencivel com ela!" + Tools.ConsoleColors.RESET);
        } else {
            System.out.println(Tools.ConsoleColors.BLUE + "Segues viajem com o pensamento de culpa, de te teres deixado enganar por aquela pessoa, mas já não ha nada a fazer, pelo menos tens algumas pipocas para comer." + Tools.ConsoleColors.RESET);
        }

        //Sala que contem uma pequena armadilha, ou um batalha + tesouro
        System.out.println("""
                \033[0;36m
                Bem, tamos quase a chegar ao Cesae, espero que a turma ainda nao se tenha ido embora!
                
                Vamos so parar aqui na bomba para abastecer o carro e chegaremos la rapidinho!
                \033[0;34m
                Enquanto abasteces o carro, ves um carro muito suspeito a chegar!
                Queres usar alguma poção antes do carro parar?
                |1 - Sim|\t\t\t\t|2 - Não|
                """ + Tools.ConsoleColors.RESET);

        do {
            try {
                in = new Scanner(System.in);
                int resposta = in.nextInt();
                if (resposta == 1) {
                    player.MostrarUsarPocaoDoInventario();
                    break;
                } else if (resposta == 2) {
                    break;
                } else {
                    System.out.println(Tools.ConsoleColors.PURPLE + "Insere uma opção valida!" + Tools.ConsoleColors.RESET);
                }
            } catch (InputMismatchException e) {
                System.out.println(Tools.ConsoleColors.PURPLE + "Insere apenas números!" + Tools.ConsoleColors.RESET);
            }
        } while (true);

        Tools.Clear();

        System.out.println("""
                \033[0;34m
                O carro para mesmo atras do teu, abre a porta e sai de la o Ash, um incrivel treinador de pokemons, que usa pasteis de nata para aumentar a vida e
                a força dos seus pokemons.
                
                Ele mal sai do carro, lança logo uma pokebola contra a tua cara, e sai de la, um Brabochu!
                
                O que desejas fazer?
                |1 - Enfrentar Ash|\t\t\t\t|2 - Tentar Fugir|
                """);

        do {
            try {
                in = new Scanner(System.in);
                int resposta = in.nextInt();
                if (resposta == 1) {
                    Tools.Clear();
                    System.out.println(Tools.ConsoleColors.BLUE + "Desides enfrentar Ash" + Tools.ConsoleColors.RESET);
                    boolean subreviveu = player.Atacar(CriarInimigo.CriarInimigo(2, "Ash e Brabochu"));

                    if (!subreviveu) {
                        return 1;
                    } else {
                        System.out.println(Tools.ConsoleColors.GREEN + "Quando derrotas Brabochu, ele dropa uma poção estranha e Ash foge de imediato!\n\nNão tens nada a perder, portanto tomas a poção!\n\nA poçao restaura toda a tua vida e ainda te da mais 50 de ataque e 20 de defesa!\n\nPara alem disso, ainda ficaram 1000 bitcoins no chão!");
                        player.AddStatus(player.getVidaMaxima(), 50, 20);
                        player.setGold(player.getGold() + 1000);
                    }

                    break;
                } else if (resposta == 2) {
                    Tools.Clear();

                    System.out.println("""
                            \033[0;34m
                            Quando tentas fugir, Brabochu usa o seu ataque especial!
                            \033[0;33m
                            Ash: Brabochu, usa insulto!
                            \033[0;36m
                            Insulto? Ele vai me atacar o que com isso? A minha paciencia? AHAHAHA
                            \033[0;33m
                            Brabochu: Nota 0 em POO!
                            \033[0;34m
                            Ataque super efetivo! Menus 300 pontos de vida!
                            
                            No entanto, consegues fugir e tambem abasteces-te o carro e não pagaste (+ 500 bitcoins)
                            """);

                    player.AddStatus(-300, 0, 0);
                    player.setGold(player.getGold() + 500);

                    if (player.getVidaAtual() <= 0) {
                        return 1;
                    } else {
                        player.MostrarStatus();

                        System.out.println(Tools.ConsoleColors.BLUE + "\n\nDesejas usar alguma poção?\n|1 - Sim|\t\t\t\t|2 - Não|" + Tools.ConsoleColors.RESET);

                        do {
                            try {
                                in = new Scanner(System.in);
                                resposta = in.nextInt();
                                if (resposta == 1) {
                                    player.MostrarUsarPocaoDoInventario();
                                    break;
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

                    break;
                } else {
                    System.out.println(Tools.ConsoleColors.PURPLE + "Insere uma opção valida!" + Tools.ConsoleColors.RESET);
                }
            } catch (InputMismatchException e) {
                System.out.println(Tools.ConsoleColors.PURPLE + "Insere apenas números!" + Tools.ConsoleColors.RESET);
            }
        } while (true);


        Tools.Clear();

        System.out.println("""
                \033[0;34m
                Finalmente chegas ao Cesae para entregar os pasteis de nata e te deliciares com os 10% que ficaram para ti!
                
                Entras na porta, e ves o segurança, o que fazes?
                |1 - Comprimentar o Segurançã|\t\t\t\t|2 - Correr até a sala|
                """);

        do {
            try {
                in = new Scanner(System.in);
                int resposta = in.nextInt();
                if (resposta == 1) {
                    System.out.println(Tools.ConsoleColors.BLUE + "Comprimentas o segurança e o segurança comprimenta-te de volta.\n\nSegues para a sala com + 25 de dano e +20 de defesa!" + Tools.ConsoleColors.RESET);
                    player.AddStatus(0, 25, 20);
                    Tools.Pause(4000);
                    break;
                } else if (resposta == 2) {
                    break;
                } else {
                    System.out.println(Tools.ConsoleColors.PURPLE + "Insere uma opção valida!" + Tools.ConsoleColors.RESET);
                }
            } catch (InputMismatchException e) {
                System.out.println(Tools.ConsoleColors.PURPLE + "Insere apenas números!" + Tools.ConsoleColors.RESET);
            }
        } while (true);

        Tools.Clear();

        System.out.println("""
                \033[0;34m
                Corres até a sala, mas logo no topo das escadas, esta um viajante do tempo, com uma carabana cheia de itens.
                \033[0;36m
                Fogo, como é que metes-te isso ca dentro?
                \033[0;33m
                Bem, simplesmente nao calculei bem os parametros da viajem no tempo, e em vez de aparecer na praia do Algarve, apareci aqui dentro...
                
                Já agora, não queres comprar alguma coisa? O combustivel para viajar no tempo esta ainda mais caro que os vossos pasteis de nata...
                \033[0;34m
                |1 - Ver loja|\t\t\t\t|2 - Seguir sem comprar|
                """);

        do {
            try {
                in = new Scanner(System.in);
                int resposta = in.nextInt();
                if (resposta == 1) {
                    loja.Vender(player);
                    System.out.println(Tools.ConsoleColors.BLUE + "Desejas usar alguma poção? (proxima fase é o boss final)\n\n|1 - Sim|\t\t\t\t|2 - Não|");

                    do {
                        try {
                            in = new Scanner(System.in);
                            resposta = in.nextInt();
                            if (resposta == 1) {
                                player.MostrarUsarPocaoDoInventario();
                                break;
                            } else if (resposta == 2) {
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

                    System.out.println(Tools.ConsoleColors.BLUE + "Desejas usar alguma poção? (proxima fase é o boss final)\n\n|1 - Sim|\t\t\t\t|2 - Não|");

                    do {
                        try {
                            in = new Scanner(System.in);
                            resposta = in.nextInt();
                            if (resposta == 1) {
                                player.MostrarUsarPocaoDoInventario();
                                break;
                            } else if (resposta == 2) {
                                break;
                            } else {
                                System.out.println(Tools.ConsoleColors.PURPLE + "Insere uma opção valida!" + Tools.ConsoleColors.RESET);
                            }
                        } catch (InputMismatchException e) {
                            System.out.println(Tools.ConsoleColors.PURPLE + "Insere apenas números!" + Tools.ConsoleColors.RESET);
                        }
                    } while (true);

                    break;
                } else {
                    System.out.println(Tools.ConsoleColors.PURPLE + "Insere uma opção valida!" + Tools.ConsoleColors.RESET);
                }
            } catch (InputMismatchException e) {
                System.out.println(Tools.ConsoleColors.PURPLE + "Insere apenas números!" + Tools.ConsoleColors.RESET);
            }
        } while (true);

        Tools.Clear();

        System.out.println("""
                \033[0;34m
                Diriges-te a sala 9, mas mal entras, deparas-te com todos os alunos acorrentados encostados a parece e na frente, os professores cheios de notas 0 para distribuir pelos alunos!
                
                Para conseguires comprir a tua jornada, e entregar estas delicias fresquinhas aos alunos, tens de derrutar todos os professores, e impedir que eles atribuam notas 0 a toda gente!
                """);

        sobreviveu = player.Atacar(CriarInimigo.CriarInimigo(6, "Professores do Cesae"));

        if (sobreviveu) {
            Tools.Clear();
            System.out.println("""
                    \033[1;32m                                                                                                   \s
                     ░█      █ █    ░▓ ▒   ░ ██    ███ ░ ▓█░▒░░░░░░░░░░▒ █ ██░ ░ ██░   ██ ░░   ████ █▓▒     █ █      ██\s
                      ███████▓████████ ███████   █  ██████░███████████████  ███████ █  ███████████  █ ████████ █████ █░\s
                      █ █▓███ █▒█████  █████▓█ ██▒████████  █▓ ██████ ░▒  ██████████▒██▒▒█▓██████████  █████ █ █▓███ █ \s
                      █ █████ █ █████  █████ █████████         ██████    █████  █████ ██ █▓████ ██████ ▓█████ █████  █ \s
                      █ █████ █ █████  █████ ██ █████  █████████████▓█████████   █████ █ █▓████  █████░ █████ █████ █  \s
                      █▓ █████ ▒████ █ █████ █░█████░ █       ██████ █ ███████▓█ █████ █ █▓█████▓██████  █████████  █  \s
                       █ █████ █████ █ █████ █ █████ █        ██████ █ ██████ ██ █████▓█ █████▓ ██████ █ █████████ █   \s
                       █ █████ █████ █ █████ █ ██▓▓█ █        ███░▓█ █ ███▒▓█ ██ ██▒▓█ █ █░█████████   █  ███████  █   \s
                       █  ████ ████  █ ██░▒█ █ █▓▓██▒█        ███▒██ █ ███▒██ ██ ██▒██ █ █░▓▓████▒█   █ █ ███████ █    \s
                        █ ████ ██▒█ ██ ██░▓█ █ ██▒██ █        ███░▓█ █ █ █▒▓█ ██ ██▒██ █ █▒▓▓█  █████ █ ▒█ ██ ▓█ ▓█    \s
                        █ ██ █░█▒█▓ █░ ██▒▓█ █ ██▒▓█ ██   ██  ███░▓█ █ █ ██▒██ █ █▓▒██ █ █▓▒▓█   ██▒█░██ █ ██░▓█ █     \s
                        █ ░█ ▓▓▒▓█ █ █ █▓▒▓█ █  ██▓██  ██ ██  ███░▓█ █ █  ████▒ ██░██▒ █ █▓▒▓█ █  █▒██ █ █ ██░█▓██     \s
                         █ █▒▒▓▓██ █ █ █▒▒▓█ ██  ███████████  ██████ █  █  █████████   █ ██▒▓█ ██ █▒▒█ █ █ ██░█░██     \s
                         █ ██░▓▓█▒ █ █ █░▒▓█ █ █   ██████ ▒█  █      █  ██     ▓█     ██ █████ ██ ██ ██ ██ ██░▓░██     \s
                         █ ██ ▓▓█ █▒ █ █████ █ ██          █  █      █    ██        ██ █    ██ █ █ █▓██ ██ ██░█ ██     \s
                          █ █ ▒▓█ █  ██▓     █   ██████████   ████████       ██████░   ██      █ █ ░▒██▒██ ██ ▓ ██     \s
                          █ █▓███ █  █       █                                           ░████▒█ █       █▒████░██     \s
                          █ ██▒  █   ██████                                                      █████░  █    ████     \s
                          ██     █                                                                    ░████      █     \s
                           █ ███                                                                            ████ █     \s
                           █                                                                                    ▒█     \s
                                                                                                                       \s
                    
                    \033[0;34m                                                                                                   
                    Parabens! Conseguiste terminar o jogo e sair bencedor!
                    
                    Olá? tas-me a ouvir?
                    
                    Podes parar de comer os pasteis de nata e ouvir o que tenho a dizer por um pouco?
                    
                    Deixa para la, tambem nao era nada de importante...
                    """);
        } else {
            Tools.Clear();
            return 1;
        }


        return 0;
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
