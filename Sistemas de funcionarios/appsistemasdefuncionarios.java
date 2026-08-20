public class appsistemasdefuncionarios {

    public static void main(String[] args) {

        Gerente gerente = new Gerente("Bruninho Proença", 110, 60000, 1000);

        Vendedor vendedor = new Vendedor("berso", 230, 6000, 2000);

        System.out.println("Salário do gerente: " + gerente.calcularSalario());

        System.out.println("Salário do vendedor: " + vendedor.calcularSalario());
    }
}