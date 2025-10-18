package biblioteca;

public class MainBiblioteca {
    public static void main(String[] args) {
        // 1. Creamos una biblioteca
        Biblioteca b = new Biblioteca("Biblioteca Central");

        // 2. Crear al menos tres autores
        Autor a1 = new Autor("A1", "Eduardo Galeano", "Uruguay");
        Autor a2 = new Autor("A2", "Jorge Luis Borges", "Argentina");
        Autor a3 = new Autor("A3", "Isabel Allende", "Chile");

        // 3. Agregar 5 libros asociados a alguno de los autores
        b.agregarLibro("ISBN-001", "El Libro de los Abrazos", 1989, a1);
        b.agregarLibro("ISBN-002", "Ficciones", 1944, a2);
        b.agregarLibro("ISBN-003", "La Casa de los Espíritus", 1982, a3);
        b.agregarLibro("ISBN-004", "El Aleph", 1949, a2);
        b.agregarLibro("ISBN-005", "Patas arriba", 1998, a1);

        // 4. Listar todos los libros
        System.out.println("== 4) Listar libros ==");
        b.listarLibros();

        // 5. Buscar un libro por su ISBN
        System.out.println("\n== 5) Buscar ISBN-004 ==");
        Libro l = b.buscarLibroPorIsbn("ISBN-004");
        if (l != null) l.mostrarInfo();

        // 6. Filtrar y mostrar los libros publicados en un año específico
        System.out.println("\n== 6) Libros de 1949 ==");
        for (Libro li : b.filtrarLibrosPorAnio(1949)) li.mostrarInfo();

        // 7. Eliminar un libro por su ISBN y listar los restantes
        System.out.println("\n== 7) Eliminar ISBN-003 y listar ==");
        b.eliminarLibro("ISBN-003");
        b.listarLibros();

        // 8. Mostrar cantidad total de libros
        System.out.println("\n== 8) Total de libros: " + b.obtenerCantidadLibros());

        // 9. Listar todos los autores de los libros disponibles
        System.out.println("\n== 9) Autores disponibles ==");
        b.mostrarAutoresDisponibles();
    }
}
