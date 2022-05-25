public class Main {
    public static void main(String[] args) {

        Hotel hotel = new Hotel("Motelzao");
        Andar andar1 = new Andar(1);
        Andar andar2 = new Andar(2);
        Andar andar3 = new Andar(3);


        QuartoSimples quartoSimples1 = new QuartoSimples("quarto 022", "Quarto basicao1");
        Quarto quartoSimples2 = new QuartoSimples("quarto 023", "Quarto basicao2");
        Quarto quartoSimples3 = new QuartoSimples("quarto 024", "Quarto basicao3");

        QuartoLuxo quartoLuxo1 = new QuartoLuxo("quarto 01", "Quarto feio");
        Quarto quartoLuxo2 = new QuartoLuxo("quarto 31", "Quarto quartoqyarto");
        Quarto quartoLuxo3 = new QuartoLuxo("quarto 313", "Quarto bonito");

        Quarto quartoCortesia1 = new QuartoCortesia("quarto 21", "Quarto1");
        Quarto quartoCortesia2 = new QuartoCortesia("quarto 212", "Quarto2");

        Hospede hospede1 = new Hospede("Matheus", "1111111111");
        Hospede hospede2 = new Hospede("Fulano", "222222222");
        Hospede hospede3 = new Hospede("Ciclano", "333333333");
        Hospede hospede4 = new Hospede("Beltrano", "44444444444");
        Hospede hospede5 = new Hospede("Pedrinho157", "555555555");

        quartoSimples1.adicionarHospede(hospede1);
        quartoSimples2.adicionarHospede(hospede2);

        quartoLuxo1.adicionarHospede(hospede3);
        quartoLuxo2.adicionarHospede(hospede4);

        quartoCortesia1.adicionarHospede(hospede5);


        andar1.adicionarQuartos(1, quartoSimples1);
        andar1.adicionarQuartos(2, quartoSimples2);


        andar2.adicionarQuartos(1, quartoSimples3);
        andar2.adicionarQuartos(2, quartoCortesia1);
        andar2.adicionarQuartos(3, quartoCortesia2);


        andar3.adicionarQuartos(1, quartoLuxo1);
        andar3.adicionarQuartos(2, quartoLuxo2);
        andar3.adicionarQuartos(3, quartoLuxo3);


        hotel.adicionarAndar(andar1);
        hotel.adicionarAndar(andar2);
        hotel.adicionarAndar(andar3);

        hotel.imprimirDados();

        Recepcao.pagar(quartoSimples1, 8);
        Recepcao.pagar(quartoLuxo1,4);


    }
}
