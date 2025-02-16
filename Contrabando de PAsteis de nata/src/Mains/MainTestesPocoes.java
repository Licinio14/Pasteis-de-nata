package Mains;

import Entidade.Heroi.ClassHeroi.Militar;
import Entidade.Heroi.CriarHerois.CriarTiposHerois;
import Entidade.NPC.CriarNPC.CriarInimigo;
import Entidade.NPC.Inimigo;
import Itens.CriacoesItens.CriacaoArremesaveis;
import Itens.CriacoesItens.CriarArmasPrincipais;
import Itens.CriacoesItens.CriarPocoes;
import Loja.CriarMercado;
import Loja.Mercado;

public class MainTestesPocoes {
    public static void main(String[] args) throws InterruptedException {

        Militar player = CriarTiposHerois.CriarMilitar("lince",100,10);


        player.AddInventario(CriarPocoes.vidaG);
        player.AddInventario(CriarPocoes.vidaG);
        player.AddInventario(CriarPocoes.vidaG);
        player.AddInventario(CriarPocoes.vidaG);
        player.AddInventario(CriarPocoes.vidaG);
        player.AddInventario(CriarPocoes.defesaG);
        player.AddInventario(CriarPocoes.defesaG);
        player.AddInventario(CriarPocoes.defesaG);
        player.AddInventario(CriarPocoes.forcaG);
        player.AddInventario(CriarPocoes.forcaG);
        player.AddInventario(CriacaoArremesaveis.bugs);
        player.AddInventario(CriacaoArremesaveis.facaA);
        player.AddInventario(CriacaoArremesaveis.granada);
        player.AddInventario(CriacaoArremesaveis.pipocas);


        player.MostrarUsarPocaoDoInventario();






        Mercado continente = CriarMercado.getMercadoCriado();

        CriarMercado.AdicionarTiposNasArmas();

        continente.Vender(player);



        //Fugitivo player = TiposHerois.CriarFugitivo("lince",100,10);
        //Militar player = TiposHerois.CriarMilitar("lince",100,10);
        //Programador player = TiposHerois.CriarProgramador("lince",100,10);

        Inimigo ini = CriarInimigo.CriarInimigo(3,"ChatGPT");



        player.setArma(CriarArmasPrincipais.sniper);

        player.Atacar(ini);



        System.out.println("fim");

         player.ExibirDetalhes();
        /*

         */
    }
}
