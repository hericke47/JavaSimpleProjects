package associacao.bidirecional.paraMuitos.aluno;

import java.util.ArrayList;

public class Aluno {
    private String nome;

    private ArrayList<Livro> livros;

    public Aluno(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<>();
    }

    public void adicionar(Livro livro) {
        this.livros.add(livro);

        livro.adicionar(this);
    }

    public int quantidadeDeLivros() {
        return livros.size();
    }

    public String getNome() {
        return nome;
    }
}
