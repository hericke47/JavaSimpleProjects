package parcelamento;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Venda {
    private String numero;
    private LocalDate data;
    private float valor;
    private List<Parcela> parcelas;

    public Venda(String numero, LocalDate data, float valor) {
        this.numero = numero;
        this.data = data;
        this.valor = valor;
        this.parcelas = new ArrayList<>();
    }

    public String getNumero() {
        return numero;
    }

    public LocalDate getData() {
        return data;
    }

    public float getValor() {
        return valor;
    }

    public List<Parcela> getParcelas() {
        // para elas n serem alteradas quando chamarem essa lista de parcelas
        return Collections.unmodifiableList(parcelas);
    }

    public void parcelarVenda(int quantidadeDeParcelas) {
            float valorParcelaBase = this.valor / quantidadeDeParcelas;

            for(int i = 1; i <= quantidadeDeParcelas; i++ ){
                LocalDate dataDeVencimento = this.data.plusMonths(i);
                float juro = valorParcelaBase * 0.01f * i;
                float taxa = (valorParcelaBase + juro) * 0.02f;
                float valorParcela = valorParcelaBase + juro + taxa;


                Parcela parcela = new Parcela(dataDeVencimento, valorParcela);
                this.parcelas.add(parcela);

            }

    }

}
