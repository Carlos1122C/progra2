public class Book {
    // Atributos privados (Encapsulación)
    private String title;
    private Author author;
    private double price;

    // Constructor
    public Book(String title, Author author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Método para devolver la información del libro
    public String getInfo() {
        return "Título: " + title + ", Autor: " + author.getName() + ", Precio: $" + price;
    }

    // Métodos Getters y Setters (Encapsulación)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
