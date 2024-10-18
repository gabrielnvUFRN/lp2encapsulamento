public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Maria Souza", "101");
        Cliente cliente2 = new Cliente("Pedro Lima", "102");

        Carro carro1 = new Carro("Toyota Corolla", "ABC-1234");
        Carro carro2 = new Carro("Honda Civic", "XYZ-5678");

        carro1.mostrarDadosCarro();
        carro2.mostrarDadosCarro();

        Reserva reserva1 = new Reserva(cliente1, carro1);
        Reserva reserva2 = new Reserva(cliente2, carro2);

        reserva1.efetuarReserva();
        carro1.mostrarDadosCarro();  

        reserva1.efetuarReserva();  

        reserva1.cancelarReserva();
        carro1.mostrarDadosCarro();  

        reserva2.efetuarReserva();
        carro2.mostrarDadosCarro();  
    }
}
