# ⚔️ Projeto RPG — Herança e Polimorfismo em Java

Este projeto foi desenvolvido como parte de um exercício académico sobre Programação Orientada a Objetos. O foco principal é a implementação de **herança**, **sobrescrita de métodos** e **polimorfismo**, utilizando o **GitHub Flow** para colaboração.

## 👥 Integrantes (Trio)
* **Pedro Gabriel Evangelista Marques**  - **RA:42520893**
* **Leonardo Ferreira Tomaz** - **RA: 42414791**
* **Lucas Gabriel Abade Oliveira** - **RA: 42420206**

## 📝 Sobre o Tema
Escolhemos o tema **RPG (Role Playing Game)**. O sistema modela uma superclasse `Personagem` que define comportamentos básicos (como atacar). As subclasses `Guerreiro` e `Mago` herdam estes atributos e sobrescrevem o método de ataque para refletir as suas habilidades específicas (força física vs. magia).

## 🚀 Tecnologias e Conceitos
- **Linguagem:** Java 17+
- **OO:** Herança, Encapsulamento e Polimorfismo.
- **Git:** Utilização de branches (`feature/`), Pull Requests e Code Review.

## 🏗️ Estrutura de Classes
1. **Personagem (Superclasse):** Define `nome`, `nivel` e o método `atacar()`.
2. **Guerreiro (Subclasse):** Adiciona `forcaFisica` e sobrescreve `atacar()`.
3. **Mago (Subclasse):** Adiciona `mana` e sobrescreve `atacar()`.
4. **Main:** Demonstra o uso de uma `List<Personagem>` para executar ataques polimórficos.
