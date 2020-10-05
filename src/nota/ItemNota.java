package nota;

public class ItemNota {
    private String item;
    private float preco;

    public ItemNota(String item, float preco) {
        this.item = item;
        this.preco = preco;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
