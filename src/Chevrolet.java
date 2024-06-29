public class Chevrolet extends Carro {
    public Chevrolet(String modelo, int ano) {
        super(modelo, ano);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Chevrolet " + getModelo() + " - Ano: " + getAno());
    }
}