// Crie uma classe mãe chamada Lanche:
// Atributos protegidos: nome (String) e preco (double).
// Construtor para inicializar nome e preco.
// Método público exibirDetalhes() que imprime: "Lanche: [nome] | Preço: R$ [preco]".

public class Lanche {
    protected String nome;
    protected double preco;

    public Lanche(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public void exibirDetalhes(){
        System.out.println("lanche: " + this.nome + "Preço: R$" +this.preco);
    }
}