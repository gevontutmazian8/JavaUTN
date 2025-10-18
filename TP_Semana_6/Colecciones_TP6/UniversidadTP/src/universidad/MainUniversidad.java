package universidad;

public class MainUniversidad {
    public static void main(String[] args) {
        // 1. Crear profesores y cursos
        Universidad u = new Universidad("UTEC");

        Profesor pr1 = new Profesor("PR01","María López","Sistemas");
        Profesor pr2 = new Profesor("PR02","Juan Pérez","Matemática");
        Profesor pr3 = new Profesor("PR03","Ana Torres","Electrónica");

        u.agregarProfesor(pr1);
        u.agregarProfesor(pr2);
        u.agregarProfesor(pr3);

        Curso c1 = new Curso("CS101","Intro a Programación");
        Curso c2 = new Curso("MA201","Cálculo II");
        Curso c3 = new Curso("EL330","Sistemas Embebidos");
        Curso c4 = new Curso("CS220","Estructuras de Datos");
        Curso c5 = new Curso("CS305","Bases de Datos");

        u.agregarCurso(c1); u.agregarCurso(c2); u.agregarCurso(c3); u.agregarCurso(c4); u.agregarCurso(c5);

        // 3. Asignar profesores a cursos
        u.asignarProfesorACurso("CS101","PR01");
        u.asignarProfesorACurso("MA201","PR02");
        u.asignarProfesorACurso("EL330","PR03");
        u.asignarProfesorACurso("CS220","PR01");
        u.asignarProfesorACurso("CS305","PR01");

        // 4. Listados
        u.listarCursos();
        u.listarProfesores();

        // 5. Cambiar profesor de un curso y verificar sincronización
        System.out.println("\n== Reasignar CS220 a PR03 ==");
        u.asignarProfesorACurso("CS220","PR03");
        u.listarCursos();
        pr1.listarCursos();
        pr3.listarCursos();

        // 6. Remover curso y confirmar
        System.out.println("\n== Eliminar curso MA201 ==");
        u.eliminarCurso("MA201");
        u.listarCursos();
        pr2.listarCursos();

        // 7. Remover profesor y dejar cursos en null
        System.out.println("\n== Eliminar profesor PR01 ==");
        u.eliminarProfesor("PR01");
        u.listarCursos();
        u.listarProfesores();

        // 8. Reporte
        System.out.println();
        u.reporteCantidadCursosPorProfesor();
    }
}
