public class Vendedor extends Funcionario {

    private int comissao;

    public Vendedor(String nome, int matricula, int salario, int comissao) {
        super(nome, matricula, salario);
        this.comissao = comissao;
    }

    @Override
    public int calcularSalario() {
        return getSalario() + comissao;
    }
}