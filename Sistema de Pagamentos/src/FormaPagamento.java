// Crie uma classe abstrata chamada FormaPagamento:
// Atributo protegido: valor (double).
// Construtor que recebe o valor.
// Método abstrato public abstract void processarPagamento(); (ele não tem corpo {}).
public abstract class FormaPagamento {
    protected double valor;
    public FormaPagamento(double valor){
        this.valor = valor;
    }

    public abstract void processarPagamento();
}
