// Desafio 1: A Hierarquia de Veículos (Nível: Fácil)
// Foco: Herança simples (extends) e Reuso de Código
// Crie uma classe base (mãe) chamada Veiculo:
// Atributos protegidos (protected): marca (String) e modelo (String).
// Construtor que recebe marca e modelo.
// Método public exibirInfo() que imprime a marca e o modelo.

// Crie uma classe filha Carro que herda de Veiculo:
// Adicione o atributo privado quantidadeDePortas (int).
// Crie o construtor usando super(marca, modelo) para repassar os dados para a classe mãe e receba também a quantidade de portas.
// Sobrescreva (@Override) o método exibirInfo() para incluir a quantidade de portas na impressão.

// Na Main, instancie um Carro e chame o método exibirInfo().

public class App {
    public static void main(String[] args) throws Exception {
        Carro novoCarro = new Carro("Fiat", "Pálio", 4);

        novoCarro.exibirInfo();
    }
}
