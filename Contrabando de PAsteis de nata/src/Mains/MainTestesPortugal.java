package Mains;

import Entidade.Heroi.ClassHeroi.Programador;
import Entidade.Heroi.Personagem;
import Itens.CriacoesItens.CriarArmasPrincipais;
import Jogo.Inicializacao;
import Jogo.Portugal;
import Loja.CriarMercado;
import Loja.Mercado;
import Tools.Tools;

public class MainTestesPortugal {
    public static void main(String[] args) throws InterruptedException {
        Programador player = new Programador("Teste",1000,50,0,25000);
        //iniciar o mercado
        Mercado loja = CriarMercado.getMercadoCriado();
        CriarMercado.AdicionarTiposNasArmas();

        player.setArma(CriarArmasPrincipais.error);

        int podeSeguir = Portugal.iniciarPortugal(player,loja);
        if (podeSeguir == 0){
            return;
        }else if (podeSeguir == 1){
            System.out.println(Tools.ConsoleColors.RED + "Infelizmente morres-te, mais sorte para a proxima!");
        }
    }
}
