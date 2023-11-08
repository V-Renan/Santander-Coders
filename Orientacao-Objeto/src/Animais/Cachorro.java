package Animais;

import java.util.Scanner;

/**
 * @author Victor$
 * @date 11/8/2023$
 * Description:
 */
public class Cachorro {


    static int numerosCachorros;
    private String nome;
    private String cor;
    private int altura;
    private double peso;
    private int tamanhoRabo;
    private String estadoDeEspirito;

    public Cachorro(){}
    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoRabo) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoRabo =tamanhoRabo;

        numerosCachorros++;
    }

    public static int getNumerosCachorros() {
        return numerosCachorros;
    }

    public static void setNumerosCachorros(int numerosCachorros) {
        Cachorro.numerosCachorros = numerosCachorros;
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

    public int getTamanhoRabo() {
        return tamanhoRabo;
    }

    public void setTamanhoRabo(int tamanhoRabo) {
        this.tamanhoRabo = tamanhoRabo;
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }


    public void comer() {

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
