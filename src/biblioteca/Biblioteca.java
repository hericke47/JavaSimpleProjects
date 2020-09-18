package biblioteca;

public class Biblioteca {

    private ListaDeLivros listaDeLivro;

    private Estado estado;

    public Biblioteca() {
        listaDeLivro = new ListaDeLivros();
    }

    public int quantidadeDeLivros() {
        return listaDeLivro.quantidade();
    }

    public void adicionar(Livro livro) {
        listaDeLivro.adicionar(livro);
    }

    public void remover(Livro livro) {
        estado.remover(livro, listaDeLivro);

    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

}
