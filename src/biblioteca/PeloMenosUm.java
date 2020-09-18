package biblioteca;

public class PeloMenosUm implements Estado{

    @Override
    public void remover(Livro livro, ListaDeLivros listaDeLivro) {
        if(listaDeLivro.quantidade() <= 1) {
            throw new RuntimeException("Pelo menos um.");
        }
            listaDeLivro.remover(livro);
    }

}
