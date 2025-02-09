package Loja;

import Entidade.Heroi.Personagem;
import Enums.TipoHeroi;
import Itens.CriacoesItens.CriacaoArremesaveis;
import Itens.CriacoesItens.CriarArmasPrincipais;
import Itens.CriacoesItens.CriarPocoes;

public class CriarMercado {

    public static Mercado getMercadoCriado(){
        Mercado continente = new Mercado();

        //armas principais
        continente.adicionarStock(CriarArmasPrincipais.faca);
        continente.adicionarStock(CriarArmasPrincipais.pistola);
        continente.adicionarStock(CriarArmasPrincipais.metrelhadora);
        continente.adicionarStock(CriarArmasPrincipais.sniper);
        continente.adicionarStock(CriarArmasPrincipais.ram8);
        continente.adicionarStock(CriarArmasPrincipais.ram32);
        continente.adicionarStock(CriarArmasPrincipais.colher);
        continente.adicionarStock(CriarArmasPrincipais.escada);

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
