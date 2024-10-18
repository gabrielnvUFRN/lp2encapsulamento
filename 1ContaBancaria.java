public class ContaBancaria {
    private Cliente cliente;
    private double saldo;

    public ContaBancaria(Cliente cliente) {
        this.cliente = cliente;
        this.saldo = 0.0; 
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saque não realizado. Verifique o valor ou saldo insuficiente.");
        }
    }

    public void mostrarDadosConta() {
        System.out.println("Cliente: " + cliente.getNome() + " | ID: " + cliente.getIdCliente());
        System.out.println("Saldo atual: R$" + saldo);
    }
}
