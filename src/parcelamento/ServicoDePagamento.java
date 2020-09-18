package parcelamento;

public class ServicoDePagamento {
    private float juro = 0.01f;
    private float taxa = 0.02f;

    public float calcularJuro(float valorParcelaBase, int parcela) {
        return valorParcelaBase * this.juro * parcela;
    }

    public float calcularTaxa(float valor) {
        return valor * this.taxa;
    }
}
