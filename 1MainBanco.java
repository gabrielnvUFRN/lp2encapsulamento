public class 1MainBanco {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João Silva", "001");

        ContaBancaria conta1 = new ContaBancaria(cliente1);

        conta1.mostrarDadosConta();

        conta1.depositar(500.0);  
        conta1.mostrarDadosConta();

        conta1.sacar(200.0);      
        conta1.mostrarDadosConta();

        conta1.sacar(400.0);     
        conta1.mostrarDadosConta();
    }
}
