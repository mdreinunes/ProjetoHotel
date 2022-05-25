public class Hospede {
    private final String nome;
    private final String rg;

    Hospede(String nome, String rg) {
        this.nome = nome;
        this.rg = rg;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nRG: " + rg;
    }
}
