import java.util.HashMap;
import java.util.Map;

public class Andar {
    private final int numeroDoAndar;
    private final Map<Integer, Quarto> mapaDeQuartos;

    public Andar(int numero) {
        this.numeroDoAndar = numero;
        this.mapaDeQuartos = new HashMap<Integer, Quarto>();

    }

    public void adicionarQuartos(Integer n, Quarto quarto) {
        mapaDeQuartos.put(n, quarto);
    }

    @Override
    public String toString() {
        return "Andar: " +
                "\nNumero Do Andar: " + numeroDoAndar +
                "\nMapaDeQuartos: " + mapaDeQuartos;
    }

}