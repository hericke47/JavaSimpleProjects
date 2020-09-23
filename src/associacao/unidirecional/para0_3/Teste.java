package associacao.unidirecional.para0_3;

public class Teste {
    public static void main(String[] args) {
        Telefone telefone1 = new Telefone("65814685468541");
        Telefone telefone2 = new Telefone("65814685468541");
        Telefone telefone3 = new Telefone("65814685468541");
        Telefone telefone4 = new Telefone("65814685468541");

        Aluno ze = new Aluno("ze");

        ze.cadastrar(telefone1);
        ze.cadastrar(telefone2);
        ze.cadastrar(telefone3);
        ze.cadastrar(telefone4);


        System.out.println(ze.quantidadeDeTelefones());
    }
}
