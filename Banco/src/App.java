// Desafio 1: A Classe ContaBancaria (Nível: Fácil)
// Foco: Atributos privados, Encapsulamento (Getters) e Métodos simples

// Crie uma classe chamada ContaBancaria.
// Adicione os atributos privados: titular (String) e saldo (double).
// Crie um construtor que receba o titular e o saldoInicial.
// Crie métodos públicos:
// depositar(double valor): adiciona o valor ao saldo se for maior que 0.
// sacar(double valor): subtrai o valor do saldo se houver saldo suficiente.
// getSaldo() e getTitular(): para consultar os valores.
// Na classe principal (Main), instancie uma conta, faça um depósito, um saque e exiba o saldo final no console.

public class App {
    public static void main(String[] args) throws Exception {
        ContaBancaria novaConta = new ContaBancaria("Jamile", 100);

        novaConta.sacar(12);
        //novaConta.depositar(50);

        System.out.println("Titular: " + novaConta.getTitular());
        System.out.println("Saldo Final: R$" + novaConta.getSaldo());
    }
}

