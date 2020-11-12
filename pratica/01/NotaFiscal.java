import java.util.ArrayList;
public class NotaFiscal {
    private ArrayList<itemNotaFiscal> itens;
    public float getTotal(){
        float total = 0;
        for(itemNotaFiscal item: this.itens) {
            total = total + item.getTotal();
        }
        return total;
    }
}
