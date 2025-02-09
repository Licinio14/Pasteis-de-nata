package Loja;

import Itens.ItensHeroi;
import java.util.ArrayList;
import java.util.Random;

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

    public void ExibirDetalhes(){
        int i = 0;
        for (ItensHeroi mostrar : stock){
            System.out.println("\n\nItem nº" + ++i);
            System.out.println("____________________________________");
            mostrar.ExibirDetalhes();
            System.out.println("____________________________________");
        }

    }

    public void Vender(){
        Random rd = new Random();
        ArrayList<ItensHeroi> randomstock = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            randomstock.add(stock.get(rd.nextInt(this.stock.size())));
        }

        int i = 0;
        for (ItensHeroi mostrar : randomstock){
            System.out.println("\n\nItem nº" + ++i);
            System.out.println("____________________________________");
            mostrar.ExibirDetalhes();
            System.out.println("____________________________________");
        }

    }


}
