package Itens.CriacoesItens;

import Enums.TipoConsumivel;
import Itens.Pocao;

/**
 * Classe para criar os diferentes tipos de poçoes
 */
public class CriarPocoes {
    public static Pocao vidaP = new Pocao("Vida Pequena",20, TipoConsumivel.VIDA,true,100,0,0,0,0,"Uma pequena poção de vida, que restaura 100 pontos");
    public static Pocao vidaM = new Pocao("Vida Media", 40, TipoConsumivel.VIDA,true,250,0,0,0,0,"Uma poção media de vida, restaura 250 pontos");
    public static Pocao vidaG = new Pocao("Vida Grande",60,TipoConsumivel.VIDA,true,500,0,0,0,0,"Uma poção grande de vida, recupera 500 pontos");
    public static Pocao forcaP = new Pocao("Força Pequena", 30, TipoConsumivel.ATAQUE,false,0,15,0,0,0,"Uma pequena poção que da mais 15 de força");
    public static Pocao forcaG = new Pocao("Força Grande",60,TipoConsumivel.ATAQUE,false,0,30,0,0,0,"Uma poção de força grande que da mais 30 de força");
    public static Pocao defesaP = new Pocao("Defesa Pequena",50,TipoConsumivel.DEFESA,false,0,0,10,0,0,"Pequena poção de defesa, aumenta 10 pontos na defesa");
    public static Pocao defesaG = new Pocao("Defesa Grande",130,TipoConsumivel.DEFESA,false,0,0,30,0,0,"Uma poção de defesa grande, da mais 30 pontos de defesa");

    //Ainda nao implementada a mecanica de dano por turnos
    /*
    public static Pocao fogo = new Pocao("Poção de fogo",50,TipoConsumivel.DANOTEMPORARIO,true,0,0,0,25,4,"Uma poção mestiriosa, feita com gasolina e um pequeno explosivo, da 25 de dano por 4 turnos");
    public static Pocao veneno = new Pocao("Pizza de Ananas", 150,TipoConsumivel.DANOTEMPORARIO, true,0,0,0,150,3,"Pior que todos os venonos descobertos pela Humanidade, da 150 de dano por 3 turnos");
    public static Pocao smoke = new Pocao("Granada de Fumo",100,TipoConsumivel.DEFESA,true,0,0,-20,0,0,"Granada de fumo para confundir o inimigo e facilitar os ataques, retira 20 de defesa");
    */


}
