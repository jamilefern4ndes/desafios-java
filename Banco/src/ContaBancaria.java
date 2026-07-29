class ContaBancaria{
    private String titular;
    private double saldo;

    // Construtor
    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return this.titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void depositar(double val) {
        if (val > 0) {
            System.out.println("Novo depósito: R$" + val);
            this.saldo += val; 
            System.out.println("Saldo atual: R$" + this.saldo);
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }
    public void sacar(double val) {
        if (this.saldo >= val) {
            System.out.println("Novo saque: R$" + val);
            this.saldo -= val;
            System.out.println("Saldo atual: R$" + this.saldo);
        } else {
            System.out.println("Saldo insuficiente para o saque de R$" + val);
        }
    }
}