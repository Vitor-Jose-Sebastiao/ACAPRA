import java.util.List;

public class Doador {
    private List<String> itens;

    public Doador() {}

    public Doador(List<String> itens) {
        this.itens = itens;
    }

    public List<String> getItens() { return itens; }
    public void setItens(List<String> itens) { this.itens = itens; }
}
