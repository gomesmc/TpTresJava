

package Exercicios;

public class Ex03 {
    String nome="Banana";
    double preco;
    int quantidadeEmEstoque=8;

    public void alterarPreco(double novoPreco){
        this.preco= novoPreco;
    }

    public void alterarQuantidade(int novaQuantidade){
        this.quantidadeEmEstoque=novaQuantidade;
    }

    public void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEmEstoque);
    }

    public static void main(String[] args) {
        Ex03 produto=new Ex03();

        produto.alterarPreco(9.98);
        produto.alterarQuantidade(8);

        produto.exibirInformacoes();

        System.out.println("Atualização estoque:");

        produto.alterarPreco(9.58);
        produto.alterarPreco(10);

        produto.exibirInformacoes();
    }
}
