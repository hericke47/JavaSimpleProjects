package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class ListaDeLivros {
    private List<Livro> livros;

    public ListaDeLivros() {
        livros = new ArrayList<>();
    }


    public int quantidade() {
        return livros.size();
    }

    public void adicionar(Livro livro) {
        livros.add(livro);
    }

    public void remover(Livro livro) {
        livros.remove(livro);
    }
}
