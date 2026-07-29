// PagamentoCartao: adicione o atributo numeroCartao e implemente processarPagamento() exibindo: "Pagamento de R$ [valor] cobrado no cartão [numeroCartao]".

public class PagamentoCartao extends FormaPagamento{
    private int numeroCartao;
    public PagamentoCartao(double valor, int numeroCartao) {
        super(valor);
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento de R$" + valor + " cobrado no cartão " + numeroCartao);
    }
    
}
