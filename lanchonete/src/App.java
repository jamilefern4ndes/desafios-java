// Desafio: A Lanchonete (Nível: Reforço de Herança)
// Objetivo: Praticar reuso de código e o uso do super.
// Crie uma classe mãe chamada Lanche:
// Atributos protegidos: nome (String) e preco (double).
// Construtor para inicializar nome e preco.
// Método público exibirDetalhes() que imprime: "Lanche: [nome] | Preço: R$ [preco]".

// Crie uma classe filha Hamburguer que herda de Lanche:
// Adicione o atributo privado eArtesanal (boolean).
// Crie o construtor usando super(...) para repassar nome e preco, e receba também eArtesanal.

// Sobrescreva (@Override) o método exibirDetalhes() para imprimir tudo do lanche mais a informação se é artesanal ou não (ex: "Artesanal: Sim/Não").

public class App {
    public static void main(String[] args) throws Exception {
        Hamburguer novoHamburguer = new Hamburguer("Xsalada", 12.50, false);

        novoHamburguer.exibirDetalhes();
    }
}
