package Exercicios;

class Produtos {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produtos(String nome, double preco, int quantidadeEmEstoque) {
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

public class Ex05 {
    public static void main(String[] args) {
        Produtos produto = new Produtos("Arroz", 5.50, 100);

        System.out.println("Informações iniciais do produto:");
        produto.exibirInformacoes();

        produto.setPreco(6.00);
        System.out.println("\nPreço após atualização: " + produto.getPreco());

        produto.setQuantidadeEmEstoque(120);
        System.out.println("Quantidade em estoque após atualização: " + produto.getQuantidadeEmEstoque());

        System.out.println("\nInformações após as alterações:");
        produto.exibirInformacoes();
    }
}
