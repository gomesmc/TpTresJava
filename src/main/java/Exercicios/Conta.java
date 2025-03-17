package Exercicios;

public class Conta {
    private String titular;
    private int numero;
    private String agencia;
    private double saldo;
    private String dataAbertura;

    public Conta(String titular, int numero, String agencia, double saldo, String dataAbertura) {
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para o saque de R$ " + valor);
        } else {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        }
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para depósito.");
        } else {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Titular: " + titular);
        System.out.println("Número da Conta: " + numero);
        System.out.println("Agência: " + agencia);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("Data de Abertura: " + dataAbertura);
    }

    public static void main(String[] args) {
        Conta conta1 = new Conta("Maria Clara", 78910, "Agência 007", 1000.0, "13/03/2023");

        System.out.println("Informações iniciais da conta:");
        conta1.exibirInformacoes();

        System.out.println("\nTentando sacar R$ 200:");
        conta1.sacar(200);

        System.out.println("\nTentando depositar R$ 500:");
        conta1.depositar(500);

        System.out.println("\nInformações após as operações:");
        conta1.exibirInformacoes();
    }
}
