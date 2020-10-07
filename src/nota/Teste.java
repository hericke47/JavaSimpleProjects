package nota;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Teste {

    public static void main(String[] args) {

        List<ItemDaNota> itens = new ArrayList<>();
        itens.add(new ItemDaNota("a", 10));
        itens.add(new ItemDaNota("b", 10));
        itens.add(new ItemDaNota("c", 10));

        double valorBruto = 0;

        for(ItemDaNota itemDaNota: itens){
            valorBruto += itemDaNota.getPreco();
        }

        double impostos = valorBruto * 0.9;



        Nota nota = new Nota("razao", "121212", Calendar.getInstance(), valorBruto, impostos, itens, "obs");
    }
}
