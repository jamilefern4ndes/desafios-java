// Crie duas classes filhas que herdam de Funcionario:
// Gerente: O bônus dele é fixo em 20% do salário base. Implemente o método calcularBonus() retornando salarioBase * 0.20.
// Desenvolvedor: O bônus dele é fixo em 10% do salário base. Implemente o método calcularBonus() retornando salarioBase * 0.10.
public class Gerente extends Funcionario{
    private double bonus;
    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
        this.bonus = 0.20;
    }

    @Override
    public double calcularBonus() {
        return this.salarioBase * this.bonus;
    }
    
}

