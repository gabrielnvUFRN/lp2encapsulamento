public class Carro {
    private String modelo;
    private String placa;
    private boolean disponivel;

    public Carro(String modelo, String placa) {
        this.modelo = modelo;
        this.placa = placa;
        this.disponivel = true; 
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    public void mostrarDadosCarro() {
        System.out.println("Modelo: " + modelo + " | Placa: " + placa + " | Disponível: " + (disponivel ? "Sim" : "Não"));
    }
}
