class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    //getter para checar a disponibilidade com encapsulamento
    public boolean isDisponivel() {
        return this.disponivel;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void emprestar() {
        this.disponivel = false;
        System.out.println("O livro \"" + this.titulo + "\" Não está disponível.");
    }

    public void devolver() {
        this.disponivel = true;
        System.out.println("O livro \"" + this.titulo + "\" Está disponível novamente.");
    }
}