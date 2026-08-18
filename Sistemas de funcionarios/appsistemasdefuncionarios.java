public class appsistemasdefuncionarios {

    public static void main(String[] args) {

        Gerente gerente = new Gerente("Carlos", 101, 5000, 1000);

        Vendedor vendedor = new Vendedor("João", 102, 2000, 500);

        System.out.println("Salário do gerente: " + gerente.calcularSalario());

        System.out.println("Salário do vendedor: " + vendedor.calcularSalario());
    }
}