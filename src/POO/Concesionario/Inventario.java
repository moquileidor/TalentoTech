package POO.Concesionario;
import java.util.ArrayList;

public class Inventario {

    private ArrayList<Vehiculo> vehiculos;

    public Inventario() {
        vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public void eliminarVehiculo(Vehiculo vehiculo) {
        vehiculos.remove(vehiculo);
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    @Override
    public String toString() {
        return "Inventario{" +
                "vehiculos=" + vehiculos +
                '}';
    }
}
