package Entidade.NPC.CriarNPC;

import Entidade.NPC.Inimigo;

import java.util.Random;

public class CriarInimigo {
    public static Inimigo CriarInimigo(int tipo, String nome) {
        Random rd = new Random();
        int gold = rd.nextInt(15,100);


        return switch (tipo) {
            case 1 -> new Inimigo(nome, rd.nextInt(500, 701), rd.nextInt(20, 41), 0, gold);
            case 2 -> new Inimigo(nome, rd.nextInt(950, 1051), rd.nextInt(45, 56), 0, gold);
            case 3 -> new Inimigo(nome, rd.nextInt(450, 551), rd.nextInt(90, 111), 0, gold);
            case 4 -> new Inimigo(nome, rd.nextInt(1500, 1671), rd.nextInt(25, 36), rd.nextInt(11), gold);
            case 5 -> new Inimigo(nome, rd.nextInt(770, 811), rd.nextInt(80, 96), rd.nextInt(5, 16), gold);
            case 6 -> new Inimigo(nome, rd.nextInt(2000, 3001), rd.nextInt(140, 176), rd.nextInt(5, 21), 2500);
            default -> new Inimigo(nome, 1000, 75, 0, gold);
        };
    }
}
