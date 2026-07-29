// Crie uma classe filha Carro que herda de Veiculo:
// Adicione o atributo privado quantidadeDePortas (int).
// Crie o construtor usando super(marca, modelo) para repassar os dados para a classe mãe e receba também a quantidade de portas.
// Sobrescreva (@Override) o método exibirInfo() para incluir a quantidade de portas na impressão.

public class Carro extends Veiculo{
    private int quantidadeDePortas;
    public Carro(String marca, String modelo, int quantidadeDePortas) {
        super(marca, modelo);
        this.quantidadeDePortas = quantidadeDePortas;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Quantidade de portas: " + this.quantidadeDePortas);
    }
    
}
