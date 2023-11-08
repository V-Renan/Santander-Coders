package Animais;

import java.util.Scanner;

/**
 * @author Victor$
 * @date 11/8/2023$
 * Description:
 */
public class Passaro extends Animal{

    public Passaro(String nome, String cor, int altura, double peso) {
        super(nome, cor, altura, peso);
    }

    @Override
    public void soar() {
        System.out.println(this.nome + ": Piu Piu");
    }

    @Override
    public void menu() {
        int op;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ações no pássaro.");
        System.out.println("[1] para fazer carinho.");
        System.out.println("[2] brigar com pássaro (sem querer, desculpa pássaro).");
        System.out.println("[3] para dar comida.");
        System.out.print("Digite sua ação: ");
        op = scan.nextInt();
        System.out.println("O " + nome + " está " + interagir(op));
    }
}
