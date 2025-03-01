package POO.Concesionario;
import java.util.ArrayList;

/**
 * @author : Jorge Alvarado
 */
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

    public ArrayList<Vehiculo> buscarPorMarca(String marca) {
        try {
            ArrayList<Vehiculo> resultados = new ArrayList<>();
            for (Vehiculo v : vehiculos) {
                if (v.getMarca().equalsIgnoreCase(marca)){
                    resultados.add(v);
                }
            }
            return resultados;
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error: " + e);
        } finally {
            System.out.println("Hemos encontrado estos resultados. ");
        }
        return null;
    }

    @Override
    public String toString() {
        return "Inventario{" +
                "vehiculos=" + vehiculos +
                '}';
    }
}
