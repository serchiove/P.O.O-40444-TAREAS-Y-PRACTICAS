public class Empleado {
    private String nombre;
    private int edad;
    private double salario;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        setEdad(edad);
        setSalario(salario);
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) {
        if (edad > 18) this.edad = edad;
        else System.out.println("La edad debe ser mayor a 18.");
    }

    public double getSalario() { return salario; }
    public void setSalario(double salario) {
        if (salario > 0) this.salario = salario;
        else System.out.println("El salario debe ser mayor a 0.");
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: $" + salario);
    }
}



