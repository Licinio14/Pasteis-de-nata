package Mains;

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

        Personagem player = new Personagem("Licinio",1000,1000,50,0,1,100);

        player.AddInventario(CriarPocoes.defesaG);
        player.AddInventario(CriacaoArremesaveis.pipocas);

        player.ExibirDetalhes();



    }
}
