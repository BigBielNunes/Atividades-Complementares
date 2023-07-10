package br.ucb.aluno.questao2;

import java.util.Scanner;

public class Empresa {
    private String nome;
    private String endereco;
    private String cidade;
    private String estado;
    private String cep;
    private String telefone;

    public Empresa() {
        this.nome = "";
        this.endereco = "";
        this.cidade = "";
        this.estado = "";
        this.cep = "";
        this.telefone = "";
    }

    public Empresa(String nome, String endereco, String cidade, String estado, String cep, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.telefone = telefone;
    }

    public void Insert() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da empresa: ");
        nome = scanner.nextLine();

        System.out.print("Digite o endereço da empresa: ");
        endereco = scanner.nextLine();

        System.out.print("Digite a cidade da empresa: ");
        cidade = scanner.nextLine();

        System.out.print("Digite o estado da empresa: ");
        estado = scanner.nextLine();

        System.out.print("Digite o CEP da empresa: ");
        cep = scanner.nextLine();

        System.out.print("Digite o telefone da empresa: ");
        telefone = scanner.nextLine();
    }

    public void Print() {
        System.out.println("Dados da empresa:");
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
        System.out.println("CEP: " + cep);
        System.out.println("Telefone: " + telefone);
    }
}

