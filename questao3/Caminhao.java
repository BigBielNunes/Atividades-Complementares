package br.ucb.aluno.questao3;

import java.util.Scanner;

public class Caminhao extends Veiculo {
    private int toneladas;
    private int alturaMax;
    private int comprimento;

    public Caminhao() {
        super();
        this.toneladas = 0;
        this.alturaMax = 0;
        this.comprimento = 0;
    }

    public Caminhao(int numCilindro, int potencia, int peso, int velocMax, float preco, int toneladas, int alturaMax, int comprimento) {
        super(numCilindro, potencia, peso, velocMax, preco);
        this.toneladas = toneladas;
        this.alturaMax = alturaMax;
        this.comprimento = comprimento;
    }

    public void insertData() {
        super.insertData();  // Chama o método insertData() da classe base (Veiculo) para inserir os dados do veículo

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a carga máxima do caminhão em toneladas: ");
        toneladas = scanner.nextInt();

        System.out.print("Digite a altura máxima do caminhão: ");
        alturaMax = scanner.nextInt();

        System.out.print("Digite o comprimento do caminhão: ");
        comprimento = scanner.nextInt();
    }

    public void print() {
        super.print();  // Chama o método print() da classe base (Veiculo) para imprimir os dados do veículo

        System.out.println("Dados do caminhão:");
        System.out.println("Carga máxima: " + toneladas + " toneladas");
        System.out.println("Altura máxima: " + alturaMax);
        System.out.println("Comprimento: " + comprimento);
    }
}

