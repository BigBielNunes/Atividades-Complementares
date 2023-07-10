package br.ucb.aluno.questao1;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public void setLength(double length) {
        if (length > 0.0 && length < 20.0) {
            this.length = length;
        } else {
            System.out.println("Comprimento inválido. O comprimento deve ser um número de ponto flutuante maior que 0.0 e menor que 20.0.");
        }
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        if (width > 0.0 && width < 20.0) {
            this.width = width;
        } else {
            System.out.println("Largura inválida. A largura deve ser um número de ponto flutuante maior que 0.0 e menor que 20.0.");
        }
    }

    public double getWidth() {
        return width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public double calculateArea() {
        return length * width;
    }
}

