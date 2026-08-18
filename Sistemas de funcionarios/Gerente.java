public class Gerente extends Funcionario {

    private int bonus;

    public Gerente(String nome, int matricula, int salario, int bonus) {
        super(nome, matricula, salario);
        this.bonus = bonus;
    }

    @Override
    public int calcularSalario() {
        return getSalario() + bonus;
    }
}