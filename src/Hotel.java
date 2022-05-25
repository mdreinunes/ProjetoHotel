import java.lang.reflect.Array;
import java.util.ArrayList;

public class Hotel {
    private String nome;
    private ArrayList<Andar> andares;

    public Hotel(String nome) {
        this.nome = nome;
        this.andares = new ArrayList<Andar>();
    }

    public void adicionarAndar(Andar a) {
        andares.add(a);
    }

    public  void imprimirDados(){
        System.out.println("Andar: " + andares);
    }
}
