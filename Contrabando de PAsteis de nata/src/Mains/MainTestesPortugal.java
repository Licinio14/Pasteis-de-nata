package Mains;

import Entidade.Heroi.ClassHeroi.Programador;
import Entidade.Heroi.Personagem;
import Jogo.Inicializacao;
import Jogo.Portugal;
import Loja.CriarMercado;
import Loja.Mercado;

public class MainTestesPortugal {
    public static void main(String[] args) throws InterruptedException {
        Programador player = new Programador("Teste",1000,50,0,25000);
        //iniciar o mercado
        Mercado loja = CriarMercado.getMercadoCriado();
        CriarMercado.AdicionarTiposNasArmas();

        Portugal.iniciarPortugal(player,loja);
    }
}
