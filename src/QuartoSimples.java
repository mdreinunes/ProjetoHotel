public class QuartoSimples extends Quarto implements Faturavel{

    private static double valorDiaria = 87.90;

    public QuartoSimples(String nome, String desc) {
        super(nome, desc);
    }
    @Override
    public double faturar(int qtdDeDiarias) {
        return valorDiaria * qtdDeDiarias;
    }
}
