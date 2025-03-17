package Exercicios;

 class Produto {
    String nome;
    double preco;
    int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void alterarPreco(double novoPreco) {
        this.preco = novoPreco;
        System.out.println("Preço alterado para: " + novoPreco);
    }

    public void alterarQuantidade(int novaQuantidade) {
        this.quantidadeEmEstoque = novaQuantidade;
        System.out.println("Quantidade em estoque alterada para: " + novaQuantidade);
    }

    public void exibirInformacoes() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade em Estoque: " + quantidadeEmEstoque);
    }
}

public class Ex04 {
    public static void main(String[] args) {
        Produto produto = new Produto("Arroz", 5.50, 100);

        System.out.println("Informações iniciais do produto:");
        produto.exibirInformacoes();

        produto.alterarPreco(6.00);  // Alterando o preço
        produto.alterarQuantidade(120);  // Alterando a quantidade em estoque

        System.out.println("\nInformações após alterações:");
        produto.exibirInformacoes();
    }
}
