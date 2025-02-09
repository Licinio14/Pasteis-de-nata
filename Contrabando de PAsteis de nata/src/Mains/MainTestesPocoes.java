package Mains;

import Entidade.Heroi.ClassHeroi.Militar;
import Entidade.Heroi.Personagem;
import Enums.TipoConsumivel;
import Enums.TipoHeroi;
import Itens.Arremesavel;
import Itens.CriacoesItens.CriacaoArremesaveis;
import Itens.CriacoesItens.CriarPocoes;
import Itens.Pocao;
import Loja.CriarMercado;
import Loja.Mercado;

public class MainTestesPocoes {
    public static void main(String[] args) {

        Mercado continente = CriarMercado.getMercadoCriado();

        CriarMercado.AdicionarTiposNasArmas();

        //continente.Vender();

        Personagem player = new Militar("Licinio",1000,50,0,100);

        player.AddInventario(CriarPocoes.vidaG);

        player.ExibirDetalhes();

        System.out.println("vai usar a poção de vida");

        player.usarPocao(CriarPocoes.vidaG);

        player.ExibirDetalhes();


    }
}
