package parcelamento;

import java.time.LocalDate;

public class Parcela {

    private LocalDate data;
    private float valor;

    public Parcela(LocalDate data, float valor) {
        this.data = data;
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public float getValor() {
        return valor;
    }
}
