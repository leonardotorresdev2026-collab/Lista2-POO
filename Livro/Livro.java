public class Livro {

        private String titulo;
        private String autor;
        private int quantidadeDisponivel;

        public Livro(String titulo, String autor, int quantidadeDisponivel) {
            this.titulo = titulo;
            this.autor = autor;
            this.quantidadeDisponivel = quantidadeDisponivel;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getAutor() {
            return autor;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

        public int getQuantidadeDisponivel() {
            return quantidadeDisponivel;
        }

        public void setQuantidadeDisponivel(int quantidadeDisponivel) {
            this.quantidadeDisponivel = quantidadeDisponivel;
        }

        public void exibirInfo() {
            System.out.println("Titulo: " + titulo);
            System.out.println("Autor: " + autor);
            System.out.println("Quantidade: " + quantidadeDisponivel);
        }

        public void emprestar() {
            quantidadeDisponivel--;
        }
    }




