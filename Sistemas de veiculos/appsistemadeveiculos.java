public class appsistemadeveiculos {

    public static void main(String[] args) {

        Carro carro = new Carro("Toyota", "Corolla", 2024, 4);

        Moto moto = new Moto("Honda", "CB500", 2023, 500);

        carro.exibirInfo();

        System.out.println();

        moto.exibirInfo();
    }
}