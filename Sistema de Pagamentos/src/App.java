// Desafio 2: O Sistema de Pagamentos (Nível: Médio)
// Foco: Classes Abstratas (abstract class) e Métodos Abstratos
// Uma classe abstrata serve como um "molde incompleto" que não pode ser instanciado diretamente.
// Crie uma classe abstrata chamada FormaPagamento:
// Atributo protegido: valor (double).
// Construtor que recebe o valor.
// Método abstrato public abstract void processarPagamento(); (ele não tem corpo {}).
// Crie duas classes filhas concretas que herdam de FormaPagamento:
// PagamentoPix: implementa processarPagamento() exibindo a mensagem: "Pagamento de R$ [valor] realizado via PIX em segundos!".
// PagamentoCartao: adicione o atributo numeroCartao e implemente processarPagamento() exibindo: "Pagamento de R$ [valor] cobrado no cartão [numeroCartao]".
// Na Main, crie um objeto de cada tipo de pagamento e chame o processarPagamento() de cada um.

public class App {
    public static void main(String[] args) throws Exception {
        PagamentoCartao cartao = new PagamentoCartao(300, 245589);
        cartao.processarPagamento();

        PagamentoPix pix = new PagamentoPix(150);
        pix.processarPagamento();
    }
 
}
