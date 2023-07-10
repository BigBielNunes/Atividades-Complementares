package br.ucb.aluno.questao3;

import java.util.Scanner;

public class CarroPasseio extends Veiculo {
    private String cor;
    private String modelo;

    public CarroPasseio() {
        super();
        this.cor = "";
        this.modelo = "";
    }

    public CarroPasseio(int numCilindro, int potencia, int peso, int velocMax, float preco, String cor, String modelo) {
        super(numCilindro, potencia, peso, velocMax, preco);
        this.cor = cor;
        this.modelo = modelo;
    }

    public void insertData() {
        super.insertData();  // Chama o método insertData() da classe base (Veiculo) para inserir os dados do veículo

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a cor do carro de passeio: ");
        cor = scanner.nextLine();

        System.out.print("Digite o modelo do carro de passeio: ");
        modelo = scanner.nextLine();
    }

    public void print() {
        super.print();  // Chama o método print() da classe base (Veiculo) para imprimir os dados do veículo

        System.out.println("Dados do carro de passeio:");
        System.out.println("Cor: " + cor);
        System.out.println("Modelo: " + modelo);
    }
}

