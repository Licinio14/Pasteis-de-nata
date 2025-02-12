package Mains;

import Entidade.Heroi.ClassHeroi.Militar;
import Entidade.Heroi.Personagem;
import Entidade.NPC.Inimigo;
import Enums.TipoConsumivel;
import Enums.TipoHeroi;
import Itens.Arremesavel;
import Itens.CriacoesItens.CriacaoArremesaveis;
import Itens.CriacoesItens.CriarArmasPrincipais;
import Itens.CriacoesItens.CriarPocoes;
import Itens.Pocao;
import Loja.CriarMercado;
import Loja.Mercado;
import Tools.Tools;

public class MainTestesPocoes {
    public static void main(String[] args) {

        Mercado continente = CriarMercado.getMercadoCriado();

        CriarMercado.AdicionarTiposNasArmas();

        //continente.Vender();

        Militar player = new Militar("Licinio",1000,50,100);

        Inimigo teste = new Inimigo("Bomba",1000,75,0,88);

        player.setArma(CriarArmasPrincipais.error);

        player.Atacar(teste);

        System.out.println("fim");


    }
}
