package Service;

public class Main {
    public static void main(String[] args) {
        // Crear algunos clientes
        Cliente cliente1 = new Cliente("Juan Pérez", "Calle Ficticia 123");
        Cliente cliente2 = new Cliente("Ana Gómez", "Avenida Real 456");

        // Crear algunos vehículos concretos
        IVehiculo vehiculo1 = new VehiculoConcreto("Toyota", "Corolla", "VID123", "Rojo", 50000, "2020");
        IVehiculo vehiculo2 = new VehiculoConcreto("Ford", "Fiesta", "VID124", "Azul", 30000, "2019");
        IVehiculo vehiculo3 = new VehiculoConcreto("Honda", "Civic", "VID125", "Negro", 20000, "2021");

        // Crear ventas
        Venta venta1 = new Venta(vehiculo1, cliente1, 20000);
        Venta venta2 = new Venta(vehiculo2, cliente1, 15000);
        Venta venta3 = new Venta(vehiculo3, cliente2, 22000);

        // Mostrar ventas
        System.out.println(venta1);
        System.out.println(venta2);
        System.out.println(venta3);
    }
}