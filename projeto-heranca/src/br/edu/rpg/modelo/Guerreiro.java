package br.edu.rpg.modelo;

public class Guerreiro extends Personagem {
    private int forcaFisica;

    public Guerreiro(String nome, int nivel, int forcaFisica) {
        super(nome, nivel);
        this.forcaFisica = forcaFisica;
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " ataca com força física de " + forcaFisica + " causando dano pesado!");
    }

    public int getForcaFisica() { 
        return forcaFisica; 
    }

    public void setForcaFisica(int forcaFisica) { 
        this.forcaFisica = forcaFisica; 
    }
}