package br.ucb.aluno.questao3;

import java.util.Scanner;

public class Veiculo extends Motor {
    private int peso;
    private int velocMax;
    private float preco;

    public Veiculo() {
        super();
        this.peso = 0;
        this.velocMax = 0;
        this.preco = 0.0f;
    }

    public Veiculo(int numCilindro, int potencia, int peso, int velocMax, float preco) {
        super(numCilindro, potencia);
        this.peso = peso;
        this.velocMax = velocMax;
        this.preco = preco;
    }

    public void insertData() {
        super.insertData();  // Chama o método insertData() da classe base para inserir os dados do motor

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso do veículo em quilos: ");
        peso = scanner.nextInt();

        System.out.print("Digite a velocidade máxima do veículo em Km/h: ");
        velocMax = scanner.nextInt();

        System.out.print("Digite o preço do veículo em R$: ");
        preco = scanner.nextFloat();
    }

    public void print() {
        super.print();  // Chama o método print() da classe base para imprimir os dados do motor

        System.out.println("Dados do veículo:");
        System.out.println("Peso: " + peso);
        System.out.println("Velocidade máxima: " + velocMax);
        System.out.println("Preço: R$ " + preco);
    }
}

