package Loja;


import Enums.TipoHeroi;
import Itens.CriacoesItens.CriacaoArremesaveis;
import Itens.CriacoesItens.CriarArmasPrincipais;
import Itens.CriacoesItens.CriarPocoes;

public class CriarMercado {

    public static Mercado getMercadoCriado(){
        Mercado lojaDos300 = new Mercado();

        //armas principais
        lojaDos300.adicionarStock(CriarArmasPrincipais.faca);
        lojaDos300.adicionarStock(CriarArmasPrincipais.pistola);
        lojaDos300.adicionarStock(CriarArmasPrincipais.metrelhadora);
        lojaDos300.adicionarStock(CriarArmasPrincipais.sniper);
        lojaDos300.adicionarStock(CriarArmasPrincipais.ram8);
        lojaDos300.adicionarStock(CriarArmasPrincipais.ram32);
        lojaDos300.adicionarStock(CriarArmasPrincipais.colher);
        lojaDos300.adicionarStock(CriarArmasPrincipais.escada);

        //armas arremesaveis
        lojaDos300.adicionarStock(CriacaoArremesaveis.pedra);
        lojaDos300.adicionarStock(CriacaoArremesaveis.facaA);
        lojaDos300.adicionarStock(CriacaoArremesaveis.bugs);
        lojaDos300.adicionarStock(CriacaoArremesaveis.escadaA);
        lojaDos300.adicionarStock(CriacaoArremesaveis.granada);
        //lojaDos300.adicionarStock(CriacaoArremesaveis.pipocas);
        lojaDos300.adicionarStock(CriacaoArremesaveis.carabela);

        //poções
        lojaDos300.adicionarStock(CriarPocoes.vidaP);
        lojaDos300.adicionarStock(CriarPocoes.vidaM);
        lojaDos300.adicionarStock(CriarPocoes.vidaG);
        lojaDos300.adicionarStock(CriarPocoes.forcaP);
        lojaDos300.adicionarStock(CriarPocoes.forcaG);
        lojaDos300.adicionarStock(CriarPocoes.defesaP);
        lojaDos300.adicionarStock(CriarPocoes.defesaG);
        //lojaDos300.adicionarStock(CriarPocoes.fogo);
        //lojaDos300.adicionarStock(CriarPocoes.veneno);
        //lojaDos300.adicionarStock(CriarPocoes.smoke);

        return lojaDos300;
    }

    public static void AdicionarTiposNasArmas(){
        CriarArmasPrincipais.faca.AdicionaTipoHeroi(TipoHeroi.TODOS);
        CriarArmasPrincipais.pistola.AdicionaTipoHeroi(TipoHeroi.TODOS);
        CriarArmasPrincipais.metrelhadora.AdicionaTipoHeroi(TipoHeroi.MILITAR);
        CriarArmasPrincipais.metrelhadora.AdicionaTipoHeroi(TipoHeroi.FUGITIVO);
        CriarArmasPrincipais.sniper.AdicionaTipoHeroi(TipoHeroi.MILITAR);
        CriarArmasPrincipais.ram8.AdicionaTipoHeroi(TipoHeroi.PROGRAMADOR);
        CriarArmasPrincipais.ram32.AdicionaTipoHeroi(TipoHeroi.PROGRAMADOR);
        CriarArmasPrincipais.colher.AdicionaTipoHeroi(TipoHeroi.PROGRAMADOR);
        CriarArmasPrincipais.colher.AdicionaTipoHeroi(TipoHeroi.FUGITIVO);
        CriarArmasPrincipais.escada.AdicionaTipoHeroi(TipoHeroi.FUGITIVO);
        CriarArmasPrincipais.error.AdicionaTipoHeroi(TipoHeroi.TODOS);
        CriarArmasPrincipais.maos.AdicionaTipoHeroi(TipoHeroi.TODOS);
    }

}
