public class Reserva {
    private Cliente cliente;
    private Carro carro;

    public Reserva(Cliente cliente, Carro carro) {
        this.cliente = cliente;
        this.carro = carro;
    }

    public void efetuarReserva() {
        if (carro.isDisponivel()) {
            carro.setDisponivel(false); 
            System.out.println("Reserva realizada com sucesso!");
            System.out.println("Cliente: " + cliente.getNome() + " | Carro: " + carro.getModelo() + " (" + carro.getPlaca() + ")");
        } else {
            System.out.println("O carro " + carro.getModelo() + " não está disponível no momento.");
        }
    }

    public void cancelarReserva() {
        if (!carro.isDisponivel()) {
            carro.setDisponivel(true); 
            System.out.println("Reserva cancelada com sucesso!");
        } else {
            System.out.println("O carro já está disponível.");
        }
    }
}
