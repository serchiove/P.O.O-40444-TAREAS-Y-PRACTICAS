// Clase principal con método main
public class Biblioteca {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Pedro", 1001);
        Alumno alumno1 = new Alumno("Ana", 2002, "Ingeniería de Sistemas");
        Docente docente1 = new Docente("Luis", 3003, "Ciencias de la Computación");

        usuario1.mostrarInfo();
        System.out.println();
        alumno1.mostrarInfo();
        System.out.println();
        docente1.mostrarInfo();
    }
}
// Superclase Usuario
public class Usuario {
    protected String nombre;
    protected int id;

    public Usuario(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", ID: " + id);
    }
}

// Subclase Alumno
class Alumno extends Usuario {
    private String carrera;

    public Alumno(String nombre, int id, String carrera) {
        super(nombre, id);
        this.carrera = carrera;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Carrera: " + carrera);
    }
}

// Subclase Docente
class Docente extends Usuario {
    private String especialidad;

    public Docente(String nombre, int id, String especialidad) {
        super(nombre, id);
        this.especialidad = especialidad;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Especialidad: " + especialidad);
    }
}
