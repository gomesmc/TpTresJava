package Exercicios;

class Produtoss {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produtoss(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double novoPreco) {
        this.preco = novoPreco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int novaQuantidade) {
        this.quantidadeEmEstoque = novaQuantidade;
    }
    public void exibirInformacoes() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade em Estoque: " + quantidadeEmEstoque);
    }
}

public class Ex06 {
    public static void main(String[] args) {
        Produto produto = new Produto("Arroz", 5.50, 100);

        System.out.println("Informações do produto:");
        produto.exibirInformacoes();
    }
}
