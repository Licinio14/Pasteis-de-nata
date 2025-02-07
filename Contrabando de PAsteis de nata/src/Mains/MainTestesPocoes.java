package Mains;

import Enums.TipoConsumivel;
import Enums.TipoHeroi;
import Itens.Arremesavel;
import Itens.Pocao;
import Loja.CriarMercado;
import Loja.Mercado;

public class MainTestesPocoes {
    public static void main(String[] args) {

        Mercado continente = CriarMercado.getMercadoCriado();



        CriarMercado.AdicionarTiposNasArmas();

        continente.ExibirDetalhes();




    }
}
