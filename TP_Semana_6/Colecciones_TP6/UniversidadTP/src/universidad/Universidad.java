package universidad;

import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombre;
    private final List<Profesor> profesores = new ArrayList<>();
    private final List<Curso> cursos = new ArrayList<>();

    public Universidad(String nombre) {
        this.nombre = nombre;
    }

    public void agregarProfesor(Profesor p) { if (p != null) profesores.add(p); }
    public void agregarCurso(Curso c) { if (c != null) cursos.add(c); }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) if (p.getId().equalsIgnoreCase(id)) return p;
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) if (c.getCodigo().equalsIgnoreCase(codigo)) return c;
        return null;
    }

    // asignarProfesorACurso usa setProfesor del curso
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso c = buscarCursoPorCodigo(codigoCurso);
        Profesor p = buscarProfesorPorId(idProfesor);
        if (c == null || p == null) {
            System.out.println("No se pudo asignar: curso o profesor inexistente.");
            return;
        }
        c.setProfesor(p);
    }

    public void listarProfesores() {
        System.out.println("== Profesores ==");
        for (Profesor p : profesores) p.mostrarInfo();
    }

    public void listarCursos() {
        System.out.println("== Cursos ==");
        for (Curso c : cursos) c.mostrarInfo();
    }

    // eliminarCurso: rompe la relación
    public boolean eliminarCurso(String codigo) {
        Curso c = buscarCursoPorCodigo(codigo);
        if (c == null) return false;
        c.setProfesor(null);
        return cursos.remove(c);
    }

    // eliminarProfesor: dejar null los cursos que dictaba
    public boolean eliminarProfesor(String id) {
        Profesor p = buscarProfesorPorId(id);
        if (p == null) return false;
        for (Curso c : new ArrayList<>(p.getCursos())) {
            c.setProfesor(null);
        }
        return profesores.remove(p);
    }

    // Reporte cantidad de cursos por profesor
    public void reporteCantidadCursosPorProfesor() {
        System.out.println("== Reporte: Cantidad de cursos por profesor ==");
        for (Profesor p : profesores) {
            System.out.printf("%s: %d cursos%n", p.getNombre(), p.getCursos().size());
        }
    }
}
