package parcelamento;

public class ServicoDePagamentoPayPal implements ServicoDePagamento {
    private float juro = 0.01f;
    private float taxa = 0.02f;

    @Override
    public float calcularJuro(float valorParcelaBase, int parcela) {
        return valorParcelaBase * this.juro * parcela;
    }

    @Override
    public float calcularTaxa(float valor) {
        return valor * this.taxa;
    }
}
