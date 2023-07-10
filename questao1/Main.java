package br.ucb.aluno.questao1;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println("Comprimento: " + rectangle.getLength());
        System.out.println("Largura: " + rectangle.getWidth());
        System.out.println("Perímetro: " + rectangle.calculatePerimeter());
        System.out.println("Área: " + rectangle.calculateArea());

        rectangle.setLength(5.0);
        rectangle.setWidth(3.0);
        System.out.println("Comprimento: " + rectangle.getLength());
        System.out.println("Largura: " + rectangle.getWidth());
        System.out.println("Perímetro: " + rectangle.calculatePerimeter());
        System.out.println("Área: " + rectangle.calculateArea());

        rectangle.setLength(25.0);
        rectangle.setWidth(10.0);
        System.out.println("Comprimento: " + rectangle.getLength());
        System.out.println("Largura: " + rectangle.getWidth());
        System.out.println("Perímetro: " + rectangle.calculatePerimeter());
        System.out.println("Área: " + rectangle.calculateArea());
    }
}
