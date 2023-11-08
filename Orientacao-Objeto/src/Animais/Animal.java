package Animais;

import java.util.Scanner;

/**
 * @author Victor$
 * @date 11/8/2023$
 * Description:
 */
public class Animal{

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }

    public void setEstadoDeEspirito(String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
    }
}
