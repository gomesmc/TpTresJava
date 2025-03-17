package Exercicios;

public class Ex11 {

    public static class Circulo {
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

        public void exibirRaio() {
            System.out.println("Raio do círculo: " + raio);
        }

        public double calcularArea() {
            return Math.PI * (raio * raio);
        }
    }

    public static class Esfera {
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

        public void exibirRaio() {
            System.out.println("Raio da esfera: " + raio);
        }

        public double calcularVolume() {
            return (4.0 / 3.0) * Math.PI * (raio * raio * raio);
        }
    }

    public static void main(String[] args) {
        Circulo circulo = new Circulo(5.0);
        circulo.exibirRaio();
        System.out.printf("Área do círculo: %.2f\n", circulo.calcularArea());

        Esfera esfera = new Esfera(3.0);
        esfera.exibirRaio();
        System.out.printf("Volume da esfera: %.2f\n", esfera.calcularVolume());
    }
}
