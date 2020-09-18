package parcelamento;

public interface ServicoDePagamento {
    float calcularJuro(float valorParcelaBase, int parcela);

    float calcularTaxa(float valor);
}
