// Crie uma classe abstrata Funcionario:
// Atributos protegidos: nome (String) e salarioBase (double).
// Construtor para inicializar os atributos.
// Método abstrato: public abstract double calcularBonus();
public abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularBonus();
}
