public class Carro extends Veiculo {

    private int quantidadePortas;

    public Carro(String marca, String modelo, int ano, int quantidadePortas) {
        super(marca, modelo, ano);
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Portas: " + quantidadePortas);
    }
}