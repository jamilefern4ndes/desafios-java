public class Usuario {
    private String nome;
    private Livro livroEmprestado;

    public Usuario(String nome) {
        this.nome = nome;
        this.livroEmprestado = null;
    }

    public void pegarLivroEmprestado(Livro livro) {
        //usa o getter ou verifica se o livro está disponível
        if (livro.isDisponivel()) {
            livro.emprestar();
            this.livroEmprestado = livro; //guarda o livro no usuário
            System.out.println(this.nome + " pegou o livro \"" + livro.getTitulo() +"\" com sucesso.");
        } else {
            System.out.println("Desculpe " + this.nome + ", o livro \"" + livro.getTitulo() + "\" não está disponível no momento.");
        }
    }

    public void devolverLivro() {
        if (this.livroEmprestado != null) {
            this.livroEmprestado.devolver(); //chama a devolução no livro
            System.out.println(this.nome + " devolveu o livro \"" + this.livroEmprestado.getTitulo() + "\".");
            this.livroEmprestado = null; //limpa a referência
        } else {
            System.out.println(this.nome + " não tem nenhum livro para devolver.");
        }
    }
}
