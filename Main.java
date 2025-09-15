package poo_tp3;

public class Main {
    public static void main(String[] args) {
        // Estudiante
        Estudiante est = new Estudiante("Juan", "Pérez", "POO", 7.5);
        est.mostrarInfo();
        est.subirCalificacion(1);
        est.bajarCalificacion(0.5);
        est.mostrarInfo();

        // Mascota
        Mascota pet = new Mascota("Firulais", "Perro", 3);
        pet.mostrarInfo();
        pet.cumplirAnios();
        pet.mostrarInfo();

        // Libro
        Libro libro = new Libro("1984", "George Orwell", 1949);
        libro.setAñoPublicacion(-100); // inválido
        libro.setAñoPublicacion(1950); // válido
        System.out.println(libro.getTitulo() + " - " + libro.getAutor() + " - " + libro.getAñoPublicacion());

        // Gallinas
        Gallina g1 = new Gallina(1);
        Gallina g2 = new Gallina(2);
        g1.ponerHuevo();
        g1.envejecer();
        g1.mostrarEstado();
        g2.envejecer();
        g2.ponerHuevo();
        g2.ponerHuevo();
        g2.mostrarEstado();

        // Nave Espacial
        NaveEspacial nave = new NaveEspacial("Apollo", 50);
        nave.avanzar(60); // no debería avanzar
        nave.recargarCombustible(30);
        nave.avanzar(60); // ahora sí
        nave.mostrarEstado();
    }
}