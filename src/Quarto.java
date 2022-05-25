abstract class Quarto {
    protected String nome;
    protected String desc;
    double valorDiaria;
    protected Hospede hospede;

    public Quarto(String nome, String desc) {
        this.nome = nome;
        this.desc = desc;
    }

    public void adicionarHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public void removerHospede() {
        this.hospede = null;
    }

    public void isOcupado() {
        if (hospede != null) {
            System.out.println("Quarto ocupado");
        }

    }

    public void isVazio() {
        if (hospede == null) {
            System.out.println("Quarto Vazio");
        }

    }

    @Override
    public String toString() {
        return "Quarto: " +
                "\nNome do Quarto: " + nome +
                "\nDesc: " + desc +
                "\nValorDiaria: " + valorDiaria +
                "\nHospede: " + hospede;

    }
}
