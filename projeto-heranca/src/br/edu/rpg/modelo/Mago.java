package br.edu.rpg.modelo;

public class Mago extends Personagem {
    private int mana;

    //Construtor
    public Mago(String nome, int nivel, int mana) {
        super(nome, nivel);
        this.mana = mana;
    }

    //Método Genérico Sobrescrito
    @Override
    public void atacar() {
        System.out.println(getNome() + " realizou um ataque com mana! Causando "+ mana +" de dano!");
    }

    // Getters e Setters (Encapsulamento)
    public int getMana() { return mana; }
    public int setMana(int mana) { this.mana = mana; }

}
