// Desafio : Os Funcionários e Bônus (Nível: Reforço de Classe Abstrata)
// Objetivo: Entender por que usamos classes abstratas para forçar comportamentos diferentes.

// Crie uma classe abstrata Funcionario:
// Atributos protegidos: nome (String) e salarioBase (double).
// Construtor para inicializar os atributos.
// Método abstrato: public abstract double calcularBonus();
// Crie duas classes filhas que herdam de Funcionario:
// Gerente: O bônus dele é fixo em 20% do salário base. Implemente o método calcularBonus() retornando salarioBase * 0.20.
// Desenvolvedor: O bônus dele é fixo em 10% do salário base. Implemente o método calcularBonus() retornando salarioBase * 0.10.
// Na Main, crie um Gerente e um Desenvolvedor e imprima o valor do bônus de cada um no console.
public class App {
    public static void main(String[] args) throws Exception {
        Funcionario gerente = new Gerente("Carlos", 1600.00);
        System.out.println(
            gerente.calcularBonus()
        );
        Funcionario desenvolvedor = new Desenvolvedor("Vitin", 3000.00);
        System.out.println(
            desenvolvedor.calcularBonus()
        );
        
    }
}
