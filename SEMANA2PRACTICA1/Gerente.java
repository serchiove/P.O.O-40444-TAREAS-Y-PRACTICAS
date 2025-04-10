public class Gerente extends Empleado {
    protected String departamento;

    public Gerente(String nombre, int edad, double salario, String departamento) {
        super(nombre, edad, salario);
        this.departamento = departamento;
    }

    public void cambiarDepartamento(String nuevoDepartamento) {
        System.out.println("Departamento anterior: " + departamento);
        this.departamento = nuevoDepartamento;
        System.out.println("Nuevo departamento: " + departamento);
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Departamento: " + departamento);
    }
}
