
public class Principal {
    public static void main(String[] args) {
        
        Vehiculo misVehiculos[] = new Vehiculo[4];
        
        misVehiculos[0] = new Vehiculo("GH69", "Ferrari", "F8");
        misVehiculos[1] = new VehiculoTurismo(4, "GX5678", "Audi", "P14");
        misVehiculos[2] = new VehiculoDeportivo(5000, "HG3004", "Toyota", "KJ8");
        misVehiculos[3] = new VehiculoFurgoneta(2200, "KM4948", "Suzuki", "Waka");
        
        for (Vehiculo vehiculos : misVehiculos) {
            System.out.println(vehiculos.mostrarDatos());
            System.out.println("");
        }
        
        System.out.println("Hola mundo");
    }
}
