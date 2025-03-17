package Exercicios;

 class Contaa {
    private String titular;
    private int numero;
    private String agencia;
    private double saldo;
    private String dataAbertura;

    public Contaa(String titular, int numero, String agencia, double saldo, String dataAbertura) {
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

    public void saca(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para o saque de R$ " + valor);
        } else {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        }
    }

    public void deposita(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para depósito.");
        } else {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        }
    }

    public double calculaRendimento() {
        double rendimento = saldo * 0.1;
        return rendimento;
    }

    public void exibirInformacoes() {
        System.out.println("Titular: " + titular);
        System.out.println("Número da Conta: " + numero);
        System.out.println("Agência: " + agencia);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("Data de Abertura: " + dataAbertura);
    }

    public static void main(String[] args) {
        Contaa conta1 = new Contaa("Maria Clara", 78910, "Agência 007", 1000.0, "13/03/2023");

        System.out.println("Informações iniciais da conta:");
        conta1.exibirInformacoes();

        System.out.println("\nTentando sacar R$ 200:");
        conta1.saca(200);

        System.out.println("\nTentando depositar R$ 500:");
        conta1.deposita(500);

        System.out.println("\nInformações após as operações:");
        conta1.exibirInformacoes();

        double rendimento = conta1.calculaRendimento();
        System.out.println("\nRendimento de 10% sobre o saldo: R$ " + rendimento);
    }
}

