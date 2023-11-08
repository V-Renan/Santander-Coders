package Animais;

import java.util.Scanner;

/**
 * @author Victor$
 * @date 11/8/2023$
 * Description:
 */
public class Animal {

    protected String nome;
    protected String cor;
    protected int altura;
    protected double peso;
    protected String estadoDeEspirito;

    public Animal(String nome, String cor, int altura, double peso) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
    }

    protected void comer(){}

    protected void dormir(){}

    public void soar() {
        System.out.println(" cri cri");
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
        System.out.println("O " + nome + " está " + interagir(op));
    }



}
