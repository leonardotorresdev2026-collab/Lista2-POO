public class Livrodigital extends Livro {

    private int tamanhoArquivoMB;

    public Livrodigital(String titulo, String autor, int quantidadeDisponivel, int tamanhoArquivoMB) {
        super(titulo, autor, quantidadeDisponivel);
        this.tamanhoArquivoMB = tamanhoArquivoMB;
    }

    public int getTamanhoArquivoMB() {
        return tamanhoArquivoMB;
    }

    public void setTamanhoArquivoMB(int tamanhoArquivoMB) {
        this.tamanhoArquivoMB = tamanhoArquivoMB;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Tamanho: " + tamanhoArquivoMB + " MB");
    }
}