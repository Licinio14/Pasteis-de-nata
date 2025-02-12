package Entidade.Heroi.ClassHeroi;

import Entidade.Heroi.Personagem;
import Entidade.NPC.Inimigo;
import Itens.Pocao;

public class Programador extends Personagem {

    public Programador(String nome, int vidaMaxima,int forca, int defesa,int gold) {
        super(nome, vidaMaxima,forca, defesa, 1, gold);
    }


    @Override
    public boolean Atacar(Inimigo inimigo) {
        System.out.println(inimigo.getNome());
        return true;
    }
}
