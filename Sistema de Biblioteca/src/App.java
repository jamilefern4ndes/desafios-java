// Desafio 3: O Sistema de Biblioteca (Nível: Desafio)
// Foco: Composição/Interação entre dois objetos diferentes e Manipulação do estado

// Crie uma classe Livro com atributos privados: titulo (String), autor (String) e disponivel (boolean).
// O construtor deve receber titulo e autor. Por padrão, todo livro novo começa como disponivel = true.
// Crie métodos emprestar() e devolver() que alteram o status de disponivel (e exibem mensagens informando se deu certo ou se o livro já estava emprestado).
// Crie uma classe Usuario com atributos privados: nome (String) e livroEmprestado (Livro).
// Crie um método pegarLivroEmprestado(Livro livro): se o livro estiver disponível, chama o método emprestar() do livro e guarda a referência desse livro no atributo livroEmprestado.
// Crie um método devolverLivro(): se o usuário tiver um livro, chama o método devolver() do livro e limpa o atributo livroEmprestado (define como null).
// Na Main, crie 1 usuário e 1 livro, e simule a tentativa do usuário pegar o livro emprestado e depois devolvê-lo.
public class App {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis");
        Usuario usuario1 = new Usuario("Jamile");

        System.out.println("--- Tentativa 1: Pegar emprestado ---");
        usuario1.pegarLivroEmprestado(livro1);

        System.out.println("\n--- Tentativa 2: Outra pessoa tenta pegar o mesmo livro ---");
        Usuario usuario2 = new Usuario("Carlos");
        usuario2.pegarLivroEmprestado(livro1); //deve dizer que não está disponível

        System.out.println("\n--- Devolução ---");
        usuario1.devolverLivro();

        System.out.println("\n--- Tentativa 3: Carlos tenta pegar novamente ---");
        usuario2.pegarLivroEmprestado(livro1); //agora deve dar certo
    }
}
