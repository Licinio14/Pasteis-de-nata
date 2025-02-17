package Mains;

import Entidade.Heroi.Personagem;
import Jogo.Inicializacao;
import Jogo.Portugal;
import Loja.CriarMercado;
import Loja.Mercado;
import Tools.Tools;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int podeSeguir = 0;
        Personagem copia;

        //Mostrar o inicio da historia
        Inicializacao.InicioHistoria();

        //iniciar o mercado
        Mercado loja = CriarMercado.getMercadoCriado();
        CriarMercado.AdicionarTiposNasArmas();

        Personagem player = Inicializacao.Inicializacao();
        copia = player;

        podeSeguir = Portugal.iniciarPortugal(player,loja);
        if (podeSeguir == 0){
            return;
        }else if (podeSeguir == 1){
            System.out.println(Tools.ConsoleColors.RED + "Infelizmente morres-te, mais sorte para a proxima!");
        }




    }
}
