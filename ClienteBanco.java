public class ClienteBanco {
    private String nome;
    private String idCliente;

    public Cliente(String nome, String idCliente) {
        this.nome = nome;
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public String getIdCliente() {
        return idCliente;
    }
}
