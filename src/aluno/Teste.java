package aluno;

public class Teste {
    public static void main(String[] args) {
        Aluno ze = new Aluno("Ze");
        Aluno bia = new Aluno("bia");

        Livro poo = new Livro("poo");
        Livro pps = new Livro("pps");

        ze.adicionar(poo);

        System.out.println("ze " + ze.quantidadeDeLivros());
        System.out.println("poo " + poo.quantidadeDeAlunos());
    }
}
