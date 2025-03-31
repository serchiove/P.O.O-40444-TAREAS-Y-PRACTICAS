// Clase principal con el método main
public class Biblioteca {
    public static void main(String[] args) {
        // Polimorfismo: Un objeto de tipo Usuario puede referenciar a subclases
        Usuario usuario1 = new Alumno("Carlos", "A123");
        Usuario usuario2 = new Docente("María", "Matemáticas");

        // Llamamos al método mostrarInfo(), pero se ejecuta la versión específica de cada subclase
        usuario1.mostrarInfo();
        usuario2.mostrarInfo();
    }
}
// Clase base Usuario con un método que será sobrescrito
class Usuario {
    protected String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    // Método que se sobrescribirá en las subclases
    public void mostrarInfo() {
        System.out.println("Usuario: " + nombre);
    }
}

// Subclase Alumno que sobrescribe el método mostrarInfo()
class Alumno extends Usuario {
    private String codigoAlumno;

    public Alumno(String nombre, String codigoAlumno) {
        super(nombre);
        this.codigoAlumno = codigoAlumno;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Alumno: " + nombre + " - Código: " + codigoAlumno);
    }
}

// Subclase Docente que sobrescribe el método mostrarInfo()
class Docente extends Usuario {
    private String especialidad;

    public Docente(String nombre, String especialidad) {
        super(nombre);
        this.especialidad = especialidad;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Docente: " + nombre + " - Especialidad: " + especialidad);
    }
}