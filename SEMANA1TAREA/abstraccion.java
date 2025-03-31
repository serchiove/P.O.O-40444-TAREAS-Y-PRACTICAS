// Clase principal con el método main
public class Biblioteca {
    public static void main(String[] args) {
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", 500);
        Multimedia multimedia1 = new Multimedia("Curso de Java", "OpenAI", 120);

        libro1.mostrarInfo();
        multimedia1.mostrarInfo();
    }
}
// Clase abstracta
abstract class RecursoBiblioteca {
    protected String titulo;
    protected String autor;

    public RecursoBiblioteca(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public abstract void mostrarInfo();
}

// Clase Libro (hereda de RecursoBiblioteca)
class Libro extends RecursoBiblioteca {
    private int paginas;

    public Libro(String titulo, String autor, int paginas) {
        super(titulo, autor);
        this.paginas = paginas;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Libro: " + titulo + " - " + autor + " (" + paginas + " páginas)");
    }
}

// Clase Multimedia (hereda de RecursoBiblioteca)
class Multimedia extends RecursoBiblioteca {
    private double duracion;

    public Multimedia(String titulo, String autor, double duracion) {
        super(titulo, autor);
        this.duracion = duracion;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Multimedia: " + titulo + " - " + autor + " (" + duracion + " min)");
    }
}