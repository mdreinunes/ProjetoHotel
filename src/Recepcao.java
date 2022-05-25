public class Recepcao {

    private Recepcao() {
    }

    public static void pagar(Faturavel f, int qtdDeDiarias) {
        System.out.println("Vc deve: " + f.faturar(qtdDeDiarias));
    }

}
