package universidad;

import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private final List<Curso> cursos = new ArrayList<>(); // cursos que dicta

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getEspecialidad() { return especialidad; }
    public List<Curso> getCursos() { return cursos; }

    // agregarCurso sincronizado
    public void agregarCurso(Curso c) {
        if (c == null) return;
        if (!cursos.contains(c)) cursos.add(c);
        if (c.getProfesor() != this) c.setProfesor(this);
    }

    // eliminarCurso sincronizado
    public void eliminarCurso(Curso c) {
        if (c == null) return;
        cursos.remove(c);
        if (c.getProfesor() == this) c.setProfesor(null);
    }

    public void listarCursos() {
        System.out.println("Cursos de " + nombre + ":");
        for (Curso c : cursos) {
            System.out.println(" - " + c.getCodigo() + " " + c.getNombre());
        }
    }

    public void mostrarInfo() {
        System.out.printf("Profesor[id=%s, nombre=%s, esp=%s, cantCursos=%d]%n",
                id, nombre, especialidad, cursos.size());
    }

    @Override
    public String toString() {
        return nombre + " (" + especialidad + ")";
    }
}
