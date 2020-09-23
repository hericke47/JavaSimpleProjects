package associacao.bidirecional.paraMuitos.aluno;

import java.util.ArrayList;

public class Livro {
    private String titulo;

    private ArrayList<Aluno> alunos;

    public Livro(String titulo) {
        this.titulo = titulo;
        this.alunos = new ArrayList<>();
    }

    public void adicionar(Aluno aluno) {
        alunos.add(aluno);

        aluno.adicionar(this);
    }

    public int quantidadeDeAlunos() {
        return alunos.size();
    }

    public String getTitulo() {
        return titulo;
    }
}
