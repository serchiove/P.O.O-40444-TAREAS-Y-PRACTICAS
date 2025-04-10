public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Ana", 35, 5000.0, "Ventas");
        gerente.mostrarInfo();

        System.out.println("--- Cambiando departamento ---");
        gerente.cambiarDepartamento("Marketing");
        gerente.mostrarInfo();
    }
}
