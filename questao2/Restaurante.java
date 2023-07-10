package br.ucb.aluno.questao2;

import java.util.Scanner;

public class Restaurante extends Empresa {
    private String tipoComida;
    private double precoMedioPrato;

    public Restaurante() {
        super();
        this.tipoComida = "";
        this.precoMedioPrato = 0.0;
    }

    public Restaurante(String nome, String endereco, String cidade, String estado, String cep, String telefone,
                       String tipoComida, double precoMedioPrato) {
        super(nome, endereco, cidade, estado, cep, telefone);
        this.tipoComida = tipoComida;
        this.precoMedioPrato = precoMedioPrato;
    }

    public void InsertData() {
        Insert();  // Chama o método Insert() da classe base para inserir os dados da empresa

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tipo de comida do restaurante: ");
        tipoComida = scanner.nextLine();

        System.out.print("Digite o preço médio de um prato: ");
        precoMedioPrato = scanner.nextDouble();
    }

    public void Print() {
        super.Print();  // Chama o método Print() da classe base para imprimir os dados da empresa

        System.out.println("Tipo de comida: " + tipoComida);
        System.out.println("Preço médio de um prato: " + precoMedioPrato);
    }
}

