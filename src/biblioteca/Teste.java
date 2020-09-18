package biblioteca;

public class Teste {

    public static void main(String[] args) {
        Livro a = new Livro("A");
        Livro b = new Livro("B");

        Biblioteca biblioteca = new Biblioteca();

        PeloMenosUm peloMenosUm = new PeloMenosUm();

        biblioteca.setEstado(peloMenosUm);

        biblioteca.adicionar(a);
        biblioteca.adicionar(b);

        System.out.println(biblioteca.quantidadeDeLivros());

    }
}
