package POO.Concesionario;

public class Venta {
    private Cliente cliente;
    private Vehiculo vehiculo;
    private Vendedor vendedor;
    private String fechaVenta;

    public Venta(Cliente cliente, Vehiculo vehiculo, Vendedor vendedor, String fechaVenta) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.vendedor = vendedor;
        this.fechaVenta = fechaVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "cliente=" + cliente +
                ", vehiculo=" + vehiculo +
                ", vendedor=" + vendedor +
                '}';
    }
}

