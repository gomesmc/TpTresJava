package Exercicios;

public class Esfera {

    private double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double obterVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
    }

    public static void main(String[] args) {
        Esfera esfera = new Esfera(5.0);
        System.out.printf("Volume da esfera: %.2f\n", esfera.obterVolume());
    }
}
