package Entidade.Heroi.CriarHerois;

import Entidade.Heroi.ClassHeroi.Fugitivo;
import Entidade.Heroi.ClassHeroi.Militar;
import Entidade.Heroi.ClassHeroi.Programador;

public class TiposHerois {

    /**
     * Cria um heroi do tipo Fugitivo com -10 de defesa e 150 gold
     * @param nome nome para o fugitivo (string)
     * @param vida vida a cima dos 1000 que vai ter (int)
     * @param forca forca a cima dos 70 que vai ter (int)
     * @return retorna o objeto Fugitivo
     */
    public static Fugitivo CriarFugitivo(String nome, int vida, int forca) {
        return new Fugitivo(nome,1000+vida,70+forca,-10,150);
    }

    /**
     * Cria um heroi do tipo Militar com -10 de defesa e 150 gold
     * @param nome nome para o militar (string)
     * @param vida vida a cima dos 1000 que vai ter (int)
     * @param forca forca a cima dos 70 que vai ter (int)
     * @return retorna o objeto Militar
     */
    public static Militar CriarMilitar(String nome, int vida, int forca) {
        return new Militar(nome,1000+vida,50+forca,20,80);
    }

    /**
     * Cria um heroi do tipo Programador com -10 de defesa e 150 gold
     * @param nome nome para o programador (string)
     * @param vida vida a cima dos 1000 que vai ter (int)
     * @param forca forca a cima dos 70 que vai ter (int)
     * @return retorna o objeto Programador
     */
    public static Programador CriarProgramador(String nome, int vida, int forca) {
        return new Programador(nome,1000+vida,60+forca,0,120);
    }
}
