// PagamentoPix: implementa processarPagamento() exibindo a mensagem: "Pagamento de R$ [valor] realizado via PIX em segundos!".
public class PagamentoPix extends FormaPagamento{

    public PagamentoPix(double valor) {
        super(valor);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento de R$" + valor + " realizado via pix!");
    }
    
}