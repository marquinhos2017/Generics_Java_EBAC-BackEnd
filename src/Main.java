import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<>();

        Carro hondaCivic = new Honda("Civic", 2020);
        Carro chevroletOnix = new Chevrolet("Onix", 2019);

        carros.add(hondaCivic);
        carros.add(chevroletOnix);

        for (Carro carro : carros) {
            carro.exibirDetalhes();
        }
    }
}
