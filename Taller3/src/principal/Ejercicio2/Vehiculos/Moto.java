package principal.Ejercicio2.Vehiculos;

class Moto extends Vehiculo {
    
    Moto(String tipo) {
        super(tipo); 
    }

    void mostrarInfo() {
        System.out.println("Esta es una moto.");
        mostrarTipo(); 
    }
}
