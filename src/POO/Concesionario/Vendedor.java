package POO.Concesionario;
public class Vendedor extends Persona {
    private String codigoVendedor;

    public Vendedor(String cedula, String nombreCompleto, String direccion, String telefono, String codigoVendedor) {
        super(cedula, nombreCompleto, direccion, telefono);
        this.codigoVendedor = codigoVendedor;
    }

    public String getCodigoVendedor() {
        return codigoVendedor;
    }

    public void setCodigoVendedor(String codigoVendedor) {
        this.codigoVendedor = codigoVendedor;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Hemos creado un vendedor con: " +
                "codigoVendedor='" + codigoVendedor + '\'' ;
    }
}
