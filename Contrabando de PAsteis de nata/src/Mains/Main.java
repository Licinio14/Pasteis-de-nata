package Mains;

import Entidade.Heroi.Personagem;
import Jogo.Inicializacao;
import Loja.CriarMercado;
import Loja.Mercado;

public class Main {
    public static void main(String[] args) {

        //iniciar o mercado
        Mercado loja = CriarMercado.getMercadoCriado();
        CriarMercado.AdicionarTiposNasArmas();

        Personagem player = Inicializacao.Inicializacao();



        player.ExibirDetalhes();




    }
}
