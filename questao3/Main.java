package br.ucb.aluno.questao3;

public class Main {
    public static void main(String[] args) {
        CarroPasseio carro = new CarroPasseio();
        carro.insertData();
        carro.print();

        System.out.println();

        Caminhao caminhao = new Caminhao();
        caminhao.insertData();
        caminhao.print();
    }
}

