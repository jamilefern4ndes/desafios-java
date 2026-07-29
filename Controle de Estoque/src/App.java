// Desafio 2: Cadastro e Modificação de Produtos (Nível: Médio)
// Foco: Construtores sobrecarregados (Overloading) e Parâmetros com validação
// Crie uma classe chamada Produto.
// Atributos privados: nome (String), preco (double) e quantidadeEmEstoque (int)
// Crie dois construtores:
// Um que receba todos os 3 parâmetros (nome, preco, quantidadeEmEstoque).
// Um construtor alternativo que receba apenas nome e preco, definindo a quantidadeEmEstoque padrão como 0.
// Crie um método público aplicarDesconto(double percentual) que reduz o preço do produto com base no percentual informado (ex: 10 para 10% de desconto).
// Crie um método exibirFichaTecnica() para imprimir todos os detalhes do produto de forma organizada.
// Na Main, crie dois produtos (um usando o primeiro construtor e outro usando o construtor alternativo), aplique um desconto em um deles e exiba a ficha técnica dos dois.
public class App {
    public static void main(String[] args){
        Produto novoProduto = new Produto("agua", 2.0, 30);
        Produto novoProduto2 = new Produto("sal", 0.7);

        novoProduto.aplicarDesconto(10);
        
        novoProduto.exibirFichaTecnica();
        novoProduto2.exibirFichaTecnica();

    }
}

class Produto{
    String nome;
    double preco;
    int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque){
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = 0;
    }

    public void aplicarDesconto(double percentual){
        double valorDesconto = (this.preco * percentual) / 100;
        this.preco = this.preco - valorDesconto;
    }

    public void exibirFichaTecnica(){
        System.out.println("---------------------------------");
        System.out.println("Produto: " + this.nome);
        System.out.println("Preço: R$ " + this.preco);
        System.out.println("Estoque: " + this.quantidadeEmEstoque + " unidades");
        System.out.println("---------------------------------");
    }
}
