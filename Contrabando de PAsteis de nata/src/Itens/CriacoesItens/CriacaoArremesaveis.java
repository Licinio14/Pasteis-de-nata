package Itens.CriacoesItens;

import Enums.TipoConsumivel;
import Enums.TipoHeroi;
import Itens.Arremesavel;

public class CriacaoArremesaveis {
    public static Arremesavel pedra = new Arremesavel("Pedra pequena",10, TipoConsumivel.DANOINSTANTANEO, TipoHeroi.TODOS,20,"Uma pequena pedra que ainda contem vestigios de terra de onde foi apanhada, da 20 de dano");
    public static Arremesavel facaA = new Arremesavel("Faca Arremesavel", 40,TipoConsumivel.DANOINSTANTANEO,TipoHeroi.TODOS,80,"Uma faca velha que o vendedor encontrou no fundo da mala, com muita ferrugem e a cor já toda desgastada, da 80 de dano");
    public static Arremesavel bugs = new Arremesavel("Codigo com bugs", 100,TipoConsumivel.DANOINSTANTANEO,TipoHeroi.PROGRAMADOR,150,"Usa bugs no codigo do jogo para retirar vida do oponente, da 150 de dano");
    public static Arremesavel escadaA = new Arremesavel("Pequena escada",50, TipoConsumivel.DANOINSTANTANEO,TipoHeroi.FUGITIVO,70,"Uma pequena escada de mao encontrada no lixo, nao aguenta nem com uma formiga em cima, da 70 de dano");
    public static Arremesavel granada = new Arremesavel("Granada",80,TipoConsumivel.DANOINSTANTANEO,TipoHeroi.MILITAR,100,"Uma granada que o vendedor conseguio roubar de uma base militar, da 100 de dano");
    public static Arremesavel pipocas = new Arremesavel("Pipocas quentinhas",5,TipoConsumivel.DANOINSTANTANEO,TipoHeroi.TODOS,1,"Pipocas acabadinhas de fazer, boas para encher a barriga, porque deverias atiralas a alguem? da 1 de dano");
    public static Arremesavel carabela = new Arremesavel("Carabela Portuguesa",800,TipoConsumivel.DANOINSTANTANEO,TipoHeroi.TODOS,800,"A verdadeira carabela portuguesa, usada nas explorações, da 800 de dano");

}
