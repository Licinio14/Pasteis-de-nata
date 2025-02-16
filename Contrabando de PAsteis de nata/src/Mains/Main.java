package Mains;

import Entidade.Heroi.Personagem;
import Jogo.Inicializacao;
import Loja.CriarMercado;
import Loja.Mercado;

public class Main {
    public static void main(String[] args) {

        //MOstrar o inicio da historia
        Inicializacao.InicioHistoria();

        //iniciar o mercado
        Mercado loja = CriarMercado.getMercadoCriado();
        CriarMercado.AdicionarTiposNasArmas();

        Personagem player = Inicializacao.Inicializacao();



        player.ExibirDetalhes();




    }
}
