// Crie uma classe base (mãe) chamada Veiculo:
// Atributos protegidos (protected): marca (String) e modelo (String).
// Construtor que recebe marca e modelo.
// Método public exibirInfo() que imprime a marca e o modelo.

public class Veiculo {
    protected String marca;
    protected String modelo;

    public Veiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public void exibirInfo(){
        System.out.println("Veículo da marca " + this.marca + ", modelo " + this.modelo);
    }
      
}
