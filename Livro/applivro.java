public class Applivro {

    public static void main(String[] args) {

        Livrofisico livrinho = new Livrofisico(
                "Os minions 2",
                "Gru",
                2,
                "A19"
        );

        Livrodigital livrinho2pontozero = new Livrodigital(
                "Bananas de pijama",
                "Sr banana",
                1,
                89
        );
        System.out.println();

        livrinho.exibirInfo();

        System.out.println();

        livrinho2pontozero.exibirInfo();

        livrinho.emprestar();
    }
}
