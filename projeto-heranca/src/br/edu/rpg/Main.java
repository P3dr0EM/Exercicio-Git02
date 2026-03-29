
package br.edu.rpg;
import br.edu.rp.modelo.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Personagem> grupo = new ArrayList<>();

        grupo.add(new Guerreiro("Aragorn", 10, 50));
        grupo.add(new Mago("Gandalf", 12, 100));

        System.out.println("--- Início do Combate ---");
        for (Personagem p : grupo) {
            System.out.println(p.toString());
            p.atacar();
            System.out.println("-------------------------");
        }
    }
}