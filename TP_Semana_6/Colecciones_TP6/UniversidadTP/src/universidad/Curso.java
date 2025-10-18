package universidad;

public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor; // puede ser null

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }

    // setProfesor sincroniza ambos lados
    public void setProfesor(Profesor p) {
        if (this.profesor == p) return;
        // quitar de profesor anterior
        if (this.profesor != null) {
            Profesor anterior = this.profesor;
            this.profesor = null;
            anterior.getCursos().remove(this);
        }
        // asignar nuevo y sincronizar
        this.profesor = p;
        if (p != null && !p.getCursos().contains(this)) {
            p.getCursos().add(this);
        }
    }

    public void mostrarInfo() {
        System.out.printf("Curso[codigo=%s, nombre=%s, profesor=%s]%n",
                codigo, nombre, profesor != null ? profesor.getNombre() : "Sin asignar");
    }

    @Override
    public String toString() {
        return "Curso{" +
                "codigo='" + codigo + "'" +
                ", nombre='" + nombre + "'" +
                ", profesor=" + (profesor == null ? "null" : profesor.getNombre()) +
                '}';
    }
}
