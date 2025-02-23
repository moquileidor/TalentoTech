package POO.Concesionario;

public class Cliente extends Persona {
    private String codigoCliente;

    public Cliente(String cedula, String nombreCompleto, String direccion, String telefono, String codigoCliente) {
        super(cedula, nombreCompleto, direccion, telefono);
        this.codigoCliente = codigoCliente;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    @Override
    public String toString() {
        return "Hemos creado un cliente con: " +
                "codigoCliente='" + codigoCliente + '\'' ;
    }
}
