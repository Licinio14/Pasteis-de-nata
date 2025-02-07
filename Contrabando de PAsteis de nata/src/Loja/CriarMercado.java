package Loja;

import Enums.TipoHeroi;
import Itens.CriacoesItens.CriacaoArremesaveis;
import Itens.CriacoesItens.CriarArmasPrincipais;
import Itens.CriacoesItens.CriarPocoes;

public class CriarMercado {

    public static Mercado getMercadoCriado(){
        Mercado continente = new Mercado();

        //armas principais
        continente.adicionarStock(CriarArmasPrincipais.faca);
        continente.adicionarStock(CriarArmasPrincipais.Pistola);
        continente.adicionarStock(CriarArmasPrincipais.Metrelhadora);
        continente.adicionarStock(CriarArmasPrincipais.Sniper);
        continente.adicionarStock(CriarArmasPrincipais.ram8);
        continente.adicionarStock(CriarArmasPrincipais.ram32);
        continente.adicionarStock(CriarArmasPrincipais.colher);
        continente.adicionarStock(CriarArmasPrincipais.escada);
        continente.adicionarStock(CriarArmasPrincipais.error);

        //armas arremesaveis
        continente.adicionarStock(CriacaoArremesaveis.pedra);
        continente.adicionarStock(CriacaoArremesaveis.facaA);
        continente.adicionarStock(CriacaoArremesaveis.bugs);
        continente.adicionarStock(CriacaoArremesaveis.escadaA);
        continente.adicionarStock(CriacaoArremesaveis.granada);
        continente.adicionarStock(CriacaoArremesaveis.pipocas);
        continente.adicionarStock(CriacaoArremesaveis.carabela);

        //poções
        continente.adicionarStock(CriarPocoes.vidaP);
        continente.adicionarStock(CriarPocoes.vidaM);
        continente.adicionarStock(CriarPocoes.vidaG);
        continente.adicionarStock(CriarPocoes.forcaP);
        continente.adicionarStock(CriarPocoes.forcaG);
        continente.adicionarStock(CriarPocoes.defesaP);
        continente.adicionarStock(CriarPocoes.defesaG);
        continente.adicionarStock(CriarPocoes.fogo);
        continente.adicionarStock(CriarPocoes.veneno);
        continente.adicionarStock(CriarPocoes.smoke);

        return continente;
    }

    public static void AdicionarTiposNasArmas(){
        CriarArmasPrincipais.faca.AdicionaTipoHeroi(TipoHeroi.TODOS);
    }

}
