package pedido;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private LocalDate data;
    private Cliente cliente;

    private List<Item> itens;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.data = LocalDate.now();
        this.itens = new ArrayList<>();
    }

    public void adicionar(Item item) {
        itens.add(item);
    }

    public float total() {
        float total = 0;
        for(Item item: itens) {
            total = total + item.subTotal();
        }
        return total;
    }
}
