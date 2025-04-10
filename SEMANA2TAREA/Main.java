public class Main {
    public static void main(String[] args) {
        Estudiante e = new Estudiante();
        e.setNombre("Ana");
        e.setEdad(20);
        e.dni = "87654321";  // Acceso directo porque dni es protected

        e.mostrarDatos();
        e.mostrarDni();
    }
}
