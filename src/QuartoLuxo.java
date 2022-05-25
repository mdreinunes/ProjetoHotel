public class QuartoLuxo extends Quarto implements Faturavel{

    private static double valorDiaria = 450.0;

    public QuartoLuxo(String nome, String desc) {
        super(nome, desc);
    }

    @Override
    public double faturar(int qtdDeDiarias) {
        return valorDiaria * qtdDeDiarias;
    }
}
