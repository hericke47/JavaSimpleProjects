package associacao.unidirecional.para0_3;

import java.util.ArrayList;

public class Aluno {

    private String nome;
    private int quantidadeDeTelefones = 3;
    private ArrayList<Telefone> telefones;

    public Aluno(String nome) {
        this.nome = nome;
        this.telefones = new ArrayList<>();
    }

    public void cadastrar(Telefone telefone) {
        if(telefones.size() < 3){
            telefones.add(telefone);
        } else {
            System.out.println("Quantidade excedida de telefones");
        }
    }

    public void remover(Telefone telefone) {
        telefones.remove(telefone);
    }

    public int quantidadeDeTelefones() {
        return telefones.size();
    }
}
