public class Desenvolvedor extends Funcionario{
    private double bonus;
    public Desenvolvedor(String nome, double salarioBase) {
        super(nome, salarioBase);
        this.bonus = 0.10;
    }

    @Override
    public double calcularBonus() {
        return this.salarioBase * this.bonus;
    }
    
} 
