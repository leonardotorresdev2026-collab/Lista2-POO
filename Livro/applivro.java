public class applivro {

    public static void main(String[] args) {

        Livrofisico livro1 = new Livrofisico(
                "Os minions 2",
                "Gru",
                2,
                "A19"
        );

        Livrodigital livro2 = new Livrodigital(
                "Bananas de pijama",
                "Sr banana",
                1,
                89
        );

        livro1.exibirInfo();

        System.out.println();

        livro2.exibirInfo();
    }
}