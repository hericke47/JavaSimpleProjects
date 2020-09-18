package parcelamento;

import java.time.LocalDate;

public class Teste {
    public static void main(String[] args) {
        Venda venda = new Venda("1", LocalDate.now(), 600);
        venda.parcelarVenda(3);

        for(Parcela parcela: venda.getParcelas()) {
            System.out.println(parcela.getData());
            System.out.println(parcela.getValor());

        }
    }
}
