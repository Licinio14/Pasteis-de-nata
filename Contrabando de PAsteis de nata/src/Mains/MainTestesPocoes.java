package Mains;

import Entidade.Heroi.ClassHeroi.Fugitivo;
import Entidade.Heroi.ClassHeroi.Militar;
import Entidade.Heroi.ClassHeroi.Programador;
import Entidade.Heroi.CriarHerois.TiposHerois;
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
    public static void main(String[] args) throws InterruptedException {

        Militar player = TiposHerois.CriarMilitar("lince",100,10);

        Mercado continente = CriarMercado.getMercadoCriado();

        CriarMercado.AdicionarTiposNasArmas();

        continente.Vender(player);

        /*

        //Fugitivo player = TiposHerois.CriarFugitivo("lince",100,10);
        //Militar player = TiposHerois.CriarMilitar("lince",100,10);
        //Programador player = TiposHerois.CriarProgramador("lince",100,10);

        Inimigo teste = new Inimigo("Bomba",1000,75,0,88);

        player.AddInventario(CriarPocoes.vidaG);
        player.AddInventario(CriarPocoes.vidaG);
        player.AddInventario(CriarPocoes.vidaG);
        player.AddInventario(CriarPocoes.vidaG);
        player.AddInventario(CriarPocoes.vidaG);
        player.AddInventario(CriarPocoes.defesaG);
        player.AddInventario(CriarPocoes.defesaG);
        player.AddInventario(CriarPocoes.defesaG);
        player.AddInventario(CriacaoArremesaveis.bugs);
        player.AddInventario(CriacaoArremesaveis.facaA);
        player.AddInventario(CriacaoArremesaveis.granada);
        player.AddInventario(CriacaoArremesaveis.pipocas);

        player.setArma(CriarArmasPrincipais.sniper);

        player.Atacar(teste);



        System.out.println("fim");

         */

    }
}
