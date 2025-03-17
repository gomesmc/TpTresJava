package Exercicios;

class TestaConta {

    static class Contaas {
        private String titular;
        private int numero;
        private String agencia;
        private double saldo;
        private String dataAbertura;

        public Contaas(String titular, int numero, String agencia, double saldo, String dataAbertura) {
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
            System.out.println("\nSaldo antes do saque: R$ " + saldo);
            if (valor > saldo) {
                System.out.println("Saldo insuficiente para o saque de R$ " + valor);
            } else {
                saldo -= valor;
                System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
            }
            System.out.println("Saldo após o saque: R$ " + saldo);
        }

        public void deposita(double valor) {
            System.out.println("\nSaldo antes do depósito: R$ " + saldo);
            if (valor <= 0) {
                System.out.println("Valor inválido para depósito.");
            } else {
                saldo += valor;
                System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
            }
            System.out.println("Saldo após o depósito: R$ " + saldo);
        }

        public double calculaRendimento() {
            double rendimento = saldo * 0.1; // 10% de rendimento sobre o saldo
            return rendimento;
        }

        public void exibirInformacoes() {
            System.out.println("\nInformações da Conta:");
            System.out.println("Titular: " + titular);
            System.out.println("Número da Conta: " + numero);
            System.out.println("Agência: " + agencia);
            System.out.println("Saldo: R$ " + saldo);
            System.out.println("Data de Abertura: " + dataAbertura);
        }
    }

    public static void main(String[] args) {
        Contaas conta1 = new Contaas("Maria Clara", 78910, "Agência 007", 1000.0, "13/03/2023");

        conta1.exibirInformacoes();
        conta1.saca(200);  // Tentando sacar R$ 200

        conta1.deposita(500);  // Tentando depositar R$ 500

        double rendimento = conta1.calculaRendimento();
        System.out.println("\nRendimento de 10% sobre o saldo: R$ " + rendimento);

        conta1.exibirInformacoes();
    }
}
