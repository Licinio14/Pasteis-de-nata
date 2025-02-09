package Entidade.Heroi.ClassHeroi;

import Entidade.Heroi.Personagem;
import Itens.Pocao;

public class Militar extends Personagem {

    public Militar(String nome, int vidaMaxima, int forca, int defesa, int gold) {
        super(nome, vidaMaxima,forca, defesa, 1, gold);
    }

    @Override
    public void Atacar() {

    }
}
