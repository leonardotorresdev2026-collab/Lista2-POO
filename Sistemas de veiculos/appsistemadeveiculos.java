public class appsistemadeveiculos {

    public static void main(String[] args) {

        Carro carro = new Carro("Chevrolet ", Camaro", 2003, 2);

        Moto moto = new Moto("Kawasaki", "Ninja ZX", 2026,399);

        carro.exibirInfo();

        System.out.println();

        moto.exibirInfo();
    }
}