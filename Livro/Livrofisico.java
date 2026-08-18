
    public class Livrofisico extends Livro {

        private String localizacaoPrateleira;

        public Livrofisico(String titulo, String autor, int quantidadeDisponivel, String localizacaoPrateleira) {
            super(titulo, autor, quantidadeDisponivel);
            this.localizacaoPrateleira = localizacaoPrateleira;
        }

        public String getLocalizacaoPrateleira() {
            return localizacaoPrateleira;
        }

        public void setLocalizacaoPrateleira(String localizacaoPrateleira) {
            this.localizacaoPrateleira = localizacaoPrateleira;
        }

        @Override
        public void exibirInfo() {
            super.exibirInfo();
            System.out.println("Prateleira: " + localizacaoPrateleira);
        }
    }







