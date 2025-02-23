package POO.Concesionario;
import java.util.ArrayList;
import java.util.Scanner;

public class Concesionario {

    private ArrayList<Cliente> clientes;
    private ArrayList<Vendedor> vendedores;
    private ArrayList<Venta> ventas;
    private Inventario inventario;

    public Concesionario(ArrayList<Cliente> clientes, ArrayList<Vendedor> vendedores, ArrayList<Venta> ventas, Inventario inventario) {
        this.clientes = clientes;
        this.vendedores = vendedores;
        this.ventas = ventas;
        this.inventario = inventario;
    }

    public Concesionario(){
        this.clientes = new ArrayList<>();
        this.vendedores = new ArrayList<>();
        this.ventas = new ArrayList<>();
        this.inventario = new Inventario();
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    public void agregarVendedor(Vendedor vendedor) {
        vendedores.add(vendedor);
    }
    public void agregrarVehiculo(Vehiculo vehiculo) {
        inventario.agregarVehiculo(vehiculo);
    }
    public void eliminarVehiculo(Vehiculo vehiculo) {
        inventario.eliminarVehiculo(vehiculo);
    }
    public ArrayList<Vehiculo> getInventario() {
        return inventario.getVehiculos();
    }
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    //Gestion de ventas
    public void registrarVentas( Cliente cliente,Vehiculo vehiculo, Vendedor vendedor,  String fechaVenta) {
        Venta venta = new Venta(cliente, vehiculo, vendedor, fechaVenta);
        ventas.add(venta);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Concesionario");
        System.out.println("Ingrese una opcion: ");
        System.out.println("1. Agregar Cliente");
        System.out.println("2. Agregar Vendedor");
        System.out.println("3. Agregar Vehiculo");
        int opc = sc.nextInt();
        sc.nextLine();
        Concesionario concesionario = new Concesionario();
        switch (opc) {
            case 1:
                Cliente cliente = new Cliente(null, null, null, null, null);
                System.out.println("Ingrese cédula:");
                cliente.setCedula(sc.nextLine());


                System.out.println("Ingrese nombre:");
                cliente.setNombreCompleto(sc.nextLine());

                System.out.println("Ingrese dirección:");
                cliente.setDireccion(sc.nextLine());

                System.out.println("Ingrese teléfono:");
                cliente.setTelefono(sc.nextLine());

                System.out.println("Ingrese código de cliente:");
                cliente.setCodigoCliente(sc.nextLine());

                concesionario.agregarCliente(cliente);
                System.out.println("Cliente agregado correctamente.");

                // Mostrar los datos capturados usando getters
                System.out.println("Datos del cliente agregado:");
                System.out.println("Cédula: " + cliente.getCedula());
                System.out.println("Nombre: " + cliente.getNombreCompleto());
                System.out.println("Dirección: " + cliente.getDireccion());
                System.out.println("Teléfono: " + cliente.getTelefono());
                System.out.println("Código Cliente: " + cliente.getCodigoCliente());
                break;
            case 2:

        }

    }

    @Override
    public String toString() {
        return "Concesionario{" +
                "clientes=" + clientes +
                ", vendedores=" + vendedores +
                ", ventas=" + ventas +
                ", inventario=" + inventario +
                '}';
    }
}
