package Loja;

import Entidade.Heroi.ClassHeroi.Fugitivo;
import Entidade.Heroi.ClassHeroi.Programador;
import Entidade.Heroi.ClassHeroi.Militar;
import Entidade.Heroi.Personagem;
import Enums.TipoHeroi;
import Itens.ArmaPrincipal;
import Itens.ItensHeroi;
import Tools.Tools;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Mercado {
    private ArrayList<ItensHeroi> stock;

    /**
     * Cria um mercado
     */
    public Mercado(){
        stock = new ArrayList<ItensHeroi>();
    }

    /**
     * Adiciona itens ao mercado
     * @param item Item a adicionar (ItensHeroi)
     */
    public void adicionarStock(ItensHeroi item){
        stock.add(item);
    }

    /**
     * Função para mostrar todos os itens da loja
     */
    public void ExibirDetalhes(){
        int i = 0;
        for (ItensHeroi mostrar : stock){
            System.out.println("\n\nItem nº" + ++i + "____________________________________");
            System.out.println("");
            mostrar.ExibirDetalhes();
            System.out.println("____________________________________");
        }

    }

    /**
     * Função para mostrar 10 itens aleatorios da loja e deixar o player comprar-los
     * @param player entidade personagem que vai usar a loja (Personagem)
     */
    public void Vender(Personagem player) throws InterruptedException {
        Random rd = new Random();
        Scanner in = new Scanner(System.in);
        int resposta, quantidadeArmas = 0;

        ArrayList<ItensHeroi> randomstock = new ArrayList<>();

        do {
            ItensHeroi item;

            if (quantidadeArmas < 3 ) {
                quantidadeArmas++;
                item = stock.get(rd.nextInt(8));
            }else {
                item = stock.get(rd.nextInt(8,this.stock.size()));
            }


            if (!randomstock.contains(item)){
                randomstock.add(item);
            }


        }while (randomstock.size() < 10);




        do {
            System.out.println(Tools.ConsoleColors.BLUE );

            player.ExibirDetalhes();
            System.out.println();

            System.out.println("""
                -----------------------------------------------------------------
                |                       Loja dos 300                            |
                -----------------------------------------------------------------""");

            int i = 0;
            for (ItensHeroi mostrar : randomstock){
                System.out.println(Tools.ConsoleColors.BLUE_BOLD + "\nItem nº" + ++i);
                mostrar.ExibirDetalhes();
            }

            System.out.println(Tools.ConsoleColors.RESET);

            System.out.println(Tools.ConsoleColors.BLUE + "Qual item desejas comprar? |0 - Sair da loja|" + Tools.ConsoleColors.RESET);

            try {
                in = new Scanner(System.in);
                resposta = in.nextInt();

                if (resposta == 0){
                    do {
                        try{
                            System.out.println(Tools.ConsoleColors.RED_BOLD + "\nTens a certeza que queres deixar a loja?\n|1 - Sim|\t\t\t|2 - Não|" + Tools.ConsoleColors.RESET);
                            in = new Scanner(System.in);
                            resposta = in.nextInt();

                            if (resposta == 1){
                                System.out.println(Tools.ConsoleColors.BLUE + "A loja nao tinha nada do teu interece, entao decides sair da loja e continuar a tua jornada" + Tools.ConsoleColors.RESET);
                                Tools.Pause(5000);
                                Tools.Clear();
                                return;
                            } else if (resposta == 2) {
                                break;
                            }else {
                                System.out.println(Tools.ConsoleColors.PURPLE + "Insira uma opção valida!" + Tools.ConsoleColors.RESET);
                            }
                        }catch (InputMismatchException e){
                            System.out.println(Tools.ConsoleColors.PURPLE + "Insira apenas nũmeros!!!" + Tools.ConsoleColors.RESET);
                        }
                    }while (true);

                }else if (resposta >= 1 && resposta <= 10){
                    int index = resposta - 1;
                    boolean podeComprar;

                    if (randomstock.get(index) instanceof ArmaPrincipal){
                        TipoHeroi tipo = getTipoHeroiStore(player);
                        podeComprar = randomstock.get(index).PodeUsar(tipo);
                    }else {
                        podeComprar = true;
                    }

                    if (podeComprar){

                        if (randomstock.get(index) instanceof ArmaPrincipal){

                            if (player.getGold() >= randomstock.get(index).getPreco()){
                                System.out.println(Tools.ConsoleColors.GREEN + "Item comprado com sucesso!" + Tools.ConsoleColors.RESET);
                                ArmaPrincipal arma = (ArmaPrincipal) randomstock.get(index);
                                player.setArma(arma);
                                player.setGold(player.getGold() - randomstock.get(index).getPreco());
                                randomstock.remove(index);
                            }else {
                                // evento aleatorio que pode deixar o player compar o item de graça se nao tiver dinheiro
                                int sorte = rd.nextInt(1,101);
                                int numeroAcertar = rd.nextInt(1,101);

                                if (sorte == numeroAcertar){
                                    System.out.println(Tools.ConsoleColors.GREEN + "O vendedor esta muito feliz hoje e ofereceu-te o item!" + Tools.ConsoleColors.RESET);
                                    ArmaPrincipal arma = (ArmaPrincipal) randomstock.get(index);
                                    player.setArma(arma);
                                    randomstock.remove(index);
                                }else {
                                    System.out.println(Tools.ConsoleColors.PURPLE + "Não tens Bitcoins suficientes!" + Tools.ConsoleColors.RESET);
                                }
                            }

                        } else {

                            if (player.getGold() >= randomstock.get(index).getPreco()){
                                System.out.println(Tools.ConsoleColors.GREEN + "Item comprado com sucesso!" + Tools.ConsoleColors.RESET);
                                player.AddInventario(randomstock.get(index));
                                player.setGold(player.getGold() - randomstock.get(index).getPreco());
                                randomstock.remove(index);
                            }else {
                                // evento aleatorio que pode deixar o player compar o item de graça se nao tiver dinheiro
                                int sorte = rd.nextInt(1,101);
                                int numeroAcertar = rd.nextInt(1,101);

                                if (sorte == numeroAcertar){
                                    System.out.println(Tools.ConsoleColors.GREEN + "O vendedor esta muito feliz hoje e ofereceu-te o item!" + Tools.ConsoleColors.RESET);
                                    player.AddInventario(randomstock.get(index));
                                    randomstock.remove(index);
                                }else {
                                    System.out.println(Tools.ConsoleColors.PURPLE + "Não tens Bitcoins suficientes!" + Tools.ConsoleColors.RESET);
                                }
                            }
                        }

                        Tools.Pause(3000);
                        Tools.Clear();
                    }else {
                        System.out.println();
                        System.out.println(Tools.ConsoleColors.RED_BACKGROUND + "Este item nao pode ser adiquirido pela tua class!" + Tools.ConsoleColors.RESET);
                        System.out.println();
                        Tools.Pause(5000);
                        Tools.Clear();
                    }



                }else {
                    System.out.println(Tools.ConsoleColors.PURPLE + "Insira uma opção valida!" + Tools.ConsoleColors.RESET);
                }

            }catch (InputMismatchException e){
                System.out.println(Tools.ConsoleColors.PURPLE + "Insira apenas números!" + Tools.ConsoleColors.RESET);
            }


        }while (true);

    }

    /**
     * Metudo para conseguir o tipo do heroi
     * @param player heroi do jogador (Personagem)
     * @return enum tipo do heroi (TipoHeroi)
     */
    public TipoHeroi getTipoHeroiStore(Personagem player){
        if (player instanceof Fugitivo){
            return TipoHeroi.FUGITIVO;
        } else if (player instanceof Militar) {
            return TipoHeroi.MILITAR;
        } else if (player instanceof Programador) {
            return TipoHeroi.PROGRAMADOR;
        }
        return null;
    }


}
