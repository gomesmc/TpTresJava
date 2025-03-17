package Exercicios;

public class Circulo {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double obterArea() {
        return Math.PI * raio * raio;
    }

    public static void main(String[] args) {
        Circulo circulo = new Circulo(3.0);
        System.out.printf("Área do círculo: %.2f\n", circulo.obterArea());
    }
}
