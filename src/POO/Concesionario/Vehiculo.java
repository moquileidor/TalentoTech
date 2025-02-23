package POO.Concesionario;

public class Vehiculo {

    private String marca;
    private String modelo;
    private String referencia;
    private double precio;

    public Vehiculo(String modelo, String marca, String referencia, double precio) {
        this.modelo = modelo;
        this.marca = marca;
        this.referencia = referencia;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", referencia='" + referencia + '\'' +
                ", precio=" + precio +
                '}';
    }
}
