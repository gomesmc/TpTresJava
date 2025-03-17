package Exercicios;

 class TestaFiguras {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(3.0);
        Esfera esfera = new Esfera(5.0);

        System.out.printf("Área do círculo: %.2f\n", circulo.obterArea());

        System.out.printf("Volume da esfera: %.2f\n", esfera.obterVolume());
    }
}
