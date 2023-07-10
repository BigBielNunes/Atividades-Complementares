package br.ucb.aluno.questao3;

import java.util.Scanner;

public class Motor {
    private int numCilindro;
    private int potencia;

    public Motor() {
        this.numCilindro = 0;
        this.potencia = 0;
    }

    public Motor(int numCilindro, int potencia) {
        this.numCilindro = numCilindro;
        this.potencia = potencia;
    }

    public void insertData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de cilindros do motor: ");
        numCilindro = scanner.nextInt();

        System.out.print("Digite a potência do motor: ");
        potencia = scanner.nextInt();
    }

    public void print() {
        System.out.println("Dados do motor:");
        System.out.println("Número de cilindros: " + numCilindro);
        System.out.println("Potência: " + potencia);
    }
}
