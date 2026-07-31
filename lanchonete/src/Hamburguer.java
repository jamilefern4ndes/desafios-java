// Crie uma classe filha Hamburguer que herda de Lanche:
// Adicione o atributo privado eArtesanal (boolean).
// Crie o construtor usando super(...) para repassar nome e preco, e receba também eArtesanal.
public class Hamburguer extends Lanche {
    private boolean artesanal;

    public Hamburguer(String nome, double preco, boolean artesanal){
        super(nome, preco);
        this.artesanal = artesanal;
    }

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Artesanal? " + this.artesanal);
    }
}
