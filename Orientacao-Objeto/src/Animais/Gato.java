package Animais;

import java.util.Scanner;

/**
 * @author Victor$
 * @date 11/8/2023$
 * Description:
 */
public class Gato extends Animal{

    static int numeroDeGatos;

    public Gato(String nome, String cor, int altura, double peso) {
        super(nome, cor, altura, peso);
    }

    @Override
    public void soar() {
        System.out.println(this.nome + ": Miau Miau");
    }

    @Override
    public void menu() {
        int op;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ações no gatinho.");
        System.out.println("[1] para fazer carinho.");
        System.out.println("[2] para pisar no rabo do gato (sem querer, desculpa gatinho).");
        System.out.println("[3] para dar comida.");
        System.out.print("Digite sua ação: ");
        op = scan.nextInt();
        System.out.println("O " + nome + " está " + interagir(op));
    }
}
