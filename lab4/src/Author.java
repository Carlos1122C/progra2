import java.util.ArrayList;
import java.util.List;

public class Author {
    // Atributos privados (Encapsulación)
    private String name;
    private List<Book> books;

    // Constructor
    public Author(String name) {
        this.name = name;
        this.books = new ArrayList<>(); // Inicializa la lista vacía para evitar NullPointerException
    }

    // Método original para agregar un objeto Book
    public void addBook(Book book) {
        this.books.add(book);
    }

    // SOBRECARGA: Método que acepta un título y un precio, creando el objeto internamente
    public void addBook(String title, double price) {
        // Al pasar 'this', mantenemos la relación bidireccional
        Book newBook = new Book(title, this, price); 
        this.books.add(newBook);
    }

    // Método para devolver la lista de libros
    public List<Book> getBooks() {
        return books;
    }

    // Métodos Getters y Setters para el nombre
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
