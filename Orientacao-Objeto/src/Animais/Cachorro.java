package Animais;

import java.util.Scanner;

/**
 * @author Victor$
 * @date 11/8/2023$
 * Description:
 */
public class Cachorro extends Animal{


    public Cachorro(String nome, String cor, int altura, double peso) {
        super(nome, cor, altura, peso);
    }

    public void soar() {
        System.out.println(getNome() + ": Au Au");
    }

    public String pegar() {
        return "O " + getNome() + " pegou uma Bolinha";
    }
    public String interagir(int acao) {
        this.estadoDeEspirito = "neutro";
        if (acao == 1) {
            this.estadoDeEspirito = "Feliz!!";
            return estadoDeEspirito;
        } else if (acao == 2) {
            this.estadoDeEspirito = "Triste!";
            return estadoDeEspirito;
        } else if (acao == 3) {
            this.estadoDeEspirito = "Feliz de barriguinha cheia!";
            return estadoDeEspirito;
        }
        return estadoDeEspirito;
    }

    public void menu() {
        int op;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ações no doguinho.");
        System.out.println("[1] para fazer carinho.");
        System.out.println("[2] para pisar no rabo (sem querer, desculpa doguinho).");
        System.out.println("[3] para dar comida.");
        System.out.print("Digite sua ação: ");
        op = scan.nextInt();
        System.out.println("O " + getNome() + " está " + interagir(op));
    }
}
