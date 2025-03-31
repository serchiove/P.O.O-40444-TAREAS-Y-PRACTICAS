// Clase principal con el método main
public class Biblioteca {
    public static void main(String[] args) {
        // Crear un objeto Libro con encapsulamiento
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", 500);

        // Mostrar información inicial
        libro1.mostrarInfo();

        // Modificar los valores usando setters
        libro1.setPaginas(600);
        libro1.setTitulo("Don Quijote de la Mancha");

        // Mostrar información actualizada
        System.out.println("\nDespués de modificar:");
        libro1.mostrarInfo();
    }
}
// Clase Libro con atributos privados y métodos getter y setter
class Libro {
    private String titulo;
    private String autor;
    private int paginas;

    // Constructor
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    // Métodos getter y setter para acceder a los atributos privados
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        if (paginas > 0) { // Validación para evitar valores negativos
            this.paginas = paginas;
        } else {
            System.out.println("El número de páginas debe ser mayor a 0.");
        }
    }

    // Método para mostrar la información del libro
    public void mostrarInfo() {
        System.out.println("Libro: " + titulo + " - " + autor + " (" + paginas + " páginas)");
    }
}