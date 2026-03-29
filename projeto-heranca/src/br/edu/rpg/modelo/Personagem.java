package br.edu.rpg.modelo;

public class Personagem {
    private String nome;
    private int nivel;

    public Personagem(String nome, int nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    public void atacar() {
        System.out.println(nome + " realizou um ataque básico!");
    }

    // Getters e Setters (Encapsulamento)
    public String getNome() { return nome; }
    public int getNivel() { return nivel; }

    @Override
    public String toString() {
        return "Personagem: " + nome + " | Nível: " + nivel;
    }
}
