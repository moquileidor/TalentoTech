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
        Concesionario concesionario = new Concesionario();
        int opc;
        do {
            System.out.println("Concesionario");
            System.out.println("Ingrese una opcion: ");
            System.out.println("1. Agregar Cliente");
            System.out.println("2. Agregar Vendedor");
            System.out.println("3. Agregar Vehiculo");
            System.out.println("4. Registrar Venta");
            System.out.println("5. Eliminar vehiculo");
            System.out.println("6. Mostrar Inventario");
            System.out.println("7. Salir");
            opc = sc.nextInt();
            sc.nextLine();

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
                    Vendedor vendedor = new Vendedor(null, null, null, null, null);
                    System.out.println("Ingrese cédula:");
                    vendedor.setCedula(sc.nextLine());

                    System.out.println("Ingrese nombre:");
                    vendedor.setNombreCompleto(sc.nextLine());

                    System.out.println("Ingrese dirección:");
                    vendedor.setDireccion(sc.nextLine());

                    System.out.println("Ingrese teléfono:");
                    vendedor.setTelefono(sc.nextLine());

                    System.out.println("Ingrese código de vendedor:");
                    vendedor.setCodigoVendedor(sc.nextLine());

                    concesionario.agregarVendedor(vendedor);
                    System.out.println("Vendedor agregado correctamente.");

                    // Mostrar los datos capturados usando getters
                    System.out.println("Datos del vendedor agregado:");
                    System.out.println("Cédula: " + vendedor.getCedula());
                    System.out.println("Nombre: " + vendedor.getNombreCompleto());
                    System.out.println("Dirección: " + vendedor.getDireccion());
                    System.out.println("Teléfono: " + vendedor.getTelefono());
                    System.out.println("Código Vendedor: " + vendedor.getCodigoVendedor());
                    break;
                case 3:
                    Vehiculo vehiculo = new Vehiculo(null, null, null, 0);

                    System.out.println("Ingrese marca:");
                    vehiculo.setMarca(sc.nextLine());

                    System.out.println("Ingrese modelo:");
                    vehiculo.setModelo(sc.nextLine());

                    System.out.println("Ingrese referencia:");
                    vehiculo.setReferencia(sc.nextLine());


                    System.out.println("Ingrese precio:");
                    vehiculo.setPrecio(sc.nextDouble());
                    sc.nextLine();

                    concesionario.agregrarVehiculo(vehiculo);
                    System.out.println("Vehiculo agregado correctamente.");

                    // Mostrar los datos capturados usando getters
                    System.out.println("Datos del vehiculo agregado:");
                    System.out.println("Marca: " + vehiculo.getMarca());
                    System.out.println("Modelo: " + vehiculo.getModelo());
                    System.out.println("Precio: " + vehiculo.getPrecio());
                    break;
                case 4:
                    System.out.println("Ingrese cédula del cliente:");
                    String cedulaCliente = sc.nextLine();
                    Cliente clienteVenta = null;
                    for (Cliente c : concesionario.getClientes()) {
                        if (c.getCedula().equals(cedulaCliente)) {
                            clienteVenta = c;
                            break;
                        }
                    }
                    if (clienteVenta == null) {
                        System.out.println("Cliente no encontrado.");
                        return;
                    }

                    System.out.println("Ingrese cédula del vendedor:");
                    String cedulaVendedor = sc.nextLine();
                    Vendedor vendedorVenta = null;
                    for (Vendedor v : concesionario.vendedores) {
                        if (v.getCedula().equals(cedulaVendedor)) {
                            vendedorVenta = v;
                            break;
                        }
                    }
                    if (vendedorVenta == null) {
                        System.out.println("Vendedor no encontrado.");
                        return;
                    }

                    System.out.println("Ingrese marca del vehículo:");
                    String marcaVehiculo = sc.nextLine();
                    Vehiculo vehiculoVenta = null;
                    for (Vehiculo v : concesionario.getInventario()) {
                        if (v.getMarca().equals(marcaVehiculo)) {
                            vehiculoVenta = v;
                            break;
                        }
                    }
                    if (vehiculoVenta == null) {
                        System.out.println("Vehículo no encontrado.");
                        return;
                    }

                    System.out.println("Ingrese fecha de la venta:");
                    String fechaVenta = sc.nextLine();

                    concesionario.registrarVentas(clienteVenta, vehiculoVenta, vendedorVenta, fechaVenta);
                    System.out.println("Venta registrada correctamente.");
                    break;
                case 5:
                    System.out.println("Ingrese marca del vehículo a eliminar:");
                    String marcaVehiculoEliminar = sc.nextLine();
                    Vehiculo vehiculoEliminar = null;
                    for (Vehiculo v : concesionario.getInventario()) {
                        if (v.getMarca().equals(marcaVehiculoEliminar)) {
                            vehiculoEliminar = v;
                            break;
                        }
                    }
                    if (vehiculoEliminar == null) {
                        System.out.println("Vehículo no encontrado.");
                        return;
                    }

                    concesionario.eliminarVehiculo(vehiculoEliminar);
                    System.out.println("Vehículo eliminado correctamente.");
                    break;
                case 6:
                    System.out.println("Inventario:");
                    for (Vehiculo v : concesionario.getInventario()) {
                        System.out.println(v);
                    }
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        } while (opc != 7);


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
